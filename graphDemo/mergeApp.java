package graphDemo;

public class mergeApp {

	public static void main(String args[]){
		
		int[] arrayA = {23, 47, 81, 95};
		int[] arrayB = {7, 14, 39, 55, 62, 74};
		int[] arrayC = new int[10];
		merge(arrayA, 4, arrayB, 6, arrayC);
		display(arrayC, 10);
		System.out.println("in main");
	}
	
	public static void merge(int [] ArrayA,int sizeA,int [] ArrayB,int sizeB,int[] ArrayC){
	    int dexA=0,dexB=0,dexC=0;
	    System.out.println("in merge");
		while(dexA!=ArrayA.length && dexB!=ArrayB.length){
		  if(ArrayA[dexA]>ArrayB[dexB]){
			  ArrayC[dexC]=ArrayB[dexB];
			  dexC++;dexB++;
			  System.out.println("in if");
		  }
		  else if (ArrayA[dexA]<ArrayB[dexB]){
			  ArrayC[dexC]=ArrayA[dexA];
			  System.out.println("in else");
			  dexC++;dexA++;
		  }
		}
		while(dexA!=ArrayA.length){
			ArrayC[dexC] = ArrayA[dexA];
			dexC++;dexA++;
			System.out.println("in while 1");
		}
		while (dexB!=ArrayB.length){
			ArrayC[dexC] = ArrayB[dexB];
			dexC++; dexB++;
			System.out.println("in while 2");
		}
	}
	
	public static void display(int [] ArrayC, int sizeC){
		for(int i=0;i<sizeC;i++){
			System.out.println(ArrayC[i]);
		}
	}
	
	
}
