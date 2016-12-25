package graphDemo;

public class secondLargest {

	public static void main(String args[])
	{
		int a[]={3,6,1,4,7};
		int max=a[0];
		int temp=0;
		int second=a[1];
		if(second>max){
			temp=second;
			second=max;
			max=temp;
		}
		for(int i=2;i<a.length;i++)
		{
			if(second<a[i]){
				second=a[i];
			}
			if(max<a[i]){
				second=max;
				max=a[i];
			}
			//System.out.println(a[i]);
		}
		System.out.println("max:"+max+"second:"+second);
		
	}
	
	
}
