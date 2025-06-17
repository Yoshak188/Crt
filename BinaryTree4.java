//FIND SUM OF ALL NODES
class Node {
    int data;
    Node left; 
	Node right;
    Node(int value) {
        data=value;
        left=right=null;
    }
}
public class BinaryTree4{
    Node root;
    public BinaryTree4() {
        root=new Node(1);
        root.left=new Node(2);
        root.right=new Node(3);
        root.left.left=new Node(4);
        root.left.right=new Node(5);
    }
	public int sumofNodes(Node node){
		if(node==null)return 0;
		return node.data+sumofNodes(node.left)+sumofNodes(node.right);
	}
	public static void main(String[] args){
		BinaryTree4 tree=new BinaryTree4();
		int sumofNodes=tree.sumofNodes(tree.root);
		System.out.println("Sum of All Nodes:"+sumofNodes);
	}
}
		