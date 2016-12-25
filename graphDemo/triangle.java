package graphDemo;

import java.util.*;

public class triangle {
	
	public static void main(String args[])
	{
	/*	[
	     [2],
	    [3,4],
	   [6,5,7],
	  [4,1,8,3]
	]*/
		Scanner in=new Scanner(System.in);
	//	ArrayList<ArrayList<Integer>> ar=new ArrayList<ArrayList<Integer>>[[2],[3,4],[6,5,7],[4,1,8,3]  ];
		List <Integer> l=new ArrayList<Integer>();
		l.add(2);
		List <Integer> l1=new ArrayList<Integer>();
		l1.add(3);
		l1.add(4);
		List <Integer> l2=new ArrayList<Integer>();
		l2.add(6);
		l2.add(5);
		l2.add(7);
		List <Integer> l3=new ArrayList<Integer>();
		l3.add(4);
		l3.add(1);
		l3.add(8);
		l3.add(3);
		List <ArrayList<Integer>> ml=new ArrayList <ArrayList<Integer>>();
		ml.add((ArrayList<Integer>) l);
		ml.add((ArrayList<Integer>) l1);
		ml.add((ArrayList<Integer>) l2);
		ml.add((ArrayList<Integer>) l3);
		System.out.println(ml);
		
		int min1=Collections.min(l);
		int min2=Collections.min(l1);
		int min3=Collections.min(l2);
		int min4=Collections.min(l3);
		
		System.out.println(min1+min2+min3+min4);
	}
	
	
	
}
