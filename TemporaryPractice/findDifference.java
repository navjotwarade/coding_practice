package TemporaryPractice;

public class findDifference {
	public static void main(String[] args) {
		
	
	String s = "abcde";
	String t = "abcd";
	   if(s.length()>=t.length())
       {
           for(int i =0 ; i< t.length(); i++){
        	   System.out.println(t.substring(i,i+1));
               if(s.contains(t.substring(i))){
                   s= s.substring(0,i)+s.substring(i+1,s.length()-1);
               }
           }
          System.out.println(s);
       }else{
            for(int i =0 ; i< s.length(); i++){
               if(t.contains(s.substring(i))){
                   t= t.substring(0,i)+t.substring(i+1,t.length()-1);
               }
           }
        //    System.out.println(t);;
       }
	}
}
