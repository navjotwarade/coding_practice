package designPatterns;

import java.util.Hashtable;

class shaape implements Cloneable{
	String id;
	String type;
	public String getID(){
            return id;		
	}
	public String getType(){
		return type;
	}
    public void setId(String n){
		id = n;
	}
	public Object clone(){
		Object clone = null;
		try{
		clone = super.clone();
		}catch(Exception e){
			System.out.println("Exception: "+e);
		}
		return clone;
	}
}
class square extends shaape{
	
	square(){
		type = "square";
	}
	
}
class circle extends shaape{
	circle(){
		type = "circle";
	}
	
}
class cloneChache{
	Hashtable<String, String> htable = new Hashtable<String, String>();
	public shaape getshape(String shapeId){
		shaape cacheShape = 
	}
	public static void loadCache() {
	      Circle circle = new Circle();
	      circle.setId("1");
	      htable.put(circle.getId(),circle);

	      Square square = new Square();
	      square.setId("2");
	      htable.put(square.getId(),square);

	      
	   }
}
public class prototypePattern {
public static void main(String[] args) {
	
}
}
