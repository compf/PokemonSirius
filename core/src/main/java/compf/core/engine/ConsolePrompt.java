/*import java.util.ArrayList;
import java.util.Scanner;
import java.util.function.BiPredicate;*/



/*public class ConsolePrompt extends AbstractPrompt {
	public ConsolePrompt(PokemonBattle battle) {
		super(battle);
	}
	protected final Scanner _scanner = new Scanner(System.in);
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
	public void prompt(String prompt) {
		System.out.println(prompt);
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
	@Override
	public int choosePlayer() {
		return _scanner.nextInt();
	}
	@Override
	public int chooseServerClient() {
		return _scanner.nextInt();
	}
}*/
