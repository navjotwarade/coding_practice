package TemporaryPractice;

public class heapsortMyex {

public void sort(int [] arr){
        
        
        int n = arr.length;
        for(int i =n/2 - 1 ; i >= 0; i--)     // ++ instead of --     // missed out =0 condition
        {
            heapify(arr,n,i);    //  convert array into heap
        }
        for(int i = n-1; i >= 0; i--){     // ++ instead of --
            int temp = arr[i];
            arr[i] = arr[0];
            arr[0] = temp;
            
            heapify(arr,i,0);            // passing n instead of i
            
        }
        
    }
    
    public void heapify(int[] arr, int n, int i ){
        
        int largest = i;
        int l = 2*i + 1;
        int r = 2*i + 2;
        
        if(l < n && arr[l] > arr[largest]){           // step 1: check if leaft child is > than node  
            largest = l;
        }
        if(r < n && arr[r] >arr[largest]){            // using l and r instead of a[l] and a[r]
            largest = r; 							  // step 2: check if right child is > than node	
        }
        if(largest != i){                             
            int temp = arr[i]; 						// put  node, left and right into correct position. 	
            arr[i] = arr[largest];
            arr[largest] = temp;
            
            heapify(arr,n,i);                        // heapify the node again
        }
        
    }
    
  static void printArray(int arr[])
	    {
	        int n = arr.length;
	        for (int i=0; i<n; ++i)
	            System.out.print(arr[i]+" ");
	        System.out.println();
	    }
	 
	
	 public static void main(String args[])
	    {
	        int arr[] = {12, 12, 11, 13, 5, 6, 7};
	        int n = arr.length;
	 
	        heapsortMyex ob = new heapsortMyex();
	        ob.sort(arr);
	 
	        System.out.println("Sorted array is");
	        printArray(arr);
	    }
	
}
