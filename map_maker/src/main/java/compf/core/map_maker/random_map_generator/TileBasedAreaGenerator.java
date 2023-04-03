package compf.core.map_maker.random_map_generator;

import java.util.ArrayList;

import compf.core.engine.Tuple;
import compf.core.etc.MyObject;
import compf.game.Direction;
import compf.game.TileBasedHierachicalObject;
import compf.game.Geometry.MyVector;

public class TileBasedAreaGenerator {
    private static final int PROBABILITY_DIRECTION_CHANGE = 5;
    private TileBasedHierachicalObject map;
    private String tileType;
    private static Direction[] upDown = { Direction.Up, Direction.Down };
    private static Direction[] leftRight = { Direction.Left, Direction.Right };
    private double desiredCount = 0;
    private int directionCounter=0;
    private int currDirectionIndex;
    private MyVector startPoint;
    private GeneratorPhase lastPhase=GeneratorPhase.GoAway;
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
            sx =10;
            sy =10;
        } while (map.isUsed(sx, sy));
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
        if(isPosInvalid(pos) ||  changeDirection()){
            directionCounter=0;
            turningPoints.add(new Tuple<MyVector,Direction>(pos, directions[currDirectionIndex]));
            currDirectionIndex=(currDirectionIndex+1)%directions.length;
            if(currDirectionIndex >=directions.length){
                currDirectionIndex=0;
            }
            

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
    ArrayList<Tuple<MyVector,Direction>> turningPoints=new ArrayList<>();

    private boolean  isPosInvalid(MyVector pos){
       return  false; //pos.getX()<0 || pos.getX()>=map.getWidth() || pos.getY()<0 || pos.getY()>=map.getHeight();
    }
    private void floodfill(MyVector pos){
        if(map.isUsed(pos))return;
        map.set(pos, tileType);
        floodfill(Direction.add(pos, Direction.Up));
        floodfill(Direction.add(pos, Direction.Down));
        floodfill(Direction.add(pos, Direction.Left));
        floodfill(Direction.add(pos, Direction.Right));
    }
    public void generate() {

  
        int totalCounter = 0;

        MyVector currPos=startPoint;
        do{
            GeneratorPhase phase=getPhase(totalCounter);
            if(phase!=lastPhase){
                directionCounter=0;
            }
            lastPhase=phase;
            MyVector posDummy=currPos;
            int endlessLoopPreventionCounter=0;
            do{
                currPos=getNextPos( posDummy, phase);
                endlessLoopPreventionCounter++;
               
            }while( endlessLoopPreventionCounter<100 &&  map.isUsed(currPos));
            map.set(currPos,tileType);
            totalCounter++;
        }while(!currPos.equals(startPoint));
        for(var pt_dir:turningPoints){
            for(Direction dir :Direction.values()){
                int usedCounter=0;
                MyVector currPosFloodFill=pt_dir.Item1;
                for(int i=0;i<desiredCount;i++){
                    currPosFloodFill=Direction.add(currPosFloodFill, dir);
                    if(map.isUsed(currPosFloodFill)){
                        usedCounter++;
                    }
                }
                if(usedCounter==1){
                    floodfill(Direction.add(pt_dir.Item1, dir));
                }
            }
        }

    }
}
