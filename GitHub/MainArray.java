package GitHub;

public class MainArray {

	public static void main(String[] args) {
		IntArray array = new IntArray(3);
		
		// array[3] = {null, null, null}
		
		try {
			array.add(1);
			array.add(2);
			array.add(3);
			array.add(4);
		}
		catch(OutOfMemoryError e) {
			System.out.println(e.getMessage());
		}
		
		System.out.println(array);
		
		array.delete();
		
		System.out.println(array);
		
		try {
			array.change(0, 5);
			array.change(2, 6);
			
		}
		catch(IndexOutOfBoundsException e) {
			System.out.println(e.getMessage());
		}
		
		System.out.println(array);
		
		if(array.isEmpty()) {
			System.out.println("The array is empty.");
		}
		else {
			System.out.printf("The array has %d elements.\n", array.size());
		}
		
		System.out.println("Index of 5 is: " + array.indexOf(5));
		System.out.println("Index of 6 is: " + array.indexOf(6));
	}

}
