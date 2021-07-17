import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Divide_Even_Odd {



	public static void podeliParnost(DLL<Integer> lista, DLL<Integer> lparni, DLL<Integer> lneparni) {
		
		DLLNode<Integer> traverseNode = lista.getFirst();
		boolean flag = true;
		
		while(flag) {
			if(traverseNode.element % 2 == 0) {
				if(traverseNode.succ != null) {
					lparni.insertFirst(traverseNode.element);
				}			
				else {
					lparni.insertFirst(traverseNode.element);
					if(traverseNode.succ == null) {
						traverseNode = traverseNode.pred;
						flag = false;
					}
				}
				traverseNode = traverseNode.succ;
			}		
			else if(traverseNode.element % 2 != 0) {
				if(traverseNode.succ != null) {
					lneparni.insertFirst(traverseNode.element);
				}
				else {
					lneparni.insertFirst(traverseNode.element);
					if(traverseNode.succ == null) {
						traverseNode = traverseNode.pred;
						flag = false;
					}
				}
				traverseNode = traverseNode.succ;
			}
		}

	}

	public static void main(String[] args) throws IOException {
		DLL<Integer> lista = new DLL<Integer>(), parni = new DLL<Integer>(), neparni = new DLL<Integer>();
		BufferedReader stdin = new BufferedReader(new InputStreamReader(
				System.in));
		String s = stdin.readLine();
		int N = Integer.parseInt(s);
		s = stdin.readLine();
		String[] pomniza = s.split(" ");
		for (int i = 0; i < N; i++) {
			lista.insertLast(Integer.parseInt(pomniza[i]));
		}

		podeliParnost(lista, parni, neparni);

		// Pecatenje parni
		DLLNode<Integer> tmp = parni.getFirst();
		while (tmp != null) {
			System.out.print(tmp.element);
			if (tmp.succ != null)
				System.out.print(" ");
			tmp = tmp.succ;
		}
		System.out.println();
		// Pecatenje neparni
		tmp = neparni.getFirst();
		while (tmp != null) {
			System.out.print(tmp.element);
			if (tmp.succ != null)
				System.out.print(" ");
			tmp = tmp.succ;
		}
		System.out.println();
	}

}
