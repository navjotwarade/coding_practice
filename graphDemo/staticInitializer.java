package graphDemo;
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;


public class staticInitializer {

	private static boolean flag=true; 
	private static int B;
	private static int H;
	static {
	    System.out.println("in static");
	    Scanner sc=new Scanner(System.in);
	     boolean flag=true;
	    int B=sc.nextInt();
	    int H=sc.nextInt();
	    if(B<=0 || H<=0){
	        System.out.println("java.lang.Exception: Breadth and height must be positive");     
	    }
	}


	
	public static void main(String[] args){
		if(flag){
			int area=B*H;
			
			System.out.print("B:"+B+"H:"+H+"area:"+area);
		}
		
	}
}
