package designPatterns;
class Factoryproducer extends abstractFactory{
	abstractFactory factory;
	public abstractFactory getFactory(String factoryType){
		
		if(factoryType.equals("shape")) return new shapefactory();
		if(factoryType.equals("color")) return new colorFactory();
		
		return null;
		
	}
}

/*class shape{
	shape(){
		System.out.println("this is shape constructor");
	}
}*/
class color{
	color(){
		System.out.println("this is color constructor");
	}
}
class shapefactory extends abstractFactory{
	public shape getShape(String shapeType){
		if(shapeType.equals("Circle")) return new Circle();
		if(shapeType.equals("Square")) return new Square();
		return new shape();
	}
}
class colorFactory extends abstractFactory{
	public colorFactory() {
	   System.out.println("this is color factory constructor");	// TODO Auto-generated constructor stub
	}
	@Override
	public color getcolor(String colorType){
		if(colorType.equals("red")) return new red();
		if(colorType.equals("green")) return new green();
		return new color();
	}
}
class red extends color{
	red(){
		System.out.println("this is red constructor");
	}
}
class green extends color{
	green(){
		System.out.println("this is green constructor");
	}
}
/*
class Square extends shape{
	Square(){
		System.out.println("this is square constructor");
	}
}
/*class Circle extends shape{
	Circle(){
		System.out.println("this is circle constructor");
	}
}*/
class abstractFactory{
	public abstractFactory() {
	   System.out.println("this is abstract factory constructor");	// TODO Auto-generated constructor stub
	}

	public color getcolor(String string) {
		// TODO Auto-generated method stub
		return null;
	}
}
public class abstractfactorypattern {

	public static void main(String[] args) {
	//	abstractFactory absFactry = new abstractFactory();
		Factoryproducer fp = new Factoryproducer();
		abstractFactory colrFactry = fp.getFactory("color");
		color red = colrFactry.getcolor("red");
	}
}
