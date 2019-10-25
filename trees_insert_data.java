package sample;

public class Traversal {
	
	class Node{
		int data;
		Node right;
		Node left;
	}
	static Node head;
  
                       // Insert data in the tree 
  
	public void insert_data(int data) {
		Node new_Node = new Node();
		new_Node.data = data;
		new_Node.left = null;
		new_Node.right = null;
		if(head==null) {
			head = new_Node;
			return;
		}
		else {
			Node pointer = head;
			while(pointer.left!=null && pointer.right!=null) {
				if(new_Node.data<=pointer.data) {
					pointer = pointer.left;
				}
				else pointer = pointer.right;
			}
			if(new_Node.data<pointer.data) {
				pointer.left = new_Node;
			}
			else {
				pointer.right = new_Node;
			}
		}
	}
             // Search elements in  the tree
             
	public void search(int data) {
		Node pointer = head;
		while(pointer.left!=null ||  pointer.right!=null) {
			if(pointer.data == data) {
				System.out.println("Number found");
				return;
			}
			else if(data<pointer.data) {
				pointer = pointer.left;
			}
			else {
				pointer = pointer.right;
			}
		}
		if(pointer.data==data) {
			System.out.println("found");
		}
		else {
			System.out.println("not found");
		}
	}
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
	public static void main(String[] args) {
		Traversal obj = new Traversal();
		Node head = null;
		obj.insert_data(11);
		obj.insert_data(6);
		obj.insert_data(8);
		obj.insert_data(19);
		obj.insert_data(4);
		obj.insert_data(10);
		obj.insert_data(5);
		obj.insert_data(17);
		obj.insert_data(43);
		obj.insert_data(49);
		obj.insert_data(31);
		
		obj.search(13);
		
	
	}

}
