import java.util.NoSuchElementException;

public class ArrayStack<E> implements Stack<E> {
	private E[] elements;
	private int depth;
	
	public ArrayStack(int maxDepth) {
		elements = (E[]) new Object[maxDepth];
		depth = 0;
	}

	public boolean isEmpty() {
		return (depth == 0);
	}

	public E peek() {
		if(depth == 0) {
			throw new NoSuchElementException();
		}
		return elements[depth - 1];
	}

	public void clear() {
		for(int i = 0; i < depth; i++) {
			elements[i] = null;
		}
		depth = 0;
	}

	public void push(E x) {
		elements[depth++] = x;
	}

	public E pop() {
		if(depth == 0) {
			throw new NoSuchElementException();
		}
		E topmost = elements[--depth];
		elements[depth] = null;
		return topmost;
	}
}
