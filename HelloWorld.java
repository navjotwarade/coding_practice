import java.util.*;
public class HelloWorld{
public Hashtable<String,Integer> countAlphabet(String aString)
// The program counts the numbers of each alphabet in a string, and put the result in a
//hashtable.//

{
Hashtable<String,Integer> table = new Hashtable<>();
if (aString.length() > 4000) return table;
StringBuffer buffer = new StringBuffer(aString);
while (buffer.length() > 0)
  {
String firstChar = buffer.substring(0, 1);
Integer count = (Integer)table.get(firstChar);
//setTimeout(1000);
try{
Thread.sleep(1000);
}catch(Exception e){
	
}
if (count == null)
   {
count = new Integer(1);
   } 
else{
count = new Integer(count.intValue() + 1);
  }
table.put(firstChar, count);
buffer.delete(0, 1);
 }
System.out.print(table);
return table;
//System.out.print(table);
}

     public static void main(String []args){
        System.out.println("Hello World");
        
     }
}
