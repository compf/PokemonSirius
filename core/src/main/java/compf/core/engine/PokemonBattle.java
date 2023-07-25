package compf.core.engine;

import java.util.*;

import compf.core.engine.pokemon.*;
import compf.core.engine.pokemon.effects.*;
import compf.core.engine.pokemon.effects.BattleEffectCollection;
import compf.core.engine.pokemon.moves.MoveFactory;
import compf.core.engine.pokemon.moves.Schedule;
import compf.core.engine.pokemon.moves.Schedule.ScheduleItem;
import compf.core.etc.MyObject;
import compf.core.etc.services.SharedInformation;
public class PokemonBattle extends MyObject implements Iterable<Pokemon>, EventExecutor {

	Schedule _schedule;
	private BattleEffectCollection _globalEffects = new BattleEffectCollection();
	private static int _uid;
	public static PokemonBattle Battle;

	public int getUID() {
		return _uid++;
	}

	public static Pokemon[] createRandomTeam() {
		var team = new Pokemon[6];
		for (int i = 0; i < 6; i++) {
			team[i] = new Pokemon(SharedInformation.Instance.getPokedexEntryService()
					.get(1 + SharedInformation.Instance.getRNG().randomNumber(0,SharedInformation.Instance.getPokedexEntryService().getCount() - 1,PokemonBattle.class)));
		}
		return team;
	}

	public PokemonBattle(BattleRule rule) {
		this._players = new ArrayList<Player>(rule.NumberPlayers);
		_schedule = new Schedule(this);
		_rule=rule;
	}

	private BattleRule _rule;

	public void init() {

	}

	public Pokemon getPokemon(int index) {
		var s = getIndices(index);
		return _players.get(s[0]).getPokemon(s[1]);
	}

	public void incrementRound() {
		_schedule.incrementRound();
	}

	public int getRound() {
		return _schedule.getCurrRound();
	}

	public boolean hasEnoughPlayers() {
		return _players.size()>= _rule.NumberPlayers;
	}

	public void start() {
		executeEffects(EffectTime.BATTLE_STARTED,new EffectParam(_schedule,null,_rule,this,null));
	}

	public class BattleIterator implements Iterator<Pokemon> {
		private int _iterator_player_index, _iterator_pkmn_index;

		@Override
		public boolean hasNext() {
			boolean b = _iterator_player_index < _players.size();
			if (!b) {
				_iterator_player_index = _iterator_pkmn_index = 0;
			}
			return b;
		}

		public Pokemon next() {
			Player player = _players.get(_iterator_player_index);
			Pokemon pkmn = player.getPokemon(_iterator_pkmn_index);
			_iterator_pkmn_index++;
			if (_iterator_pkmn_index >= player.getPokemonCount()) {
				_iterator_pkmn_index = 0;
				_iterator_player_index++;

			}
			return pkmn;
		}
	}

	public Iterator<Pokemon> iterator() {
		return new BattleIterator();
	}

	public void executeEffect(BattleEffect effect, EffectTime time, EffectParam param) {
		if (!effect.isEnabled())
			return;
		switch (time) {
			case POKEMON_DEFEATED:
				effect.pokemonDefeated(param);
				break;
			case POKEMON_SWITCHED:
				effect.pokemonSwitched(param);
				break;
			case ROUND_STARTING:
				effect.roundBeginning(param);
				break;
			case ROUND_ENDING:
				effect.roundEnding(param);
				break;
			case ATTACK:
				effect.attack(param);
				break;
			case DEFEND:
				effect.defend(param);
				break;
			case DELAYED_ATTACK:
				effect.delayedAttack(param);
			case BATTLE_STARTED:
					effect.battleStarted(param);
			case STATS_MODIFIED:
					effect.statsModified(param);

		}

	}

	public void executeEffects(BattleEffectCollection effects, EffectTime time, EffectParam param) {
		for (var effect : effects) {
			executeEffect(effect, time, param);
		}
		effects.removeIf((obj) -> !obj.isEnabled());
	}

	public void executeEffects(EffectTime time, EffectParam param) {
		for (Pokemon pkmn : this) {
			executeEffects(pkmn.getEffects(), time, param);
		}
		executeEffects(_globalEffects,time,param);

	}

	private void executeEffects(Pokemon pkmn, EffectTime time, EffectParam param) {
		executeEffects(pkmn.getEffects(), time, param);
	}


	protected boolean _run = true;
	public static final byte PLAYER1 = -1;
	public static final byte PLAYER2 = +1;

    /*public void execute() {

		
		 * Move mv = null;
		 * while (_run) {
		 * Prompt.prompt(this.toString());
		 * executeSchedule();
		 * //if(canAttack(_player.getCurrPokemon()))continue; TODO
		 * int input = Prompt.prompt("Please select an option", "Fight", "Bag",
		 * "Pokemon", "Exit");
		 * if (input == 0) {
		 * 
		 * while (mv == null) {
		 * mv = playerChoose();
		 * }
		 * 
		 * // if(_run)break;
		 * mv.init(_schedule, PLAYER1, PLAYER2);
		 * 
		 * mv = enemyChoose();
		 * mv.init(_schedule, PLAYER2, PLAYER1);
		 * 
		 * _schedule.incrementRound();
		 * } else if (input == 2) {
		 * chooseNewPlayerPokemon();
		 * } else if (input == 3) {
		 * _run = false;
		 * exit();
		 * }
		 * mv = null;
		 * 
		 * }
		 
	}*/

	public void exit() {

	}

	public static class PokemonComparator implements  Comparator<Pokemon>{

		@Override
		public int compare(Pokemon arg0, Pokemon arg1) {
			if (arg0.getStat(5) > arg1.getStat(5))
				return -1;
			if (arg0.getStat(5) < arg1.getStat(5))
				return +1;
			else{
				// Randome choice if equal, will neve return 0
				return SharedInformation.Instance.getRNG().checkPerc(50,PokemonComparator.class) ? +1 : -1;

			}
		}
	}

	private Iterable<Pokemon> sort() {
		ArrayList<Pokemon> ls = new ArrayList<>();
		for (var pkmn : this) {
			ls.add(pkmn);
		}
		ls.sort(new PokemonComparator());
		return ls;
	}

	@Override
	public boolean hasEffect(Class<?> effectClass) {
		boolean result= _globalEffects.hasEffect(effectClass);
		for(var pkmn:this){
			result=result | pkmn.getEffects().hasEffect(effectClass);
		}
		return  result;
	}

	public BattleRoundResult executeSchedule(Interrupt interrupt) {
		LinkedList<BattleAction> actions = new LinkedList<>();
		executeEffects(EffectTime.ROUND_STARTING, new EffectParam(_schedule,interrupt,_rule,this,null));
		var pokemonSorted = sort();
		for (var pkmn : pokemonSorted) {
			executeEffects(pkmn, EffectTime.DELAYED_ATTACK, new EffectParam( _schedule,interrupt,_rule,this,null));
		}
		while (_schedule.any()) {
			ScheduleItem item = _schedule.getNext();
			var attacker = (item.getAttacker());
			var defender = (item.getDefender());

			var dmgInf = item.execute();

			for (var eff : dmgInf.getEffects()) {
				if (eff instanceof GlobalBattleEffect) {
					_globalEffects.add(eff);
				} else if (eff instanceof PokemonBattleEffect) {
					PokemonBattleEffect pkmneff = (PokemonBattleEffect) eff;
					pkmneff.getPokemon().addEffect(pkmneff);
				}
			}


			EffectParam effectParam=new EffectParam(_schedule,interrupt,_rule,this,new EffectParam.AdditionalDirectDamageData(dmgInf,item));
			executeEffects( EffectTime.ATTACK, effectParam);
			executeEffects(EffectTime.DEFEND, effectParam);
			dmgInf = ((EffectParam.AdditionalDirectDamageData)effectParam.additionalData()).getDamageInformation();
			if (attacker.getCurrHP() <= 0) {

				short oldIndex = (short) indexOf(attacker.getPlayer().getTeam(), attacker);

				short newIndex = interrupt.forceSwitch(attacker.getPlayer().getPlayerId(), oldIndex);
				String msg = (switchPokemon( attacker.getPlayer(),oldIndex,newIndex));
				var switchAction = new BattleAction(-1, msg, BattleAction.ActionKind.SwitchPokemon, attacker.getPlayer().getPlayerId() +" "+ oldIndex +" "+newIndex);
				actions.add(switchAction);
				continue;
			}
			defender.modifyCurrHp(dmgInf.getDamage());
			dmgInf.getMessages().addFirst(dmgInf.toString());

			item.getMove().finishedMove(dmgInf);
			var action = new BattleAction(item.getID(), dmgInf.getMessages(), BattleAction.ActionKind.Move,
					dmgInf);
			actions.add(action);
			if (defender.getCurrHP() <= 0) {
				short oldIndex = (short) indexOf(defender.getPlayer().getTeam(), defender);

				short newIndex = interrupt.forceSwitch(defender.getPlayer().getPlayerId(), oldIndex);
				String msg = (switchPokemon(defender.getPlayer(),oldIndex, newIndex));
				var switchAction = new BattleAction(-1, msg, BattleAction.ActionKind.SwitchPokemon, defender.getPlayer().getPlayerId() +" "+ oldIndex +" "+newIndex);
				actions.add(switchAction);

			}


		}
		executeEffects(_globalEffects, EffectTime.ROUND_ENDING, null);
		executeEffects(EffectTime.ROUND_ENDING, null);
		for(var pkmn:this) {
			for(var effect:pkmn.getEffects()){
				var battleAction=effect.getBattleAction();
				if(battleAction!=null){
					actions.add(battleAction);
				}


			}
		}

		return new BattleRoundResult(actions, new DetailedBattleState(_players), NetworkMessageKind.Update);

	}

	public String switchPokemon(Player player,short oldIndex,short newIndex) {

		Pokemon pkmn=player.getPokemon(oldIndex);
		_schedule.clear(combine(player.getPlayerId(),newIndex));
		if(newIndex==-1)return "Could not switch";
		var dummy = player.getTeam()[oldIndex];
		String msg = player.getName() + " replaced " + pkmn.toString() + " with "
				+ pkmn.getPlayer().getPokemon(newIndex).getName();
		player.getTeam()[oldIndex] =player.getTeam()[newIndex];
		player.getTeam()[newIndex] = dummy;
		return msg;

	}


	/**
	 * @param index the index, <0 for player, >0 for enemy
	 * @return the pokemon at that index
	 */
	private ArrayList<Player> _players;

	public List<Player> getPlayers() {

		return _players;

	}

	public void addInput(PlayerInput inp) {
		if (inp instanceof PlayerInput.AttackInput) {
			var att = (PlayerInput.AttackInput) inp;
			int attackerIndex = combine(att.PlayerId, att.PokemonIndex);
			int defenderIndex = combine(att.TargetPlayer, att.TargetPokemonIndex);
			var move = new MoveFactory().create(getPokemon(attackerIndex).getMoves()[att.MoveIndex]);
			move.init(_schedule, attackerIndex, defenderIndex);
		} else if(inp instanceof  PlayerInput.SwitchPokemonInput switch_inp){
			Pokemon pkmn=getPlayerById(switch_inp.PlayerId).getPokemon(switch_inp.PokemonOldIndex);
			switchPokemon(getPlayerById(switch_inp.PlayerId),switch_inp.PokemonOldIndex,switch_inp.PokemonNewIndex);
		}

	}

	public Player getPlayerById(short playerId){
		for(var p:_players){
			if(p.getPlayerId()==playerId)return p;
		}
		return null;
	}

	public boolean allPlayerGaveInput(int maxNumberInputs) {
		return _schedule.allPlayersGaveInput(maxNumberInputs);
	}

}
