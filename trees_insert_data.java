package sample;
class Node {
	Node right;
	Node left;
	int data;
}

class BST {
	public Node createNewNode(int data) {
		Node a = new Node();
		a.data = data;
		a.left = null;
		a.right = null;

		return a;
	}

	public Node insertData(Node node, int data) {
		if (node == null) {
			return createNewNode(data);
		}
		if(data<=node.data) {
			node.left = insertData(node.left,data);
		}else {
			node.right = insertData(node.right,data);
		}
		return node;
	}

	public boolean search(Node root, int data) {
		if (root == null)
			return false;
		else if (root.data == data)
			return true;
		else if (data <= root.data)
			return search(root.left, data);
		else
			return search(root.right, data);
	}
	
	
	
// 	Tree Traversal 
	
	public void PreOrder(Node head){
		if(head==null){
		return;
		}
		System.out.println(head.data);
		PreOrder(head.left);
		ProOrder(head.right);
	}
	
	public void PostOrder(Node root){
		if(head==null) return;
		PostOrder(head.left);
		PostOrder(head.right);
		System.out.println(head.data);
		

	}
	
	public void InOrder(Node head){
		if(head==null) return;
		
		InOrder(head.left);
		System.out.println(head.data);
		InOrder(head.right);
		
	}
}


public class Traversal {
	public static void main(String[] args) {
		BST a = new BST();
		Node root = null;
		root = a.insertData(root,6);
		root = a.insertData(root,12);
		root = a.insertData(root,4);
		root = a.insertData(root,9);
		root = a.insertData(root,2);
		if(a.search(root,2)==true){
		System.out.println("Number found");
		}else{
		System.out.println("Number not found");
		}
		
	
	}

}
