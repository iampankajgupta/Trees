package sample;

import sample.Traversal.Node;

public class Another {
	class Node{
		int data;
		Node left;
		Node right;
	}
	
	Node head;
	 Node insert_data(Node head,int data) {
		Node first_Node = new Node();
		first_Node.data = data;
		first_Node.left = null;
		first_Node.right = null;
		if(head==null) {
			head = first_Node;
			return head;	
		}
		else if(first_Node.data<head.data) {
			head.left = insert_data(head.left,data);
			return head;
		}
		else {
			head.right = insert_data(head.right,data);
			return head;
		}
	
	}
	public boolean search(Node head,int data) {
		if(head==null) return false;
		if(head.data==data) {
			return true;
		}
		else if(data<head.data) {
			return search(head.left,data);
		}
		else {
			return search(head.right,data);
		}
	}
	
	 void inorder(Node head) {
		if(head==null) return ;
		inorder(head.left);
		System.out.print(head.data+" ");
		inorder(head.right);
	}
	void pre_order(Node head) {
		if(head==null) return ;
		System.out.print(head.data+" ");
		pre_order(head.left);
		pre_order(head.right);
	}
	
	
	void post_order(Node head) {
		if(head==null) return ;
		post_order(head.left);
		post_order(head.right);
		System.out.print(head.data+" ");
	}
	
	
	
	public static void main(String[] args) {
		Another obj = new Another();
		Node head =null;
		head = obj.insert_data(head, 11);
		head = obj.insert_data(head, 14);
		head = obj.insert_data(head, 5);
		head = obj.insert_data(head, 21);
		head = obj.insert_data(head, 30);
		head = obj.insert_data(head, 25);
//		if(obj.search(head, 30)==true) {
//			System.out.println("found");
//		}
//		else {
//			System.out.println("not found");
//		}
		obj.inorder(head);
		obj.pre_order(head);
		obj.post_order(head);
	
	}

}
