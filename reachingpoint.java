
public class reachingpoint {
	static int done = 0;
	static boolean ans = false;
	static int checkMax(int x, int y){
	return (x>y)? x:y;
	}
	
	static void checkLR(int a, int b, int c, int d, int rootA, int rootB){
		if(ans == true){
			return;
		}
		if(done == 1){
			return ;
		}
		if((a+b)<= checkMax(c,d) || (a==c && b==d)){
		if(a<=c && b<=d){
             
			 if(a==c && b==d){
                // System.out.println("Yes");
                 done = 1;
                 ans = true;
               //  flag = true;
                 return;
             }
             checkLR(a,a+b,c,d,a,b);    // for left 
             a= rootA;
             b= rootB;
             checkLR(a+b,b,c,d,a,b);    // for righht       
         }else{
        	// System.out.println("No");
        	 return ;
         }
		}
		
         return ;
         
	}
	
	  static String canReach(int a, int b, int c, int d) {
          checkLR(a,b,c,d,a,b);
          String result = "";
          if(ans == true) result = "Yes";
          else result = "No";
          return result;
   }
	  
	  
  public static void main(String[] args) {
	  System.out.println("starttime: "+ System.currentTimeMillis());
	  System.out.println(canReach(1,4,5,9));
	  System.out.println("endtime: "+System.currentTimeMillis());
  }
}
