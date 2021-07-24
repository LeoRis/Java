

public class Get_All_Permutations {

	public static void getPemutations(int[] array) {
		helper(array, 0);
	}
	
	private static void helper(int[] array, int position) {
		if(position >= array.length - 1) {
			System.out.print("[");
		
			for(int i = 0; i < array.length - 1; i++) {
				System.out.print(array[i] + ",");
			}
			
			if(array.length > 0) {
				System.out.print(array[array.length - 1]);
			}
			System.out.println("]");
			return;
		}
		
		for(int i = position; i < array.length; i++) {
			int temp = array[position];
			array[position] = array[i];
			array[i] = temp;
			
			helper(array, position + 1);
			
			temp = array[position];
			array[position] = array[i];
			array[i] = temp;
		}
	}
	
	public static void main(String[] args) {
		int[] numbers = {1, 2, 3, 4};
		getPemutations(numbers);

	}

}
