package graphDemo;

public class stackimpl {
	int top;
//	char[] stackarr;
	int [] stackarrint;
	int maxSize;
	public stackimpl(int maxSize) {
	//	stackarr = new char[maxSize];
		stackarrint = new int [maxSize];
		top= -1;
	}
	public int pop(){
		return stackarrint[top--];
	}
	/*public char pop(){
		
		return stackarr[top--];
	}*/
	private int peek(){
		return stackarrint[top];
	}
/*	private char peek()
	{
		return stackarr[top];
	}*/
	public boolean isEmpty(){
		if(top!=-1) return false;
		else return true;
	}
	
	public static void main(String[] args) {
		stackimpl mystack = new stackimpl(5);
		//mystack.push(1);
		//mystack.push(2);
		//mystack.push(3);
		//mystack.push(4);
		//System.out.println(mystack.peek());
		while(mystack.top != -1){
			//System.out.println(mystack.pop());
		}
		
		//char []  exp = "a+b*(c^d-e)^(f+g*h)-i".toCharArray();
		//mystack.infixtoprefix(exp);
		char [] exp1= "231*+9-".toCharArray();
		mystack.evalPostfix(exp1);
	}
	
	private void evalPostfix(char [] arr){
		int result=0;
		for(int i=0,k=-1;i<arr.length;i++){
			if(isNumber(arr[i])){
				push(arr[i]);
			}
			else{
				if(arr[i] == '*'){
					result= pop()*pop(); 
				}else if(arr[i] == '+'){
					result = pop() + pop();
				}else if(arr[i] == '-'){
					result = pop() - pop();
				}
				push(result);
			}
		}
		
		
	}

	private void push(int result) {
		// TODO Auto-generated method stub
		
	}

	private boolean isNumber(char c) {
		if(c >=0 && c <=9){ return true;}
		return false;
	}

	public boolean isOperand(char c){
		if((c >'a' && c< 'z')  || (c > 'A' && c < 'Z') )
		return true;
		else
		return false;
	}
	public void infixtoprefix(char [] arr){
		
		for(int i=0, k=-1;i<arr.length;i++){
			
			// if operand push to stack
			if(isOperand(arr[i])){
				arr[++k]=arr[i];
			}
			
			// if '(' push to stack
			if(arr[i]=='(' ){
				push('(');
			}
			
			/// encountered ')' pop alll elements from the stack till '('
			if(arr[i]==')'){
			    while(stackarr[top]!='('){
			    	
			    }
			}
			
			// if encountered operator then check if the precendennce of the operator is greatere than hte precedence of the character in teh stack
			else{
				while(prec(arr[i])<prec(stackarr[top]))
				{
					arr[++k]= pop();
				}
				push(arr[i]);
			}
			
		}
		
		
	}
	
	private int prec(char ch){
		switch(ch){
		case '+':
					break;
		case '-':
			return 1;
		case '*':
	    case '/':
	        return 2;
	 
	    case '^':
	        return 3;	
		}
		return -1;
	}
	private void push(char str) {
		// TODO Auto-generated method stub
		 stackarr[++top]= str;
		
	}

	
}
