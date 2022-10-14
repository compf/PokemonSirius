/*
 * public class MultiplePokemonBattle extends PokemonBattle {
 * public enum Mode {
 * V2, V3
 * }
 * 
 * private ArrayList<Player> _players=new ArrayList<>();
 * public ArrayList<Player> getPlayers(){return _players;}
 * public enum PlayerKind{Human,Bot,Network}
 * public MultiplePokemonBattle(Player[] players,int[] pkmnCount) {
 * int counter=0;
 * for(var p:players){
 * _players.add(p);
 * p.setPokemonCount(pkmnCount[counter]);
 * counter++;
 * }
 * 
 * }
 * private int _iterator_player,_iterator_pkmn;
 * 
 * @Override
 * public Pokemon next(){
 * Player player=_players.get(_iterator_player);
 * Pokemon pkmn=player.getPokemon(_iterator_pkmn);
 * _iterator_pkmn++;
 * if(_iterator_pkmn>=player.getPokemonCount()) {
 * _iterator_pkmn=0;
 * _iterator_player++;
 * 
 * }
 * return pkmn;
 * }
 * 
 * @Override
 * public boolean hasNext() {
 * boolean b= _iterator_player<_players.size();
 * if(!b) {
 * _iterator_player=_iterator_pkmn=0;
 * }
 * return b;
 * }
 * 
 * 
 * @Override
 * public void init() {
 * 
 * _schedule=new Schedule(this);
 * _players.get(0)._team[0].setMove(0, 18);
 * 
 * }
 * public void initMove(Move mv,byte attackerId,byte attackerPokemonId){
 * short attackerIndex=combine(attackerId,attackerPokemonId);
 * Player attacker=_players.get(attackerId);
 * for(byte defenderId=0;defenderId<_players.size();defenderId++) {
 * Player defender=_players.get(defenderId);
 * for(byte defenderPokemonId=0;defenderPokemonId<_players.get(defenderId).
 * getPokemonCount();defenderPokemonId++) {
 * short defenderIndex=combine(defenderId,defenderPokemonId);
 * switch(mv.getTarget()){
 * case AllOpponents:
 * if(defenderId!=attackerId && !defender.isAlly(attacker)) {
 * mv.init(_schedule, attackerIndex, defenderIndex);
 * 
 * }
 * case AllOtherPokemon:
 * if(attacker!=defender) mv.init(_schedule, attackerIndex, defenderIndex);
 * break;
 * case AllPokemon:
 * mv.init(_schedule, attackerIndex, defenderIndex);
 * break;
 * case Ally:{
 * defenderIndex=attacker.chooseTarget(this,false,attackerPokemonId,mv);
 * mv.init(_schedule, attackerIndex, defenderIndex);
 * return;
 * }
 * 
 * 
 * case EntireField:
 * if(defenderIndex==attackerIndex || defender.isAlly(attacker))
 * mv.init(_schedule, attackerIndex, defenderIndex);
 * break;
 * case None:
 * Prompt.prompt("None target triggered, need to fix (MultiplePokemonBattle)");
 * break;
 * case OpponentField:
 * if(defenderId!=attackerId && !defender.isAlly(attacker)) {
 * mv.init(_schedule, attackerIndex, defenderIndex);
 * }
 * break;
 * case RandomOpponent:
 * if(!defender.isAlly(attacker) && MyObject.randomNumber(0, 2)==0)
 * mv.init(_schedule, attackerIndex, defenderIndex);
 * 
 * break;
 * case SelectedPokemonMeFirst:
 * case SelectedPokemon:
 * defenderIndex=attacker.chooseTarget(this,true,attackerPokemonId,mv);
 * mv.init(_schedule, attackerIndex, defenderIndex);
 * return;
 * 
 * case User:
 * Prompt.prompt("Not implemented");
 * break;
 * case UserAndAllies:
 * Prompt.prompt("Not implemented");
 * break;
 * case UserField:
 * Prompt.prompt("Not implemented");
 * break;
 * case UserOrAlly:
 * Prompt.prompt("Not implemented");
 * break;
 * default:
 * break;
 * 
 * }
 * }
 * }
 * 
 * }
 * public byte promptPlayer(Player attacker,boolean enemySide) {
 * byte counter=0;
 * byte index=0;
 * for(byte b=0;b<_players.size();b++) {
 * Player defender=_players.get(b);
 * if(enemySide && !defender.isAlly(attacker) || !enemySide &&
 * defender.isAlly(attacker)) {
 * counter++;
 * Prompt.prompt(b + "\t"+defender.getName());
 * index=b;
 * }
 * }
 * if(counter==1) {
 * Prompt.prompt("defender was chosen automatically");
 * return index;
 * }
 * else {
 * index=(byte)Prompt.choosePlayer();
 * return index;
 * }
 * }
 * 
 * @Override
 * public void execute() {
 * byte currPokemon = 1;
 * while (_run) {
 * executeSchedule();
 * Player player=_players.get(0);
 * for(byte p=0;p<_players.size();p++){
 * player=_players.get(p);
 * for(byte i=0;i<player.getPokemonCount();i++){
 * Move mv=null;
 * if(player instanceof HumanPlayer){
 * Prompt.prompt(player.getName() +" your turn with  " + player.getPokemon(i));
 * 
 * int input =Prompt.prompt("Please select an option", "Fight", "Bag",
 * "Pokemon", "Exit");
 * if (input == 0) {
 * 
 * while (mv == null) {
 * mv =player.chooseMove(i);
 * }
 * 
 * // if(_run)break;
 * initMove(mv,p,i);
 * 
 * 
 * } else if (input == 2) {
 * player.chooseNextPokemon();
 * } else if (input == 3) {
 * _run = false;
 * exit();
 * }
 * mv = null;
 * }
 * else if(player instanceof Player) {
 * mv=player.chooseMove(i);
 * initMove(mv,p,i);
 * }
 * }
 * 
 * }
 * _schedule.incrementRound();
 * }
 * }
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * @Override
 * public Pokemon getPokemon(int index) {
 * var s=getIndices((short)index);
 * return _players.get(s[0]).getPokemon(s[1]);
 * }
 * }
 */
