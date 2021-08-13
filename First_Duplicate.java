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
	
	// O(n) time complexity / O(n) space complexity
	public static int solution2(int[] array) {
		int N = array.length;
		
		HashSet<Integer> temp = new HashSet();
		for(int i = 0; i < N; i++) {
			if(temp.contains(array[i])) {
				return array[i];
			}
			else {
				temp.add(i);
			}
		}
		
		return -1;
	}
	
	// O(n) time complexity / Best space solution
	public static int solution3(int[] array) {
		for(int i = 0; i < array.length; i++) {
			if(array[Math.abs(array[i]) - 1] < 0) {
				return Math.abs(array[i]);
			}
			else {
				array[Math.abs(array[i]) - 1] = -array[Math.abs(array[i]) - 1];
			}
		}
		
		return -1;
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
		
		System.out.println("Solution #1 -> The first duplicate is: " + solution(testArray));

		System.out.println("Solution #2 -> The first duplicate is: " + solution2(testArray));
		
		System.out.println("Solution #3 -> The first duplicate is: " + solution3(testArray));
		
		input.close();

	}

}
