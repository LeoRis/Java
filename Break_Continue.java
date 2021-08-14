import java.util.Scanner;

public class Break_Continue {

	public static void solution(int x) {
		for(int i = 0; i < 10; i++) {
			if(i % x == 0) {
				continue;
			}
			else {
				System.out.println(i);
			}
		}
		
	}
	
	public static void solution2() {
		int n = 0;
		Scanner s = new Scanner(System.in);
		
		while(true) {
			System.out.println("Enter a number between 1 and 10: ");
			n = s.nextInt();
			
			if(n < 1 || n > 10) {
				continue;
			}
			else {
				System.out.println(n + " is between 1 and 10.");
				break;
			}
		}
		
		s.close();
	}
	
	public static void main(String[] args) {
		
		int P = 2;
		
		solution(P);
		solution2();

	}

}
