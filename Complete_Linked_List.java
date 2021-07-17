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
