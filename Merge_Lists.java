import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// Class: DLLNode
// Class: DLL

public class Merge_Lists {

	public static void main(String[] args) throws IOException {
		
		DLL<Integer> lista1 = new DLL<Integer>();
		DLL<Integer> lista2 = new DLL<Integer>();
		
		BufferedReader stdin = new BufferedReader(new InputStreamReader(System.in));
		
		String s = stdin.readLine();
		
		int N = Integer.parseInt(s);
		
		s = stdin.readLine();
		
		String[] pomniza = s.split(" ");
		
		for (int i = 0; i < N; i++) {
			lista1.insertLast(Integer.parseInt(pomniza[i]));
		}

		s = stdin.readLine();
		N = Integer.parseInt(s);
		s = stdin.readLine();
		pomniza = s.split(" ");
		
		for (int i = 0; i < N; i++) {
			lista2.insertLast(Integer.parseInt(pomniza[i]));
		}
		
		lista1.printList(lista1.mergeLists(lista1, lista2));

		//vasiot kod tuka!
	}
}
