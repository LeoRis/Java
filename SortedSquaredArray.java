import java.util.Arrays;
import java.util.Scanner;


public class SortedSquaredArray {
	
	public static int[] solution(int[] array) {
		int N = array.length;
		int[] squaredArray = new int[N];
		for(int i = 0; i < N; i++) {
			squaredArray[i] = array[i] * array[i];
		}
		
		Arrays.sort(squaredArray);
		return squaredArray;
	}
	
	public static int[] solution2(int[] array) {
		int N = array.length;
		int[] squaredArray = new int[N];
		int left = 0;
		int right = N - 1;
		
		for(int i = right; i >= 0; i--) {
			if(Math.abs(array[left]) > array[right]) {
				squaredArray[i] = array[left] * array[left];
				left++;
			}
			else {
				squaredArray[i] = array[right] * array[right];
				right--;
			}
		}
		
		return squaredArray;
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
		
		System.out.println("The squared sorted array is (solution 1): ");
		System.out.println(Arrays.toString(solution(testArray)));
		
		System.out.println("The squared sorted array is (solution 2): ");
		System.out.println(Arrays.toString(solution2(testArray)));
		input.close();

	}

}
 