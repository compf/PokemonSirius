/*
 * This Kotlin source file was generated by the Gradle 'init' task.
 */
package teambuilder
import compf.core.engine.pokemon.PokePasteParser;
import compf.core.engine.pokemon.PokemonStat
import compf.core.engine.pokemon.Nature
import compf.core.etc.MyObject
import compf.core.etc.services.DefaultPokedexEntryService
import compf.core.etc.services.DefaultMoveService
import compf.core.etc.services.SharedInformation
import kotlin.test.Test
import kotlin.test.assertTrue
import kotlin.test.assertEquals
import org.junit.jupiter.api.BeforeAll

class LibraryTest {
    companion object{
        @BeforeAll
        @JvmStatic
        public fun init(){
                SharedInformation.Instance.init(DefaultPokedexEntryService("kanto.json"),
                DefaultMoveService("moves.json"),WorstCaseRandomGenerator())
        }
 
}
    @Test fun testPokePasteParser() {
        //SharedInformation.Instance.init()
       val input=
"""Pikachu @ Weakness Policy  
Ability: Clear Body  
Level: 50  
EVs: 252 HP / 252 Atk / 4 SpD  
Adamant Nature  
- Protect  
- Iron Head  
- Ice Punch  
- Stomping Tantrum  
""";
       val parser=PokePasteParser(input)

       val pkmn=parser.parse()
       assertEquals(252,pkmn.getEV(PokemonStat.HP))
       assertEquals(252,pkmn.getEV(PokemonStat.ATT))
       assertEquals(pkmn.getEV(PokemonStat.SDEF),4)
       assertEquals(Nature.Hardy, pkmn.nature)
       assertEquals(50, pkmn.level)
       val finder=ThreatFinder(pkmn)
       val result=finder.findThreats(1.0)
       println(result.size)

    }
}