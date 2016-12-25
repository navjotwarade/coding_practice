package TemporaryPractice;
import java.util.*;

public class pricesuggestiion {

	public static void main(String[] args) {
		 int [] contractData = {1, 5, 6, 3, 2, 4, 7, 8};
		 int length = contractData.length;
		    int [] part1 = new int [length/2];
		    int [] part2 = new int [length/2];
		    int [] priceSuggestion = new int[2]; 
		    
		    Arrays.sort(contractData);
		    System.out.println(Arrays.toString(contractData));
		    part1 = Arrays.copyOfRange(contractData, 0 , length/2);
		    part2 = Arrays.copyOfRange(contractData, length/2, length);
		   
		    int length1 = part1.length;
		    int length2 = part2.length;
		    int x = length1-1;
		    //System.out.println(part1[x/2]);
		    priceSuggestion[0] = part1[x/2];
		    priceSuggestion[1] = part2[(length2-1)/2];
		    System.out.println(Arrays.toString(priceSuggestion));
	}
	
	
}
