import java.util.Hashtable;

public class Test_Hash_Table {

	public static void main(String[] args) {
		Hashtable<Character, Integer> m = new Hashtable<Character, Integer>();
		
		String s = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		
		for(int i = 0; i < s.length(); i++) {
			m.put(s.charAt(i), i); // Filling of the hash table
		}
		
		System.out.println(m);
		
		System.out.println("The bucket where \"Z\" is at is: " + m.get('Z'));
		
	}
}
