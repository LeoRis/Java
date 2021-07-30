import java.util.Scanner;

public class FirstNonRepeatingCharacter {

	public static char findFirstNonRepeatingChar(String s) {
		
		for(int i = 0; i < s.length(); i++) {
			if(s.indexOf(s.charAt(i)) == s.lastIndexOf(s.charAt(i))) {
				return s.charAt(i);
			}
		}
		
		return '_';
		
	}
	
	public static char findFirstNonRepeatingChar2(String s) {
	
		for(int i = 0; i < s.length(); i++) {
			boolean flag = false;
			for(int j = 0; j < s.length(); j++) {
				if(s.charAt(i) == s.charAt(j) && (i != j)) {
					flag = true;
					break;
				}
			}
			if(!flag) {
				return s.charAt(i);
			}
		}
			
		return '_';
	}
	
	public static char findFirstNonRepeatingChar3(String s) {
		
		HashMap<Character, Integer> char_counts = new HashMap();
		
		for(int i = 0; i < s.length(); i++) {
			char c = s.charAt(i);
			if(char_counts.containsKey(c)) {
				char_counts.put(c, char_counts.get(c) + 1);
			}
			else {
				char_counts.put(c, 1);
			}
		}
		
		for(int i = 0; i < s.length(); i++) {
			char c = s.charAt(i);
			if(char_counts.get(c) == 1) {
				return c;
			}
		}
		
		return '_';
		
	}
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Insert your test sample string: ");
		String testSample = input.nextLine();
		
		System.out.println("First method test: " + findFirstNonRepeatingChar(testSample));
		System.out.println("Second method test: " + findFirstNonRepeatingChar2(testSample));
		System.out.println("Third method test: " + findFirstNonRepeatingChar3(testSample));
		
		input.close();
	}

}
