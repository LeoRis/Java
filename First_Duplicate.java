import java.util.Scanner;

public class First_Duplicate {

	// O(n^2) time complexity
	public static int solution(int[] array) {
		int N = array.length;
		int min_second_index = N;
		
		
		for(int i = 0; i < N; i++) {
			for(int j = i + 1; j < N; j++) {
				if(array[i] == array[j]) {
					min_second_index = Math.min(min_second_index, j);
				}
			}
		}

		return (min_second_index > 0 ? array[min_second_index] : -1);

	}
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Array size: ");
		int N = input.nextInt();

		int[] testArray = new int[N];
		System.out.println("Insert the array: ");
	
		for(int i = 0; i < N; i++) {
			System.out.print("Element #" + (i + 1) + ": ");
			testArray[i] = input.nextInt();
		}
		
		System.out.println("The first duplicate is: " + solution(testArray));
		
		input.close();

	}

}
