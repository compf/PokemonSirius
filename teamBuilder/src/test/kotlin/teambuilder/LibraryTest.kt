/*
 * This Kotlin source file was generated by the Gradle 'init' task.
 */
package teambuilder
import compf.core.engine.pokemon.Nature
import compf.core.engine.pokemon.PokePasteParser
import compf.core.engine.pokemon.PokemonStat
import compf.core.etc.services.SharedInformation
import compf.core.etc.services.learnset.DefaultLearnsetService
import compf.core.etc.services.logging.NoLoggerService
import compf.core.etc.services.move.DefaultMoveService
import compf.core.etc.services.pokemon.DefaultPokedexEntryService
import compf.core.etc.services.random.RealRandomGeneratorService
import org.junit.jupiter.api.BeforeAll
import util.CountingStyleIterator
import kotlin.test.Test
import kotlin.test.assertEquals

class LibraryTest {
    companion object{
        @BeforeAll
        @JvmStatic
        public fun init(){
                SharedInformation.Instance.init(
                    DefaultPokedexEntryService("pokedex.json"),
                    DefaultMoveService("moves.json"),RealRandomGeneratorService(),
                    DefaultLearnsetService("learnsets.json"),
                    NoLoggerService()
                )
        }
 
}
    @Test fun testPokePasteParser() {
        //SharedInformation.Instance.init()
       val input=
"""Dragonite @ Weakness Policy  
Ability: Clear Body  
Level: 50  
EVs: 252 HP / 252 Atk / 4 SpD  
Adamant Nature  
- Thunder  
- Iron Head  
- Ice Punch  
- Stomping Tantrum  
""";
       val parser=PokePasteParser(input)

       val pkmn=parser.parse()
       assertEquals(252,pkmn.eVs[PokemonStat.HP])
       assertEquals(252,pkmn.eVs[PokemonStat.ATT])
       assertEquals(pkmn.eVs[PokemonStat.SDEF],4)
       assertEquals(Nature.ATT_ATT, pkmn.nature)
       assertEquals(50, pkmn.level)
       val finder=ThreatFinder("Dragonite","Greninja","gen9ou.json",50,0.6)
       val result=finder.findThreats()

    }
    @Test fun textDigitCountIterator(){
    val counter=DigitCountIterator(3)
        var count=0
        var result=0
        counter.resetAll()
        while(counter.hasNext()){
            result=counter.next()
            count++
        }
        assertEquals(1000,count)

    }
}
class DigitCountIterator(private val numberDigits:Int): CountingStyleIterator<Int>(numberDigits) {
    private val digits:IntArray =IntArray(numberDigits)
    override fun reset(index: Int) {
        iterators[index]=(0 until 10).iterator()
    }

    override fun assign(index: Int, value: Any) {
        digits[index]=value as Int
    }

    override fun construct(): Int {
        var power=1
        var result=0
        for(i in numberDigits-1 downTo  0){
            result+=digits[i]*power
            power*=10
        }
        return result
    }

}
