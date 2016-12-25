package StringArrays;
import java.util.*;
public class convList2StrArr {
	
	 public static void main(String[] args) {
		List<String> l = new ArrayList<String>();
		l.add("abc");
		l.add("am");
		l.add("using");
		l.add("to");
		
		String [] strarray = l.toArray(new String[0]);
		for(String str:strarray) System.out.println(str);
	}
}
