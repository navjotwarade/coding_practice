class CDLLNode{
			int data;
			CDLLNode next;
			CDLLNode prev;
			public CDLLNode(int d) {
				// TODO Auto-generated constructor stub
				data = d;
				next = null;
				prev = null;
			}
		}
public class tree2CDLL {
Node root;
CDLLNode head;
	
	public void printTree(Node root){
	   this.root = root;	
	   if(root!=null){
		   printTree(root.left);
		   System.out.println(root.data);
		   conv2CDLL(root.data);
		   printTree(root.right);
	   }
	}
	public void conv2CDLL(int data){
		
		
		if(head == null){
			head = new CDLLNode(data);
			head.next = head;
			head.prev = head;
		}else{
			CDLLNode current = head;
			System.out.println(current.data);
			while(current.next!=head){
				current = current.next;
			}
			System.out.println(current.data);
			
		}
		
		
	}
	
	public static void main(String[] args) {
        Node root = new Node(10);
        root.left = new Node(12);
        root.right = new Node(15);
        root.left.left = new Node(25);
        root.left.right = new Node(30);
        root.right.left = new Node(36);
        //root.right.right = new Node(8);
        tree2CDLL tp = new tree2CDLL();
        tp.printTree(root);
		//tp.maxConsLength(root); 
	}
}
