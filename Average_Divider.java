import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// Class: SLL
// Class: SLLNode

public class Average_Divider {
	
	public static void podeli(SLL<Integer> lista){
		SLL<Integer> pomali = new SLL<Integer>();
		SLL<Integer> pogolemi = new SLL<Integer>();
		
		int average = 0;
		int averageSum = 0;
		
		SLLNode<Integer> traverseNode = lista.getFirst();
		
		while(traverseNode.element != null) {
			averageSum += traverseNode.element;
			
			if(traverseNode.succ == null) {
				break;
			}
			else {
				traverseNode = traverseNode.succ;
			}
		}
		 
		average = averageSum / lista.length();		
		
		traverseNode = lista.getFirst();
		
		while(traverseNode.element != null) {
			
			if(traverseNode.element <= average) {
				pomali.insertFirst(traverseNode.element);
				if(traverseNode.succ == null) {
					break;
				}
				else {
					traverseNode = traverseNode.succ;
				}
			}
			else {
				pogolemi.insertFirst(traverseNode.element);
				if(traverseNode.succ == null) {
					break;
				}
				else {
					traverseNode = traverseNode.succ;
				}
			}
			
		}
		
		// Print smaller or equal to average
		SLLNode<Integer> pom = pomali.getFirst();
		while (pom != null) {
			System.out.print(pom.element);
            if(pom.succ != null)
                System.out.print(" ");
            pom = pom.succ;
		}
		System.out.println();
		
		// Print greater than average
		pom = pogolemi.getFirst();
		while (pom != null) {
			System.out.print(pom.element);
            if(pom.succ != null)
                System.out.print(" ");
            pom = pom.succ;
		}
		System.out.println();
		
	}
	
	public static void main(String[] args) throws IOException{
		SLL<Integer> lista = new SLL<Integer>();
		BufferedReader stdin = new BufferedReader(new InputStreamReader(System.in));
		
		String s = stdin.readLine();
		
		int N = Integer.parseInt(s);
		s = stdin.readLine();
		
		String[] pomniza = s.split(" ");
		for (int i = 0; i < N; i++) {
			lista.insertLast(Integer.parseInt(pomniza[i]));
		}
		
		podeli(lista);

	}
}

/////////////////////////////////////////////////////////////////////////////////////////////////////////

public class SLL<E> {
	private SLLNode<E> first;

	public SLL() {
		// Construct an empty SLL
		this.first = null;
	}
	
	public void deleteList() {
		first = null;
	}

	public int length() {
		int ret;
		if (first != null) {
			SLLNode<E> tmp = first;
			ret = 1;
			while (tmp.succ != null) {
				tmp = tmp.succ;
				ret++;
			}
			return ret;
		} else
			return 0;

	}

	@Override
	public String toString() {
		String ret = new String();
		if (first != null) {
			SLLNode<E> tmp = first;
			ret += tmp + "->";
			while (tmp.succ != null) {
				tmp = tmp.succ;
				ret += tmp + "->";
			}
		} else
			ret = "Prazna lista!!!";
		return ret;
	}

	public void insertFirst(E o) {
		SLLNode<E> ins = new SLLNode<E>(o, first);
		first = ins;
	}

	public void insertAfter(E o, SLLNode<E> node) {
		if (node != null) {
			SLLNode<E> ins = new SLLNode<E>(o, node.succ);
			node.succ = ins;
		} else {
			System.out.println("Dadenot jazol e null");
		}
	}

	public void insertBefore(E o, SLLNode<E> before) {
		
		if (first != null) {
			SLLNode<E> tmp = first;
			if(first==before){
				this.insertFirst(o);
				return;
			}
			//ako first!=before
			while (tmp.succ != before)
				tmp = tmp.succ;
			if (tmp.succ == before) {
				SLLNode<E> ins = new SLLNode<E>(o, before);
				tmp.succ = ins;
			} else {
				System.out.println("Elementot ne postoi vo listata");
			}
		} else {
			System.out.println("Listata e prazna");
		}
	}

	public void insertLast(E o) {
		if (first != null) {
			SLLNode<E> tmp = first;
			while (tmp.succ != null)
				tmp = tmp.succ;
			SLLNode<E> ins = new SLLNode<E>(o, null);
			tmp.succ = ins;
		} else {
			insertFirst(o);
		}
	}

	public E deleteFirst() {
		if (first != null) {
			SLLNode<E> tmp = first;
			first = first.succ;
			return tmp.element;
		} else {
			System.out.println("Listata e prazna");
			return null;
		}
	}

	public E delete(SLLNode<E> node) {
		if (first != null) {
			SLLNode<E> tmp = first;
			if(first == node){
				return this.deleteFirst();
			}
			while (tmp.succ != node && tmp.succ.succ != null)
				tmp = tmp.succ;
			if (tmp.succ == node) {
				tmp.succ = tmp.succ.succ;
				return node.element;
			} else {
				System.out.println("Elementot ne postoi vo listata");
				return null;
			}
		} else {
			System.out.println("Listata e prazna");
			return null;
		}

	}

	public SLLNode<E> getFirst() {
		return first;
	}
	
	public SLLNode<E> find(E o) {
		if (first != null) {
			SLLNode<E> tmp = first;
			while (tmp.element != o && tmp.succ != null)
				tmp = tmp.succ;
			if (tmp.element == o) {
				return tmp;
			} else {
				System.out.println("Elementot ne postoi vo listata");
			}
		} else {
			System.out.println("Listata e prazna");
		}
		return first;
	}
	
}

/////////////////////////////////////////////////////////////////////////////////////////////////////////

class SLLNode<E> {
	protected E element;
	protected SLLNode<E> succ;

	public SLLNode(E elem, SLLNode<E> succ) {
		this.element = elem;
		this.succ = succ;
	}

	@Override
	public String toString() {
		return element.toString();
	}
}
