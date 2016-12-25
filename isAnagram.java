import java.util.HashMap;

public class isAnagram {
	
  public static void main(String[] args) {
	
	  HashMap <Character, Integer> Map1 = new HashMap<Character, Integer>();
	  
	  HashMap <Character, Integer> Map2 = new HashMap<Character, Integer>();
	  
	  String s1 = "anagram";
	  String s2 = "margana";
	  
	  s1 = s1.toLowerCase();
	  s2 = s2.toLowerCase();
	  
	  if(s1.length() == s2.length()){
		 for(int i =0; i< s1.length(); i++){ 
		  if(Map1.containsKey(s1.charAt(i))){
			  Map1.put(s1.charAt(i), Map1.get(s1.charAt(i)+1));
		  }else{
			  Map1.put(s1.charAt(i), Map1.get(s1.charAt(i)));
		  }
		  
		 }
		 
		  
	  }else{
		  
	  }
	  
 }

}
