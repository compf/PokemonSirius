package compf.core.networking;

import compf.core.engine.*;
import compf.core.etc.MyObject;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;
import java.util.function.BiPredicate;



public class ConsolePrompt implements IOInterface {
	protected final Scanner _scanner = new Scanner(System.in);
	private BattleRule _rule;
	private Player _player;
	public int prompt(String prompt, String... args) {
		System.out.println(prompt);
		for (int i = 0; i < args.length; i++) {
			System.out.println(i + "\t" + args[i]);
		}
		int result = _scanner.nextInt();

		return result;
	}

	public int prompt(String prompt, IPrompt<Integer> promptHelper, int begin, int[] args) {
		System.out.println(prompt);
		for (int i = begin; i < args.length; i++) {
			System.out.println(i + "\t" + promptHelper.prompt(args[i], i));
		}
		int result = _scanner.nextInt();

		return result;
	}
	public ConsolePrompt(BattleRule rule,Player player) {
		_rule=rule;
		_player=player;
	}
	public void message(String prompt) {
		System.out.println(prompt);
	}
	public int promptInt(String msg){
		message(msg);
		return _scanner.nextInt();
	}
	public void endBattle(){
		//TODO
	}
	public <T> int prompt(String prompt, IPrompt<T> promptHelper,BiPredicate<Integer,T> test, T... args) {
		System.out.println(prompt);
		for (int i = 0; i < args.length; i++) {
			if(test.test(i,args[i]))
			System.out.println(i + "\t" + promptHelper.prompt(args[i], i));
		}
		int result = _scanner.nextInt();

		return result;
	} 
	public <T> int prompt(String prompt, IPrompt<T> promptHelper, T... args) {
		System.out.println(prompt);
		for (int i = 0; i < args.length; i++) {
			System.out.println(i + "\t" + promptHelper.prompt(args[i], i));
		}
		int result = _scanner.nextInt();

		return result;
	}
	public <T> int prompt(String prompt, IPrompt<T> promptHelper,  ArrayList<T> args) {
		System.out.println(prompt);
		for (int i = 0; i < args.size(); i++) {
			System.out.println(i + "\t" + promptHelper.prompt(args.get(i), i));
		}
		int result = _scanner.nextInt();

		return result;
	}


	public void prompt(String prompt) {
		// TODO Auto-generated method stub
		
	}
	private HashMap<Integer, Integer> printState(BattleState state, boolean showSelectionIndex){
		return printState(state,showSelectionIndex,false,_rule.PokemonPerPlayerOnField);
	}
	private HashMap<Integer, Integer> printState(BattleState state, boolean showSelectionIndex,boolean onlyMe,int numPkmn){
		int selectionIndex=0;
		HashMap<Integer, Integer> pkmnSelectionIndexMap=showSelectionIndex?new HashMap<>() :null;
		for(short pId: state.getPlayerIds()) {
			String p_msg=state.getPlayerName(pId);
			if(pId==_player.getPlayerId())p_msg="(ME) "+p_msg;
			if(onlyMe && pId!=_player.getPlayerId())continue;;
			message(p_msg);
			for(short i=0;i<_rule.PokemonPerPlayerOnField;i++) {
				String msg=state.getPokemonName(pId, i)+ "["+ state.getCurrHp(pId, i)+"/"+state.getMaxHP(pId, i)+"]";

				if(showSelectionIndex){
					msg=selectionIndex+"\t"+msg;
					pkmnSelectionIndexMap.put(selectionIndex, MyObject.combine(pId,i));
					selectionIndex+=1;
				}
				message(msg);

			}
		}
		return pkmnSelectionIndexMap;
	}
	@Override
	public void update(BattleRoundResult result) {
		for(var action:result.Actions) {
			for(var msg:action.Messages) {
				message(msg);
			}
		}
		var state=result.State;
		printState(state,false);
		
		
	}

	@Override
	public void setLock(boolean val) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public PlayerInput requestPlayerInput(short pkmnIndex, BattleState state) {
		short mvIndex=(short)prompt("Please input id of move",(mv,i)->mv.getName(),_player.getPokemon(pkmnIndex).getMoves());
		var map=printState(state,true);
		//printState(state,true);
		int targetIndex=promptInt("Please input target index as described above");
		var targetIndices=MyObject.getIndices(map.get(targetIndex));
		short targetPlayer=targetIndices[0];
		short targetPokemon=targetIndices[1];

		 return new PlayerInput.AttackInput(pkmnIndex,mvIndex,targetPlayer,targetPokemon,_player.getPlayerId());
	}

	@Override
	public short switchPokemon(BattleState state, short oldIndex) {
		var map=printState(state,true,true,_rule.MaxPokemonInTeamPerPlayer);
		short index;
		do{
			 index=promptShort("You must select a new pokemon. Please input a index from above(may not be same as "+oldIndex);
		}while(index==oldIndex);
		return index;
	}

	private short promptShort(String s) {
		message(s);
		return _scanner.nextShort();
	}

}
