package GitHub;

import java.util.Scanner;

public class Even_Odd {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Start: ");
		int start = input.nextInt();
		System.out.print("End: ");
		int end = input.nextInt();
		System.out.println("Choice: 1 = EVEN 2 = ODD");
		int choice = input.nextInt();
		
		if(choice == 1) {
			for(int i = start; i <= end; i++) {
				if(i % 2 == 0) {
					System.out.println(i);
				}
			}
		}else if(choice == 2) {
			for(int i = start; i <= end; i++) {
				if(i % 2 != 0) {
					System.out.println(i);
				}
			}
		}else {
			System.out.println("Invalid choice!");
		}
	}

}
