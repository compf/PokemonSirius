package compf.core.etc.services;

import com.google.gson.Gson;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import com.google.gson.reflect.TypeToken;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;

import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.sql.*;
import java.util.ArrayList;
import java.util.HashMap;

import compf.core.engine.pokemon.*;
import compf.core.engine.pokemon.moves.*;
import compf.core.engine.pokemon.moves.Move.MoveKind;

/**
 * @author timoc
 * @date 15.06.18
 */
public final class SharedInformation {

	public static final SharedInformation Instance = new SharedInformation();

	public void init(PokedexEntryService entryService, MoveService moveService, RandomGeneratorService randomService) {
		if(entryService!=null){
			pokedexEntryService=entryService;
		}

		if(moveService!=null){
			this.moveService=moveService;
		}

		if(randomService!=null){
			this.randomService=randomService;
		}
	}

	private PokedexEntryService pokedexEntryService;
	private MoveService moveService;
	private RandomGeneratorService randomService;

	public PokedexEntryService getPokedexEntryService() {
		return pokedexEntryService;
	}

	public MoveService getMoveService() {
		return moveService;
	}

	public RandomGeneratorService getRNG(){
		return randomService;
	}

	public InputStream getResource(String resourceName) throws IOException {
		return new FileInputStream("assets/" + resourceName);
	}

}