package compf.core.map_maker.random_map_generator;

import compf.core.etc.MyObject;
import compf.game.Direction;
import compf.game.TileBasedHierachicalObject;
import compf.game.Geometry.MyVector;

public class TileBasedAreaGenerator {
    private static final int PROBABILITY_DIRECTION_CHANGE = 20;
    private TileBasedHierachicalObject map;
    private String tileType;
    private static Direction[] upDown = { Direction.Up, Direction.Down };
    private static Direction[] leftRight = { Direction.Left, Direction.Right };
    private double desiredCount = 0;
    private int directionCounter=0;
    private int currDirectionIndex;
    private MyVector startPoint;
  
    Direction[] mainDir;
    Direction[] otherDir;

    public TileBasedAreaGenerator(TileBasedHierachicalObject map, String type) {
        this.map = map;
        this.tileType = type;
        init();
    }

    private void init() {
        int sx, sy;
        do {
            sx =20;
            sy =20;
        } while (!map.isEmpty(sx, sy));
        startPoint = new MyVector(sx, sy);
        int[] mainDirIndex= { MyObject.randomNumber(0, 2), MyObject.randomNumber(0, 2) };
        int[] otherDirIndex=getOppositeDirections(mainDirIndex);
        mainDir = new Direction[] { upDown[mainDirIndex[0]], leftRight[mainDirIndex[1]] };
        otherDir = new Direction[] { upDown[otherDirIndex[0]], leftRight[otherDirIndex[1]] };
        desiredCount=MyObject.RNG.nextGaussian()*1+100;
        currDirectionIndex=MyObject.RNG.nextInt(2);
    }

    private int[] getOppositeDirections(int[] mainDirIndex) {
        return new int[] { (mainDirIndex[0] + 1) % 2, (mainDirIndex[1] + 1) % 2 };
    }

    private enum GeneratorPhase {
        GoAway, Return, Close
    }
    private boolean changeDirection(){
        for(int i=0;i<directionCounter;i++){
            if(MyObject.checkPerc(PROBABILITY_DIRECTION_CHANGE)){
                return true;
            }
        }
        return false;
    }
    private MyVector getNextPos(MyVector pos,GeneratorPhase phase){
        Direction[] directions;
        if(phase==GeneratorPhase.GoAway){
            directions=mainDir;
        }
        else if(phase== GeneratorPhase.GoAway){
            directions=otherDir;
        }
        else{
            directions=Direction.getDirections(pos, startPoint);
        }
        if(pos.getX()==0 || pos.getX()>=map.getWidth()-1 || pos.getY()==0 || pos.getY()>=map.getHeight()-1 ||  changeDirection()){
            directionCounter=0;
            currDirectionIndex=(currDirectionIndex+1)%directions.length;
        }
        else{
            directionCounter++;
        }
        if(currDirectionIndex >=directions.length){
            currDirectionIndex=0;
        }
        return Direction.add(pos, directions[currDirectionIndex]);
        
    }
    private GeneratorPhase getPhase(int totalCounter) {
        double perc=totalCounter/desiredCount;
        if(perc<0.4){
            return GeneratorPhase.GoAway;
        }
        else if(perc<1){
            return GeneratorPhase.Return;
        }
        else{
            return GeneratorPhase.Close;
        }

    }

    public void generate() {

        Direction currDir = mainDir[MyObject.randomNumber(0, 2)];
  
        int totalCounter = 0;
        MyVector currPos=startPoint;
        do{
            GeneratorPhase phase=getPhase(totalCounter);
            System.out.println(phase);
            do{
                currPos=getNextPos(currPos, phase);
               
            }while(map.isUsed(currPos));
            map.set(currPos, tileType);
            totalCounter++;
            System.out.println(currPos.getX()+" "+currPos.getY());
        }while(!currPos.equals(startPoint));

    }
}
