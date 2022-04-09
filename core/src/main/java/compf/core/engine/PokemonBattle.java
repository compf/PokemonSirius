package compf.core.engine;

import java.util.Iterator;
import java.util.LinkedList;

import compf.core.networking.BattleServer.Interrupt;
import compf.core.engine.pokemon.*;
import compf.core.engine.pokemon.effects.*;
import compf.core.engine.pokemon.effects.BattleEffectCollection;
import compf.core.engine.pokemon.moves.DamageInformation;
import compf.core.engine.pokemon.moves.Schedule;
import compf.core.engine.pokemon.moves.Schedule.ScheduleItem;
import compf.core.etc.MyObject;

public class PokemonBattle extends MyObject implements  Iterable<Pokemon> {

	Schedule _schedule;
	private BattleEffectCollection _globalEffects = new BattleEffectCollection();
	private static int _uid;
	public static PokemonBattle Battle;
	private BattleRule rule;


	public int getUID() {
		return _uid++;
	}
	public static Pokemon[] createRandomTeam(){
		var team=new Pokemon[6];
		for (int i = 0; i < 6; i++) {
			team[i] = new Pokemon(SharedInformation.Instance
					.getPokedexEntry(1 + MyObject.RNG.nextInt(SharedInformation.PokemonCount - 1)));
		}
		return team;
	}
	public PokemonBattle(BattleRule rule) {
		this.rule=rule;
		this._players=new compf.core.etc.BufferList<>(rule.NumberPlayers);
		_schedule=new Schedule(this);
	}
	public void init() {
	

	}
	public Pokemon getPokemon(int index) {
		var s=getIndices(index);
		return _players.get(s[0]).getPokemon(s[1]);
	}

	public void incrementRound() {
		_schedule.incrementRound();
	}

	public class BattleIterator implements Iterator<Pokemon>{
		private int _iterator_player_index,_iterator_pkmn_index;
		@Override
		public boolean hasNext() {
			boolean b= _iterator_player_index<_players.size();
			if(!b) {
				_iterator_player_index=_iterator_pkmn_index=0;
			}
			return b;
		}
		public Pokemon next(){
			Player player=_players.get(_iterator_player_index);
			Pokemon pkmn=player.getPokemon(_iterator_pkmn_index);
			_iterator_pkmn_index++;
			if(_iterator_pkmn_index>=player.getPokemonCount()) {
				_iterator_pkmn_index=0;
				_iterator_player_index++;

			}
			return pkmn;
		}
	}


	public Iterator<Pokemon> iterator(){
		return new BattleIterator();
	}
	private void executeEffect(BattleEffect effect, EffectTime time, Object... inf) {
		if (!effect.isEnabled())
			return;
		switch (time) {
			case POKEMON_DEFEATED:
				effect.pokemonDefeated(inf);
				break;
			case POKEMON_SWITCHED:
				effect.pokemonSwitched(inf);
				break;
			case ROUND_STARTING:
				effect.roundBeginning(inf);
				break;
			case ROUND_ENDING:
				effect.roundEnding(inf);
				break;
			case ATTACK:
				effect.attack(inf);
				break;
			case DEFEND:
				effect.defend(inf);
				break;
		
		}
	
	}

	private void executeEffects(BattleEffectCollection effects, EffectTime time, Object... inf) {
		for (var effect : effects) {
			executeEffect(effect, time, inf);
		}
		effects.removeIf((obj) -> !obj.isEnabled());
	}

	private void executeEffects( EffectTime time, Object... inf) {
		for(Pokemon pkmn:this) {
			executeEffects(pkmn.getEffects(), time, inf);
		}
		

	}
	private void executeEffects(Pokemon pkmn,EffectTime time,Object... inf) {
		executeEffects(pkmn.getEffects(),time,inf);
	}

	private void executeEffects(PokemonBattle battle, EffectTime time) {
		executeEffects(battle._globalEffects, time, (Object[])null);
	}

	protected boolean _run = true;
	public static final byte PLAYER1 = -1;
	public static final byte PLAYER2 = +1;
	

	public void execute() {

		/*Move mv = null;
		while (_run) {
			Prompt.prompt(this.toString());
			executeSchedule();
			//if(canAttack(_player.getCurrPokemon()))continue; TODO
			int input = Prompt.prompt("Please select an option", "Fight", "Bag", "Pokemon", "Exit");
			if (input == 0) {

				while (mv == null) {
					mv = playerChoose();
				}

				// if(_run)break;
				mv.init(_schedule, PLAYER1, PLAYER2);

				mv = enemyChoose();
				mv.init(_schedule, PLAYER2, PLAYER1);

				_schedule.incrementRound();
			} else if (input == 2) {
				chooseNewPlayerPokemon();
			} else if (input == 3) {
				_run = false;
				exit();
			}
			mv = null;

		}*/
	}

	public void exit() {

	}





	public enum EffectTime {
		ROUND_STARTING, ROUND_ENDING, ATTACK, DEFEND, POKEMON_SWITCHED,POKEMON_DEFEATED
	}

	public BattleRoundResult executeSchedule(Interrupt interrupt) {
		Object[] effectParam= {null};
		LinkedList<BattleAction> actions=new LinkedList<>();
		executeEffects(_globalEffects, EffectTime.ROUND_STARTING, null);
		executeEffects(EffectTime.ROUND_STARTING, null);
		while (_schedule.any()) {
			ScheduleItem item = _schedule.getNext();
			var attacker = (item.getAttacker());
			var defender = (item.getDefender());

			var dmgInf = item.execute();
			
			for(var eff:dmgInf.getEffects()) {
				if (eff instanceof GlobalBattleEffect ) {
					_globalEffects.add(eff);
				}
				else if(eff instanceof PokemonBattleEffect ) {
					PokemonBattleEffect pkmneff=(PokemonBattleEffect)eff;
					pkmneff.getPokemon().addEffect(pkmneff);
				}
			}
			
			// storing the damage information in this array of size one so that it might be changed by the effects
			effectParam[0]=dmgInf;
			
			executeEffects(attacker, EffectTime.ATTACK, effectParam);
			executeEffects(defender, EffectTime.DEFEND, effectParam);
			dmgInf=(DamageInformation)effectParam[0];
			if (attacker.getCurrHP() <= 0) {
				
				String msg=(switchPokemon(interrupt,attacker));
				var action=new BattleAction(-1,msg,BattleAction.ActionKind.SwitchPokemon,null);
				actions.add(action);
				continue;
			}
			defender.modifyCurrHp(dmgInf.getDamage());
			dmgInf.getMessages().addFirst(dmgInf.toString());
			
			item.getMove().finishedMove(dmgInf);
			if (defender.getCurrHP() <= 0) {
				String msg=(switchPokemon(interrupt,defender));
				var action=new BattleAction(-1,msg,BattleAction.ActionKind.SwitchPokemon,null);
				actions.add(action);
				continue;
			}
			
			var action=new BattleAction(item.getID(),dmgInf.getMessages(),BattleAction.ActionKind.Move,null);
			actions.add(action);
			while(dmgInf.getEffects().size()>0) {
				var effect=dmgInf.getEffects().removeFirst();
				actions.add(effect.getBattleAction());
			}
			
		}
		executeEffects(_globalEffects, EffectTime.ROUND_ENDING, null);
		executeEffects( EffectTime.ROUND_ENDING, null);
		return new BattleRoundResult(actions, new DetailedBattleState(_players), NetworkMessageKind.Update);

		
	}
	

	

	

	private String switchPokemon(Interrupt interrupt, Pokemon pkmn) {
		short oldIndex=(short)indexOf(pkmn.getPlayer().getTeam(),pkmn);
		short newIndex=interrupt.forceSwitch(pkmn.getPlayer().getPlayerId(),oldIndex );
		var dummy=pkmn.getPlayer().getTeam()[oldIndex];
		String msg=pkmn.getPlayer().getName() +" replaced " +pkmn.toString()+" with "+ pkmn.getPlayer().getPokemon(newIndex).getName();
		pkmn.getPlayer().getTeam()[oldIndex]=pkmn.getPlayer().getTeam()[newIndex];
		pkmn.getPlayer().getTeam()[newIndex]=dummy;
		return msg;
		
	}

	protected void enemyLose() {
		System.out.println("Enemy loses");
		_run = false;

	}

	protected void playerLose() {
		System.out.println("Player loses");
		_run = false;

	}








	/**
	 * @param index the index, <0 for player, >0 for enemy
	 * @return the pokemon at that index
	 */
	private compf.core.etc.BufferList<Player> _players;
	public compf.core.etc.BufferList<Player> getPlayers() {
		
		return _players;
		
	}
	public void addInput(PlayerInput inp) {
		if(inp instanceof PlayerInput.AttackInput) {
			var att=(PlayerInput.AttackInput)inp;
			int attackerIndex=combine(att.PlayerId,att.PokemonIndex);
			int defenderIndex=combine(att.TargetPlayer,att.TargetPokemonIndex);
			var move_nr=getPokemon(attackerIndex).getMoves()[att.MoveIndex].getNr();
			_schedule.addMove(attackerIndex,defenderIndex,move_nr,1);
		}
		
	}
	public boolean allPlayerGaveInput(int maxNumberInputs) {
		return _schedule.allPlayersGaveInput(maxNumberInputs);
	}

}
