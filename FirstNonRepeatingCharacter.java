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
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Insert your test sample string: ");
		String testSample = input.nextLine();
		
		System.out.print("The first non-repeating character is: ");
		System.out.print(findFirstNonRepeatingChar(testSample));
		
		input.close();
	}

}
