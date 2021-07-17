
public class TreeNode {
	int data;
	TreeNode left;
	TreeNode right;
	
	public TreeNode(int data) {
		this.data = data;
	}
	
	public TreeNode findMin() {
		if(left != null) {
			return findMin();
		}
		return this;
	}
	
	public TreeNode findMax() {
		if(right != null) {
			return findMax();
		}
		return this;
	}
	
	public TreeNode search(int data) {
		if(data == this.data) {
			return this;
		}
		else if(data < this.data) {
			if(left != null) {
				return left.search(data);
			}
			else {
				return null;
			}
		}
		else {
			if(right != null) {
				return right.search(data);
			}
			else {
				return null;
			}
		}	
	}
	
	public void insert(int data) {
		if(data < this.data) {
			if(left == null) {
			left.insert(data);
			}
			else {
				left = new TreeNode(data);
			}
		}
		else {
			if(right != null) {
				right.insert(data);
			}
			else {
				right = new TreeNode(data);
			}
		}
	}
	
	public void preorder() {
		System.out.println(this.data);
		
		if(left != null) {
			left.preorder();
		}
		if(right != null) {
			right.preorder();			
		}
	}
	
	// Prints the tree in ascending order
	public void inorder() {
		if(left != null) {
			left.inorder();
		}
		
		System.out.println(this.data);
		
		if(right != null) {
			right.inorder();
		}
	}
	
	public void postorder() {
		if(left != null) {
			left.postorder();
		}
		
		if(right != null) {
			right.postorder();
		}
		
		System.out.println(this.data);
	}
	
	public TreeNode prevSmallerAncestor(TreeNode n, TreeNode ancestorNode) {
		if(this.data < data) {
			return right.prevSmallerAncestor(n, this);
		}
		else if(this.data > n.data) {
			return left.prevSmallerAncestor(n, ancestorNode);
		}
		return ancestorNode;
	}
	
	public TreeNode inorderPredecessor(TreeNode n) {
		if(n == null) {
			return null;
		}
		else if(n.left != null) {
			return n.left.findMax();
		}
		return prevSmallerAncestor(n, null);
	}
	

}
