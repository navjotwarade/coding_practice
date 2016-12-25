package graphDemo;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;


public class twopower {

	public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner in=new Scanner(System.in);
        double sum=0;
        int t=in.nextInt();
        for(int i=0;i<t;i++)
        {
            int a=in.nextInt();
            int b=in.nextInt();
            int n=in.nextInt();
           // sum=a;
            for(int j=0;j<n;j++)
            {
                  int mathresult=(int)Math.pow(2,j);
                  sum=sum+a+(mathresult*b); 
                  int sum1=(int)sum;
                  System.out.print(sum1+" "); 
            }
           // System.out.println(Math.pow(n1,0)+Math.pow(n2,1)+Math.pow(n3,2));
            
        }
    }
	
}
