package StringArrays;

import java.util.Arrays;

public class rotateArray {

	public static void main(String[] args) {
		
		int []  nums  = {0,1,2,3,4,5,6,7};
		int k =3;
		  if(k > nums.length) 
		        k=k%nums.length;
		 
		    int[] result = new int[nums.length];
		 
		    for(int i=0; i < k; i++){
		        result[i] = nums[nums.length-k+i];
		    }
		 
		    int j=0;
		    for(int i=k; i<nums.length; i++){
		        result[i] = nums[j];
		        j++;
		    }
		 
		    System.arraycopy( result, 0, nums, 0, nums.length );
		    System.out.println(Arrays.toString(result));
		
	}
	
}
