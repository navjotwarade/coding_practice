package decoratorPattern;
interface shape{
	void draw();
}
class rectangle implements shape{
	@Override
	public void draw() {
		System.out.println("this is a rectangle");
	}
	
}
class Circle implements shape{
	@Override
	public void draw() {
		System.out.println("this is a circle");
	}
}
abstract class shapeDecorator implements shape{
	protected shape decoratedShape;
	public shapeDecorator(shape shape) {
		this.decoratedShape= shape;
	}
	public void draw(){};
	
}
class redshapeDecorator extends shapeDecorator{

	public redshapeDecorator(shape decoratedShape) {
		super(decoratedShape);
	}
	
	public void draw(){
		decoratedShape.draw();
		setBorder(decoratedShape);
	}
	public void setBorder(shape decoratedShape){
		System.out.println("circle with red border");
	}
	
	
}

public class decoratorPattern {
public static void main(String[] args) {
	Circle circle =new Circle();
	redshapeDecorator redshapdector = new redshapeDecorator(new Circle());
	circle.draw();
	redshapdector.draw();
	
}
}
