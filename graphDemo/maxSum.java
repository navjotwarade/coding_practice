package graphDemo;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class maxSum {
	 public static void main(String[] args) {
         int max=0,prev=0;
       /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
       Scanner in=new Scanner(System.in);
       int t=in.nextInt();
       for(int i=0;i<t;i++)
          {
           int size=in.nextInt();
           int target=in.nextInt();
           String sr=(in.nextLine());
           String str=in.nextLine();
           String [] temp;
           temp = str.split(" ");
          //---------------------------------------------------------------------------------------------------
           for(int j=0;j<temp.length;j++){
               for(int k=j+1;k<temp.length;k++){
                 //  System.out.println("j:"+j+" k:"+k);
                   //-----------------------------------------------------------
                   int sum=0;
                   for(int p=j;p<k;p++)
                   {
                       sum=sum+Integer.valueOf(temp[p]);    
                   }
                   int mod=sum % target;
               //    System.out.println("sum: "+sum+"mod: "+mod);
                        //-------------------------------------------
                           //System.out.println("mod: "+mod+"max: "+max);
                           if(mod>max)
                               {
                                 max=mod;
                               //  System.out.println("in if max: "+max);
                               }
                               // System.out.println("max: "+max);
                               // max=mod;
                        //-------------------------------------------  
                    
                   //-----------------------------------------------------------
            }
              //  System.out.println("max: "+max);
           }
           
           
          
           //-------------------------------------------------------------------------------------------------------
         
            System.out.println(max);
         }
   }
}
