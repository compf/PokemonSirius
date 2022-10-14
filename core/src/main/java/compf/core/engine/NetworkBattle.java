/*
 * public class NetworkBattle extends PokemonBattle {
 * private boolean _isServer = false;
 * private ServerSocket _server = null;
 * private Socket _conn = null;
 * public static final int DEFAULT_PORT = 1998;
 * public static String DEFAULT_IP = "127.0.0.1";
 * private ObjectInputStream _in;
 * private ObjectOutputStream _out;
 * 
 * @Override
 * public void init() {
 * _schedule = new Schedule(this);
 * System.out.println("Please input 1 for server and 2 for client");
 * int input = 0;
 * do {
 * try {
 * input = Prompt.chooseServerClient();
 * } catch (InputMismatchException ex) {
 * continue;
 * }
 * 
 * } while (input != 1 && input != 2);
 * if (input == 1) {
 * _isServer = true;
 * _conn = startServer(DEFAULT_PORT);
 * } else {
 * _conn = startClient(DEFAULT_IP, DEFAULT_PORT);
 * }
 * 
 * try {
 * var str = _conn.getInputStream();
 * _out = new ObjectOutputStream(_conn.getOutputStream());
 * _in = new ObjectInputStream(_conn.getInputStream());
 * 
 * } catch (IOException e) {
 * // TODO Auto-generated catch block
 * e.printStackTrace();
 * }
 * _player=new BotPlayer(0,getName(),createRandomTeam());
 * // writeObject(NetworkMessages.PokemonHeader);
 * writeObject(_player);
 * 
 * _enemy = this.<Player>readObject();
 * 
 * 
 * 
 * }
 * 
 * public String getName() {
 * if (isServer()) {
 * return "Server: ";
 * } else {
 * return "Client: ";
 * }
 * }
 * 
 * public void writeObject(Object obj) {
 * try {
 * _out.reset();
 * _out.writeObject(obj);
 * } catch (IOException e) {
 * // TODO Auto-generated catch block
 * e.printStackTrace();
 * }
 * }
 * 
 * @Override
 * public void exit() {
 * try {
 * _in.close();
 * _out.close();
 * _conn.close();
 * if (isServer()) {
 * _server.close();
 * }
 * } catch (IOException e) {
 * // TODO Auto-generated catch block
 * e.printStackTrace();
 * }
 * 
 * }
 * 
 * private boolean isServer() {
 * // TODO Auto-generated method stub
 * return _isServer;
 * }
 * 
 * public <T> T readObject() {
 * try {
 * return (T) _in.readObject();
 * } catch (ClassNotFoundException | IOException e) {
 * // TODO Auto-generated catch block
 * e.printStackTrace();
 * return null;
 * }
 * 
 * }
 * 
 * protected Socket startServer(int port) {
 * try {
 * ServerSocket server = new ServerSocket(DEFAULT_PORT);
 * server.setSoTimeout(1000 * 60 * 1);
 * _server = server;
 * return server.accept();
 * 
 * } catch (IOException e) {
 * // TODO Auto-generated catch block
 * e.printStackTrace();
 * return null;
 * }
 * }
 * 
 * protected Socket startClient(String ip, int port) {
 * try {
 * Socket s = new Socket(DEFAULT_IP, DEFAULT_PORT);
 * if (s.isConnected() && !s.isClosed()) {
 * return s;
 * }
 * return null;
 * } catch (IOException e) {
 * // TODO Auto-generated catch block
 * e.printStackTrace();
 * return null;
 * }
 * }
 * 
 * 
 * 
 * @Override
 * public void execute() {
 * NetworkBattleWorker worker=new NetworkBattleWorker();
 * worker.start();
 * 
 * while (_run) {
 * Move mv = null;
 * System.out.println(this.toString());
 * while(!_schedule.isBalanched()) {
 * 
 * }
 * executeSchedule();
 * _schedule.otherSideState.set(false);
 * int input =Prompt.prompt("Please select an option", "Fight", "Bag",
 * "Pokemon", "Exit");
 * if (input == 0) {
 * 
 * while (mv == null) {
 * mv = playerChoose();
 * }
 * writeObject(NetworkMessages.PlayerChose);
 * 
 * // if(_run)break;
 * mv.init(_schedule, PLAYER1, PLAYER2);
 * 
 * _schedule.incrementRound();
 * } else if (input == 2) {
 * chooseNewPlayerPokemon();
 * } else if (input == 3) {
 * _run = false;
 * exit();
 * return;
 * }
 * mv = null;
 * 
 * }
 * }
 * 
 * class NetworkBattleWorker extends Thread {
 * 
 * @Override
 * public void run() {
 * while (_run) {
 * var parent = NetworkBattle.this;
 * Object obj = parent.<Object>readObject();
 * if(obj instanceof NetworkMessages) {
 * NetworkMessages msg=(NetworkMessages)obj;
 * switch (msg) {
 * case DamageDealt:
 * DamageInformation dmg = parent.<DamageInformation>readObject();
 * getPokemon(1).modifyCurrHp(dmg.getDamage());
 * System.out.println(dmg.toString());
 * break;
 * case PlayerChose:
 * _schedule.otherSideState.set(true);
 * }
 * }
 * 
 * }
 * }
 * 
 * }
 * }
 */