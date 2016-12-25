package graphDemo;

public class MyQuickSort {

	     int [] numbers;
	    public static void main(String a[]){
	         
	        MyQuickSort sorter = new MyQuickSort();
	        int[] input = {24,2,45,20,56,75,2,56,99,53,12};
	       
	        sorter.sort(input);
	        
	        for(int i:input){
	            System.out.print(i);
	            System.out.print(" ");
	        }
	    }


		private void sort(int[] input) {
			this.numbers=input;
		    int low=0;
			int high=numbers.length-1;
			System.out.println(numbers);
			quickSort(low, high);
				
		}
		private void quickSort(int low,int high) {
			// TODO Auto-generated method stub
			int i=low;
			int j=high;
			
			int pivot=numbers[low+(high-low)/2];
			System.out.println("pivot:"+pivot);
			if(i<=j)
			{
				System.out.println("numbers[i]:"+numbers[i]+"numbers[j]"+numbers[j]);
				while(numbers[i]<pivot)
				{
					i++;
					System.out.println("first while:"+i);
				}
				while(numbers[j]>pivot)
				{
					j--;
					System.out.println("second while:"+j);
				}
				System.out.println("i:"+i+"j:"+j);
				
				if(i<j)
				{
				swap(i,j);
				i++;
				j--;
				}
				
				if(low<j)
					quickSort(low,j);
				
				if(i<high)
					quickSort(i,high);
				
				
			}
			
			
		}


		private void swap(int i, int j) {
			int temp;
			temp= numbers[i];
			numbers[i]=numbers[j];
			numbers[j]=temp;
			
		}
}
