import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class FindAllDuplicates {
	
	public static List<Integer> solution(int[] array) {
		int N = array.length;
		List<Integer> result = new ArrayList();
		
		for(int i = 0; i < N; i++) {
			int index = Math.abs(array[i]) - 1;
			if(array[index] < 0) {
				result.add(index + 1);
				array[index] = -array[index];
			}
		}
		
		for(int j = 0; j < result.size(); j++) {
			System.out.println(result.get(j));
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
		
		System.out.println(Arrays.toString((solution(testArray).toArray())));

	}

}
