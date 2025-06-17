// FIND MAXIMUM ELEMENT IN BINARY TREE
class Node {
    int data;
    Node left, right;
    Node(int value) {
        data=value;
        left=right=null;
    }
}
public class BinaryTree5{
    Node root;
    public BinaryTree5() {
        root=new Node(1);
        root.left=new Node(20);
        root.right=new Node(3);
        root.left.left=new Node(4);
        root.left.right=new Node(5);
    }
    public int findMax(Node node){
        if(node==null)
            return Integer.MIN_VALUE;
        int leftMax=findMax(node.left);
        int rightMax=findMax(node.right);
        return Math.max(node.data,Math.max(leftMax,rightMax));
    }
    public static void main(String[] args){
        BinaryTree5 tree=new BinaryTree5();
        int max=tree.findMax(tree.root);
        System.out.println("Maximum element in the tree:"+max);
    }
}
