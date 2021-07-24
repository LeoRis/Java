// Class: LinkedList
// Class: Node

public class LinkedList_Node {

	public static void main(String[] args) {
		LinkedList linked_list = new LinkedList();
		
		linked_list.isnert(linked_list, 10);
		linked_list.insert(linked_list, 20);
		linked_list.insert(linked_list, 15);		
		linked_list.insert(linked_list, 20);
		linked_list.insert(linked_list, 90);
		linked_list.insert(linked_list, 70);
		linked_list.insert(linked_list, 80);
		
		linked_list.print(linked_list);
		System.out.println("\nThe list has " + linked_list.listLength(linked_list) + " elements.\n");
		
		linked_list.delete(linked_list, 3);
		linked_list.printList(linked_list);
		System.out.println("\nThe list has " + linked_list.listLength(linked_list) + " elements.\n");
		
		linked_list.add(linked_list, 23);
		linked_list.printList(linked_list);
		
		linked_list.delete(linked_list, 1);
		linked_list.printList(linked_list);
		
		System.out.println("\nGetting a desired node from the linked list: " + linked_list.get(2));
		
		linked_list.add_Beggining(11);
		linked_list.printList(linked_list);
	}

}

/////////////////////////////////////////////////////////////////////////////////////////////////////////

public class LinkedList {
	public Node start = null;
	public Node end = null;
	
	public LinkedList() {
	}
	
	public void insert(LinkedList list, int data) {
		Node traverseNode = new Node(data);
		traverseNode.next = null;
		
		if(list.start == null) {
			list.start = traverseNode;
		}
		else {
			end = list.start;
			while(end.next != null) {
				end = end.next;
			}
			end.next = traverseNode;
		}
	}
	
	public void add(LinkedList list, int value) {
		Node addNode = new Node();
		addNode = list.start;
		
		while(addNode.next != null) {
			addNode = addNode.next;
		}

		addNode.next = new Node(value);
	}
	
	public LinkedList delete(LinkedList list, int index) {
		Node currentNode = new Node();
		Node previousNode = null;
		currentNode = list.start;
		
		int counter = 0;
		while (currentNode != null) {

		    if (counter == index) {
			// Since the currentNode is the required
			// position unlink currentNode from linked list
			previousNode.next = currentNode.next;

			System.out.println("Position " + index + " element deleted.");
			break;
		    }
		    else {
			// If current position is not the index
			// continue to next node
			previousNode = currentNode;
			currentNode = currentNode.next;
			counter++;
		    }
	return list;
        }
		


	}
	
	public int get(int position) {
		Node traverseNode = new Node();
		traverseNode = this.start;
		
		for(int i = 0; i < position; i++) {
			traverseNode = traverseNode.next;
		}
		
		return traverseNode.data;
	}
	
	public int listLength(LinkedList list) {
		Node traverseNode = list.start;
		int counter = 0;
		
		while(traverseNode != null) {
			traverseNode = traverseNode.next;
			counter++;
		}
		
		return counter;
	}
	
	public void add_Beggining(int value) {
		Node node = new Node(value);
		node.next = this.start;
		start = node;
	}
	
	public void delete_Beggining() {
		this.start = this.start.next;
	}
	
	public void printList(LinkedList list) {
		Node printNode = list.start;
		
		while(printNode != null) {
			System.out.print(printNode.data + " ");
			printNode = printNode.next;
		}
	}
	
	public void insertAnywhere(LinkedList list, int index, int data) {
		Node searchNode = new Node();
		Node newNode = new Node(data);
		searchNode = list.start;
				
		index--;
		while(index != 1) {
			searchNode = searchNode.next;
			index--;
		}
		
		newNode.next = searchNode.next;
		searchNode.next = newNode;
	}
}

/////////////////////////////////////////////////////////////////////////////////////////////////////////

public class Node {
	public int data;
	public Node next;
	
	public Node(int data) {
		this.data = data;
		this.next = null;
	}
	
	public Node() {
	}
}
