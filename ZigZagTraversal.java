	public void spiralTraversal(Node root) {
		Stack<Node>s1 = new Stack<Node>();
		Stack<Node>s2 = new Stack<Node>();
		Node popedNode=null;
		s1.push(root);
		
		while(!s1.isEmpty() || !s2.isEmpty()) {
			
			while(!s1.isEmpty()) {
				popedNode = s1.pop();
				System.out.print(popedNode.data+" ");
				if(popedNode.right!=null) {
					s2.push(popedNode.right);
				}
				if(popedNode.left!=null) {
					s2.push(popedNode.left);
				}
	
			}
			while(!s2.isEmpty()) {
				popedNode = s2.pop();
				System.out.print(popedNode.data+" ");
				if(popedNode.left!=null) {
					s1.push(popedNode.left);
				}
				if(popedNode.right!=null) {
					s1.push(popedNode.right);
				}

			}
		}	
	}
