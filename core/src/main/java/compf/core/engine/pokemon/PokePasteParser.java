package compf.core.engine.pokemon;

import java.io.IOException;
import java.io.InputStream;
import java.util.Arrays;
import java.util.regex.*;
import org.apache.logging.log4j.core.util.StringEncoder;

import compf.core.engine.pokemon.Pokemon.Gender;
import compf.core.engine.pokemon.moves.Move;
import compf.core.etc.MyObject;
import compf.core.etc.services.SharedInformation;

public class PokePasteParser {
    private String[] lines;
    public PokePasteParser(InputStream stream){
        
        try {
            String str=new String(stream.readAllBytes());
            parseString(str);
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
    public PokePasteParser(String text){
        
        parseString(text);
    }
    private void parseString(String text){
        lines=text.split("\n");
    }
    final  String[] statNames={"HP" , "Atk","Def" ,  "SpA" ,  "SpD" ,  "Spe"};
    public Pokemon parse(){
        var firstLine=parseFirstLine(lines[0]);
        int level=50;
        Nature nature=Nature.ATT_ATT;
        int[] evs={0,0,0,0,0,0};
        int[] ivs={31,31,31,31,31,31};
        Move[] moves=new Move[4];
        for(int i=1;i<lines.length;i++){
            if(lines[i].startsWith("Ability")){
                //ignore for now
            }
            else if(lines[i].startsWith("Level")){
               level=Integer.parseInt(lines[i].split(":")[1].strip());
            }
            else if(lines[i].startsWith("EVs")){
                evs=parseStatLine(lines[i], 0);
             }
             else if(lines[i].startsWith("Ivs")){
                evs=parseStatLine(lines[i], 31);
             }
             else if(lines[i].endsWith("Nature")){
                nature=Nature.parse( lines[i].split(" ")[0]);
             }
             else if(lines[i].startsWith("-")){
                String move=lines[i].substring(2).strip();
                int moveIndex=MyObject.indexOf(moves, null);
                moves[moveIndex]=SharedInformation.Instance.getMoveService().get(move);
             }
        }
        int nr=SharedInformation.Instance.getPokedexEntryService().get(firstLine.species).getNr();
        return new Pokemon(nr, level, evs, ivs, nature, moves);
    }
    private int[] parseStatLine(String line,int defaultValue){
        int[] values=new int[6];
        Arrays.fill(values,defaultValue);
        String[] statsSplitted=line.substring(5).split("/");
        for(String valStatName:statsSplitted){
            String[] splitted=valStatName.strip().split(" ");
            values[MyObject.indexOf(statNames, splitted[1])]=Integer.parseInt(splitted[0]);
        }
        return values;
    }
    private FirstLineInformation parseFirstLine(String line){
       String[] whiteSpaceSplitted=line.split(" ");
        var inf=new FirstLineInformation();
        boolean atSignFound=false;
        for(int i=0;i<whiteSpaceSplitted.length;i++){
            if(whiteSpaceSplitted[i].contentEquals("(F)") ){
                //male by default
            }
            else if( whiteSpaceSplitted[i].contentEquals("(M)")){
                inf.gender=Gender.Female;
            }
            else if(whiteSpaceSplitted[i].startsWith("(") && whiteSpaceSplitted[i].endsWith(")")){
                inf.species=whiteSpaceSplitted[i].replace("(", "").replace(")", "");
            }
            else if(whiteSpaceSplitted[i].contentEquals("@")){
                atSignFound=true;
            }
            else if(atSignFound){
                inf.item+=whiteSpaceSplitted[i]+" "; 
            }
            else {
                inf.nickname=whiteSpaceSplitted[i];
            }
        }
        if(inf.species==null){
            inf.species=inf.nickname;
        }
        return inf;
    }
     private  static class FirstLineInformation{
        public Pokemon.Gender gender=Gender.Male;
        public String nickname;
        public String species;
        public String item="";
    }
}
