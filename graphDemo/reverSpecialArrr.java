package graphDemo;

public class reverSpecialArrr {
	public static void main(String args[]){
		String[] arr1={"a",",","b","$","c"};
		String [] arr2=new String [arr1.length];
		String [] arr3=new String [arr1.length];
		int count=0;
		
		int j=0;
		for(int i=0;i<arr1.length;i++){
			if(arr1[i].matches("[^A-Za-z0-9]") ){
				arr2[j]=arr1[i];
				
			}
			j++;
		}
		int q=0;
		for(int i=arr1.length-1;i>=0;i--){
			if(arr1[i].matches("[^A-Za-z0-9]")){
				continue;
			}
			arr3[q]=arr1[i];
			q++;
			count++;
		}

		int p=0;
		
		for(int k=0;k<arr1.length;k++){
			if(arr1[k].matches("[^A-Za-z0-9]")){
				continue;
			 }
			
			arr2[k]=arr3[p];
			System.out.println(arr2[k]+" copied from :"+arr3[p]);
			p++;
			
		}
		
		for(int i=0;i<arr2.length;i++){
			System.out.print(arr2[i]+ ",");
		}
		
				
	}

}
