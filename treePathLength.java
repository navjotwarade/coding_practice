class Node{
	int data;
	Node left;
	Node right;
	Node(int d){
		data = d;
		left = null;
		right = null;
	}
}



public class treePathLength {
	Node root;
	
	private void printTree(Node root){
	   this.root = root;	
	   if(root!=null){
		   printTree(root.left);
		   System.out.println(root.data);
		   
		   printTree(root.right);
	   }
	}
	
    int prev_data =0;
	
	int count = 0;
	public void maxConsLength(Node root){
		this.root = root;
		
        if(root!=null){
        	//System.out.println(root.data);
        	if((prev_data+1) == root.data || count == 0)  
        	{
        		System.out.println(root.data);
        		prev_data = root.data;
        	}
        	count++;
        	//prev_data = root.data;
        	maxConsLength(root.left);
        	maxConsLength(root.right);
        }
		
	}
	
	public static void main(String[] args) {
        Node root = new Node(10);
        root.left = new Node(11);
        root.right = new Node(9);
        root.left.left = new Node(13);
        root.left.right = new Node(12);
        root.right.left = new Node(13);
        root.right.right = new Node(8);
        treePathLength tp = new treePathLength();
       tp.printTree(root);
		//tp.maxConsLength(root); 
	}
	

}
