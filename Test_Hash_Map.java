import java.util.HashMap;
import java.util.Map;

public class Test_Hash_Map {

	public static void main(String[] args) {
		Map<Character, Integer> m = new HashMap<Character, Integer>();
		
		String s = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		
		for(int i = 0; i < s.length(); i++) {
			m.put(s.charAt(i), i); // Filling of the hash table
		}
		
		System.out.println(m);
		
		System.out.println("The bucket where \"Q\" is at is: " + m.get('Q'));
		
	}

}
