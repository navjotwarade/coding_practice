package TemporaryPractice;
public class stack{
    int a[];
    int top;
    int Size;
    
    stack(int size){
        Size = size;
        a = new int [Size];
        top = -1;
    }
    
    public void push(int n){
        a[++top] = n;
    }
    
    public int pop(){
        return a[top--];
    }
    
    public boolean isEmpty(){
        if(top==-1){
            return true;
        }
        return false;
    }
    
    public boolean isFull(){
        if(top ==Size){
            return true;
        }
        return false;
    }
    public  static void main (String args[]){
        stack s = new stack(5);
        s.push(10);
        s.push(20);
        s.push(30);
        s.push(40);
        s.push(50);
        System.out.println(s.pop());
    }
    
    
}