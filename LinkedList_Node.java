
public class LinkedList_Node {

	public static void main(String[] args) {
		
		LinkedList linked_list = new LinkedList();
		
		linked_list.insert(linked_list, 20);
		linked_list.insert(linked_list, 15);		
		linked_list.insert(linked_list, 20);
		linked_list.insert(linked_list, 13);
		linked_list.insert(linked_list, 70);
		linked_list.insert(linked_list, 80);
		
		linked_list.printList(linked_list);		
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
		
		linked_list.insertAnywhere(linked_list, 2, 100);
		System.out.println();
		linked_list.printList(linked_list);
		
//		linked_list.removeLastNode(80);
		System.out.println();
	}

}
