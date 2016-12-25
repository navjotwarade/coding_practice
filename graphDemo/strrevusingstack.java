package graphDemo;

public class strrevusingstack {

	
    int top;
    char [] charstr;
    int maxSize;
    public strrevusingstack(int maxSize) {
    	top = -1;
    	charstr = new char[maxSize];
    	}
    public void push(char c){
    	charstr[++top] = c;
    }
    public char pop(){
    	return charstr[top--];
    }
    public char peek(){
    	return charstr[top];
    }
    public static void main(String[] args) {
		strrevusingstack mystack = new strrevusingstack(20);
		//mystack.push('a');
		//mystack.push('b');
		char [] arr = "navjot".toCharArray();
		char [] exp = "[()]{}{[()()]()}".toCharArray();
		mystack.evalparen(exp);
		//mystack.reverseStr(arr);
		while(mystack.top!=-1){
			System.out.println("ele"+mystack.pop());
		}
	}
    
    public void evalparen(char [] arr){
    	for(int i=0,k=-1;i<arr.length;i++){
    		if(isOpenParen(arr[i]))	{
    			push(arr[i]);
    		}
    		else{
    			if(arr[i]== ')' && peek() == '(' ){
    				pop();
    			}
    			if(arr[i]== ']' && peek() == '[' ){
    				pop();
    			}
    			if(arr[i]== '}' && peek() == '{' ){
    				pop();
    			}
    			
    		}
    	}
    	
    	
    }
    
    public boolean isOpenParen(char c){
    	if(c=='(' || c== '[' || c == '{'){
    		return true;
    	}
    	return false;
    }
    public void reverseStr(char [] arr){
    	for(int i=0; i<arr.length;i++){
    		push(arr[i]);
    	}
    }
 }
