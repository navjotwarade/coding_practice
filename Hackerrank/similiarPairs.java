package Hackerrank;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class similiarPairs {
    Node root;
    static Node nodeIm; 
    List<Integer> nodes = new ArrayList<Integer>();
   static class Node{
        Node left;
        Node right;
        int data;
        Node(int d){
            data = d;
            left = null;
            right = null;
        }
    }
    public void getNodeWithData(Node root, int value){
        if(root.data == value){
            nodeIm = root;
            return ;
        }
      if(root.left!=null){
          getNodeWithData(root.left,value);
      }
      if(root.right!=null){
          getNodeWithData(root.right,value);
      }
        return ;
    }
    boolean checkParentofNode(int a, int b, Node root){
        getNodeWithData(root,a);
        Node nodeA = nodeIm;
        nodeIm = null;
        getNodeWithData(root,b);
        Node nodeB = nodeIm;
        nodeIm = null;
        
        if(nodeA.left.data == nodeB.data || nodeA.right.data ==nodeB.data){
            return true;
        }
        return false;
        
    }
    
    void generateTree(int a, int b,Node root){
      
        if(nodes.contains(a)){
            getNodeWithData(root,a);
            Node parent = nodeIm;
            nodeIm = null;
            if(parent.left == null){
                 parent.left = new Node(b);
            }else{
               parent.right = new Node(b);
            }
        }else{
        	Node temp1 = null;
        	if(a == root.data)
        	{
        		temp1 = root;
        	}else{
        		temp1 = new Node(a);
        	}
         //  Node temp1 = new Node(a);
            nodes.add(a);
            if(temp1.left == null){
                 temp1.left = new Node(b);
            }else{
               temp1.right = new Node(b);
            }
           
        }
       
      //  Node temp2 = new Node(b);
      nodes.add(b);
        
      //  temp1.left = temp2;
        
    }
    
    public static  void printTree(Node root){
        Node current = root;
        if(current!=null){
            System.out.println("da: "+current.data);
            printTree(current.left);
            printTree(current.right);
        }
        
    }

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        similiarPairs s = new similiarPairs();
        Node root = s.root;
        Scanner sc = new Scanner(System.in);
        int n = 5;// sc.nextInt();
        int k = 2;// sc.nextInt();
        int count=0;
        
        for(int i =0; i<n-1 ; i++){
            int a = sc.nextInt();
            if(root == null) {
                root = new Node(a);
            }
           // if()
           // Node temp1 = new Node(a);
            int b= sc.nextInt();
            s.generateTree(a,b,root);
            
            boolean check = s.checkParentofNode(a,b,root);
            if(check == true && Math.abs(a-b) <= k ) count++;
          //  Node temp2 = new Node(b);
            
        }
        printTree(root);
        System.out.println("count "+ count);
    }
}
