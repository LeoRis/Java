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
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Insert your test sample string: ");
		String testSample = input.nextLine();
		
		System.out.println("First method test: " + findFirstNonRepeatingChar(testSample));
		System.out.println("Second method test: " + findFirstNonRepeatingChar2(testSample));
		
		input.close();
	}

}
