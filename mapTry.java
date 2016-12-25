import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class mapTry {

	public static void main(String[] args) {
		Map<String , String > dataSet = new HashMap<>();
		  dataSet.put("A", "C");
	        dataSet.put("B", "C");
	        dataSet.put("C", "F");
	        dataSet.put("D", "E");
	        dataSet.put("E", "F");
	        dataSet.put("F", "F");
	        
	     Map<String, ArrayList<String>> map = new HashMap<String, ArrayList<String>>();
	     
	    ArrayList<String> list= new ArrayList<String>();
	   
	    for(Entry <String,String> entry : dataSet.entrySet()) {
	    	if(!map.containsKey(entry.getValue())) {
	    		list = new ArrayList<String>();
	    	}else{
	    		list = map.get(entry.getValue());
	    	}
	    		//list.clear(); 
              
	    	    list.add(entry.getKey());
	    	    map.put(entry.getValue(),list);
	    	
	    }
	        System.out.println(map.toString());
		
	}
	
	
 	
}
