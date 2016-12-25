package graphDemo;

public class zigzagArray {

	public static void main(String args[]){
		int arr[]={4,3,7,8,6,2,1};
		int temp=0;
		for(int i=0;i<arr.length-1;i++)
		{
			if(i%2==0){
				if(arr[i]>arr[i+1])
				{
					temp=arr[i];
					arr[i]=arr[i+1];
					arr[i+1]=temp;
				}
			}
			else{
				if(arr[i]<arr[i+1])
				{
					temp=arr[i];
					arr[i]=arr[i+1];
					arr[i+1]=temp;
				}
								
			}
	
			
			
		}
		for(int k=0;k<arr.length;k++)
			System.out.print(arr[k]+" ");
			System.out.println("\n");
	}
	
}
