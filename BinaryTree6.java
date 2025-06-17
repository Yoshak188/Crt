// COUNT NON-LEAF NODES
class Node {
    int data;
    Node left; 
	Node right;
    Node(int value) {
        data=value;
        left=right=null;
    }
}
public class BinaryTree6{
    Node root;
    public BinaryTree6() {
        root=new Node(1);
        root.left=new Node(2);
        root.right=new Node(3);
        root.left.left=new Node(4);
        root.left.right=new Node(5);
    }
	public int countNonleafNodes(Node node) {
        if (node == null) return 0;
        if (node.left == null && node.right == null)
            return 0;
        return 1 +countNonleafNodes(node.left)+countNonleafNodes(node.right);
    }
	public static void main(String[] args){
		BinaryTree6 tree=new BinaryTree6();
		int countNonleafNodes=tree.countNonleafNodes(tree.root);
		System.out.println("Number of Non leaf nodes:"+countNonleafNodes);
	}
}