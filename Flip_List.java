import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

// Class: DLL
// Class: DLLNode

public class Flip_List {


	public static void main(String[] args) throws IOException {
		
		DLL<Integer> lista = new DLL<Integer>();
		DLL<Integer> pomosna = new DLL<Integer>();
		
		BufferedReader stdin = new BufferedReader(new InputStreamReader(System.in));
		
		String s = stdin.readLine();
		
		int N = Integer.parseInt(s);
		
		s = stdin.readLine();
		
		String[] pomniza = s.split(" ");
		
		for (int i = 0; i < N; i++) {
			lista.insertLast(Integer.parseInt(pomniza[i]));
		}

		lista.flip(lista, pomosna);

		pomosna.printList(pomosna);

	}

}

/////////////////////////////////////////////////////////////////////////////////////////////////////////

public class DLL<E> {
	private DLLNode<E> first, last;

	public DLL() {
		// Construct an empty SLL
		this.first = null;
		this.last = null;
	}

	public void deleteList() {
		first = null;
		last = null;
	}

	public int length() {
		int ret;
		if (first != null) {
			DLLNode<E> tmp = first;
			ret = 1;
			while (tmp.succ != null) {
				tmp = tmp.succ;
				ret++;
			}
			return ret;
		} else
			return 0;

	}

	public void insertFirst(E o) {
		DLLNode<E> ins = new DLLNode<E>(o, null, first);
		if (first == null)
			last = ins;
		else
			first.pred = ins;
			first = ins;
	}

	public void insertLast(E o) {
		if (first == null)
			insertFirst(o);
		else {
			DLLNode<E> ins = new DLLNode<E>(o, last, null);
			last.succ = ins;
			last = ins;
		}
	}

	public void insertAfter(E o, DLLNode<E> after) {
		if (after == last) {
			insertLast(o);
			return;
		}
		DLLNode<E> ins = new DLLNode<E>(o, after, after.succ);
		after.succ.pred = ins;
		after.succ = ins;
	}

	public void insertBefore(E o, DLLNode<E> before) {
		if (before == first) {
			insertFirst(o);
			return;
		}
		DLLNode<E> ins = new DLLNode<E>(o, before.pred, before);
		before.pred.succ = ins;
		before.pred = ins;
	}

	public E deleteFirst() {
		if (first != null) {
            if (first.succ == null){
				last = null;
                first = null;
            }
			else{
				DLLNode<E> tmp = first;
				first = first.succ;
				first.pred = null;
				return tmp.element;
			}			
		}  
		return null;
	}

	public E deleteLast() {
		if (first != null) {
			if (first.succ == null)
				return deleteFirst();
			else {
				DLLNode<E> tmp = last;
				last = last.pred;
				last.succ = null;
				return tmp.element;
			}
		}
		// else throw Exception
		return null;
	}

	@Override
	public String toString() {
		String ret = new String();
		if (first != null) {
			DLLNode<E> tmp = first;
			ret += tmp + "<->";
			while (tmp.succ != null) {
				tmp = tmp.succ;
				ret += tmp + "<->";
			}
		} else
			ret = "Prazna lista!!!";
		return ret;
	}

	public DLLNode<E> getFirst() {
		return first;
	}

	public DLLNode<E> getLast() {

		return last;
	}
	
	public void flip(DLL<Integer> inputList, DLL<Integer> outputList) {
		DLLNode<Integer> firstNode = inputList.getFirst();
		DLLNode<Integer> lastNode = inputList.getLast();
		
		while(firstNode.element != null) {
			if(firstNode.element == null) {
				break;
			}
			else {
				if(firstNode.element % 2 == 0) {
					outputList.insertFirst(firstNode.element);
					firstNode = firstNode.succ;
				}
				else {
					outputList.insertLast(lastNode.element);
					
					lastNode = lastNode.pred;
					if(firstNode.succ == null) {
						break;
					}
					else {
						firstNode = firstNode.succ;
					}
				}
			}
		}
	}
	
	public void printList(DLL<Integer> list) {
		DLLNode<Integer> printNode = list.getFirst();
		
		while(printNode.element != null) {
			System.out.print(printNode.element + " ");
			if(printNode.succ == null) {
				break;
			}
			else {
				printNode = printNode.succ;
			}
		}
	}

}

/////////////////////////////////////////////////////////////////////////////////////////////////////////

public class DLLNode<E> {
	protected E element;
	protected DLLNode<E> pred, succ;

	public DLLNode(E elem, DLLNode<E> pred, DLLNode<E> succ) {
		this.element = elem;
		this.pred = pred;
		this.succ = succ;
	}

	@Override
	public String toString() {
		return element.toString();
	}
}
