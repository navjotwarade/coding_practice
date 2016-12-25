package graphDemo;
import java.lang.Math; 

public class pythagorusTriplet {

	public static void main(String args[])
	{
		int arr[]={10,6,2,4};
		
		//a2+b2=c2
		for(int i=0;i<arr.length;i++)
		{
			for(int j=i+1;j<arr.length;j++)
			{
				for(int k=j+1;k<arr.length;k++)
				{
					int powera=(int) Math.pow(arr[i], 2);
					int powerb=(int) Math.pow(arr[j],2);
					int powerc= (int) Math.pow(arr[k], 2);
					if( powera + powerb == powerc)
							{
						         System.out.println(arr[i]+"|"+arr[j]+"|"+arr[k]);
						         System.out.println("output: True");
						         break;
							}else{
						         System.out.println("output: False");
						         break;
							}
				}
			}
		}
		
	}
	
	
}
