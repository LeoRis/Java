import java.util.Arrays;
import java.util.Scanner;

public class FindLongestSubarrayBySum {

	public static int[] longestSubarray(int s, int[] array) {
		int[] result = new int[] {-1};
		
		int sum = 0;
		int left = 0;
		int right = 0;
		
		while(right < array.length) {
			sum += array[right];
			while(left < right && sum > s) {
				sum -= array[left++];
			}
			if(sum == s && (result.length == 1 || result[1] - result[0] < right - left)) {
				result = new int[] {left + 1, right + 1};
			}
			right++;
		}
		
		return result;
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
		
		System.out.print("Chose the subarray's sum: ");
		int sum = input.nextInt();
		
		System.out.println("The longest subarray is between these indicies: ");
		System.out.println(Arrays.toString(longestSubarray(sum, testArray)));
	}

}
