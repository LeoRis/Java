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
