import java.util.Scanner;

public class Max_Subarray_Sum {
	
	// O(n * k) time complexity due to the 2 nested for loops.
	public static int maxSum(int[] array, int n, int k) {
		int max_sum = Integer.MIN_VALUE;
		
		for(int i = 0; i < n - k + 1; i++) {
			int current_sum = 0;
			for(int j = 0; j < k; j++) {
				current_sum += array[i + j];
			}
			max_sum = Math.max(current_sum, max_sum);
		}
		
		return max_sum;
	}
	
	// O(n) time complexity
	public static int windowSliding(int[] array, int n, int k) {
		if(n < k) {
			System.out.println("Invalid!");
			return -1;
		}

		int max_sum = 0;
		for(int i = 0; i < k; i++) {
			max_sum += array[i];
		}
		
		int window_sum = max_sum;
		for(int i = k; i < n; i++) {
			window_sum += array[i] - array[i - k];
			max_sum = Math.max(max_sum, window_sum);	
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
		
		System.out.print("Chose the subarray's range: ");
		int range = input.nextInt();
		
		System.out.println("The longest subarray solution 1 has a total of : ");
		System.out.println(maxSum(testArray, N, range));
		
		System.out.println("The longest subarray solution 2 has a total of : ");
		System.out.println(windowSliding(testArray, N, range));
		
		input.close();
	}

}
