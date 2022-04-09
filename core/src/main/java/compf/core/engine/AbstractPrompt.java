/*public abstract class AbstractPrompt extends Thread{
	protected PokemonBattle _battle;
	
	public abstract int prompt(String prompt, String... args);
		
	

	public abstract int prompt(String prompt, IPrompt<Integer> promptHelper, int begin, int[] args);
	
	public abstract void prompt(String prompt);
	public abstract <T> int prompt(String prompt, IPrompt<T> promptHelper,BiPredicate<Integer,T> test, T... args);
		
	public abstract <T> int prompt(String prompt, IPrompt<T> promptHelper, T... args);
		
	public abstract <T> int prompt(String prompt, IPrompt<T> promptHelper,  ArrayList<T> args);
	public abstract int  choosePlayer();
	public abstract int chooseServerClient();
	public AbstractPrompt(PokemonBattle battle) {
		_battle=battle;
	}
	protected boolean _initFinnished;
	public void init() {
		
	}
	public void run() {
	
		
		_battle.init();

		_battle.execute();
		_battle.exit();
	}
		
}*/
