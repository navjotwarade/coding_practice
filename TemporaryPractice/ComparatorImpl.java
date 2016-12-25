package TemporaryPractice;

import java.util.Comparator;
import java.util.PriorityQueue;

class Country implements Comparable<Country>{
	String name;
	
	Country(String name){
		this.name = name;
	}

	@Override
	public int compareTo(Country o) {
		// TODO Auto-generated method stub
		return name.compareTo(o.name);
	
	}
	
}

class NameComparator implements Comparator<Country>{
	public int compare(Country c1, Country c2){
		return c1.name.compareTo(c2.name);
	}
}

public class ComparatorImpl {

	
	public static void main(String[] args) {
		PriorityQueue<Country> pq = new PriorityQueue<Country>();
		pq.add(new Country("aaca"));
		pq.add(new Country("b"));
		pq.add(new Country("aaac"));
		Country m;
		while((m = pq.poll())!= null){
			System.out.println(m.name);
		}
		PriorityQueue<Country> pq1 = new PriorityQueue<Country>(3,new NameComparator());
		pq1.add(new Country("av"));
		pq1.add(new Country("bv"));
		pq1.add(new Country("dv"));
		
		while((m = pq1.poll())!= null){
			System.out.println(m.name);
		}
	}
	 
}
