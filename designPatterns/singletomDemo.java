package designPatterns;
class SingletonObject{
	private static SingletonObject instance = new SingletonObject();
	private SingletonObject(){}
	public static SingletonObject getInstance(){
		//showmsg();
		return instance;
	}
	void showmsg(){
		System.out.println("single");
	}
}


public class singletomDemo {

	 public static void main(String[] args) {
		SingletonObject so = SingletonObject.getInstance();
		so.showmsg();
	}
}
