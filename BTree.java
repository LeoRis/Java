public class BTree<E> {
	public BNode<E> root;
	
	public BTree() {
		root = null;
	}
	
	public BTree(E info) {
		root = new BNode<E>(info);
	}
	
	public void makeRoot(E elem) {
		root = new BNode<E>(elem);
	}
	
	public BNode<E> addChild(BNode<E> node, int where, E elem){	
		BNode<E> temp = new BNode<E>(elem);
		
		if(where == BNode.LEFT) {
			if(node.left != null) { // The element already exists
				return null;
			}
			node.left = temp;
		}
		else {
			if(node.right != null) { // The element already exists
				return null;
			}
			node.right = temp;
		}
		
		return temp;
	}
	
	public void inOrder(BNode<E> n) {
		if(n != null) {
			inOrder(n.left);
			System.out.println(n.info.toString() + " ");
			inOrder(n.right);
		}
	}
	
	public void preOrder(BNode<E> n) {
		if(n != null) {
			System.out.println(n.info.toString() + " ");
			preOrder(n.left);
			preOrder(n.right);
		}
	}
	
	public void postOrder(BNode<E> n) {
		if(n != null) {
			postOrder(n.left);
			postOrder(n.right);
			System.out.println(n.info.toString() + " ");
		}
	}
}
