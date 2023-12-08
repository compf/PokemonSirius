package compf.core.engine.pokemon.effects;
 import compf.core.engine.pokemon.effects.PokemonBattleEffect;
 import compf.core.engine.pokemon.Pokemon;
public class AbilitiesEffectFactory{

public static PokemonBattleEffect getEffect(String effectName,Pokemon pkmn){

switch(effectName){
case "Adaptability":
return new compf.core.engine.pokemon.effects.newEffects.abilities.Adaptability(pkmn);
case "Aerilate":
return new compf.core.engine.pokemon.effects.newEffects.abilities.Aerilate(pkmn);
case "Aftermath":
return new compf.core.engine.pokemon.effects.newEffects.abilities.Aftermath(pkmn);
case "Air Lock":
return new compf.core.engine.pokemon.effects.newEffects.abilities.Air_Lock(pkmn);
case "Analytic":
return new compf.core.engine.pokemon.effects.newEffects.abilities.Analytic(pkmn);
case "Anger Point":
return new compf.core.engine.pokemon.effects.newEffects.abilities.Anger_Point(pkmn);
case "Anger Shell":
return new compf.core.engine.pokemon.effects.newEffects.abilities.Anger_Shell(pkmn);
case "Anticipation":
return new compf.core.engine.pokemon.effects.newEffects.abilities.Anticipation(pkmn);
case "Arena Trap":
return new compf.core.engine.pokemon.effects.newEffects.abilities.Arena_Trap(pkmn);
case "Armor Tail":
return new compf.core.engine.pokemon.effects.newEffects.abilities.Armor_Tail(pkmn);
case "Aroma Veil":
return new compf.core.engine.pokemon.effects.newEffects.abilities.Aroma_Veil(pkmn);
case "As One (Glastrier)":
return new compf.core.engine.pokemon.effects.newEffects.abilities.As_One__Glastrier_(pkmn);
case "As One (Spectrier)":
return new compf.core.engine.pokemon.effects.newEffects.abilities.As_One__Spectrier_(pkmn);
case "Aura Break":
return new compf.core.engine.pokemon.effects.newEffects.abilities.Aura_Break(pkmn);
case "Bad Dreams":
return new compf.core.engine.pokemon.effects.newEffects.abilities.Bad_Dreams(pkmn);
case "Battery":
return new compf.core.engine.pokemon.effects.newEffects.abilities.Battery(pkmn);
case "Battle Bond":
return new compf.core.engine.pokemon.effects.newEffects.abilities.Battle_Bond(pkmn);
case "Beads of Ruin":
return new compf.core.engine.pokemon.effects.newEffects.abilities.Beads_of_Ruin(pkmn);
case "Beast Boost":
return new compf.core.engine.pokemon.effects.newEffects.abilities.Beast_Boost(pkmn);
case "Berserk":
return new compf.core.engine.pokemon.effects.newEffects.abilities.Berserk(pkmn);
case "Big Pecks":
return new compf.core.engine.pokemon.effects.newEffects.abilities.Big_Pecks(pkmn);
case "Blaze":
return new compf.core.engine.pokemon.effects.newEffects.abilities.Blaze(pkmn);
case "Bulletproof":
return new compf.core.engine.pokemon.effects.newEffects.abilities.Bulletproof(pkmn);
case "Cheek Pouch":
return new compf.core.engine.pokemon.effects.newEffects.abilities.Cheek_Pouch(pkmn);
case "Chilling Neigh":
return new compf.core.engine.pokemon.effects.newEffects.abilities.Chilling_Neigh(pkmn);
case "Chlorophyll":
return new compf.core.engine.pokemon.effects.newEffects.abilities.Chlorophyll(pkmn);
case "Clear Body":
return new compf.core.engine.pokemon.effects.newEffects.abilities.Clear_Body(pkmn);
case "Cloud Nine":
return new compf.core.engine.pokemon.effects.newEffects.abilities.Cloud_Nine(pkmn);
case "Color Change":
return new compf.core.engine.pokemon.effects.newEffects.abilities.Color_Change(pkmn);
case "Comatose":
return new compf.core.engine.pokemon.effects.newEffects.abilities.Comatose(pkmn);
case "Commander":
return new compf.core.engine.pokemon.effects.newEffects.abilities.Commander(pkmn);
case "Competitive":
return new compf.core.engine.pokemon.effects.newEffects.abilities.Competitive(pkmn);
case "Compound Eyes":
return new compf.core.engine.pokemon.effects.newEffects.abilities.Compound_Eyes(pkmn);
case "Contrary":
return new compf.core.engine.pokemon.effects.newEffects.abilities.Contrary(pkmn);
case "Costar":
return new compf.core.engine.pokemon.effects.newEffects.abilities.Costar(pkmn);
case "Cotton Down":
return new compf.core.engine.pokemon.effects.newEffects.abilities.Cotton_Down(pkmn);
case "Cud Chew":
return new compf.core.engine.pokemon.effects.newEffects.abilities.Cud_Chew(pkmn);
case "Curious Medicine":
return new compf.core.engine.pokemon.effects.newEffects.abilities.Curious_Medicine(pkmn);
case "Cursed Body":
return new compf.core.engine.pokemon.effects.newEffects.abilities.Cursed_Body(pkmn);
case "Cute Charm":
return new compf.core.engine.pokemon.effects.newEffects.abilities.Cute_Charm(pkmn);
case "Damp":
return new compf.core.engine.pokemon.effects.newEffects.abilities.Damp(pkmn);
case "Dark Aura":
return new compf.core.engine.pokemon.effects.newEffects.abilities.Dark_Aura(pkmn);
case "Dauntless Shield":
return new compf.core.engine.pokemon.effects.newEffects.abilities.Dauntless_Shield(pkmn);
case "Dazzling":
return new compf.core.engine.pokemon.effects.newEffects.abilities.Dazzling(pkmn);
case "Defeatist":
return new compf.core.engine.pokemon.effects.newEffects.abilities.Defeatist(pkmn);
case "Defiant":
return new compf.core.engine.pokemon.effects.newEffects.abilities.Defiant(pkmn);
case "Delta Stream":
return new compf.core.engine.pokemon.effects.newEffects.abilities.Delta_Stream(pkmn);
case "Desolate Land":
return new compf.core.engine.pokemon.effects.newEffects.abilities.Desolate_Land(pkmn);
case "Disguise":
return new compf.core.engine.pokemon.effects.newEffects.abilities.Disguise(pkmn);
case "Download":
return new compf.core.engine.pokemon.effects.newEffects.abilities.Download(pkmn);
case "Dragon's Maw":
return new compf.core.engine.pokemon.effects.newEffects.abilities.Dragon_s_Maw(pkmn);
case "Drizzle":
return new compf.core.engine.pokemon.effects.newEffects.abilities.Drizzle(pkmn);
case "Drought":
return new compf.core.engine.pokemon.effects.newEffects.abilities.Drought(pkmn);
case "Dry Skin":
return new compf.core.engine.pokemon.effects.newEffects.abilities.Dry_Skin(pkmn);
case "Earth Eater":
return new compf.core.engine.pokemon.effects.newEffects.abilities.Earth_Eater(pkmn);
case "Effect Spore":
return new compf.core.engine.pokemon.effects.newEffects.abilities.Effect_Spore(pkmn);
case "Electric Surge":
return new compf.core.engine.pokemon.effects.newEffects.abilities.Electric_Surge(pkmn);
case "Electromorphosis":
return new compf.core.engine.pokemon.effects.newEffects.abilities.Electromorphosis(pkmn);
case "Embody Aspect (Cornerstone)":
return new compf.core.engine.pokemon.effects.newEffects.abilities.Embody_Aspect__Cornerstone_(pkmn);
case "Embody Aspect (Hearthflame)":
return new compf.core.engine.pokemon.effects.newEffects.abilities.Embody_Aspect__Hearthflame_(pkmn);
case "Embody Aspect (Teal)":
return new compf.core.engine.pokemon.effects.newEffects.abilities.Embody_Aspect__Teal_(pkmn);
case "Embody Aspect (Wellspring)":
return new compf.core.engine.pokemon.effects.newEffects.abilities.Embody_Aspect__Wellspring_(pkmn);
case "Emergency Exit":
return new compf.core.engine.pokemon.effects.newEffects.abilities.Emergency_Exit(pkmn);
case "Fairy Aura":
return new compf.core.engine.pokemon.effects.newEffects.abilities.Fairy_Aura(pkmn);
case "Filter":
return new compf.core.engine.pokemon.effects.newEffects.abilities.Filter(pkmn);
case "Flame Body":
return new compf.core.engine.pokemon.effects.newEffects.abilities.Flame_Body(pkmn);
case "Flare Boost":
return new compf.core.engine.pokemon.effects.newEffects.abilities.Flare_Boost(pkmn);
case "Flash Fire":
return new compf.core.engine.pokemon.effects.newEffects.abilities.Flash_Fire(pkmn);
case "Flower Gift":
return new compf.core.engine.pokemon.effects.newEffects.abilities.Flower_Gift(pkmn);
case "Flower Veil":
return new compf.core.engine.pokemon.effects.newEffects.abilities.Flower_Veil(pkmn);
case "Fluffy":
return new compf.core.engine.pokemon.effects.newEffects.abilities.Fluffy(pkmn);
case "Forecast":
return new compf.core.engine.pokemon.effects.newEffects.abilities.Forecast(pkmn);
case "Forewarn":
return new compf.core.engine.pokemon.effects.newEffects.abilities.Forewarn(pkmn);
case "Friend Guard":
return new compf.core.engine.pokemon.effects.newEffects.abilities.Friend_Guard(pkmn);
case "Frisk":
return new compf.core.engine.pokemon.effects.newEffects.abilities.Frisk(pkmn);
case "Full Metal Body":
return new compf.core.engine.pokemon.effects.newEffects.abilities.Full_Metal_Body(pkmn);
case "Fur Coat":
return new compf.core.engine.pokemon.effects.newEffects.abilities.Fur_Coat(pkmn);
case "Gale Wings":
return new compf.core.engine.pokemon.effects.newEffects.abilities.Gale_Wings(pkmn);
case "Galvanize":
return new compf.core.engine.pokemon.effects.newEffects.abilities.Galvanize(pkmn);
case "Gluttony":
return new compf.core.engine.pokemon.effects.newEffects.abilities.Gluttony(pkmn);
case "Good as Gold":
return new compf.core.engine.pokemon.effects.newEffects.abilities.Good_as_Gold(pkmn);
case "Gooey":
return new compf.core.engine.pokemon.effects.newEffects.abilities.Gooey(pkmn);
case "Gorilla Tactics":
return new compf.core.engine.pokemon.effects.newEffects.abilities.Gorilla_Tactics(pkmn);
case "Grass Pelt":
return new compf.core.engine.pokemon.effects.newEffects.abilities.Grass_Pelt(pkmn);
case "Grassy Surge":
return new compf.core.engine.pokemon.effects.newEffects.abilities.Grassy_Surge(pkmn);
case "Grim Neigh":
return new compf.core.engine.pokemon.effects.newEffects.abilities.Grim_Neigh(pkmn);
case "Guard Dog":
return new compf.core.engine.pokemon.effects.newEffects.abilities.Guard_Dog(pkmn);
case "Gulp Missile":
return new compf.core.engine.pokemon.effects.newEffects.abilities.Gulp_Missile(pkmn);
case "Guts":
return new compf.core.engine.pokemon.effects.newEffects.abilities.Guts(pkmn);
case "Hadron Engine":
return new compf.core.engine.pokemon.effects.newEffects.abilities.Hadron_Engine(pkmn);
case "Harvest":
return new compf.core.engine.pokemon.effects.newEffects.abilities.Harvest(pkmn);
case "Healer":
return new compf.core.engine.pokemon.effects.newEffects.abilities.Healer(pkmn);
case "Heatproof":
return new compf.core.engine.pokemon.effects.newEffects.abilities.Heatproof(pkmn);
case "Heavy Metal":
return new compf.core.engine.pokemon.effects.newEffects.abilities.Heavy_Metal(pkmn);
case "Hospitality":
return new compf.core.engine.pokemon.effects.newEffects.abilities.Hospitality(pkmn);
case "Huge Power":
return new compf.core.engine.pokemon.effects.newEffects.abilities.Huge_Power(pkmn);
case "Hunger Switch":
return new compf.core.engine.pokemon.effects.newEffects.abilities.Hunger_Switch(pkmn);
case "Hustle":
return new compf.core.engine.pokemon.effects.newEffects.abilities.Hustle(pkmn);
case "Hydration":
return new compf.core.engine.pokemon.effects.newEffects.abilities.Hydration(pkmn);
case "Hyper Cutter":
return new compf.core.engine.pokemon.effects.newEffects.abilities.Hyper_Cutter(pkmn);
case "Ice Body":
return new compf.core.engine.pokemon.effects.newEffects.abilities.Ice_Body(pkmn);
case "Ice Face":
return new compf.core.engine.pokemon.effects.newEffects.abilities.Ice_Face(pkmn);
case "Ice Scales":
return new compf.core.engine.pokemon.effects.newEffects.abilities.Ice_Scales(pkmn);
case "Illuminate":
return new compf.core.engine.pokemon.effects.newEffects.abilities.Illuminate(pkmn);
case "Illusion":
return new compf.core.engine.pokemon.effects.newEffects.abilities.Illusion(pkmn);
case "Immunity":
return new compf.core.engine.pokemon.effects.newEffects.abilities.Immunity(pkmn);
case "Imposter":
return new compf.core.engine.pokemon.effects.newEffects.abilities.Imposter(pkmn);
case "Infiltrator":
return new compf.core.engine.pokemon.effects.newEffects.abilities.Infiltrator(pkmn);
case "Innards Out":
return new compf.core.engine.pokemon.effects.newEffects.abilities.Innards_Out(pkmn);
case "Inner Focus":
return new compf.core.engine.pokemon.effects.newEffects.abilities.Inner_Focus(pkmn);
case "Insomnia":
return new compf.core.engine.pokemon.effects.newEffects.abilities.Insomnia(pkmn);
case "Intimidate":
return new compf.core.engine.pokemon.effects.newEffects.abilities.Intimidate(pkmn);
case "Intrepid Sword":
return new compf.core.engine.pokemon.effects.newEffects.abilities.Intrepid_Sword(pkmn);
case "Iron Barbs":
return new compf.core.engine.pokemon.effects.newEffects.abilities.Iron_Barbs(pkmn);
case "Iron Fist":
return new compf.core.engine.pokemon.effects.newEffects.abilities.Iron_Fist(pkmn);
case "Justified":
return new compf.core.engine.pokemon.effects.newEffects.abilities.Justified(pkmn);
case "Keen Eye":
return new compf.core.engine.pokemon.effects.newEffects.abilities.Keen_Eye(pkmn);
case "Klutz":
return new compf.core.engine.pokemon.effects.newEffects.abilities.Klutz(pkmn);
case "Leaf Guard":
return new compf.core.engine.pokemon.effects.newEffects.abilities.Leaf_Guard(pkmn);
case "Libero":
return new compf.core.engine.pokemon.effects.newEffects.abilities.Libero(pkmn);
case "Light Metal":
return new compf.core.engine.pokemon.effects.newEffects.abilities.Light_Metal(pkmn);
case "Lightning Rod":
return new compf.core.engine.pokemon.effects.newEffects.abilities.Lightning_Rod(pkmn);
case "Limber":
return new compf.core.engine.pokemon.effects.newEffects.abilities.Limber(pkmn);
case "Lingering Aroma":
return new compf.core.engine.pokemon.effects.newEffects.abilities.Lingering_Aroma(pkmn);
case "Liquid Ooze":
return new compf.core.engine.pokemon.effects.newEffects.abilities.Liquid_Ooze(pkmn);
case "Liquid Voice":
return new compf.core.engine.pokemon.effects.newEffects.abilities.Liquid_Voice(pkmn);
case "Long Reach":
return new compf.core.engine.pokemon.effects.newEffects.abilities.Long_Reach(pkmn);
case "Magic Bounce":
return new compf.core.engine.pokemon.effects.newEffects.abilities.Magic_Bounce(pkmn);
case "Magic Guard":
return new compf.core.engine.pokemon.effects.newEffects.abilities.Magic_Guard(pkmn);
case "Magician":
return new compf.core.engine.pokemon.effects.newEffects.abilities.Magician(pkmn);
case "Magma Armor":
return new compf.core.engine.pokemon.effects.newEffects.abilities.Magma_Armor(pkmn);
case "Magnet Pull":
return new compf.core.engine.pokemon.effects.newEffects.abilities.Magnet_Pull(pkmn);
case "Marvel Scale":
return new compf.core.engine.pokemon.effects.newEffects.abilities.Marvel_Scale(pkmn);
case "Mega Launcher":
return new compf.core.engine.pokemon.effects.newEffects.abilities.Mega_Launcher(pkmn);
case "Merciless":
return new compf.core.engine.pokemon.effects.newEffects.abilities.Merciless(pkmn);
case "Mimicry":
return new compf.core.engine.pokemon.effects.newEffects.abilities.Mimicry(pkmn);
case "Mind's Eye":
return new compf.core.engine.pokemon.effects.newEffects.abilities.Mind_s_Eye(pkmn);
case "Minus":
return new compf.core.engine.pokemon.effects.newEffects.abilities.Minus(pkmn);
case "Mirror Armor":
return new compf.core.engine.pokemon.effects.newEffects.abilities.Mirror_Armor(pkmn);
case "Misty Surge":
return new compf.core.engine.pokemon.effects.newEffects.abilities.Misty_Surge(pkmn);
case "Mold Breaker":
return new compf.core.engine.pokemon.effects.newEffects.abilities.Mold_Breaker(pkmn);
case "Moody":
return new compf.core.engine.pokemon.effects.newEffects.abilities.Moody(pkmn);
case "Motor Drive":
return new compf.core.engine.pokemon.effects.newEffects.abilities.Motor_Drive(pkmn);
case "Moxie":
return new compf.core.engine.pokemon.effects.newEffects.abilities.Moxie(pkmn);
case "Multiscale":
return new compf.core.engine.pokemon.effects.newEffects.abilities.Multiscale(pkmn);
case "Mummy":
return new compf.core.engine.pokemon.effects.newEffects.abilities.Mummy(pkmn);
case "Mycelium Might":
return new compf.core.engine.pokemon.effects.newEffects.abilities.Mycelium_Might(pkmn);
case "Natural Cure":
return new compf.core.engine.pokemon.effects.newEffects.abilities.Natural_Cure(pkmn);
case "Neuroforce":
return new compf.core.engine.pokemon.effects.newEffects.abilities.Neuroforce(pkmn);
case "Neutralizing Gas":
return new compf.core.engine.pokemon.effects.newEffects.abilities.Neutralizing_Gas(pkmn);
case "No Guard":
return new compf.core.engine.pokemon.effects.newEffects.abilities.No_Guard(pkmn);
case "Normalize":
return new compf.core.engine.pokemon.effects.newEffects.abilities.Normalize(pkmn);
case "Oblivious":
return new compf.core.engine.pokemon.effects.newEffects.abilities.Oblivious(pkmn);
case "Opportunist":
return new compf.core.engine.pokemon.effects.newEffects.abilities.Opportunist(pkmn);
case "Orichalcum Pulse":
return new compf.core.engine.pokemon.effects.newEffects.abilities.Orichalcum_Pulse(pkmn);
case "Overcoat":
return new compf.core.engine.pokemon.effects.newEffects.abilities.Overcoat(pkmn);
case "Overgrow":
return new compf.core.engine.pokemon.effects.newEffects.abilities.Overgrow(pkmn);
case "Own Tempo":
return new compf.core.engine.pokemon.effects.newEffects.abilities.Own_Tempo(pkmn);
case "Parental Bond":
return new compf.core.engine.pokemon.effects.newEffects.abilities.Parental_Bond(pkmn);
case "Pastel Veil":
return new compf.core.engine.pokemon.effects.newEffects.abilities.Pastel_Veil(pkmn);
case "Perish Body":
return new compf.core.engine.pokemon.effects.newEffects.abilities.Perish_Body(pkmn);
case "Pickpocket":
return new compf.core.engine.pokemon.effects.newEffects.abilities.Pickpocket(pkmn);
case "Pickup":
return new compf.core.engine.pokemon.effects.newEffects.abilities.Pickup(pkmn);
case "Pixilate":
return new compf.core.engine.pokemon.effects.newEffects.abilities.Pixilate(pkmn);
case "Plus":
return new compf.core.engine.pokemon.effects.newEffects.abilities.Plus(pkmn);
case "Poison Heal":
return new compf.core.engine.pokemon.effects.newEffects.abilities.Poison_Heal(pkmn);
case "Poison Point":
return new compf.core.engine.pokemon.effects.newEffects.abilities.Poison_Point(pkmn);
case "Poison Touch":
return new compf.core.engine.pokemon.effects.newEffects.abilities.Poison_Touch(pkmn);
case "Power Construct":
return new compf.core.engine.pokemon.effects.newEffects.abilities.Power_Construct(pkmn);
case "Power of Alchemy":
return new compf.core.engine.pokemon.effects.newEffects.abilities.Power_of_Alchemy(pkmn);
case "Power Spot":
return new compf.core.engine.pokemon.effects.newEffects.abilities.Power_Spot(pkmn);
case "Prankster":
return new compf.core.engine.pokemon.effects.newEffects.abilities.Prankster(pkmn);
case "Pressure":
return new compf.core.engine.pokemon.effects.newEffects.abilities.Pressure(pkmn);
case "Primordial Sea":
return new compf.core.engine.pokemon.effects.newEffects.abilities.Primordial_Sea(pkmn);
case "Prism Armor":
return new compf.core.engine.pokemon.effects.newEffects.abilities.Prism_Armor(pkmn);
case "Propeller Tail":
return new compf.core.engine.pokemon.effects.newEffects.abilities.Propeller_Tail(pkmn);
case "Protean":
return new compf.core.engine.pokemon.effects.newEffects.abilities.Protean(pkmn);
case "Protosynthesis":
return new compf.core.engine.pokemon.effects.newEffects.abilities.Protosynthesis(pkmn);
case "Psychic Surge":
return new compf.core.engine.pokemon.effects.newEffects.abilities.Psychic_Surge(pkmn);
case "Punk Rock":
return new compf.core.engine.pokemon.effects.newEffects.abilities.Punk_Rock(pkmn);
case "Pure Power":
return new compf.core.engine.pokemon.effects.newEffects.abilities.Pure_Power(pkmn);
case "Purifying Salt":
return new compf.core.engine.pokemon.effects.newEffects.abilities.Purifying_Salt(pkmn);
case "Quark Drive":
return new compf.core.engine.pokemon.effects.newEffects.abilities.Quark_Drive(pkmn);
case "Queenly Majesty":
return new compf.core.engine.pokemon.effects.newEffects.abilities.Queenly_Majesty(pkmn);
case "Quick Draw":
return new compf.core.engine.pokemon.effects.newEffects.abilities.Quick_Draw(pkmn);
case "Quick Feet":
return new compf.core.engine.pokemon.effects.newEffects.abilities.Quick_Feet(pkmn);
case "Rain Dish":
return new compf.core.engine.pokemon.effects.newEffects.abilities.Rain_Dish(pkmn);
case "Rattled":
return new compf.core.engine.pokemon.effects.newEffects.abilities.Rattled(pkmn);
case "Receiver":
return new compf.core.engine.pokemon.effects.newEffects.abilities.Receiver(pkmn);
case "Reckless":
return new compf.core.engine.pokemon.effects.newEffects.abilities.Reckless(pkmn);
case "Refrigerate":
return new compf.core.engine.pokemon.effects.newEffects.abilities.Refrigerate(pkmn);
case "Regenerator":
return new compf.core.engine.pokemon.effects.newEffects.abilities.Regenerator(pkmn);
case "Ripen":
return new compf.core.engine.pokemon.effects.newEffects.abilities.Ripen(pkmn);
case "Rivalry":
return new compf.core.engine.pokemon.effects.newEffects.abilities.Rivalry(pkmn);
case "Rock Head":
return new compf.core.engine.pokemon.effects.newEffects.abilities.Rock_Head(pkmn);
case "Rocky Payload":
return new compf.core.engine.pokemon.effects.newEffects.abilities.Rocky_Payload(pkmn);
case "Rough Skin":
return new compf.core.engine.pokemon.effects.newEffects.abilities.Rough_Skin(pkmn);
case "Sand Force":
return new compf.core.engine.pokemon.effects.newEffects.abilities.Sand_Force(pkmn);
case "Sand Rush":
return new compf.core.engine.pokemon.effects.newEffects.abilities.Sand_Rush(pkmn);
case "Sand Spit":
return new compf.core.engine.pokemon.effects.newEffects.abilities.Sand_Spit(pkmn);
case "Sand Stream":
return new compf.core.engine.pokemon.effects.newEffects.abilities.Sand_Stream(pkmn);
case "Sand Veil":
return new compf.core.engine.pokemon.effects.newEffects.abilities.Sand_Veil(pkmn);
case "Sap Sipper":
return new compf.core.engine.pokemon.effects.newEffects.abilities.Sap_Sipper(pkmn);
case "Schooling":
return new compf.core.engine.pokemon.effects.newEffects.abilities.Schooling(pkmn);
case "Scrappy":
return new compf.core.engine.pokemon.effects.newEffects.abilities.Scrappy(pkmn);
case "Screen Cleaner":
return new compf.core.engine.pokemon.effects.newEffects.abilities.Screen_Cleaner(pkmn);
case "Seed Sower":
return new compf.core.engine.pokemon.effects.newEffects.abilities.Seed_Sower(pkmn);
case "Serene Grace":
return new compf.core.engine.pokemon.effects.newEffects.abilities.Serene_Grace(pkmn);
case "Shadow Shield":
return new compf.core.engine.pokemon.effects.newEffects.abilities.Shadow_Shield(pkmn);
case "Shadow Tag":
return new compf.core.engine.pokemon.effects.newEffects.abilities.Shadow_Tag(pkmn);
case "Sharpness":
return new compf.core.engine.pokemon.effects.newEffects.abilities.Sharpness(pkmn);
case "Shed Skin":
return new compf.core.engine.pokemon.effects.newEffects.abilities.Shed_Skin(pkmn);
case "Sheer Force":
return new compf.core.engine.pokemon.effects.newEffects.abilities.Sheer_Force(pkmn);
case "Shield Dust":
return new compf.core.engine.pokemon.effects.newEffects.abilities.Shield_Dust(pkmn);
case "Shields Down":
return new compf.core.engine.pokemon.effects.newEffects.abilities.Shields_Down(pkmn);
case "Simple":
return new compf.core.engine.pokemon.effects.newEffects.abilities.Simple(pkmn);
case "Skill Link":
return new compf.core.engine.pokemon.effects.newEffects.abilities.Skill_Link(pkmn);
case "Slow Start":
return new compf.core.engine.pokemon.effects.newEffects.abilities.Slow_Start(pkmn);
case "Slush Rush":
return new compf.core.engine.pokemon.effects.newEffects.abilities.Slush_Rush(pkmn);
case "Sniper":
return new compf.core.engine.pokemon.effects.newEffects.abilities.Sniper(pkmn);
case "Snow Cloak":
return new compf.core.engine.pokemon.effects.newEffects.abilities.Snow_Cloak(pkmn);
case "Snow Warning":
return new compf.core.engine.pokemon.effects.newEffects.abilities.Snow_Warning(pkmn);
case "Solar Power":
return new compf.core.engine.pokemon.effects.newEffects.abilities.Solar_Power(pkmn);
case "Solid Rock":
return new compf.core.engine.pokemon.effects.newEffects.abilities.Solid_Rock(pkmn);
case "Soul-Heart":
return new compf.core.engine.pokemon.effects.newEffects.abilities.Soul_Heart(pkmn);
case "Soundproof":
return new compf.core.engine.pokemon.effects.newEffects.abilities.Soundproof(pkmn);
case "Speed Boost":
return new compf.core.engine.pokemon.effects.newEffects.abilities.Speed_Boost(pkmn);
case "Stakeout":
return new compf.core.engine.pokemon.effects.newEffects.abilities.Stakeout(pkmn);
case "Stalwart":
return new compf.core.engine.pokemon.effects.newEffects.abilities.Stalwart(pkmn);
case "Stamina":
return new compf.core.engine.pokemon.effects.newEffects.abilities.Stamina(pkmn);
case "Stance Change":
return new compf.core.engine.pokemon.effects.newEffects.abilities.Stance_Change(pkmn);
case "Static":
return new compf.core.engine.pokemon.effects.newEffects.abilities.Static(pkmn);
case "Steadfast":
return new compf.core.engine.pokemon.effects.newEffects.abilities.Steadfast(pkmn);
case "Steam Engine":
return new compf.core.engine.pokemon.effects.newEffects.abilities.Steam_Engine(pkmn);
case "Steelworker":
return new compf.core.engine.pokemon.effects.newEffects.abilities.Steelworker(pkmn);
case "Steely Spirit":
return new compf.core.engine.pokemon.effects.newEffects.abilities.Steely_Spirit(pkmn);
case "Stench":
return new compf.core.engine.pokemon.effects.newEffects.abilities.Stench(pkmn);
case "Sticky Hold":
return new compf.core.engine.pokemon.effects.newEffects.abilities.Sticky_Hold(pkmn);
case "Storm Drain":
return new compf.core.engine.pokemon.effects.newEffects.abilities.Storm_Drain(pkmn);
case "Strong Jaw":
return new compf.core.engine.pokemon.effects.newEffects.abilities.Strong_Jaw(pkmn);
case "Sturdy":
return new compf.core.engine.pokemon.effects.newEffects.abilities.Sturdy(pkmn);
case "Suction Cups":
return new compf.core.engine.pokemon.effects.newEffects.abilities.Suction_Cups(pkmn);
case "Super Luck":
return new compf.core.engine.pokemon.effects.newEffects.abilities.Super_Luck(pkmn);
case "Supersweet Syrup":
return new compf.core.engine.pokemon.effects.newEffects.abilities.Supersweet_Syrup(pkmn);
case "Supreme Overlord":
return new compf.core.engine.pokemon.effects.newEffects.abilities.Supreme_Overlord(pkmn);
case "Surge Surfer":
return new compf.core.engine.pokemon.effects.newEffects.abilities.Surge_Surfer(pkmn);
case "Swarm":
return new compf.core.engine.pokemon.effects.newEffects.abilities.Swarm(pkmn);
case "Sweet Veil":
return new compf.core.engine.pokemon.effects.newEffects.abilities.Sweet_Veil(pkmn);
case "Swift Swim":
return new compf.core.engine.pokemon.effects.newEffects.abilities.Swift_Swim(pkmn);
case "Symbiosis":
return new compf.core.engine.pokemon.effects.newEffects.abilities.Symbiosis(pkmn);
case "Synchronize":
return new compf.core.engine.pokemon.effects.newEffects.abilities.Synchronize(pkmn);
case "Sword of Ruin":
return new compf.core.engine.pokemon.effects.newEffects.abilities.Sword_of_Ruin(pkmn);
case "Tablets of Ruin":
return new compf.core.engine.pokemon.effects.newEffects.abilities.Tablets_of_Ruin(pkmn);
case "Tangled Feet":
return new compf.core.engine.pokemon.effects.newEffects.abilities.Tangled_Feet(pkmn);
case "Tangling Hair":
return new compf.core.engine.pokemon.effects.newEffects.abilities.Tangling_Hair(pkmn);
case "Technician":
return new compf.core.engine.pokemon.effects.newEffects.abilities.Technician(pkmn);
case "Telepathy":
return new compf.core.engine.pokemon.effects.newEffects.abilities.Telepathy(pkmn);
case "Teravolt":
return new compf.core.engine.pokemon.effects.newEffects.abilities.Teravolt(pkmn);
case "Thermal Exchange":
return new compf.core.engine.pokemon.effects.newEffects.abilities.Thermal_Exchange(pkmn);
case "Thick Fat":
return new compf.core.engine.pokemon.effects.newEffects.abilities.Thick_Fat(pkmn);
case "Tinted Lens":
return new compf.core.engine.pokemon.effects.newEffects.abilities.Tinted_Lens(pkmn);
case "Torrent":
return new compf.core.engine.pokemon.effects.newEffects.abilities.Torrent(pkmn);
case "Tough Claws":
return new compf.core.engine.pokemon.effects.newEffects.abilities.Tough_Claws(pkmn);
case "Toxic Boost":
return new compf.core.engine.pokemon.effects.newEffects.abilities.Toxic_Boost(pkmn);
case "Toxic Chain":
return new compf.core.engine.pokemon.effects.newEffects.abilities.Toxic_Chain(pkmn);
case "Toxic Debris":
return new compf.core.engine.pokemon.effects.newEffects.abilities.Toxic_Debris(pkmn);
case "Trace":
return new compf.core.engine.pokemon.effects.newEffects.abilities.Trace(pkmn);
case "Transistor":
return new compf.core.engine.pokemon.effects.newEffects.abilities.Transistor(pkmn);
case "Triage":
return new compf.core.engine.pokemon.effects.newEffects.abilities.Triage(pkmn);
case "Truant":
return new compf.core.engine.pokemon.effects.newEffects.abilities.Truant(pkmn);
case "Turboblaze":
return new compf.core.engine.pokemon.effects.newEffects.abilities.Turboblaze(pkmn);
case "Unaware":
return new compf.core.engine.pokemon.effects.newEffects.abilities.Unaware(pkmn);
case "Unburden":
return new compf.core.engine.pokemon.effects.newEffects.abilities.Unburden(pkmn);
case "Unnerve":
return new compf.core.engine.pokemon.effects.newEffects.abilities.Unnerve(pkmn);
case "Unseen Fist":
return new compf.core.engine.pokemon.effects.newEffects.abilities.Unseen_Fist(pkmn);
case "Vessel of Ruin":
return new compf.core.engine.pokemon.effects.newEffects.abilities.Vessel_of_Ruin(pkmn);
case "Victory Star":
return new compf.core.engine.pokemon.effects.newEffects.abilities.Victory_Star(pkmn);
case "Vital Spirit":
return new compf.core.engine.pokemon.effects.newEffects.abilities.Vital_Spirit(pkmn);
case "Volt Absorb":
return new compf.core.engine.pokemon.effects.newEffects.abilities.Volt_Absorb(pkmn);
case "Wandering Spirit":
return new compf.core.engine.pokemon.effects.newEffects.abilities.Wandering_Spirit(pkmn);
case "Water Absorb":
return new compf.core.engine.pokemon.effects.newEffects.abilities.Water_Absorb(pkmn);
case "Water Bubble":
return new compf.core.engine.pokemon.effects.newEffects.abilities.Water_Bubble(pkmn);
case "Water Compaction":
return new compf.core.engine.pokemon.effects.newEffects.abilities.Water_Compaction(pkmn);
case "Water Veil":
return new compf.core.engine.pokemon.effects.newEffects.abilities.Water_Veil(pkmn);
case "Weak Armor":
return new compf.core.engine.pokemon.effects.newEffects.abilities.Weak_Armor(pkmn);
case "Well-Baked Body":
return new compf.core.engine.pokemon.effects.newEffects.abilities.Well_Baked_Body(pkmn);
case "White Smoke":
return new compf.core.engine.pokemon.effects.newEffects.abilities.White_Smoke(pkmn);
case "Wimp Out":
return new compf.core.engine.pokemon.effects.newEffects.abilities.Wimp_Out(pkmn);
case "Wind Power":
return new compf.core.engine.pokemon.effects.newEffects.abilities.Wind_Power(pkmn);
case "Wind Rider":
return new compf.core.engine.pokemon.effects.newEffects.abilities.Wind_Rider(pkmn);
case "Wonder Guard":
return new compf.core.engine.pokemon.effects.newEffects.abilities.Wonder_Guard(pkmn);
case "Wonder Skin":
return new compf.core.engine.pokemon.effects.newEffects.abilities.Wonder_Skin(pkmn);
case "Zen Mode":
return new compf.core.engine.pokemon.effects.newEffects.abilities.Zen_Mode(pkmn);
case "Zero to Hero":
return new compf.core.engine.pokemon.effects.newEffects.abilities.Zero_to_Hero(pkmn);
case "Mountaineer":
return new compf.core.engine.pokemon.effects.newEffects.abilities.Mountaineer(pkmn);
case "Rebound":
return new compf.core.engine.pokemon.effects.newEffects.abilities.Rebound(pkmn);
default:
return null;

}
}
}