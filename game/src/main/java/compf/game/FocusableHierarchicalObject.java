package compf.game;

public class FocusableHierarchicalObject extends HierarchicalObject{
    private DrawableObject focused;

    public FocusableHierarchicalObject(int x, int y, int width, int height) {
        super(x, y, width, height);
    }
    public void setFocused(DrawableObject obj){
        focused=obj;
    }
    public DrawableObject getFocused(){
        return focused;
    }
    @Override
    public void onKeyPress(int key,boolean newPress){
        if(focused!=null)focused.onKeyPress(key,newPress);
        for(var chi:getChildren()){
            if(chi!=focused)chi.onKeyPress(key,newPress);
        }
    }
}
