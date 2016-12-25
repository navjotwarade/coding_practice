package graphDemo;

import java.util.ArrayList;

public class sumPair {

	 public static void main(String []args){
	        System.out.println(" World");
	        int [] arr ={8,2,1,10,5,4,3};
	        int sum = 7;
	        ArrayList al= new ArrayList();
	        for(int i=0;i<arr.length;i++)
	        {
	            int temp = sum - arr[i];
	            if(al.contains(arr[i]))
	            {
	                System.out.println(temp + " and "+ arr[i]);
	               // break;
	            }
	            
	            al.add(temp);
	        }
	        
	       // System.out.println(arr-arr[2]);
	     }
	
}
