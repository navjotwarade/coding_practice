package designPatterns;
class Square extends shape{
	Square(){
		System.out.println("new object of type sqaure is formed");
	}
}
class Circle extends shape{
	Circle(){
		System.out.println("new object of type circle is formed");
	}

	public void setId(String string) {
		// TODO Auto-generated method stub
		
	}
}
class shape{
	shape(){
		System.out.println("this is shape class");
	}
	
}
class shapeFactory{
	String shape;
	public shape getShape(String shape){
		this.shape = shape;
		if(shape.equals("Circle")) return new Circle();
		if(shape.equals("Square")) return new Square();
		
		
		return new shape();
	}
	
}

public class factoryPattern {
	
 public static void main(String[] args) {
	  shapeFactory sFactory = new shapeFactory();
	  shape s = sFactory.getShape("Circle");
	  s= sFactory.getShape("Square");
			  
 }
}
