package TemporaryPractice;

import java.util.Arrays;

public class queue {
    int[] q ;
    int front,rear;
    int Size;
    
    queue(int size){
    	Size = size; 
    	q = new int[Size];
    	front=-1;
    	rear=-1;
    }
    
    public void resize(){
    	int [] temp = new int[Size+1];
    	System.out.println(q.length);
    	temp = Arrays.copyOf(q, temp.length);
    	System.out.println(Arrays.toString(temp));
    	q = temp;
    	Size = q.length-1;
    	front = q[0];
    	rear = q[Size];
    	System.out.println(rear);
    }
    
    public int enqueue(int num){
    	resize();
    	q[rear] = num; 
    	System.out.println(rear+":"+Arrays.toString(q));
    	return 1;
    }
    
	public void dequeue(){
		
	}
	
	
	public static void main(String[] args) {
		queue Q = new queue(5);
		Q.enqueue(51);
		
		
	} 
}
