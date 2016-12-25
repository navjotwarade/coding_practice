package tree;
class Node
{
    int data;
    Node left, right;
    public Node(int item)
    {
        data = item;
        left = right = null;
    }
}
public class levelOrderTraversal {
	
	 Node root;
	 
	   
	    /* function to print level order traversal of tree*/
	    void printLevelOrder(Node root)
	    {
	        int h = height(root);
	        int i;
	        for (i=1; i<=h; i++)
	            printGivenLevel(root, i);
	    }
	 
	    /* Compute the "height" of a tree -- the number of
	    nodes along the longest path from the root node
	    down to the farthest leaf node.*/
	    int height(Node root)
	    {
	        if (root == null)
	           return 0;
	        else
	        {
	            /* compute  height of each subtree */
	            int lheight = height(root.left);
	            int rheight = height(root.right);
	             
	            /* use the larger one */
	            if (lheight > rheight)
	                return(lheight+1);
	            else return(rheight+1); 
	        }
	    }
	 
	    /* Print nodes at the given level */
	    void printGivenLevel (Node root ,int level)
	    {
	        if (root == null)
	            return;
	        if (level == 1)
	            System.out.print(root.data + " ");
	        else if (level > 1)
	        {
	            printGivenLevel(root.left, level-1);
	            printGivenLevel(root.right, level-1);
	        }
	    }
	    void printlevelAlt (Node root, int level){
	    	if(root == null) return ;
	    	int h = height(root);
	    	int count = 0;
	    	while(count < level){
	    		root = root.left;
	    		root = root.right;
	    	}
	    	System.out.println("");
	    }
	    
	 public static void main(String args[])
	    {
		 levelOrderTraversal tree = new levelOrderTraversal();
	       Node root= new Node(1);
	       root.left= new Node(2);
	       root.right= new Node(3);
	       root.left.left= new Node(4);
	       root.left.right= new Node(5);
	       root.right.left = new Node(6);
	       root.right.right = new Node(7);
	        
	       System.out.println("Level order traversal of binary tree is ");
	       tree.printLevelOrder(root);
	    }
}
