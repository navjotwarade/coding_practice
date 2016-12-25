package googleinterview;

import java.util.ArrayList;

public class synonyms {
	
	public ArrayList<Boolean> synonymPairs(synonyms, queries){
	     HashMap<String,String> synonymsHashmap = new HashMap<String, String>(); 
	    List<Boolean> output = new ArrayList<>();
	    boolean sentenceMatched = true;
	     for(int i =0;i<synonym.length;i++){
	         String temp =synonym[i];
	         String [] token = temp.split(",");
	         synonymsHashmap.put(token[0],token[1]);
	         sysnonymsHashmap.put(token[1],token[0]);
	     }    
	     for(int i =0; i<queries.length; i++){
	          String parseSingleQuery =queries[i];
	   	    String [] parseQuery = parseSingleQuery.split(",");
	          String firstQuery = parseSingleQuery[0];
	          String secondQuery = parseSingleQuery[1];	           
	  

	        // First check for the length of the string if matches   
	          if(firstQuery.length() == secondQuery.length){

	       String[] firstQueryToken = parseSingleQuery[0].split(" ");
	             String[] secondQueryToken = parseSingleQuery[1].split(" ");
	          
	             for(int j=0; j<firstQueryToken.length;j++){
	           // if matches go inside 
	                if(firstQueryToken[j].equals(firstQueryToken[j])){
	                    continue;
	                }else{
	                     if(synonymsHashMap.containsKey(firstQueryToken[i])){
	                                       if(synonymsHashMap.get(firstQueryToken[i]).equals(secondaryQueryToken[j])){
	            continue;
	else{
	             sentenceMatched = false;
	             break;
	    }
	  
	   }  
	   if(sentenceMatched)
	        output.add(i,true);
	    else
	        output.add(i,false);                    
	                }
	             }
	          }
	                        
	     }
	   return output;
	}

}

}
    public static void main(String[] args) {
		
	}
}