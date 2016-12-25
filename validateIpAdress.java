import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class validateIpAdress {
	
	
  public static void main(String[] args) {
	 String s1= "222.111.111.111";
	 String s2 = "222.22.23.25.2.23";
	 char[] charArray = s1.toCharArray();
	 
	 String pattern ="([\\d+]*\\.[\\d+]*\\.[\\d+]*\\.[\\d+]*)";
	// "([\\d+]*\\.[\\d+]*\\.[\\d+]*)\\..*";
	 try{
     Pattern r = Pattern.compile(pattern);
     Matcher m = r.matcher(s1);
     if (m.find( )) {
         System.out.println("Found value: " + m.group(0) );
         if(!m.group(0).equals(s1)) System.out.println("Invalid IP address");
     }else{
    	 System.out.println("invalid Ip !");
     }
	 }catch(Exception e){
		 System.out.println("in exception");
	 }
     
     for (String retval: s1.split("\\.")) {
    	 int n = Integer.parseInt(retval);
    	 if(n < 0 || n >255){
    		 System.out.println("invalid Ip !");
    	 }
         System.out.println(retval);
      }
  }
	
	
}
