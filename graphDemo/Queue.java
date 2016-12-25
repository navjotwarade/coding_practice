package graphDemo;

public class Queue {
	
	
	int rear, front;
	int [] Queuearr;
	int size;
	
	
	Queue( int inSize){
	  //  Qarr = new int[size];
	    rear = -1;
	    front = -1;
	    size = inSize;
	    Queuearr = new int [size];
	}
	public boolean isempty(){
		if(front == -1 && rear == -1) {
			return true;
		}
		return false;
	}
	public boolean isFull(){
		if(rear == size){
			return true;
		}
		return false;
	}
	
	public void enqueue(int data) throws Exception{
		if(isempty()) {
			front++;
			rear++;
			Queuearr[rear] = data;
		}else if(isFull()){
			throw new Exception("Queue is full");	
		}else{
			rear++;
			Queuearr[rear] = data;
		}
		
	}
	
	
	public int dequeue(){
		
		int popelement = Queuearr[rear];
		Queuearr[rear] = -1;
		rear--;
		
		return  popelement;
	}
	
	public static void main(String[] args) throws Exception {
	
		Queue q = new Queue(5);
		q.enqueue(1);
		q.enqueue(2);
		
		q.enqueue(3);
		
		System.out.println(q.dequeue()); 
		
	}
	

}
