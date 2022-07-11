import java.util.Scanner;

public class Kadane_Algorithm {
	
	public static int arrayMaxConsecutiveSum(int[] inputArray) {
		int max_sum = inputArray[0];
		int current_sum = max_sum;
		
		for(int i = 1; i < inputArray.length; i++) {
			current_sum = Math.max(inputArray[i] + current_sum, inputArray[i]);
			max_sum = Math.max(current_sum, max_sum);
		}
		return max_sum;
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
		
		System.out.println(arrayMaxConsecutiveSum(testArray));
		
		input.close();

	}
}
