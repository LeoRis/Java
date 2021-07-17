
public class Simple_Stack_Queue {
	public static class Stack{
		private static class Node{
			private int data;
			private Node next;
			
			private Node(int data) {
				this.data = data;
			}
		}
		
		private Node top;
		
		public boolean isEmpty() {
			return top == null;
		}
		
		public int peek() {
			return top.data;
		}
		
		public void push(int data) {
			Node node = new Node(data);
			node.next = top;
			top = node;				
		}
		
		public int pop() {
			int data = top.data;
			top = top.next;
			return data;
		}

	}
	
	public static class Queue{
		private static class Node{
			private int data;
			private Node next;
			
			private Node(int data) {
				this.data = data;
			}
			
			private Node head; // Remove from the head
			private Node tail; // Add
			
			public boolean isEmpty() {
				return head == null;
			}
			
			public int peek() {
				return tail.data;
			}
			
			public void push(int data) {
				Node node = new Node(data);
				if(tail.next != null) {
					tail.next = node;
				}
				tail = node;
				if(head.next == null) {
					head = node;
				}
			}
			
			public int pop() {
				int data = head.data;
				head = head.next;
				if(head == null) {
					tail = null;
				}
				return data;
			}
		}
	}
}
