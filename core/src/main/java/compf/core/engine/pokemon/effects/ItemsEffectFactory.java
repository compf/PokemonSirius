package compf.core.engine.pokemon.effects;
 import compf.core.engine.pokemon.effects.PokemonBattleEffect;
 import compf.core.engine.pokemon.Pokemon;
public class ItemsEffectFactory{

public static PokemonBattleEffect getEffect(String effectName,Pokemon pkmn){

switch(effectName){
case "Ability Shield":
return new compf.core.engine.pokemon.effects.newEffects.items.Ability_Shield(pkmn);
case "Abomasite":
return new compf.core.engine.pokemon.effects.newEffects.items.Abomasite(pkmn);
case "Absolite":
return new compf.core.engine.pokemon.effects.newEffects.items.Absolite(pkmn);
case "Absorb Bulb":
return new compf.core.engine.pokemon.effects.newEffects.items.Absorb_Bulb(pkmn);
case "Adamant Crystal":
return new compf.core.engine.pokemon.effects.newEffects.items.Adamant_Crystal(pkmn);
case "Adamant Orb":
return new compf.core.engine.pokemon.effects.newEffects.items.Adamant_Orb(pkmn);
case "Adrenaline Orb":
return new compf.core.engine.pokemon.effects.newEffects.items.Adrenaline_Orb(pkmn);
case "Aerodactylite":
return new compf.core.engine.pokemon.effects.newEffects.items.Aerodactylite(pkmn);
case "Aggronite":
return new compf.core.engine.pokemon.effects.newEffects.items.Aggronite(pkmn);
case "Aguav Berry":
return new compf.core.engine.pokemon.effects.newEffects.items.Aguav_Berry(pkmn);
case "Air Balloon":
return new compf.core.engine.pokemon.effects.newEffects.items.Air_Balloon(pkmn);
case "Alakazite":
return new compf.core.engine.pokemon.effects.newEffects.items.Alakazite(pkmn);
case "Altarianite":
return new compf.core.engine.pokemon.effects.newEffects.items.Altarianite(pkmn);
case "Ampharosite":
return new compf.core.engine.pokemon.effects.newEffects.items.Ampharosite(pkmn);
case "Apicot Berry":
return new compf.core.engine.pokemon.effects.newEffects.items.Apicot_Berry(pkmn);
case "Aspear Berry":
return new compf.core.engine.pokemon.effects.newEffects.items.Aspear_Berry(pkmn);
case "Assault Vest":
return new compf.core.engine.pokemon.effects.newEffects.items.Assault_Vest(pkmn);
case "Audinite":
return new compf.core.engine.pokemon.effects.newEffects.items.Audinite(pkmn);
case "Babiri Berry":
return new compf.core.engine.pokemon.effects.newEffects.items.Babiri_Berry(pkmn);
case "Banettite":
return new compf.core.engine.pokemon.effects.newEffects.items.Banettite(pkmn);
case "Beedrillite":
return new compf.core.engine.pokemon.effects.newEffects.items.Beedrillite(pkmn);
case "Berry Juice":
return new compf.core.engine.pokemon.effects.newEffects.items.Berry_Juice(pkmn);
case "Big Root":
return new compf.core.engine.pokemon.effects.newEffects.items.Big_Root(pkmn);
case "Black Belt":
return new compf.core.engine.pokemon.effects.newEffects.items.Black_Belt(pkmn);
case "Black Glasses":
return new compf.core.engine.pokemon.effects.newEffects.items.Black_Glasses(pkmn);
case "Black Sludge":
return new compf.core.engine.pokemon.effects.newEffects.items.Black_Sludge(pkmn);
case "Blastoisinite":
return new compf.core.engine.pokemon.effects.newEffects.items.Blastoisinite(pkmn);
case "Blazikenite":
return new compf.core.engine.pokemon.effects.newEffects.items.Blazikenite(pkmn);
case "Blue Orb":
return new compf.core.engine.pokemon.effects.newEffects.items.Blue_Orb(pkmn);
case "Booster Energy":
return new compf.core.engine.pokemon.effects.newEffects.items.Booster_Energy(pkmn);
case "Bright Powder":
return new compf.core.engine.pokemon.effects.newEffects.items.Bright_Powder(pkmn);
case "Bug Gem":
return new compf.core.engine.pokemon.effects.newEffects.items.Bug_Gem(pkmn);
case "Bug Memory":
return new compf.core.engine.pokemon.effects.newEffects.items.Bug_Memory(pkmn);
case "Burn Drive":
return new compf.core.engine.pokemon.effects.newEffects.items.Burn_Drive(pkmn);
case "Cameruptite":
return new compf.core.engine.pokemon.effects.newEffects.items.Cameruptite(pkmn);
case "Cell Battery":
return new compf.core.engine.pokemon.effects.newEffects.items.Cell_Battery(pkmn);
case "Charcoal":
return new compf.core.engine.pokemon.effects.newEffects.items.Charcoal(pkmn);
case "Charizardite X":
return new compf.core.engine.pokemon.effects.newEffects.items.Charizardite_X(pkmn);
case "Charizardite Y":
return new compf.core.engine.pokemon.effects.newEffects.items.Charizardite_Y(pkmn);
case "Charti Berry":
return new compf.core.engine.pokemon.effects.newEffects.items.Charti_Berry(pkmn);
case "Cheri Berry":
return new compf.core.engine.pokemon.effects.newEffects.items.Cheri_Berry(pkmn);
case "Chesto Berry":
return new compf.core.engine.pokemon.effects.newEffects.items.Chesto_Berry(pkmn);
case "Chilan Berry":
return new compf.core.engine.pokemon.effects.newEffects.items.Chilan_Berry(pkmn);
case "Chill Drive":
return new compf.core.engine.pokemon.effects.newEffects.items.Chill_Drive(pkmn);
case "Choice Band":
return new compf.core.engine.pokemon.effects.newEffects.items.Choice_Band(pkmn);
case "Choice Scarf":
return new compf.core.engine.pokemon.effects.newEffects.items.Choice_Scarf(pkmn);
case "Choice Specs":
return new compf.core.engine.pokemon.effects.newEffects.items.Choice_Specs(pkmn);
case "Chople Berry":
return new compf.core.engine.pokemon.effects.newEffects.items.Chople_Berry(pkmn);
case "Clear Amulet":
return new compf.core.engine.pokemon.effects.newEffects.items.Clear_Amulet(pkmn);
case "Coba Berry":
return new compf.core.engine.pokemon.effects.newEffects.items.Coba_Berry(pkmn);
case "Colbur Berry":
return new compf.core.engine.pokemon.effects.newEffects.items.Colbur_Berry(pkmn);
case "Cornerstone Mask":
return new compf.core.engine.pokemon.effects.newEffects.items.Cornerstone_Mask(pkmn);
case "Covert Cloak":
return new compf.core.engine.pokemon.effects.newEffects.items.Covert_Cloak(pkmn);
case "Custap Berry":
return new compf.core.engine.pokemon.effects.newEffects.items.Custap_Berry(pkmn);
case "Dark Gem":
return new compf.core.engine.pokemon.effects.newEffects.items.Dark_Gem(pkmn);
case "Dark Memory":
return new compf.core.engine.pokemon.effects.newEffects.items.Dark_Memory(pkmn);
case "Deep Sea Scale":
return new compf.core.engine.pokemon.effects.newEffects.items.Deep_Sea_Scale(pkmn);
case "Deep Sea Tooth":
return new compf.core.engine.pokemon.effects.newEffects.items.Deep_Sea_Tooth(pkmn);
case "Destiny Knot":
return new compf.core.engine.pokemon.effects.newEffects.items.Destiny_Knot(pkmn);
case "Diancite":
return new compf.core.engine.pokemon.effects.newEffects.items.Diancite(pkmn);
case "Douse Drive":
return new compf.core.engine.pokemon.effects.newEffects.items.Douse_Drive(pkmn);
case "Draco Plate":
return new compf.core.engine.pokemon.effects.newEffects.items.Draco_Plate(pkmn);
case "Dragon Fang":
return new compf.core.engine.pokemon.effects.newEffects.items.Dragon_Fang(pkmn);
case "Dragon Gem":
return new compf.core.engine.pokemon.effects.newEffects.items.Dragon_Gem(pkmn);
case "Dragon Memory":
return new compf.core.engine.pokemon.effects.newEffects.items.Dragon_Memory(pkmn);
case "Dread Plate":
return new compf.core.engine.pokemon.effects.newEffects.items.Dread_Plate(pkmn);
case "Earth Plate":
return new compf.core.engine.pokemon.effects.newEffects.items.Earth_Plate(pkmn);
case "Eject Button":
return new compf.core.engine.pokemon.effects.newEffects.items.Eject_Button(pkmn);
case "Eject Pack":
return new compf.core.engine.pokemon.effects.newEffects.items.Eject_Pack(pkmn);
case "Electric Gem":
return new compf.core.engine.pokemon.effects.newEffects.items.Electric_Gem(pkmn);
case "Electric Memory":
return new compf.core.engine.pokemon.effects.newEffects.items.Electric_Memory(pkmn);
case "Electric Seed":
return new compf.core.engine.pokemon.effects.newEffects.items.Electric_Seed(pkmn);
case "Enigma Berry":
return new compf.core.engine.pokemon.effects.newEffects.items.Enigma_Berry(pkmn);
case "Eviolite":
return new compf.core.engine.pokemon.effects.newEffects.items.Eviolite(pkmn);
case "Expert Belt":
return new compf.core.engine.pokemon.effects.newEffects.items.Expert_Belt(pkmn);
case "Fairy Feather":
return new compf.core.engine.pokemon.effects.newEffects.items.Fairy_Feather(pkmn);
case "Fairy Gem":
return new compf.core.engine.pokemon.effects.newEffects.items.Fairy_Gem(pkmn);
case "Fairy Memory":
return new compf.core.engine.pokemon.effects.newEffects.items.Fairy_Memory(pkmn);
case "Fighting Gem":
return new compf.core.engine.pokemon.effects.newEffects.items.Fighting_Gem(pkmn);
case "Fighting Memory":
return new compf.core.engine.pokemon.effects.newEffects.items.Fighting_Memory(pkmn);
case "Figy Berry":
return new compf.core.engine.pokemon.effects.newEffects.items.Figy_Berry(pkmn);
case "Fire Gem":
return new compf.core.engine.pokemon.effects.newEffects.items.Fire_Gem(pkmn);
case "Fire Memory":
return new compf.core.engine.pokemon.effects.newEffects.items.Fire_Memory(pkmn);
case "Fist Plate":
return new compf.core.engine.pokemon.effects.newEffects.items.Fist_Plate(pkmn);
case "Flame Orb":
return new compf.core.engine.pokemon.effects.newEffects.items.Flame_Orb(pkmn);
case "Flame Plate":
return new compf.core.engine.pokemon.effects.newEffects.items.Flame_Plate(pkmn);
case "Float Stone":
return new compf.core.engine.pokemon.effects.newEffects.items.Float_Stone(pkmn);
case "Flying Gem":
return new compf.core.engine.pokemon.effects.newEffects.items.Flying_Gem(pkmn);
case "Flying Memory":
return new compf.core.engine.pokemon.effects.newEffects.items.Flying_Memory(pkmn);
case "Focus Band":
return new compf.core.engine.pokemon.effects.newEffects.items.Focus_Band(pkmn);
case "Focus Sash":
return new compf.core.engine.pokemon.effects.newEffects.items.Focus_Sash(pkmn);
case "Galladite":
return new compf.core.engine.pokemon.effects.newEffects.items.Galladite(pkmn);
case "Ganlon Berry":
return new compf.core.engine.pokemon.effects.newEffects.items.Ganlon_Berry(pkmn);
case "Garchompite":
return new compf.core.engine.pokemon.effects.newEffects.items.Garchompite(pkmn);
case "Gardevoirite":
return new compf.core.engine.pokemon.effects.newEffects.items.Gardevoirite(pkmn);
case "Gengarite":
return new compf.core.engine.pokemon.effects.newEffects.items.Gengarite(pkmn);
case "Ghost Gem":
return new compf.core.engine.pokemon.effects.newEffects.items.Ghost_Gem(pkmn);
case "Ghost Memory":
return new compf.core.engine.pokemon.effects.newEffects.items.Ghost_Memory(pkmn);
case "Glalitite":
return new compf.core.engine.pokemon.effects.newEffects.items.Glalitite(pkmn);
case "Grass Gem":
return new compf.core.engine.pokemon.effects.newEffects.items.Grass_Gem(pkmn);
case "Grass Memory":
return new compf.core.engine.pokemon.effects.newEffects.items.Grass_Memory(pkmn);
case "Grassy Seed":
return new compf.core.engine.pokemon.effects.newEffects.items.Grassy_Seed(pkmn);
case "Griseous Core":
return new compf.core.engine.pokemon.effects.newEffects.items.Griseous_Core(pkmn);
case "Griseous Orb":
return new compf.core.engine.pokemon.effects.newEffects.items.Griseous_Orb(pkmn);
case "Ground Gem":
return new compf.core.engine.pokemon.effects.newEffects.items.Ground_Gem(pkmn);
case "Ground Memory":
return new compf.core.engine.pokemon.effects.newEffects.items.Ground_Memory(pkmn);
case "Gyaradosite":
return new compf.core.engine.pokemon.effects.newEffects.items.Gyaradosite(pkmn);
case "Haban Berry":
return new compf.core.engine.pokemon.effects.newEffects.items.Haban_Berry(pkmn);
case "Hard Stone":
return new compf.core.engine.pokemon.effects.newEffects.items.Hard_Stone(pkmn);
case "Hearthflame Mask":
return new compf.core.engine.pokemon.effects.newEffects.items.Hearthflame_Mask(pkmn);
case "Heracronite":
return new compf.core.engine.pokemon.effects.newEffects.items.Heracronite(pkmn);
case "Houndoominite":
return new compf.core.engine.pokemon.effects.newEffects.items.Houndoominite(pkmn);
case "Iapapa Berry":
return new compf.core.engine.pokemon.effects.newEffects.items.Iapapa_Berry(pkmn);
case "Ice Gem":
return new compf.core.engine.pokemon.effects.newEffects.items.Ice_Gem(pkmn);
case "Ice Memory":
return new compf.core.engine.pokemon.effects.newEffects.items.Ice_Memory(pkmn);
case "Icicle Plate":
return new compf.core.engine.pokemon.effects.newEffects.items.Icicle_Plate(pkmn);
case "Insect Plate":
return new compf.core.engine.pokemon.effects.newEffects.items.Insect_Plate(pkmn);
case "Iron Ball":
return new compf.core.engine.pokemon.effects.newEffects.items.Iron_Ball(pkmn);
case "Iron Plate":
return new compf.core.engine.pokemon.effects.newEffects.items.Iron_Plate(pkmn);
case "Jaboca Berry":
return new compf.core.engine.pokemon.effects.newEffects.items.Jaboca_Berry(pkmn);
case "Kasib Berry":
return new compf.core.engine.pokemon.effects.newEffects.items.Kasib_Berry(pkmn);
case "Kebia Berry":
return new compf.core.engine.pokemon.effects.newEffects.items.Kebia_Berry(pkmn);
case "Kee Berry":
return new compf.core.engine.pokemon.effects.newEffects.items.Kee_Berry(pkmn);
case "Kangaskhanite":
return new compf.core.engine.pokemon.effects.newEffects.items.Kangaskhanite(pkmn);
case "King's Rock":
return new compf.core.engine.pokemon.effects.newEffects.items.King_s_Rock(pkmn);
case "Lansat Berry":
return new compf.core.engine.pokemon.effects.newEffects.items.Lansat_Berry(pkmn);
case "Latiasite":
return new compf.core.engine.pokemon.effects.newEffects.items.Latiasite(pkmn);
case "Latiosite":
return new compf.core.engine.pokemon.effects.newEffects.items.Latiosite(pkmn);
case "Lax Incense":
return new compf.core.engine.pokemon.effects.newEffects.items.Lax_Incense(pkmn);
case "Leek":
return new compf.core.engine.pokemon.effects.newEffects.items.Leek(pkmn);
case "Leftovers":
return new compf.core.engine.pokemon.effects.newEffects.items.Leftovers(pkmn);
case "Leppa Berry":
return new compf.core.engine.pokemon.effects.newEffects.items.Leppa_Berry(pkmn);
case "Liechi Berry":
return new compf.core.engine.pokemon.effects.newEffects.items.Liechi_Berry(pkmn);
case "Life Orb":
return new compf.core.engine.pokemon.effects.newEffects.items.Life_Orb(pkmn);
case "Light Ball":
return new compf.core.engine.pokemon.effects.newEffects.items.Light_Ball(pkmn);
case "Loaded Dice":
return new compf.core.engine.pokemon.effects.newEffects.items.Loaded_Dice(pkmn);
case "Lopunnite":
return new compf.core.engine.pokemon.effects.newEffects.items.Lopunnite(pkmn);
case "Lucarionite":
return new compf.core.engine.pokemon.effects.newEffects.items.Lucarionite(pkmn);
case "Lucky Punch":
return new compf.core.engine.pokemon.effects.newEffects.items.Lucky_Punch(pkmn);
case "Lum Berry":
return new compf.core.engine.pokemon.effects.newEffects.items.Lum_Berry(pkmn);
case "Luminous Moss":
return new compf.core.engine.pokemon.effects.newEffects.items.Luminous_Moss(pkmn);
case "Lustrous Globe":
return new compf.core.engine.pokemon.effects.newEffects.items.Lustrous_Globe(pkmn);
case "Lustrous Orb":
return new compf.core.engine.pokemon.effects.newEffects.items.Lustrous_Orb(pkmn);
case "Macho Brace":
return new compf.core.engine.pokemon.effects.newEffects.items.Macho_Brace(pkmn);
case "Magnet":
return new compf.core.engine.pokemon.effects.newEffects.items.Magnet(pkmn);
case "Mago Berry":
return new compf.core.engine.pokemon.effects.newEffects.items.Mago_Berry(pkmn);
case "Mail":
return new compf.core.engine.pokemon.effects.newEffects.items.Mail(pkmn);
case "Manectite":
return new compf.core.engine.pokemon.effects.newEffects.items.Manectite(pkmn);
case "Maranga Berry":
return new compf.core.engine.pokemon.effects.newEffects.items.Maranga_Berry(pkmn);
case "Mawilite":
return new compf.core.engine.pokemon.effects.newEffects.items.Mawilite(pkmn);
case "Meadow Plate":
return new compf.core.engine.pokemon.effects.newEffects.items.Meadow_Plate(pkmn);
case "Medichamite":
return new compf.core.engine.pokemon.effects.newEffects.items.Medichamite(pkmn);
case "Mental Herb":
return new compf.core.engine.pokemon.effects.newEffects.items.Mental_Herb(pkmn);
case "Metagrossite":
return new compf.core.engine.pokemon.effects.newEffects.items.Metagrossite(pkmn);
case "Metal Coat":
return new compf.core.engine.pokemon.effects.newEffects.items.Metal_Coat(pkmn);
case "Metal Powder":
return new compf.core.engine.pokemon.effects.newEffects.items.Metal_Powder(pkmn);
case "Metronome":
return new compf.core.engine.pokemon.effects.newEffects.items.Metronome(pkmn);
case "Mewtwonite X":
return new compf.core.engine.pokemon.effects.newEffects.items.Mewtwonite_X(pkmn);
case "Mewtwonite Y":
return new compf.core.engine.pokemon.effects.newEffects.items.Mewtwonite_Y(pkmn);
case "Micle Berry":
return new compf.core.engine.pokemon.effects.newEffects.items.Micle_Berry(pkmn);
case "Mind Plate":
return new compf.core.engine.pokemon.effects.newEffects.items.Mind_Plate(pkmn);
case "Miracle Seed":
return new compf.core.engine.pokemon.effects.newEffects.items.Miracle_Seed(pkmn);
case "Mirror Herb":
return new compf.core.engine.pokemon.effects.newEffects.items.Mirror_Herb(pkmn);
case "Misty Seed":
return new compf.core.engine.pokemon.effects.newEffects.items.Misty_Seed(pkmn);
case "Muscle Band":
return new compf.core.engine.pokemon.effects.newEffects.items.Muscle_Band(pkmn);
case "Mystic Water":
return new compf.core.engine.pokemon.effects.newEffects.items.Mystic_Water(pkmn);
case "Never-Melt Ice":
return new compf.core.engine.pokemon.effects.newEffects.items.Never_Melt_Ice(pkmn);
case "Normal Gem":
return new compf.core.engine.pokemon.effects.newEffects.items.Normal_Gem(pkmn);
case "Occa Berry":
return new compf.core.engine.pokemon.effects.newEffects.items.Occa_Berry(pkmn);
case "Odd Incense":
return new compf.core.engine.pokemon.effects.newEffects.items.Odd_Incense(pkmn);
case "Oran Berry":
return new compf.core.engine.pokemon.effects.newEffects.items.Oran_Berry(pkmn);
case "Passho Berry":
return new compf.core.engine.pokemon.effects.newEffects.items.Passho_Berry(pkmn);
case "Payapa Berry":
return new compf.core.engine.pokemon.effects.newEffects.items.Payapa_Berry(pkmn);
case "Pecha Berry":
return new compf.core.engine.pokemon.effects.newEffects.items.Pecha_Berry(pkmn);
case "Persim Berry":
return new compf.core.engine.pokemon.effects.newEffects.items.Persim_Berry(pkmn);
case "Petaya Berry":
return new compf.core.engine.pokemon.effects.newEffects.items.Petaya_Berry(pkmn);
case "Pidgeotite":
return new compf.core.engine.pokemon.effects.newEffects.items.Pidgeotite(pkmn);
case "Pinsirite":
return new compf.core.engine.pokemon.effects.newEffects.items.Pinsirite(pkmn);
case "Pixie Plate":
return new compf.core.engine.pokemon.effects.newEffects.items.Pixie_Plate(pkmn);
case "Poison Barb":
return new compf.core.engine.pokemon.effects.newEffects.items.Poison_Barb(pkmn);
case "Poison Gem":
return new compf.core.engine.pokemon.effects.newEffects.items.Poison_Gem(pkmn);
case "Poison Memory":
return new compf.core.engine.pokemon.effects.newEffects.items.Poison_Memory(pkmn);
case "Power Anklet":
return new compf.core.engine.pokemon.effects.newEffects.items.Power_Anklet(pkmn);
case "Power Band":
return new compf.core.engine.pokemon.effects.newEffects.items.Power_Band(pkmn);
case "Power Belt":
return new compf.core.engine.pokemon.effects.newEffects.items.Power_Belt(pkmn);
case "Power Bracer":
return new compf.core.engine.pokemon.effects.newEffects.items.Power_Bracer(pkmn);
case "Power Herb":
return new compf.core.engine.pokemon.effects.newEffects.items.Power_Herb(pkmn);
case "Power Lens":
return new compf.core.engine.pokemon.effects.newEffects.items.Power_Lens(pkmn);
case "Power Weight":
return new compf.core.engine.pokemon.effects.newEffects.items.Power_Weight(pkmn);
case "Psychic Gem":
return new compf.core.engine.pokemon.effects.newEffects.items.Psychic_Gem(pkmn);
case "Psychic Memory":
return new compf.core.engine.pokemon.effects.newEffects.items.Psychic_Memory(pkmn);
case "Psychic Seed":
return new compf.core.engine.pokemon.effects.newEffects.items.Psychic_Seed(pkmn);
case "Punching Glove":
return new compf.core.engine.pokemon.effects.newEffects.items.Punching_Glove(pkmn);
case "Quick Claw":
return new compf.core.engine.pokemon.effects.newEffects.items.Quick_Claw(pkmn);
case "Quick Powder":
return new compf.core.engine.pokemon.effects.newEffects.items.Quick_Powder(pkmn);
case "Rawst Berry":
return new compf.core.engine.pokemon.effects.newEffects.items.Rawst_Berry(pkmn);
case "Razor Claw":
return new compf.core.engine.pokemon.effects.newEffects.items.Razor_Claw(pkmn);
case "Razor Fang":
return new compf.core.engine.pokemon.effects.newEffects.items.Razor_Fang(pkmn);
case "Red Card":
return new compf.core.engine.pokemon.effects.newEffects.items.Red_Card(pkmn);
case "Red Orb":
return new compf.core.engine.pokemon.effects.newEffects.items.Red_Orb(pkmn);
case "Rindo Berry":
return new compf.core.engine.pokemon.effects.newEffects.items.Rindo_Berry(pkmn);
case "Rock Gem":
return new compf.core.engine.pokemon.effects.newEffects.items.Rock_Gem(pkmn);
case "Rock Incense":
return new compf.core.engine.pokemon.effects.newEffects.items.Rock_Incense(pkmn);
case "Rock Memory":
return new compf.core.engine.pokemon.effects.newEffects.items.Rock_Memory(pkmn);
case "Rocky Helmet":
return new compf.core.engine.pokemon.effects.newEffects.items.Rocky_Helmet(pkmn);
case "Room Service":
return new compf.core.engine.pokemon.effects.newEffects.items.Room_Service(pkmn);
case "Rose Incense":
return new compf.core.engine.pokemon.effects.newEffects.items.Rose_Incense(pkmn);
case "Roseli Berry":
return new compf.core.engine.pokemon.effects.newEffects.items.Roseli_Berry(pkmn);
case "Rowap Berry":
return new compf.core.engine.pokemon.effects.newEffects.items.Rowap_Berry(pkmn);
case "Rusted Shield":
return new compf.core.engine.pokemon.effects.newEffects.items.Rusted_Shield(pkmn);
case "Rusted Sword":
return new compf.core.engine.pokemon.effects.newEffects.items.Rusted_Sword(pkmn);
case "Sablenite":
return new compf.core.engine.pokemon.effects.newEffects.items.Sablenite(pkmn);
case "Safety Goggles":
return new compf.core.engine.pokemon.effects.newEffects.items.Safety_Goggles(pkmn);
case "Salac Berry":
return new compf.core.engine.pokemon.effects.newEffects.items.Salac_Berry(pkmn);
case "Salamencite":
return new compf.core.engine.pokemon.effects.newEffects.items.Salamencite(pkmn);
case "Sceptilite":
return new compf.core.engine.pokemon.effects.newEffects.items.Sceptilite(pkmn);
case "Scizorite":
return new compf.core.engine.pokemon.effects.newEffects.items.Scizorite(pkmn);
case "Scope Lens":
return new compf.core.engine.pokemon.effects.newEffects.items.Scope_Lens(pkmn);
case "Sea Incense":
return new compf.core.engine.pokemon.effects.newEffects.items.Sea_Incense(pkmn);
case "Sharp Beak":
return new compf.core.engine.pokemon.effects.newEffects.items.Sharp_Beak(pkmn);
case "Sharpedonite":
return new compf.core.engine.pokemon.effects.newEffects.items.Sharpedonite(pkmn);
case "Shed Shell":
return new compf.core.engine.pokemon.effects.newEffects.items.Shed_Shell(pkmn);
case "Shell Bell":
return new compf.core.engine.pokemon.effects.newEffects.items.Shell_Bell(pkmn);
case "Shock Drive":
return new compf.core.engine.pokemon.effects.newEffects.items.Shock_Drive(pkmn);
case "Shuca Berry":
return new compf.core.engine.pokemon.effects.newEffects.items.Shuca_Berry(pkmn);
case "Silk Scarf":
return new compf.core.engine.pokemon.effects.newEffects.items.Silk_Scarf(pkmn);
case "Silver Powder":
return new compf.core.engine.pokemon.effects.newEffects.items.Silver_Powder(pkmn);
case "Sitrus Berry":
return new compf.core.engine.pokemon.effects.newEffects.items.Sitrus_Berry(pkmn);
case "Sky Plate":
return new compf.core.engine.pokemon.effects.newEffects.items.Sky_Plate(pkmn);
case "Slowbronite":
return new compf.core.engine.pokemon.effects.newEffects.items.Slowbronite(pkmn);
case "Snowball":
return new compf.core.engine.pokemon.effects.newEffects.items.Snowball(pkmn);
case "Soft Sand":
return new compf.core.engine.pokemon.effects.newEffects.items.Soft_Sand(pkmn);
case "Soul Dew":
return new compf.core.engine.pokemon.effects.newEffects.items.Soul_Dew(pkmn);
case "Spell Tag":
return new compf.core.engine.pokemon.effects.newEffects.items.Spell_Tag(pkmn);
case "Splash Plate":
return new compf.core.engine.pokemon.effects.newEffects.items.Splash_Plate(pkmn);
case "Spooky Plate":
return new compf.core.engine.pokemon.effects.newEffects.items.Spooky_Plate(pkmn);
case "Starf Berry":
return new compf.core.engine.pokemon.effects.newEffects.items.Starf_Berry(pkmn);
case "Steelixite":
return new compf.core.engine.pokemon.effects.newEffects.items.Steelixite(pkmn);
case "Steel Gem":
return new compf.core.engine.pokemon.effects.newEffects.items.Steel_Gem(pkmn);
case "Steel Memory":
return new compf.core.engine.pokemon.effects.newEffects.items.Steel_Memory(pkmn);
case "Stick":
return new compf.core.engine.pokemon.effects.newEffects.items.Stick(pkmn);
case "Sticky Barb":
return new compf.core.engine.pokemon.effects.newEffects.items.Sticky_Barb(pkmn);
case "Stone Plate":
return new compf.core.engine.pokemon.effects.newEffects.items.Stone_Plate(pkmn);
case "Swampertite":
return new compf.core.engine.pokemon.effects.newEffects.items.Swampertite(pkmn);
case "Tanga Berry":
return new compf.core.engine.pokemon.effects.newEffects.items.Tanga_Berry(pkmn);
case "Thick Club":
return new compf.core.engine.pokemon.effects.newEffects.items.Thick_Club(pkmn);
case "Throat Spray":
return new compf.core.engine.pokemon.effects.newEffects.items.Throat_Spray(pkmn);
case "Toxic Orb":
return new compf.core.engine.pokemon.effects.newEffects.items.Toxic_Orb(pkmn);
case "Toxic Plate":
return new compf.core.engine.pokemon.effects.newEffects.items.Toxic_Plate(pkmn);
case "Twisted Spoon":
return new compf.core.engine.pokemon.effects.newEffects.items.Twisted_Spoon(pkmn);
case "Tyranitarite":
return new compf.core.engine.pokemon.effects.newEffects.items.Tyranitarite(pkmn);
case "Utility Umbrella":
return new compf.core.engine.pokemon.effects.newEffects.items.Utility_Umbrella(pkmn);
case "Venusaurite":
return new compf.core.engine.pokemon.effects.newEffects.items.Venusaurite(pkmn);
case "Wacan Berry":
return new compf.core.engine.pokemon.effects.newEffects.items.Wacan_Berry(pkmn);
case "Water Gem":
return new compf.core.engine.pokemon.effects.newEffects.items.Water_Gem(pkmn);
case "Water Memory":
return new compf.core.engine.pokemon.effects.newEffects.items.Water_Memory(pkmn);
case "Wave Incense":
return new compf.core.engine.pokemon.effects.newEffects.items.Wave_Incense(pkmn);
case "Weakness Policy":
return new compf.core.engine.pokemon.effects.newEffects.items.Weakness_Policy(pkmn);
case "Wellspring Mask":
return new compf.core.engine.pokemon.effects.newEffects.items.Wellspring_Mask(pkmn);
case "White Herb":
return new compf.core.engine.pokemon.effects.newEffects.items.White_Herb(pkmn);
case "Wide Lens":
return new compf.core.engine.pokemon.effects.newEffects.items.Wide_Lens(pkmn);
case "Wiki Berry":
return new compf.core.engine.pokemon.effects.newEffects.items.Wiki_Berry(pkmn);
case "Wise Glasses":
return new compf.core.engine.pokemon.effects.newEffects.items.Wise_Glasses(pkmn);
case "Yache Berry":
return new compf.core.engine.pokemon.effects.newEffects.items.Yache_Berry(pkmn);
case "Zap Plate":
return new compf.core.engine.pokemon.effects.newEffects.items.Zap_Plate(pkmn);
case "Zoom Lens":
return new compf.core.engine.pokemon.effects.newEffects.items.Zoom_Lens(pkmn);
case "Berserk Gene":
return new compf.core.engine.pokemon.effects.newEffects.items.Berserk_Gene(pkmn);
case "Berry":
return new compf.core.engine.pokemon.effects.newEffects.items.Berry(pkmn);
case "Bitter Berry":
return new compf.core.engine.pokemon.effects.newEffects.items.Bitter_Berry(pkmn);
case "Burnt Berry":
return new compf.core.engine.pokemon.effects.newEffects.items.Burnt_Berry(pkmn);
case "Gold Berry":
return new compf.core.engine.pokemon.effects.newEffects.items.Gold_Berry(pkmn);
case "Ice Berry":
return new compf.core.engine.pokemon.effects.newEffects.items.Ice_Berry(pkmn);
case "Mint Berry":
return new compf.core.engine.pokemon.effects.newEffects.items.Mint_Berry(pkmn);
case "Miracle Berry":
return new compf.core.engine.pokemon.effects.newEffects.items.Miracle_Berry(pkmn);
case "Mystery Berry":
return new compf.core.engine.pokemon.effects.newEffects.items.Mystery_Berry(pkmn);
case "Pink Bow":
return new compf.core.engine.pokemon.effects.newEffects.items.Pink_Bow(pkmn);
case "Polkadot Bow":
return new compf.core.engine.pokemon.effects.newEffects.items.Polkadot_Bow(pkmn);
case "PRZ Cure Berry":
return new compf.core.engine.pokemon.effects.newEffects.items.PRZ_Cure_Berry(pkmn);
case "PSN Cure Berry":
return new compf.core.engine.pokemon.effects.newEffects.items.PSN_Cure_Berry(pkmn);
case "Crucibellite":
return new compf.core.engine.pokemon.effects.newEffects.items.Crucibellite(pkmn);
case "Vile Vial":
return new compf.core.engine.pokemon.effects.newEffects.items.Vile_Vial(pkmn);
default:
return null;

}
}
}