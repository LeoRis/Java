import java.util.Scanner;

// Class: SortingAlgorithms

public class Tests_Of_Sorting_Algorithms {

	public static void main(String[] args) {
				
		SortingAlgorithms sort = new SortingAlgorithms();
		Scanner input = new Scanner(System.in);
		
		System.out.println("Desired array size: ");
		int integerArraySize = input.nextInt();
		
		System.out.println("Start inserting elements: ");
		
		int[] integerArray = new int[integerArraySize];
		for(int i = 0; i < integerArraySize; i++) {
			System.out.println("Element # " + (i + 1) + ": ");
			integerArray[i] = input.nextInt();
		}
		
		sort.quickSort(integerArray, 0, integerArraySize - 1);
		sort.print(integerArray);
		
		sort.bubbleSort(integerArray);
		sort.print(integerArray);
		
		sort.selectionSort(integerArray);
		sort.print(integerArray);
		
		sort.insertionSort(integerArray);
		sort.print(integerArray);
		
	}
	
}