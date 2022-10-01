package compf.core.engine; /**
 * 
 */

import java.sql.*;
import compf.core.engine.pokemon.*;
import compf.core.engine.pokemon.moves.*;
/**
 * @author timoc
 *@date 15.06.18
 */
public final class SharedInformation {
	public static final int[] PokemonGenCount= {151,251,386,493,650,722,808};
	public static final int TeamSize =6 ;
	public static final int MovesPerPokemonCount=4;
	private static final String WIN_PATH="jdbc:sqlite:veekun-pokedex.sqlite";
	private static  String PATH=WIN_PATH;
	public static final  int PokemonCount = 491;
	public static final  int MovesCount = PokemonCount - 100;
	private PokedexEntry[] pokemon=new PokedexEntry[PokemonCount];
	private Move[] moves=new Move[MovesCount];
public static final SharedInformation Instance=new SharedInformation();
	/**
	 * 
	 */
	private SharedInformation() {
		// TODO Auto-generated constructor stub
	}
	public void init() {
		
		try {
			
			Class.forName("org.sqlite.JDBC");
			final  String sqlString="jdbc:sqlite:lib/veekun-pokedex.sqlite";
			Connection conn=DriverManager.getConnection(sqlString);
		
		
			initPokemon(conn);
			initMoves(conn);
			conn.close();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	private void initPokemon(Connection conn) throws SQLException {
		PreparedStatement pkmnStatement=conn.prepareStatement("SELECT * FROM pokemon WHERE ?=id");
		PreparedStatement typeStatement=conn.prepareStatement("SELECT * FROM pokemon_types WHERE ?=pokemon_id");
		PreparedStatement statStatement=conn.prepareStatement("SELECT * FROM pokemon_stats WHERE ?=pokemon_id");
		for(int i=1;i<PokemonCount;i++) {
			pkmnStatement.setInt(1, i);
			typeStatement.setInt(1, i);
			statStatement.setInt(1, i);
			var reader=pkmnStatement.executeQuery();
			//reader.beforeFirst();
			reader.next();
			String name=reader.getString(2);
			name=Character.toUpperCase(name.charAt(0))+name.substring(1);
			float height=reader.getFloat(4);
			float weight=reader.getFloat(5);
			reader.close();
			reader=typeStatement.executeQuery();
			//reader.beforeFirst();
			boolean firstType=true;
			Type type1=Type.Empty;
			Type type2=Type.Empty;
			while(reader.next()) {
				if(firstType) {
					type1=Type.parse(reader.getInt(2));
					firstType=false;
				}
				else {
					type2=Type.parse(reader.getInt(2));
				}
					
				
			}
			reader.close();
			reader=statStatement.executeQuery();
			//reader.beforeFirst();
			int hp,att,def,satt,sdef,speed;
			reader.next();
			hp=reader.getInt(3);
			reader.next();
			att=reader.getInt(3);
			reader.next();
			def=reader.getInt(3);
			reader.next();
			satt=reader.getInt(3);
			reader.next();
			sdef=reader.getInt(3);
			reader.next();
			speed=reader.getInt(3);
			//System.out.println(name);
			pokemon[i-1]=new PokedexEntry(i,name,type1,type2,height,weight,hp,att,def,satt,sdef,speed);
		}
		
		
	}
	private void initMoves(Connection conn) throws SQLException{
		final MoveFactory factory=new MoveFactory();
		PreparedStatement statement=conn.prepareStatement("SELECT * FROM moves WHERE ?=id");
		for(int i=1;i<MovesCount;i++) {
			statement.setInt(1, i);
			var reader=statement.executeQuery();
			reader.next();
			String name=reader.getString(2);
			name=Character.toUpperCase(name.charAt(0))+name.substring(1);
			Type type=Type.parse(reader.getInt(4));
			if(type==null)type=Type.Normal;
			byte power=reader.getByte(5);
			byte pp=reader.getByte(6);
			byte accuracy=reader.getByte(7);
			if(accuracy==0){
				accuracy=127;
			}
			byte priority=reader.getByte(8);
			byte target=reader.getByte(9);
			if(priority>=0)priority++; //Prevent Zero in priority
			else priority--;

			int damageClass=reader.getInt(10);
			Move.MoveKind kind=null;
			if(damageClass==1)kind=Move.MoveKind.Status;
			else if(damageClass==2)kind=Move.MoveKind.Physical;
			else kind=Move.MoveKind.Special;
			final Move mv=new Move(i,name,power,pp,accuracy,priority,type,kind,Move.TargetType.find(target));
			moves[i-1]=factory.create(mv);
			reader.close();
		}
	}
	public PokedexEntry getPokedexEntry(int nr) {
		return pokemon[nr-1];
	}
	public Move getMove(int nr) {
		if(nr==0)return null;
		return moves[nr-1];
	}

}
