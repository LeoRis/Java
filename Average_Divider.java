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
