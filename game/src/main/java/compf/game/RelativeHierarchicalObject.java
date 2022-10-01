package compf.game;

public class RelativeHierarchicalObject extends HierarchicalObject {
    public RelativeHierarchicalObject(int x, int y, int width, int height) {
        super(x, y, width, height);
    }

    @Override
    public void addChild(DrawableObject obj) {
        obj.x=this.x+obj.x;
        obj.y=this.y+obj.y;
        super.addChild(obj);
    }
}
