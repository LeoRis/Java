import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class TwoSumSolution {

	public static int[] solution(int[] nums, int target) {
		Map<Integer, Integer> map = new HashMap<>();
		
		for(int i = 0; i < nums.length; i++) {
			int complement = target - nums[i];
			if(map.containsKey(complement)) {
				return new int[] { map.get(complement), i};
			}
			map.put(nums[i], i);
		}
		throw new IllegalArgumentException("No two num solution.");
		
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
		
		System.out.println("Target amount: ");
		int target = input.nextInt();
		
		System.out.println("The sum of the 2 elements that fit the target amount is on indicies: " + Arrays.toString(solution(testArray, target)));

	}

}
