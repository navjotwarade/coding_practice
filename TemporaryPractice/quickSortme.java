package TemporaryPractice;

import java.util.Arrays;

public class quickSortme {

	public static void main(String[] args) {
		
		int arr [] ={9, 2 , 4, 7, 3, 7 , 10};
		
		int low = 0;
		int high = arr.length-1;
		
		quickSort(arr, low, high);
		
		System.out.println(Arrays.toString(arr));
		
		
		
	}
	
	public static void quickSort(int [] arr, int low, int high){
		// Dont forget to hanfdke the test cases in case of null array
		int middle = low+ (high - low)/2;
		int pivot = arr[middle];
		int i=low, j= high;
		while(i<=j){
			while(arr[i]<pivot){
				i++;                 // if already in place move ahead
			}
			while(arr[j]>pivot){
				j--;                 // if already in the place move backwards
			}
			if(i<=j){
				int temp =arr[i];    // swap wrongly places elements
				arr[i] = arr [j];
				arr[j] = temp;
				i++;                  // move ahead i for next  
				j--; 					// move backwards j for the next checkings
			}
					
		}
		if(low < j){
			quickSort(arr , low , j);       // now that we have one part of the aray sorted lets move to the next aprt
			}
		if(high > i){
			quickSort(arr, i , high);       // similarly divide and conquer the array to sor the remaining aprt of the array  
		}
	}
	
	
	
}
