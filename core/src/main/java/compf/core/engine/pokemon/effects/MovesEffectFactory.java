package compf.core.engine.pokemon.effects;
 import compf.core.engine.pokemon.effects.PokemonBattleEffect;
 import compf.core.engine.pokemon.Pokemon;
public class MovesEffectFactory{

public static PokemonBattleEffect getEffect(String effectName,Pokemon pkmn){

switch(effectName){
case "Acrobatics":
return new compf.core.engine.pokemon.effects.newEffects.moves.Acrobatics(pkmn);
case "Acupressure":
return new compf.core.engine.pokemon.effects.newEffects.moves.Acupressure(pkmn);
case "After You":
return new compf.core.engine.pokemon.effects.newEffects.moves.After_You(pkmn);
case "Ally Switch":
return new compf.core.engine.pokemon.effects.newEffects.moves.Ally_Switch(pkmn);
case "Aqua Ring":
return new compf.core.engine.pokemon.effects.newEffects.moves.Aqua_Ring(pkmn);
case "Aromatherapy":
return new compf.core.engine.pokemon.effects.newEffects.moves.Aromatherapy(pkmn);
case "Assist":
return new compf.core.engine.pokemon.effects.newEffects.moves.Assist(pkmn);
case "Assurance":
return new compf.core.engine.pokemon.effects.newEffects.moves.Assurance(pkmn);
case "Attract":
return new compf.core.engine.pokemon.effects.newEffects.moves.Attract(pkmn);
case "Aura Wheel":
return new compf.core.engine.pokemon.effects.newEffects.moves.Aura_Wheel(pkmn);
case "Aurora Veil":
return new compf.core.engine.pokemon.effects.newEffects.moves.Aurora_Veil(pkmn);
case "Autotomize":
return new compf.core.engine.pokemon.effects.newEffects.moves.Autotomize(pkmn);
case "Avalanche":
return new compf.core.engine.pokemon.effects.newEffects.moves.Avalanche(pkmn);
case "Axe Kick":
return new compf.core.engine.pokemon.effects.newEffects.moves.Axe_Kick(pkmn);
case "Baneful Bunker":
return new compf.core.engine.pokemon.effects.newEffects.moves.Baneful_Bunker(pkmn);
case "Barb Barrage":
return new compf.core.engine.pokemon.effects.newEffects.moves.Barb_Barrage(pkmn);
case "Baton Pass":
return new compf.core.engine.pokemon.effects.newEffects.moves.Baton_Pass(pkmn);
case "Beak Blast":
return new compf.core.engine.pokemon.effects.newEffects.moves.Beak_Blast(pkmn);
case "Beat Up":
return new compf.core.engine.pokemon.effects.newEffects.moves.Beat_Up(pkmn);
case "Belch":
return new compf.core.engine.pokemon.effects.newEffects.moves.Belch(pkmn);
case "Belly Drum":
return new compf.core.engine.pokemon.effects.newEffects.moves.Belly_Drum(pkmn);
case "Bestow":
return new compf.core.engine.pokemon.effects.newEffects.moves.Bestow(pkmn);
case "Bide":
return new compf.core.engine.pokemon.effects.newEffects.moves.Bide(pkmn);
case "Bleakwind Storm":
return new compf.core.engine.pokemon.effects.newEffects.moves.Bleakwind_Storm(pkmn);
case "Blizzard":
return new compf.core.engine.pokemon.effects.newEffects.moves.Blizzard(pkmn);
case "Block":
return new compf.core.engine.pokemon.effects.newEffects.moves.Block(pkmn);
case "Bolt Beak":
return new compf.core.engine.pokemon.effects.newEffects.moves.Bolt_Beak(pkmn);
case "Bounce":
return new compf.core.engine.pokemon.effects.newEffects.moves.Bounce(pkmn);
case "Brick Break":
return new compf.core.engine.pokemon.effects.newEffects.moves.Brick_Break(pkmn);
case "Brine":
return new compf.core.engine.pokemon.effects.newEffects.moves.Brine(pkmn);
case "Bug Bite":
return new compf.core.engine.pokemon.effects.newEffects.moves.Bug_Bite(pkmn);
case "Burn Up":
return new compf.core.engine.pokemon.effects.newEffects.moves.Burn_Up(pkmn);
case "Camouflage":
return new compf.core.engine.pokemon.effects.newEffects.moves.Camouflage(pkmn);
case "Captivate":
return new compf.core.engine.pokemon.effects.newEffects.moves.Captivate(pkmn);
case "Ceaseless Edge":
return new compf.core.engine.pokemon.effects.newEffects.moves.Ceaseless_Edge(pkmn);
case "Celebrate":
return new compf.core.engine.pokemon.effects.newEffects.moves.Celebrate(pkmn);
case "Charge":
return new compf.core.engine.pokemon.effects.newEffects.moves.Charge(pkmn);
case "Clangorous Soul":
return new compf.core.engine.pokemon.effects.newEffects.moves.Clangorous_Soul(pkmn);
case "Clear Smog":
return new compf.core.engine.pokemon.effects.newEffects.moves.Clear_Smog(pkmn);
case "Collision Course":
return new compf.core.engine.pokemon.effects.newEffects.moves.Collision_Course(pkmn);
case "Comeuppance":
return new compf.core.engine.pokemon.effects.newEffects.moves.Comeuppance(pkmn);
case "Conversion":
return new compf.core.engine.pokemon.effects.newEffects.moves.Conversion(pkmn);
case "Conversion 2":
return new compf.core.engine.pokemon.effects.newEffects.moves.Conversion_2(pkmn);
case "Copycat":
return new compf.core.engine.pokemon.effects.newEffects.moves.Copycat(pkmn);
case "Core Enforcer":
return new compf.core.engine.pokemon.effects.newEffects.moves.Core_Enforcer(pkmn);
case "Corrosive Gas":
return new compf.core.engine.pokemon.effects.newEffects.moves.Corrosive_Gas(pkmn);
case "Counter":
return new compf.core.engine.pokemon.effects.newEffects.moves.Counter(pkmn);
case "Court Change":
return new compf.core.engine.pokemon.effects.newEffects.moves.Court_Change(pkmn);
case "Covet":
return new compf.core.engine.pokemon.effects.newEffects.moves.Covet(pkmn);
case "Crafty Shield":
return new compf.core.engine.pokemon.effects.newEffects.moves.Crafty_Shield(pkmn);
case "Crush Grip":
return new compf.core.engine.pokemon.effects.newEffects.moves.Crush_Grip(pkmn);
case "Curse":
return new compf.core.engine.pokemon.effects.newEffects.moves.Curse(pkmn);
case "Dark Void":
return new compf.core.engine.pokemon.effects.newEffects.moves.Dark_Void(pkmn);
case "Defense Curl":
return new compf.core.engine.pokemon.effects.newEffects.moves.Defense_Curl(pkmn);
case "Defog":
return new compf.core.engine.pokemon.effects.newEffects.moves.Defog(pkmn);
case "Destiny Bond":
return new compf.core.engine.pokemon.effects.newEffects.moves.Destiny_Bond(pkmn);
case "Detect":
return new compf.core.engine.pokemon.effects.newEffects.moves.Detect(pkmn);
case "Dig":
return new compf.core.engine.pokemon.effects.newEffects.moves.Dig(pkmn);
case "Disable":
return new compf.core.engine.pokemon.effects.newEffects.moves.Disable(pkmn);
case "Dive":
return new compf.core.engine.pokemon.effects.newEffects.moves.Dive(pkmn);
case "Doodle":
return new compf.core.engine.pokemon.effects.newEffects.moves.Doodle(pkmn);
case "Doom Desire":
return new compf.core.engine.pokemon.effects.newEffects.moves.Doom_Desire(pkmn);
case "Double Shock":
return new compf.core.engine.pokemon.effects.newEffects.moves.Double_Shock(pkmn);
case "Dragon Energy":
return new compf.core.engine.pokemon.effects.newEffects.moves.Dragon_Energy(pkmn);
case "Dream Eater":
return new compf.core.engine.pokemon.effects.newEffects.moves.Dream_Eater(pkmn);
case "Echoed Voice":
return new compf.core.engine.pokemon.effects.newEffects.moves.Echoed_Voice(pkmn);
case "Electric Terrain":
return new compf.core.engine.pokemon.effects.newEffects.moves.Electric_Terrain(pkmn);
case "Electrify":
return new compf.core.engine.pokemon.effects.newEffects.moves.Electrify(pkmn);
case "Electro Ball":
return new compf.core.engine.pokemon.effects.newEffects.moves.Electro_Ball(pkmn);
case "Electro Drift":
return new compf.core.engine.pokemon.effects.newEffects.moves.Electro_Drift(pkmn);
case "Embargo":
return new compf.core.engine.pokemon.effects.newEffects.moves.Embargo(pkmn);
case "Encore":
return new compf.core.engine.pokemon.effects.newEffects.moves.Encore(pkmn);
case "Endeavor":
return new compf.core.engine.pokemon.effects.newEffects.moves.Endeavor(pkmn);
case "Endure":
return new compf.core.engine.pokemon.effects.newEffects.moves.Endure(pkmn);
case "Entrainment":
return new compf.core.engine.pokemon.effects.newEffects.moves.Entrainment(pkmn);
case "Eruption":
return new compf.core.engine.pokemon.effects.newEffects.moves.Eruption(pkmn);
case "Expanding Force":
return new compf.core.engine.pokemon.effects.newEffects.moves.Expanding_Force(pkmn);
case "Facade":
return new compf.core.engine.pokemon.effects.newEffects.moves.Facade(pkmn);
case "Fairy Lock":
return new compf.core.engine.pokemon.effects.newEffects.moves.Fairy_Lock(pkmn);
case "Fake Out":
return new compf.core.engine.pokemon.effects.newEffects.moves.Fake_Out(pkmn);
case "False Swipe":
return new compf.core.engine.pokemon.effects.newEffects.moves.False_Swipe(pkmn);
case "Fell Stinger":
return new compf.core.engine.pokemon.effects.newEffects.moves.Fell_Stinger(pkmn);
case "Fillet Away":
return new compf.core.engine.pokemon.effects.newEffects.moves.Fillet_Away(pkmn);
case "Final Gambit":
return new compf.core.engine.pokemon.effects.newEffects.moves.Final_Gambit(pkmn);
case "Fire Pledge":
return new compf.core.engine.pokemon.effects.newEffects.moves.Fire_Pledge(pkmn);
case "First Impression":
return new compf.core.engine.pokemon.effects.newEffects.moves.First_Impression(pkmn);
case "Fishious Rend":
return new compf.core.engine.pokemon.effects.newEffects.moves.Fishious_Rend(pkmn);
case "Flail":
return new compf.core.engine.pokemon.effects.newEffects.moves.Flail(pkmn);
case "Flame Burst":
return new compf.core.engine.pokemon.effects.newEffects.moves.Flame_Burst(pkmn);
case "Fling":
return new compf.core.engine.pokemon.effects.newEffects.moves.Fling(pkmn);
case "Floral Healing":
return new compf.core.engine.pokemon.effects.newEffects.moves.Floral_Healing(pkmn);
case "Flower Shield":
return new compf.core.engine.pokemon.effects.newEffects.moves.Flower_Shield(pkmn);
case "Fly":
return new compf.core.engine.pokemon.effects.newEffects.moves.Fly(pkmn);
case "Flying Press":
return new compf.core.engine.pokemon.effects.newEffects.moves.Flying_Press(pkmn);
case "Focus Energy":
return new compf.core.engine.pokemon.effects.newEffects.moves.Focus_Energy(pkmn);
case "Focus Punch":
return new compf.core.engine.pokemon.effects.newEffects.moves.Focus_Punch(pkmn);
case "Follow Me":
return new compf.core.engine.pokemon.effects.newEffects.moves.Follow_Me(pkmn);
case "Foresight":
return new compf.core.engine.pokemon.effects.newEffects.moves.Foresight(pkmn);
case "Forest's Curse":
return new compf.core.engine.pokemon.effects.newEffects.moves.Forest_s_Curse(pkmn);
case "Freeze-Dry":
return new compf.core.engine.pokemon.effects.newEffects.moves.Freeze_Dry(pkmn);
case "Freeze Shock":
return new compf.core.engine.pokemon.effects.newEffects.moves.Freeze_Shock(pkmn);
case "Freezy Frost":
return new compf.core.engine.pokemon.effects.newEffects.moves.Freezy_Frost(pkmn);
case "Frustration":
return new compf.core.engine.pokemon.effects.newEffects.moves.Frustration(pkmn);
case "Fury Cutter":
return new compf.core.engine.pokemon.effects.newEffects.moves.Fury_Cutter(pkmn);
case "Fusion Bolt":
return new compf.core.engine.pokemon.effects.newEffects.moves.Fusion_Bolt(pkmn);
case "Fusion Flare":
return new compf.core.engine.pokemon.effects.newEffects.moves.Fusion_Flare(pkmn);
case "Future Sight":
return new compf.core.engine.pokemon.effects.newEffects.moves.Future_Sight(pkmn);
case "Gastro Acid":
return new compf.core.engine.pokemon.effects.newEffects.moves.Gastro_Acid(pkmn);
case "Gear Up":
return new compf.core.engine.pokemon.effects.newEffects.moves.Gear_Up(pkmn);
case "Geomancy":
return new compf.core.engine.pokemon.effects.newEffects.moves.Geomancy(pkmn);
case "Glaive Rush":
return new compf.core.engine.pokemon.effects.newEffects.moves.Glaive_Rush(pkmn);
case "G-Max Cannonade":
return new compf.core.engine.pokemon.effects.newEffects.moves.G_Max_Cannonade(pkmn);
case "G-Max Chi Strike":
return new compf.core.engine.pokemon.effects.newEffects.moves.G_Max_Chi_Strike(pkmn);
case "G-Max Snooze":
return new compf.core.engine.pokemon.effects.newEffects.moves.G_Max_Snooze(pkmn);
case "G-Max Steelsurge":
return new compf.core.engine.pokemon.effects.newEffects.moves.G_Max_Steelsurge(pkmn);
case "G-Max Vine Lash":
return new compf.core.engine.pokemon.effects.newEffects.moves.G_Max_Vine_Lash(pkmn);
case "G-Max Volcalith":
return new compf.core.engine.pokemon.effects.newEffects.moves.G_Max_Volcalith(pkmn);
case "G-Max Wildfire":
return new compf.core.engine.pokemon.effects.newEffects.moves.G_Max_Wildfire(pkmn);
case "Grass Knot":
return new compf.core.engine.pokemon.effects.newEffects.moves.Grass_Knot(pkmn);
case "Grass Pledge":
return new compf.core.engine.pokemon.effects.newEffects.moves.Grass_Pledge(pkmn);
case "Grassy Glide":
return new compf.core.engine.pokemon.effects.newEffects.moves.Grassy_Glide(pkmn);
case "Grassy Terrain":
return new compf.core.engine.pokemon.effects.newEffects.moves.Grassy_Terrain(pkmn);
case "Grav Apple":
return new compf.core.engine.pokemon.effects.newEffects.moves.Grav_Apple(pkmn);
case "Gravity":
return new compf.core.engine.pokemon.effects.newEffects.moves.Gravity(pkmn);
case "Growth":
return new compf.core.engine.pokemon.effects.newEffects.moves.Growth(pkmn);
case "Grudge":
return new compf.core.engine.pokemon.effects.newEffects.moves.Grudge(pkmn);
case "Guardian of Alola":
return new compf.core.engine.pokemon.effects.newEffects.moves.Guardian_of_Alola(pkmn);
case "Guard Split":
return new compf.core.engine.pokemon.effects.newEffects.moves.Guard_Split(pkmn);
case "Guard Swap":
return new compf.core.engine.pokemon.effects.newEffects.moves.Guard_Swap(pkmn);
case "Gyro Ball":
return new compf.core.engine.pokemon.effects.newEffects.moves.Gyro_Ball(pkmn);
case "Happy Hour":
return new compf.core.engine.pokemon.effects.newEffects.moves.Happy_Hour(pkmn);
case "Haze":
return new compf.core.engine.pokemon.effects.newEffects.moves.Haze(pkmn);
case "Heal Bell":
return new compf.core.engine.pokemon.effects.newEffects.moves.Heal_Bell(pkmn);
case "Heal Block":
return new compf.core.engine.pokemon.effects.newEffects.moves.Heal_Block(pkmn);
case "Healing Wish":
return new compf.core.engine.pokemon.effects.newEffects.moves.Healing_Wish(pkmn);
case "Heal Pulse":
return new compf.core.engine.pokemon.effects.newEffects.moves.Heal_Pulse(pkmn);
case "Heart Swap":
return new compf.core.engine.pokemon.effects.newEffects.moves.Heart_Swap(pkmn);
case "Heat Crash":
return new compf.core.engine.pokemon.effects.newEffects.moves.Heat_Crash(pkmn);
case "Heavy Slam":
return new compf.core.engine.pokemon.effects.newEffects.moves.Heavy_Slam(pkmn);
case "Helping Hand":
return new compf.core.engine.pokemon.effects.newEffects.moves.Helping_Hand(pkmn);
case "Hex":
return new compf.core.engine.pokemon.effects.newEffects.moves.Hex(pkmn);
case "Hidden Power":
return new compf.core.engine.pokemon.effects.newEffects.moves.Hidden_Power(pkmn);
case "High Jump Kick":
return new compf.core.engine.pokemon.effects.newEffects.moves.High_Jump_Kick(pkmn);
case "Hold Back":
return new compf.core.engine.pokemon.effects.newEffects.moves.Hold_Back(pkmn);
case "Hurricane":
return new compf.core.engine.pokemon.effects.newEffects.moves.Hurricane(pkmn);
case "Hyperspace Fury":
return new compf.core.engine.pokemon.effects.newEffects.moves.Hyperspace_Fury(pkmn);
case "Ice Ball":
return new compf.core.engine.pokemon.effects.newEffects.moves.Ice_Ball(pkmn);
case "Ice Burn":
return new compf.core.engine.pokemon.effects.newEffects.moves.Ice_Burn(pkmn);
case "Ice Spinner":
return new compf.core.engine.pokemon.effects.newEffects.moves.Ice_Spinner(pkmn);
case "Imprison":
return new compf.core.engine.pokemon.effects.newEffects.moves.Imprison(pkmn);
case "Incinerate":
return new compf.core.engine.pokemon.effects.newEffects.moves.Incinerate(pkmn);
case "Infernal Parade":
return new compf.core.engine.pokemon.effects.newEffects.moves.Infernal_Parade(pkmn);
case "Ingrain":
return new compf.core.engine.pokemon.effects.newEffects.moves.Ingrain(pkmn);
case "Instruct":
return new compf.core.engine.pokemon.effects.newEffects.moves.Instruct(pkmn);
case "Ion Deluge":
return new compf.core.engine.pokemon.effects.newEffects.moves.Ion_Deluge(pkmn);
case "Ivy Cudgel":
return new compf.core.engine.pokemon.effects.newEffects.moves.Ivy_Cudgel(pkmn);
case "Jaw Lock":
return new compf.core.engine.pokemon.effects.newEffects.moves.Jaw_Lock(pkmn);
case "Judgment":
return new compf.core.engine.pokemon.effects.newEffects.moves.Judgment(pkmn);
case "Jump Kick":
return new compf.core.engine.pokemon.effects.newEffects.moves.Jump_Kick(pkmn);
case "Jungle Healing":
return new compf.core.engine.pokemon.effects.newEffects.moves.Jungle_Healing(pkmn);
case "King's Shield":
return new compf.core.engine.pokemon.effects.newEffects.moves.King_s_Shield(pkmn);
case "Knock Off":
return new compf.core.engine.pokemon.effects.newEffects.moves.Knock_Off(pkmn);
case "Laser Focus":
return new compf.core.engine.pokemon.effects.newEffects.moves.Laser_Focus(pkmn);
case "Lash Out":
return new compf.core.engine.pokemon.effects.newEffects.moves.Lash_Out(pkmn);
case "Last Resort":
return new compf.core.engine.pokemon.effects.newEffects.moves.Last_Resort(pkmn);
case "Last Respects":
return new compf.core.engine.pokemon.effects.newEffects.moves.Last_Respects(pkmn);
case "Leech Seed":
return new compf.core.engine.pokemon.effects.newEffects.moves.Leech_Seed(pkmn);
case "Light Screen":
return new compf.core.engine.pokemon.effects.newEffects.moves.Light_Screen(pkmn);
case "Light That Burns the Sky":
return new compf.core.engine.pokemon.effects.newEffects.moves.Light_That_Burns_the_Sky(pkmn);
case "Lock-On":
return new compf.core.engine.pokemon.effects.newEffects.moves.Lock_On(pkmn);
case "Low Kick":
return new compf.core.engine.pokemon.effects.newEffects.moves.Low_Kick(pkmn);
case "Lucky Chant":
return new compf.core.engine.pokemon.effects.newEffects.moves.Lucky_Chant(pkmn);
case "Lunar Blessing":
return new compf.core.engine.pokemon.effects.newEffects.moves.Lunar_Blessing(pkmn);
case "Lunar Dance":
return new compf.core.engine.pokemon.effects.newEffects.moves.Lunar_Dance(pkmn);
case "Magic Coat":
return new compf.core.engine.pokemon.effects.newEffects.moves.Magic_Coat(pkmn);
case "Magic Powder":
return new compf.core.engine.pokemon.effects.newEffects.moves.Magic_Powder(pkmn);
case "Magic Room":
return new compf.core.engine.pokemon.effects.newEffects.moves.Magic_Room(pkmn);
case "Magnetic Flux":
return new compf.core.engine.pokemon.effects.newEffects.moves.Magnetic_Flux(pkmn);
case "Magnet Rise":
return new compf.core.engine.pokemon.effects.newEffects.moves.Magnet_Rise(pkmn);
case "Magnitude":
return new compf.core.engine.pokemon.effects.newEffects.moves.Magnitude(pkmn);
case "Mat Block":
return new compf.core.engine.pokemon.effects.newEffects.moves.Mat_Block(pkmn);
case "Max Guard":
return new compf.core.engine.pokemon.effects.newEffects.moves.Max_Guard(pkmn);
case "Mean Look":
return new compf.core.engine.pokemon.effects.newEffects.moves.Mean_Look(pkmn);
case "Me First":
return new compf.core.engine.pokemon.effects.newEffects.moves.Me_First(pkmn);
case "Metal Burst":
return new compf.core.engine.pokemon.effects.newEffects.moves.Metal_Burst(pkmn);
case "Meteor Beam":
return new compf.core.engine.pokemon.effects.newEffects.moves.Meteor_Beam(pkmn);
case "Metronome":
return new compf.core.engine.pokemon.effects.newEffects.moves.Metronome(pkmn);
case "Mimic":
return new compf.core.engine.pokemon.effects.newEffects.moves.Mimic(pkmn);
case "Mind Blown":
return new compf.core.engine.pokemon.effects.newEffects.moves.Mind_Blown(pkmn);
case "Mind Reader":
return new compf.core.engine.pokemon.effects.newEffects.moves.Mind_Reader(pkmn);
case "Minimize":
return new compf.core.engine.pokemon.effects.newEffects.moves.Minimize(pkmn);
case "Miracle Eye":
return new compf.core.engine.pokemon.effects.newEffects.moves.Miracle_Eye(pkmn);
case "Mirror Coat":
return new compf.core.engine.pokemon.effects.newEffects.moves.Mirror_Coat(pkmn);
case "Mirror Move":
return new compf.core.engine.pokemon.effects.newEffects.moves.Mirror_Move(pkmn);
case "Mist":
return new compf.core.engine.pokemon.effects.newEffects.moves.Mist(pkmn);
case "Misty Explosion":
return new compf.core.engine.pokemon.effects.newEffects.moves.Misty_Explosion(pkmn);
case "Misty Terrain":
return new compf.core.engine.pokemon.effects.newEffects.moves.Misty_Terrain(pkmn);
case "Moonlight":
return new compf.core.engine.pokemon.effects.newEffects.moves.Moonlight(pkmn);
case "Morning Sun":
return new compf.core.engine.pokemon.effects.newEffects.moves.Morning_Sun(pkmn);
case "Mortal Spin":
return new compf.core.engine.pokemon.effects.newEffects.moves.Mortal_Spin(pkmn);
case "Mud Sport":
return new compf.core.engine.pokemon.effects.newEffects.moves.Mud_Sport(pkmn);
case "Multi-Attack":
return new compf.core.engine.pokemon.effects.newEffects.moves.Multi_Attack(pkmn);
case "Natural Gift":
return new compf.core.engine.pokemon.effects.newEffects.moves.Natural_Gift(pkmn);
case "Nature Power":
return new compf.core.engine.pokemon.effects.newEffects.moves.Nature_Power(pkmn);
case "Nature's Madness":
return new compf.core.engine.pokemon.effects.newEffects.moves.Nature_s_Madness(pkmn);
case "Nightmare":
return new compf.core.engine.pokemon.effects.newEffects.moves.Nightmare(pkmn);
case "No Retreat":
return new compf.core.engine.pokemon.effects.newEffects.moves.No_Retreat(pkmn);
case "Obstruct":
return new compf.core.engine.pokemon.effects.newEffects.moves.Obstruct(pkmn);
case "Octolock":
return new compf.core.engine.pokemon.effects.newEffects.moves.Octolock(pkmn);
case "Odor Sleuth":
return new compf.core.engine.pokemon.effects.newEffects.moves.Odor_Sleuth(pkmn);
case "Order Up":
return new compf.core.engine.pokemon.effects.newEffects.moves.Order_Up(pkmn);
case "Outrage":
return new compf.core.engine.pokemon.effects.newEffects.moves.Outrage(pkmn);
case "Pain Split":
return new compf.core.engine.pokemon.effects.newEffects.moves.Pain_Split(pkmn);
case "Parting Shot":
return new compf.core.engine.pokemon.effects.newEffects.moves.Parting_Shot(pkmn);
case "Payback":
return new compf.core.engine.pokemon.effects.newEffects.moves.Payback(pkmn);
case "Perish Song":
return new compf.core.engine.pokemon.effects.newEffects.moves.Perish_Song(pkmn);
case "Petal Dance":
return new compf.core.engine.pokemon.effects.newEffects.moves.Petal_Dance(pkmn);
case "Phantom Force":
return new compf.core.engine.pokemon.effects.newEffects.moves.Phantom_Force(pkmn);
case "Photon Geyser":
return new compf.core.engine.pokemon.effects.newEffects.moves.Photon_Geyser(pkmn);
case "Pika Papow":
return new compf.core.engine.pokemon.effects.newEffects.moves.Pika_Papow(pkmn);
case "Pluck":
return new compf.core.engine.pokemon.effects.newEffects.moves.Pluck(pkmn);
case "Pollen Puff":
return new compf.core.engine.pokemon.effects.newEffects.moves.Pollen_Puff(pkmn);
case "Poltergeist":
return new compf.core.engine.pokemon.effects.newEffects.moves.Poltergeist(pkmn);
case "Powder":
return new compf.core.engine.pokemon.effects.newEffects.moves.Powder(pkmn);
case "Power Shift":
return new compf.core.engine.pokemon.effects.newEffects.moves.Power_Shift(pkmn);
case "Power Split":
return new compf.core.engine.pokemon.effects.newEffects.moves.Power_Split(pkmn);
case "Power Swap":
return new compf.core.engine.pokemon.effects.newEffects.moves.Power_Swap(pkmn);
case "Power Trick":
return new compf.core.engine.pokemon.effects.newEffects.moves.Power_Trick(pkmn);
case "Power Trip":
return new compf.core.engine.pokemon.effects.newEffects.moves.Power_Trip(pkmn);
case "Present":
return new compf.core.engine.pokemon.effects.newEffects.moves.Present(pkmn);
case "Protect":
return new compf.core.engine.pokemon.effects.newEffects.moves.Protect(pkmn);
case "Psyblade":
return new compf.core.engine.pokemon.effects.newEffects.moves.Psyblade(pkmn);
case "Psych Up":
return new compf.core.engine.pokemon.effects.newEffects.moves.Psych_Up(pkmn);
case "Psychic Fangs":
return new compf.core.engine.pokemon.effects.newEffects.moves.Psychic_Fangs(pkmn);
case "Psychic Terrain":
return new compf.core.engine.pokemon.effects.newEffects.moves.Psychic_Terrain(pkmn);
case "Psycho Shift":
return new compf.core.engine.pokemon.effects.newEffects.moves.Psycho_Shift(pkmn);
case "Psywave":
return new compf.core.engine.pokemon.effects.newEffects.moves.Psywave(pkmn);
case "Punishment":
return new compf.core.engine.pokemon.effects.newEffects.moves.Punishment(pkmn);
case "Purify":
return new compf.core.engine.pokemon.effects.newEffects.moves.Purify(pkmn);
case "Pursuit":
return new compf.core.engine.pokemon.effects.newEffects.moves.Pursuit(pkmn);
case "Quash":
return new compf.core.engine.pokemon.effects.newEffects.moves.Quash(pkmn);
case "Quick Guard":
return new compf.core.engine.pokemon.effects.newEffects.moves.Quick_Guard(pkmn);
case "Rage":
return new compf.core.engine.pokemon.effects.newEffects.moves.Rage(pkmn);
case "Rage Fist":
return new compf.core.engine.pokemon.effects.newEffects.moves.Rage_Fist(pkmn);
case "Rage Powder":
return new compf.core.engine.pokemon.effects.newEffects.moves.Rage_Powder(pkmn);
case "Raging Bull":
return new compf.core.engine.pokemon.effects.newEffects.moves.Raging_Bull(pkmn);
case "Raging Fury":
return new compf.core.engine.pokemon.effects.newEffects.moves.Raging_Fury(pkmn);
case "Rapid Spin":
return new compf.core.engine.pokemon.effects.newEffects.moves.Rapid_Spin(pkmn);
case "Razor Wind":
return new compf.core.engine.pokemon.effects.newEffects.moves.Razor_Wind(pkmn);
case "Recycle":
return new compf.core.engine.pokemon.effects.newEffects.moves.Recycle(pkmn);
case "Reflect":
return new compf.core.engine.pokemon.effects.newEffects.moves.Reflect(pkmn);
case "Reflect Type":
return new compf.core.engine.pokemon.effects.newEffects.moves.Reflect_Type(pkmn);
case "Refresh":
return new compf.core.engine.pokemon.effects.newEffects.moves.Refresh(pkmn);
case "Relic Song":
return new compf.core.engine.pokemon.effects.newEffects.moves.Relic_Song(pkmn);
case "Rest":
return new compf.core.engine.pokemon.effects.newEffects.moves.Rest(pkmn);
case "Retaliate":
return new compf.core.engine.pokemon.effects.newEffects.moves.Retaliate(pkmn);
case "Return":
return new compf.core.engine.pokemon.effects.newEffects.moves.Return(pkmn);
case "Revelation Dance":
return new compf.core.engine.pokemon.effects.newEffects.moves.Revelation_Dance(pkmn);
case "Revenge":
return new compf.core.engine.pokemon.effects.newEffects.moves.Revenge(pkmn);
case "Reversal":
return new compf.core.engine.pokemon.effects.newEffects.moves.Reversal(pkmn);
case "Revival Blessing":
return new compf.core.engine.pokemon.effects.newEffects.moves.Revival_Blessing(pkmn);
case "Rising Voltage":
return new compf.core.engine.pokemon.effects.newEffects.moves.Rising_Voltage(pkmn);
case "Role Play":
return new compf.core.engine.pokemon.effects.newEffects.moves.Role_Play(pkmn);
case "Rollout":
return new compf.core.engine.pokemon.effects.newEffects.moves.Rollout(pkmn);
case "Roost":
return new compf.core.engine.pokemon.effects.newEffects.moves.Roost(pkmn);
case "Rototiller":
return new compf.core.engine.pokemon.effects.newEffects.moves.Rototiller(pkmn);
case "Round":
return new compf.core.engine.pokemon.effects.newEffects.moves.Round(pkmn);
case "Ruination":
return new compf.core.engine.pokemon.effects.newEffects.moves.Ruination(pkmn);
case "Safeguard":
return new compf.core.engine.pokemon.effects.newEffects.moves.Safeguard(pkmn);
case "Salt Cure":
return new compf.core.engine.pokemon.effects.newEffects.moves.Salt_Cure(pkmn);
case "Sandsear Storm":
return new compf.core.engine.pokemon.effects.newEffects.moves.Sandsear_Storm(pkmn);
case "Sappy Seed":
return new compf.core.engine.pokemon.effects.newEffects.moves.Sappy_Seed(pkmn);
case "Secret Power":
return new compf.core.engine.pokemon.effects.newEffects.moves.Secret_Power(pkmn);
case "Shadow Force":
return new compf.core.engine.pokemon.effects.newEffects.moves.Shadow_Force(pkmn);
case "Shed Tail":
return new compf.core.engine.pokemon.effects.newEffects.moves.Shed_Tail(pkmn);
case "Shell Side Arm":
return new compf.core.engine.pokemon.effects.newEffects.moves.Shell_Side_Arm(pkmn);
case "Shell Trap":
return new compf.core.engine.pokemon.effects.newEffects.moves.Shell_Trap(pkmn);
case "Shore Up":
return new compf.core.engine.pokemon.effects.newEffects.moves.Shore_Up(pkmn);
case "Silk Trap":
return new compf.core.engine.pokemon.effects.newEffects.moves.Silk_Trap(pkmn);
case "Simple Beam":
return new compf.core.engine.pokemon.effects.newEffects.moves.Simple_Beam(pkmn);
case "Sketch":
return new compf.core.engine.pokemon.effects.newEffects.moves.Sketch(pkmn);
case "Skill Swap":
return new compf.core.engine.pokemon.effects.newEffects.moves.Skill_Swap(pkmn);
case "Skull Bash":
return new compf.core.engine.pokemon.effects.newEffects.moves.Skull_Bash(pkmn);
case "Sky Attack":
return new compf.core.engine.pokemon.effects.newEffects.moves.Sky_Attack(pkmn);
case "Sky Drop":
return new compf.core.engine.pokemon.effects.newEffects.moves.Sky_Drop(pkmn);
case "Sleep Talk":
return new compf.core.engine.pokemon.effects.newEffects.moves.Sleep_Talk(pkmn);
case "Smack Down":
return new compf.core.engine.pokemon.effects.newEffects.moves.Smack_Down(pkmn);
case "Smelling Salts":
return new compf.core.engine.pokemon.effects.newEffects.moves.Smelling_Salts(pkmn);
case "Snatch":
return new compf.core.engine.pokemon.effects.newEffects.moves.Snatch(pkmn);
case "Snore":
return new compf.core.engine.pokemon.effects.newEffects.moves.Snore(pkmn);
case "Soak":
return new compf.core.engine.pokemon.effects.newEffects.moves.Soak(pkmn);
case "Solar Beam":
return new compf.core.engine.pokemon.effects.newEffects.moves.Solar_Beam(pkmn);
case "Solar Blade":
return new compf.core.engine.pokemon.effects.newEffects.moves.Solar_Blade(pkmn);
case "Sparkling Aria":
return new compf.core.engine.pokemon.effects.newEffects.moves.Sparkling_Aria(pkmn);
case "Speed Swap":
return new compf.core.engine.pokemon.effects.newEffects.moves.Speed_Swap(pkmn);
case "Spider Web":
return new compf.core.engine.pokemon.effects.newEffects.moves.Spider_Web(pkmn);
case "Spikes":
return new compf.core.engine.pokemon.effects.newEffects.moves.Spikes(pkmn);
case "Spiky Shield":
return new compf.core.engine.pokemon.effects.newEffects.moves.Spiky_Shield(pkmn);
case "Spit Up":
return new compf.core.engine.pokemon.effects.newEffects.moves.Spit_Up(pkmn);
case "Spite":
return new compf.core.engine.pokemon.effects.newEffects.moves.Spite(pkmn);
case "Splash":
return new compf.core.engine.pokemon.effects.newEffects.moves.Splash(pkmn);
case "Splintered Stormshards":
return new compf.core.engine.pokemon.effects.newEffects.moves.Splintered_Stormshards(pkmn);
case "Spotlight":
return new compf.core.engine.pokemon.effects.newEffects.moves.Spotlight(pkmn);
case "Stealth Rock":
return new compf.core.engine.pokemon.effects.newEffects.moves.Stealth_Rock(pkmn);
case "Steel Beam":
return new compf.core.engine.pokemon.effects.newEffects.moves.Steel_Beam(pkmn);
case "Steel Roller":
return new compf.core.engine.pokemon.effects.newEffects.moves.Steel_Roller(pkmn);
case "Sticky Web":
return new compf.core.engine.pokemon.effects.newEffects.moves.Sticky_Web(pkmn);
case "Stockpile":
return new compf.core.engine.pokemon.effects.newEffects.moves.Stockpile(pkmn);
case "Stomping Tantrum":
return new compf.core.engine.pokemon.effects.newEffects.moves.Stomping_Tantrum(pkmn);
case "Stone Axe":
return new compf.core.engine.pokemon.effects.newEffects.moves.Stone_Axe(pkmn);
case "Stored Power":
return new compf.core.engine.pokemon.effects.newEffects.moves.Stored_Power(pkmn);
case "Strength Sap":
return new compf.core.engine.pokemon.effects.newEffects.moves.Strength_Sap(pkmn);
case "Struggle":
return new compf.core.engine.pokemon.effects.newEffects.moves.Struggle(pkmn);
case "Stuff Cheeks":
return new compf.core.engine.pokemon.effects.newEffects.moves.Stuff_Cheeks(pkmn);
case "Substitute":
return new compf.core.engine.pokemon.effects.newEffects.moves.Substitute(pkmn);
case "Sucker Punch":
return new compf.core.engine.pokemon.effects.newEffects.moves.Sucker_Punch(pkmn);
case "Super Fang":
return new compf.core.engine.pokemon.effects.newEffects.moves.Super_Fang(pkmn);
case "Swallow":
return new compf.core.engine.pokemon.effects.newEffects.moves.Swallow(pkmn);
case "Switcheroo":
return new compf.core.engine.pokemon.effects.newEffects.moves.Switcheroo(pkmn);
case "Synchronoise":
return new compf.core.engine.pokemon.effects.newEffects.moves.Synchronoise(pkmn);
case "Synthesis":
return new compf.core.engine.pokemon.effects.newEffects.moves.Synthesis(pkmn);
case "Syrup Bomb":
return new compf.core.engine.pokemon.effects.newEffects.moves.Syrup_Bomb(pkmn);
case "Tailwind":
return new compf.core.engine.pokemon.effects.newEffects.moves.Tailwind(pkmn);
case "Take Heart":
return new compf.core.engine.pokemon.effects.newEffects.moves.Take_Heart(pkmn);
case "Tar Shot":
return new compf.core.engine.pokemon.effects.newEffects.moves.Tar_Shot(pkmn);
case "Taunt":
return new compf.core.engine.pokemon.effects.newEffects.moves.Taunt(pkmn);
case "Teatime":
return new compf.core.engine.pokemon.effects.newEffects.moves.Teatime(pkmn);
case "Techno Blast":
return new compf.core.engine.pokemon.effects.newEffects.moves.Techno_Blast(pkmn);
case "Telekinesis":
return new compf.core.engine.pokemon.effects.newEffects.moves.Telekinesis(pkmn);
case "Teleport":
return new compf.core.engine.pokemon.effects.newEffects.moves.Teleport(pkmn);
case "Tera Blast":
return new compf.core.engine.pokemon.effects.newEffects.moves.Tera_Blast(pkmn);
case "Terrain Pulse":
return new compf.core.engine.pokemon.effects.newEffects.moves.Terrain_Pulse(pkmn);
case "Thief":
return new compf.core.engine.pokemon.effects.newEffects.moves.Thief(pkmn);
case "Thousand Arrows":
return new compf.core.engine.pokemon.effects.newEffects.moves.Thousand_Arrows(pkmn);
case "Thousand Waves":
return new compf.core.engine.pokemon.effects.newEffects.moves.Thousand_Waves(pkmn);
case "Thrash":
return new compf.core.engine.pokemon.effects.newEffects.moves.Thrash(pkmn);
case "Throat Chop":
return new compf.core.engine.pokemon.effects.newEffects.moves.Throat_Chop(pkmn);
case "Thunder":
return new compf.core.engine.pokemon.effects.newEffects.moves.Thunder(pkmn);
case "Tidy Up":
return new compf.core.engine.pokemon.effects.newEffects.moves.Tidy_Up(pkmn);
case "Topsy-Turvy":
return new compf.core.engine.pokemon.effects.newEffects.moves.Topsy_Turvy(pkmn);
case "Torment":
return new compf.core.engine.pokemon.effects.newEffects.moves.Torment(pkmn);
case "Toxic Spikes":
return new compf.core.engine.pokemon.effects.newEffects.moves.Toxic_Spikes(pkmn);
case "Transform":
return new compf.core.engine.pokemon.effects.newEffects.moves.Transform(pkmn);
case "Trick":
return new compf.core.engine.pokemon.effects.newEffects.moves.Trick(pkmn);
case "Trick-or-Treat":
return new compf.core.engine.pokemon.effects.newEffects.moves.Trick_or_Treat(pkmn);
case "Trick Room":
return new compf.core.engine.pokemon.effects.newEffects.moves.Trick_Room(pkmn);
case "Triple Axel":
return new compf.core.engine.pokemon.effects.newEffects.moves.Triple_Axel(pkmn);
case "Triple Kick":
return new compf.core.engine.pokemon.effects.newEffects.moves.Triple_Kick(pkmn);
case "Trump Card":
return new compf.core.engine.pokemon.effects.newEffects.moves.Trump_Card(pkmn);
case "Uproar":
return new compf.core.engine.pokemon.effects.newEffects.moves.Uproar(pkmn);
case "Veevee Volley":
return new compf.core.engine.pokemon.effects.newEffects.moves.Veevee_Volley(pkmn);
case "Venom Drench":
return new compf.core.engine.pokemon.effects.newEffects.moves.Venom_Drench(pkmn);
case "Venoshock":
return new compf.core.engine.pokemon.effects.newEffects.moves.Venoshock(pkmn);
case "Wake-Up Slap":
return new compf.core.engine.pokemon.effects.newEffects.moves.Wake_Up_Slap(pkmn);
case "Water Pledge":
return new compf.core.engine.pokemon.effects.newEffects.moves.Water_Pledge(pkmn);
case "Water Shuriken":
return new compf.core.engine.pokemon.effects.newEffects.moves.Water_Shuriken(pkmn);
case "Water Sport":
return new compf.core.engine.pokemon.effects.newEffects.moves.Water_Sport(pkmn);
case "Water Spout":
return new compf.core.engine.pokemon.effects.newEffects.moves.Water_Spout(pkmn);
case "Weather Ball":
return new compf.core.engine.pokemon.effects.newEffects.moves.Weather_Ball(pkmn);
case "Wide Guard":
return new compf.core.engine.pokemon.effects.newEffects.moves.Wide_Guard(pkmn);
case "Wildbolt Storm":
return new compf.core.engine.pokemon.effects.newEffects.moves.Wildbolt_Storm(pkmn);
case "Wish":
return new compf.core.engine.pokemon.effects.newEffects.moves.Wish(pkmn);
case "Wonder Room":
return new compf.core.engine.pokemon.effects.newEffects.moves.Wonder_Room(pkmn);
case "Worry Seed":
return new compf.core.engine.pokemon.effects.newEffects.moves.Worry_Seed(pkmn);
case "Wring Out":
return new compf.core.engine.pokemon.effects.newEffects.moves.Wring_Out(pkmn);
case "Yawn":
return new compf.core.engine.pokemon.effects.newEffects.moves.Yawn(pkmn);
default:
return null;

}
}
}