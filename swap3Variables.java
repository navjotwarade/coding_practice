
public class swap3Variables {
	
	
	public static void main(String[] args) {
		int a = 11, b = 26, c = 33;
		
		int subsum =a+b;
		
		int totsum = subsum + c;
		
		a = totsum - subsum;
		subsum =  totsum - a;
		b =  subsum - b;
		c = subsum - b;
		
		System.out.println("a : "+a);
		//System.out.println("subsum : "+subsum);
		System.out.println("b : "+b);
		System.out.println("c : "+c);
	}

}
