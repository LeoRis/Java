
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
