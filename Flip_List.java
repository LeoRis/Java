import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

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

//		lista.printList(lista);
		pomosna.printList(pomosna);
		
		//vasiot kod tuka!
	}

}
