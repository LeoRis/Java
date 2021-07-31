import java.util.Scanner;

public class ProductExceptSelf {

	public static void solution(int[] input) {
		int product = 1;
		int[] output = new int[input.length];
		for(int i = 0; i < input.length; i++) {
			product *= input[i];
		}
		
		for(int i = 0; i < input.length; i++) {
			output[i] = product / input[i];
		}
		
		for(int i = 0; i < output.length; i++) {
			System.out.println(output[i]);
		}
	}
	
	public static void solution2(int[] nums) {
		int N = nums.length;
		
		int[] left_Products = new int[N];
		int[] right_Products = new int[N];
		
		int[] output = new int[N];
		
		left_Products[0] = 1;
		right_Products[N - 1] = 1;
		
		for(int i = 1; i < N; i++) {
			left_Products[i] = nums[i - 1] * left_Products[i - 1];
		}
		
		for(int i = N - 2; i >= 0; i--) {
			right_Products[i] = nums[i + 1] * right_Products[i + 1];
		}
		
		for(int i = 0; i < N; i++) {
			output[i] = left_Products[i] * right_Products[i];
		}
		
		for(int i = 0; i < N; i++) {
			System.out.println(output[i]);
		}
		
//		return output;
	}
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		int n = 0;
		
		System.out.print("Insert array size: ");
		n = input.nextInt();
		
		int[] mainArray = new int[n];
		
		System.out.println("Insert the array: ");
		
		for(int i = 0; i < n; i++) {
			System.out.print("Element " + i + ": ");
			mainArray[i] = input.nextInt();
		}
		
		
		solution(mainArray);
		
		solution2(mainArray);
		
		input.close();
		
		
	}

}
