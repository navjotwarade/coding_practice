package BridgePattern;
abstract class shape{
	protected drawAPI drawAPI;
	public shape(drawAPI drawAPI){
		this.drawAPI =drawAPI;
	}
	protected abstract void draw();
}
class Circle extends shape{
int x, y, radius;;
	public Circle(int x, int y,int r,drawAPI drawAPI) {
		super(drawAPI);
		this.x =x;
		this.y =y;
		this.radius = r;
		// TODO Auto-generated constructor stub
	}

	@Override
	protected void draw() {
		// TODO Auto-generated method stub
		drawAPI.drawCircle(radius, x, y);
	}
	
	
}
interface drawAPI{
	void drawCircle(int radius, int x, int y);
}
class redCircle implements drawAPI{
	 public void drawCircle(int radius, int x, int y){
		 System.out.println("this is red circle with parameters ("+radius+")");
	 }
}
class greenCircle implements drawAPI{
	public void drawCircle(int radius, int x, int y){
		System.out.println("this is green circle with parameters ("+radius+")");
	}
}

public class bridgePattern {

	public static void main(String[] args) {
		Circle redCircle = new Circle(100,100,10,new redCircle());
		Circle greenCircle = new Circle(200,20,20, new greenCircle());
		redCircle.draw();
		greenCircle.draw();
	}
	
}
