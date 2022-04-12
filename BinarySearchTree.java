public class BinarySearchTree {
	TreeNode root;
	
	public BinarySearchTree(TreeNode root) {
		this.root =root;
	}
	
	public void swapData(TreeNode nodeA, TreeNode nodeB) {
		int temp = nodeA.data;
		nodeA.data = nodeB.data;
		nodeB.data = temp;
	}
	
	public TreeNode deleteHelper(int data, TreeNode root) {
		if(root == null) {
			return null;
		}
		else if(data < root.data) {
			root.left = deleteHelper(data, root.left);
		}
		else if(data > root.data) {
			root.right = deleteHelper(data, root.right);
		}
		else {
			if(root.left == null && root.right == null) {
				root = null;
			}
			else if(root.left == null || root.right == null) {
				root = root.left == null ? root.right : root.left;
			}
			else {
				TreeNode predecessorNode = root.left.findMax();
				swapData(predecessorNode, root);
				root.left = deleteHelper(predecessorNode.data, root.left);
			}
		}
		return root;
	}
	
	public TreeNode delete(int data) {
		return this.root = deleteHelper(data, this.root);
	}
}
