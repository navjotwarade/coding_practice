package graphDemo;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;

class pair{
	int i;
	int j;
	pair(int x, int y){
		i=x;
		j=y;
	}
	int sum(){
		return i+j;
	}
}

public class findFourElements {
  public static void main(String[] args) {
	int [] arr =  {3, 4, 7, 1, 2, 9, 8};
	HashMap<Integer, pair> map = new HashMap<Integer,pair>();
	for(int a = 0; a < arr.length; a++){
		for(int b = 1 ; b<arr.length; b++){
		  if(a==b) continue;
		  pair p = new pair(arr[a], arr[b]);
		 // System.out.println("sum: "+p.sum()+ "p: "+p);
		  if(!map.containsKey(p.sum())){
			  map.put(p.sum(),p);
		  }else{
			  pair p2 = map.get(p.sum());
			  System.out.println("i: "+p2.i+"j: "+p2.j+"a: "+p.i+"b: "+p.j);
		  }
		}
	}
  }
}
