package graphDemo;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;

public class countTriplets {
	
	public static void main(String args[]){
		int arr[]= {-2,0,1,3};
		int target=2;
		for(int i=0;i<arr.length;i++)
		{
			
			for(int j=i+1;j<arr.length;j++)
			{
				for(int k=j+1;k<arr.length;k++)
				{
				
					if(arr[i]+arr[j]+arr[k]<2){
						System.out.println(arr[i]+" "+arr[j]+" "+arr[k]);
										
					}
				}
			}
		}
		
		
		
		
	}
	
}
	


