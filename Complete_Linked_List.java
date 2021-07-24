// Class: Node
// Class: Singly_Linked_List
// Class: Doubly_Linked_List

public class Complete_Linked_List {

	
	
	public static void main(String[] args) {
		
		Node SLLNode = new Node(3);
		Node DLLNode = new Node(99);
		
		Singly_Linked_List SLlist = new Singly_Linked_List(SLLNode);
		Doubly_Linked_List DLlist = new Doubly_Linked_List(DLLNode);
		
		SLlist.addToEnd(5);
		SLlist.addToEnd(4);
		
//		SLlist.printList(SLlist);
		System.out.println();
		
		SLlist.addNodeToStart(13);
//		SLlist.printList(SLlist);
		System.out.println();
		
		SLlist.addAfter(13, 12);
//		SLlist.printList(SLlist);
		System.out.println();
		
		SLlist.deleteAfter(12, 3);
//		SLlist.printList(SLlist);
		System.out.println();
		
		SLlist.deleteAtEnd();
//		SLlist.printList(SLlist);
		System.out.println();
		
		SLlist.deleteAtStart();
//		SLlist.printList(SLlist);
		
		DLlist.addToEnd(72);
		DLlist.printList(DLlist);
		System.out.println();
		
		DLlist.addToStart(88);
		DLlist.printList(DLlist);
		System.out.println();
		
		DLlist.addAfter(99, 69);
		DLlist.printList(DLlist);
		System.out.println();
		
//		DLlist.deleteAtEnd();
//		DLlist.printList(DLlist);
//		System.out.println();
		
//		DLlist.deleteAtStart();
//		DLlist.printList(DLlist);
//		System.out.println();
		
		DLlist.deleteAfter(88);
		DLlist.printList(DLlist);
	}

}

/////////////////////////////////////////////////////////////////////////////////////////////////////////

public class Node {
	public int data;
	public Node next, prev;
	
	public Node(int data) {
		this.data = data;
		this.next = null;
		this.prev = null;
	}
	
	public Node() {
	}
}

/////////////////////////////////////////////////////////////////////////////////////////////////////////

public class Singly_Linked_List{
	Node head;
	
	public Singly_Linked_List(Node head) {
		this.head = head;
	}
	
	public void addNodeToStart(int data){
		Node addNode = new Node(data);
		
		addNode.next = head;
		head = addNode;
	}
	
	public void addAfter(int after, int data) {
		Node addNode = new Node(data);
		Node curr = head;
		
		if(curr.data != after) {
			curr = curr.next;
		}
		else {
			addNode.next = curr.next;
			curr.next = addNode;
		}
		curr = addNode;
		
//		while(curr != null) {
//			if(curr.data == after) {
//				addNode.next = curr.next;
//				curr.next = addNode;
//				break;
//			}
//			curr = curr.next;
//		}
	}
	
	public void addToEnd(int data) {
		Node addNode = new Node(data);
		
		if(head == null) {
			head = addNode;
		}
		else {
			Node curr = head;
			while(curr.next != null) {
				curr = curr.next;
			}
			curr.next = addNode;
		}
	}
	
	public Node deleteAtStart() {
		if(head != null) {
			Node curr = head;
			
			head = head.next;
			curr = null;
			
			// Using "return curr" is to keep that Node in case we want to use it later.
			return curr;
		}
		return null;
	}
	
	public Node deleteAtEnd() {
		Node curr = head;
		
		if(curr == null || curr.next == null) {
			head = null;
			return curr;
		}

		Node toDelete = curr.next;
		while(curr.next != null) {
			if(toDelete.next == null) {
				curr.next = null;
			}
			curr = toDelete;
			toDelete = toDelete.next;
		}
		return curr;
	}
	
	public void deleteAfter(int after, int data) {
		Node curr = head;
		Node toDelete = head.next;
		
		while(curr.data != after) {
			curr = curr.next;
		}
		while(toDelete.data != data) {
			toDelete = toDelete.next;
		}
		curr.next = toDelete.next;	
	}
		
	public void printList(Singly_Linked_List list) {
		Node printNode = list.head;
		
		while(printNode != null) {
			System.out.print(printNode.data + " ");
			printNode = printNode.next;
		}
	}
}

/////////////////////////////////////////////////////////////////////////////////////////////////////////


public class Doubly_Linked_List {
	Node head;
	
	public Doubly_Linked_List(Node head) {
		this.head = head;
	}
	
	public void addToStart(int data) {
		Node newNode = new Node(data);
		
		if(head == null) {
			head = newNode;
		}
		else {
			newNode.next = head;
			head.prev = newNode;
			head = newNode;
		}
	}
	
	public void addAfter(int after, int data) {
		Node newNode = new Node(data);
		Node traverseNode = head;
		
		while(traverseNode.data != after) {
			traverseNode = traverseNode.next;
		}
		
		traverseNode.next.prev = newNode; 
		newNode.next = traverseNode.next;
		
		traverseNode.next = newNode;
		newNode.prev = traverseNode;
		
	}
	
	public void addToEnd(int data) {
		Node traverseNode = head;
		Node newNode = new Node(data);
		
		if(head == null) {
			head.data = data;
		}
		else {
			while(traverseNode.next != null) {
				traverseNode = traverseNode.next;
			}
			traverseNode.next = newNode;
			newNode.prev = traverseNode;
		}
	}
	
	public void deleteAtStart() {
		head = head.next;
		head.prev = null;
	}
	
	public void deleteAfter(int after) {
		Node traverseNode = head;
		
		while(traverseNode.data != after) {
			traverseNode = traverseNode.next;
		}
		Node toDelete = traverseNode.next;
		traverseNode.next = toDelete.next;
		toDelete.next.prev = toDelete.prev;
		toDelete.next = null;
		
	}
	
	public void deleteAtEnd() {
		Node traverseNode = head;
		
		if(head == null || head.next == null) {
			head = null;
		}
		else {
			Node toDelete = traverseNode.next;
			while(toDelete.next != null) {
				toDelete = toDelete.next;
				traverseNode = traverseNode.next;
			}
			toDelete.prev = null;
			traverseNode.next = null;
		}
			// Simplified version of the code above.
//			Node toDelete = head;		
//			while(toDelete.next != null) {
//				toDelete = toDelete.next; 
//			}
//			toDelete.prev.next = null;
					
	}
	
	public void printList(Doubly_Linked_List list) {
		Node printNode = list.head;
		
		while(printNode != null) {
			System.out.print(printNode.data + " ");
			printNode = printNode.next;
		}
	}
}
