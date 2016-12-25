package TemporaryPractice;
import java.util.*;
public class array {
    
	public  static void main(String[] args) {
		int a[] = new int [10];
		Scanner sc = new Scanner(System.in);
		int b[]={4,1,5,2,1,5,1};
		for(int i=0 ; i<5; i++){
			a[i]= sc.nextInt();
		}
		System.out.println(Arrays.toString(a));
		System.out.println(Arrays.toString(b));
	}
	
}
