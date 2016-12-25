package TemporaryPractice;

public class ransomNote {
	
	
	
	public static void main(String[] args) {
		
		int [] c1 = new int[26];
		int [] c2 = new int[26];
		
		String s1 = "aa";   //"aa"
		String s2 = "aab";    //"ab", "aab"
		
		for(int i=0;i<s1.length();i++){
			c1[(int) s1.charAt(i)- 'a' ]++;
		}
		for(int j =0 ;j<s2.length(); j++){
			c2[(int) s2.charAt(j)- 'a']++; 
		}
		for(int k=0; k<s1.length();k++ ){
			if((c1[(int) s1.charAt(k)- 'a' ] <= c2[(int) s1.charAt(k) - 'a']) && (c2[(int) s1.charAt(k)-'a'] >0 )){
				continue;
			}else{
				System.out.println(" false");
			}
		}
		System.out.println(" true ");
		
	}

}
