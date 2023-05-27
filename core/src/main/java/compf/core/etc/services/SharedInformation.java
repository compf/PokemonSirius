package compf.core.etc.services;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

import compf.core.etc.services.learnset.LearnsetService;
import compf.core.etc.services.logging.LoggerService;
import compf.core.etc.services.move.MoveService;
import compf.core.etc.services.pokemon.PokedexEntryService;
import compf.core.etc.services.random.RandomGeneratorService;

/**
 * @author timoc
 * @date 15.06.18
 */
public final class SharedInformation {

	public static final SharedInformation Instance = new SharedInformation();

	public void init(PokedexEntryService entryService, MoveService moveService, RandomGeneratorService randomService, LearnsetService learnsetService,
					 LoggerService loggerService) {
		if(entryService!=null){
			pokedexEntryService=entryService;
		}

		if(moveService!=null){
			this.moveService=moveService;
		}

		if(randomService!=null){
			this.randomService=randomService;
		}
		if(learnsetService!=null){
			this.learnsetService=learnsetService;
		}
		if(loggerService!=null){
			this.loggerService=loggerService;
		}
	}

	private PokedexEntryService pokedexEntryService;
	private MoveService moveService;
	private RandomGeneratorService randomService;
	private LearnsetService learnsetService;

	private LoggerService loggerService;

	public PokedexEntryService getPokedexEntryService() {
		return pokedexEntryService;
	}

	public MoveService getMoveService() {
		return moveService;
	}

	public RandomGeneratorService getRNG(){
		return randomService;
	}
	public LearnsetService getLearnsetService(){
		return learnsetService;
	}
	public  LoggerService getLoggerService(){return loggerService;}
	public InputStream getResource(String resourceName) throws IOException {
		return new FileInputStream("assets/" + resourceName);
	}

}
