
public class findSqrt {
    
	
	
	public static void findSquareRoot(double number){
		boolean isPositiveNumber = true;
	    double g1;

		
		   double squareRoot = number/2;
		    do
		    {
		        g1=squareRoot;
		        squareRoot = (g1 + (number/g1))/2;
		    }
		   while((g1-squareRoot)!=0);

		    //Displays square root in the case of a positive number
		    if(isPositiveNumber)
		    {
		        System.out.println("Square roots of "+number+" are ");
		        System.out.println("+"+squareRoot);
		        System.out.println("-"+squareRoot);
		    }
		    //Displays square root in the case of a -ve number
		    else
		    {
		        System.out.println("Square roots of -"+number+" are ");
		        System.out.println("+"+squareRoot+" i");
		        System.out.println("-"+squareRoot+" i");
		    }

	}
	
	
	
	public static void main(String[] args) {
		findSquareRoot(9);
		
	}
	 
}
