package compf.core.networking;

import compf.core.engine.*;
import compf.core.etc.MyObject;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;
import java.util.function.BiPredicate;

public class ConsolePrompt extends SimpleIOInterface {
	private static  Scanner _scanner =null;
	private BattleRule _rule;
	private Player _player;
	public interface IPrompt<T> {
		String prompt(T item, int index);
	}

	public int prompt(String prompt, String... args) {
		System.out.println(prompt);
		for (int i = 0; i < args.length; i++) {
			System.out.println(i + "\t" + args[i]);
		}
		int result =  Integer.parseInt( nextLine());

		return result;
	}

	public int prompt(String prompt, IPrompt<Integer> promptHelper, int begin, int[] args) {
		System.out.println(prompt);
		for (int i = begin; i < args.length; i++) {
			System.out.println(i + "\t" + promptHelper.prompt(args[i], i));
		}
		int result = Integer.parseInt(nextLine());

		return result;
	}

	public ConsolePrompt(BattleRule rule, Player player) {
		_rule = rule;
		_player = player;
	}

	public void message(String prompt) {
		System.out.println(prompt);
	}

	public int promptInt(String msg) {
		message(msg);
		return  Integer.parseInt( nextLine());
	}

	public void battleEnded(int playerLost) {
		// TODO
	}

	public <T> int prompt(String prompt, IPrompt<T> promptHelper, BiPredicate<Integer, T> test, T... args) {
		System.out.println(prompt);
		for (int i = 0; i < args.length; i++) {
			if (test.test(i, args[i]))
				System.out.println(i + "\t" + promptHelper.prompt(args[i], i));
		}
		int result =  Integer.parseInt( nextLine());

		return result;
	}

	public <T> int prompt(String prompt, IPrompt<T> promptHelper, T... args) {
		System.out.println(prompt);
		for (int i = 0; i < args.length; i++) {
			System.out.println(i + "\t" + promptHelper.prompt(args[i], i));
		}
		int result =  Integer.parseInt(nextLine());

		return result;
	}

	public <T> int prompt(String prompt, IPrompt<T> promptHelper, ArrayList<T> args) {
		System.out.println(prompt);
		for (int i = 0; i < args.size(); i++) {
			System.out.println(i + "\t" + promptHelper.prompt(args.get(i), i));
		}
		int result =  Integer.parseInt( nextLine());

		return result;
	}

	public void prompt(String prompt) {
		// TODO Auto-generated method stub

	}

	private HashMap<Integer, Integer> printState(BattleState state, boolean showSelectionIndex) {
		return printState(state, showSelectionIndex, false, _rule.PokemonPerPlayerOnField);
	}

	private HashMap<Integer, Integer> printState(BattleState state, boolean showSelectionIndex, boolean onlyMe,
			int numPkmn) {
		int selectionIndex = 0;
		HashMap<Integer, Integer> pkmnSelectionIndexMap = showSelectionIndex ? new HashMap<>() : null;
		for (short pId : state.getPlayerIds()) {
			String p_msg = state.getPlayerName(pId);
			if (pId == _player.getPlayerId())
				p_msg = "(ME) " + p_msg;
			if (onlyMe && pId != _player.getPlayerId())
				continue;
			;
			message(p_msg);
			for (short i = 0; i < _rule.PokemonPerPlayerOnField; i++) {
				String msg = state.getPokemonName(pId, i) + "[" + state.getCurrHp(pId, i) + "/" + state.getMaxHP(pId, i)
						+ "]";

				if (showSelectionIndex) {
					msg = selectionIndex + "\t" + msg;
					pkmnSelectionIndexMap.put(selectionIndex, MyObject.combine(pId, i));
					selectionIndex += 1;
				}
				message(msg);

			}
		}
		return pkmnSelectionIndexMap;
	}
	@Override
    public NetworkMessage handle(NetworkMessage msg) {
        switch (msg.Kind) {
            case RequestInputToIO:
                return NetworkMessageKind.ReplyInputFromIO.createMessage(requestPlayerInput(((Tuple<Short,BattleState>) msg.Data)));
            case SwitchPokemon:
                return NetworkMessageKind.ReplyInputFromIO
                        .createMessage(switchPokemon(((Tuple<Short, BattleState>) msg.Data)));
            case Update:
                update((BattleRoundResult) msg.Data);
                return null;
            case BattleEnded:
                battleEnded((int) msg.Data);
            default:
                return null;

        }
    }
	public void update(BattleRoundResult result) {
		for (var action : result.Actions) {
			for (var msg : action.Messages) {
				message(msg);
			}
		}
		var state = result.State;
		printState(state, false);

	}

	public PlayerInput requestPlayerInput(Tuple<Short, BattleState> inf) {
		short mvIndex = (short) prompt("Please input id of move", (mv, i) -> mv.getName(),
				_player.getPokemon(inf.Item1).getMoves());
		var map = printState(inf.Item2, true);
		// printState(state,true);
		int targetIndex = promptInt("Please input target index as described above");
		var targetIndices = MyObject.getIndices(map.get(targetIndex));
		short targetPlayer = targetIndices[0];
		short targetPokemon = targetIndices[1];

		return new PlayerInput.AttackInput(inf.Item1, mvIndex, targetPlayer, targetPokemon, _player.getPlayerId());
	}

	public short switchPokemon(Tuple<Short, BattleState> inf) {
		var map = printState(inf.Item2, true, true, _rule.MaxPokemonInTeamPerPlayer);
		short index;
		do {
			index = promptShort(
					"You must select a new pokemon. Please input a index from above(may not be same as " + inf.Item1);
		} while (index == inf.Item1);
		return index;
	}
	private String nextLine(){
		if(_scanner==null){
			_scanner=new Scanner(System.in);
		}
			return _scanner.nextLine();
		
	}

	private short promptShort(String s) {
		message(s);
		return  Short.parseShort( nextLine());
	}

}
