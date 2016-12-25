package graphDemo;

public class modifiedreverseSpecialArr {
	public static void main(String args[]){
		//String[] arr1={"a",",","b","$","c"};
		String[] arr1={"A","b",",","c","d","e","!","$"};
		//String[] arr1={Ab,c,de!$};
		String [] arr2=new String [arr1.length];
		String [] arr3=new String [arr1.length];
		int count=0;
		
		int j=0,q=0;
		for(int i=0;i<arr1.length;i++){
			if(arr1[i].matches("[^A-Za-z0-9]") ){
				arr2[j]=arr1[i];
			}else{
				arr2[j]=null;
			    arr3[q]=arr1[i];
			    q++;
			}
			j++;
		}
		int p=0;
		for(int k=0;k<arr1.length;k++){
			if(arr1[k].matches("[^A-Za-z0-9]")){
				continue;
			 }
			arr2[k]=arr3[q-1];
			p++;
			q--;
		}
		
		for(int i=0;i<arr2.length;i++){
			System.out.print(arr2[i]+ ",");
		}
		
				
	}

}
