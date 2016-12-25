package graphDemo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class stringimutable {

	
	public static void main(String args[]){
	 final String[]s={"amarjit","navjot","richard","manchester"};
	 List<String> list = new ArrayList<String>(Arrays.asList(""));
	 List<String> unmodifiableList = Collections.unmodifiableList(list);
	
	 list.add("four");
	 System.out.println(unmodifiableList);
	int count=s.length;
	final String[] s1=new String[count];
	int j=0;
	
	for(int i=0;i<s.length;i++)
	   {
		    if(s[i].contains("m"))
				{
		    	     list.add(s[i]);
			         
				}
	   }
	
	   System.out.println(unmodifiableList);
	}
	
}
