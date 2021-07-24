// Class: SLLTree
// Class: Tree

public class Windows_Menu {

	public static void main(String[] args) {
		Tree.Node<String> a, b, c, d;
		SLLTree<String> t = new SLLTree<String>();
		t.makeRoot("C:");
		
		a = t.addChild(t.root, "Program files");
		b = t.addChild(a, "CodeBlocks");
		c = t.addChild(b, "codeblocks.dll");
		c = t.addChild(b, "codeblocks.exe");
		b = t.addChild(a, "Notepad++");
		c = t.addChild(b, "langs.xml");
		c = t.addChild(b, "notepad++.exe");
		a = t.addChild(t.root, "Users");
		b = t.addChild(a, "John");
		c = t.addChild(b, "Desktop");
		c = t.addChild(b, "Downloads");
		c = t.addChild(b, "My Documents");
		c = t.addChild(b, "My Pictures");
		b = t.addChild(a, "Public");
		a = t.addChild(t.root, "Windows");
		b = t.addChild(a, "Media");
		t.printTreeRecursive(a, 0);
	}

	
}

/////////////////////////////////////////////////////////////////////////////////////////////////////////

import java.util.Iterator;
import java.util.NoSuchElementException;

public class SLLTree<E> implements Tree<E> {

	// SLLNode is the implementation of the Node interface
	class SLLNode<P> implements Node<P>{
		
		// Holds the links to the needed nodes
		SLLNode<P> parent, sibling, firstChild;
		
		// Hold the data
		P element;
		
		public SLLNode(P o) {
			element = o;
			parent = sibling = firstChild = null;
		}
		
		public P getElement() {
			return element; 
		}
		
		public void setElement(P o) {
			element = o;
		}

	}
	
	// Root of the tree
	protected SLLNode<E> root;
	
	public SLLTree() {
		root = null;
	}
	
	public Node<E> root(){
		return root;
	}
	
	public Tree.Node<E> parent(Tree.Node<E> node){
		return ((SLLNode<E>) node).firstChild;
	}
	
	public int childCount(Tree.Node<E> node) {
		SLLNode<E> temp = ((SLLNode<E>) node).firstChild;
		int num = 0;
		
		while(temp != null) {
			temp = temp.sibling;
			num++;
		}
		
		return num;
	}
	
	public void makeRoot(E element) {
		root = new SLLNode<E>(element);
	}
	
	public Node<E> addChild(Node<E> node, E element){
		SLLNode<E> temp = new SLLNode<E>(element);
		SLLNode<E> curr = (SLLNode<E>) node;
		temp.sibling = curr.sibling;
		curr.firstChild = temp;
		temp.parent = curr;
		return temp;
	}
	
	public Iterator<E> children(Tree.Node<E> node){
		return new SLLTreeChildIterator<E>(((SLLNode<E>) node).firstChild);
	}
	
	public void remove(Tree.Node<E> node) {
		SLLNode<E> curr = (SLLNode<E>) node;
		
		if(curr.parent != null) {
			if(curr.parent.firstChild == curr) {
				// The node is the first child of its parent
				// Reconnect the parent to the next sibling
				curr.parent.firstChild = curr.sibling;
			}
			else {
				// The node is not the first child of its parent
				// Start from the first and search the node in the sibling list and remove it
				SLLNode<E> temp = curr.parent.firstChild;
				while(temp.sibling != curr) {
					temp = temp.sibling;
				}
				temp.sibling = curr.sibling;
			}
		}
		else {
			root = null;
		}
	}
	
	class SLLTreeChildIterator<T> implements Iterator<T>{
		SLLNode<T> start, current;
		
		public SLLTreeChildIterator(SLLNode<T> node) {
			start = node;
			current = node;
		}
		
		public boolean hasNext() {	
			return (current != null);
		}
		
		public T next() throws NoSuchElementException{
			if(current != null) {
				SLLNode<T> temp = current;
				current = current.sibling;
				return temp.getElement();
			}
			else {
				throw new NoSuchElementException();
			}
		}
		
	}
	
	public void printTreeRecursive(Node<E> node, int level) {
		if(node == null) {
			return;
		}

		SLLNode<E> temp;
		
		for(int i = 0; i < level; i++) {
			System.out.println(" ");
		}
		
		System.out.println(node.getElement().toString());
		
		temp = ((SLLNode<E>)node).firstChild;	
		while(temp != null) {
			printTreeRecursive(temp, level);
			temp = temp.sibling;
		}
	}
		
}

/////////////////////////////////////////////////////////////////////////////////////////////////////////

import java.util.Iterator;

public interface Tree<E> {
	public Tree.Node<E> root();
	public Tree.Node<E> parent(Tree.Node<E> node);
	public int childCount(Tree.Node<E> node);
	public void makeRoot(E element);
	public Tree.Node<E> addChild(Tree.Node<E> node, E element);
	public void remove(Tree.Node<E> node);
	public Iterator<E> children(Tree.Node<E> node);
	
	// Inner interface for tree nodes.
	public interface Node<E>{
		public E getElement();
		public void setElement(E element);
	}
}
