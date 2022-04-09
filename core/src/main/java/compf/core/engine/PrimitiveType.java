package compf.core.engine;

public class PrimitiveType{
	public final static PrimitiveType BYTE=new PrimitiveType(1);
	public final static PrimitiveType INT=new PrimitiveType(4);
	public final static PrimitiveType LONG=new PrimitiveType(8);
	private int _size;
	public int getSize() {return _size;}
	private PrimitiveType(int size)
	{
		_size=size;
	}
}