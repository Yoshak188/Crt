// SEARCH AN ELEMENT
import java.util.Scanner;
class Node {
    int data;
    Node left; 
	Node right;
    Node(int value) {
        data=value;
        left=right=null;
    }
}
public class BinaryTree7{
    Node root;
    public BinaryTree7(){
        root=new Node(1);
        root.left=new Node(2);
        root.right=new Node(3);
        root.left.left=new Node(4);
        root.left.right=new Node(5);
    }
	 public boolean search(Node node,int value){
        if (node==null)return false;
        if (node.data==value)return true;
        return search(node.left,value)||search(node.right,value);
    }
	 public static void main(String[] args){
        BinaryTree7 tree = new BinaryTree7();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a value to search in the tree: ");
        int valToFind=scanner.nextInt();
        boolean found=tree.search(tree.root,valToFind);
        if(found){
            System.out.println(valToFind +"is found in the tree.");
        } else{
            System.out.println(valToFind +"is NOT found in the tree.");
        }
		scanner.close();
	 }
}
