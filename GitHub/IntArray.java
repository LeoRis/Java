package GitHub;

import java.util.Arrays;

public class IntArray implements Array{
	private int[] newArray; 
	
	public IntArray() {
		this.newArray = new int[10];
	}
	
	public IntArray(int size) {
		this.newArray = new int[size];
	}
	
	public IntArray(int[] argument) {
		this.newArray = argument;
	}
	
	@Override
	public void add(int newElement) throws OutOfMemoryError {
		boolean isFull = true;
		for(Object s : newArray) {
		    if(s == null) {
		        isFull = false;
		        throw new OutOfMemoryError("Out of memory exception!");
		    }
		}
		
		newArray[newArray.length - 1] = newElement;		
	
	}

	@Override
	public void change(int index, int newValue) throws IndexOutOfBoundsException {
		for(int i = 0; i < newArray.length; i++) {		
			if(i < 0 && i > newArray.length) {
				throw new IndexOutOfBoundsException("Out of bound exception!");
			}
			else {
				newArray[index] = newValue;
			}
		}
	}

	@Override
	public void delete() {
		
		newArray = Arrays.copyOf(newArray, newArray.length-1);
				
	}

	@Override
	public boolean isEmpty() {
		if(newArray == null) {
			return true;
		}
		return false;
	}

	@Override
	public int size() {
		int counter = 0;
		
	      for(Object i : newArray)
	      {
	         if(i != null)
	         {
	            counter++;
	         }
	      }
	      return counter;
		
		// Not elegant, but working solution (if array element is smaller than 0, the counter would miss it)
		
//		for(int i = 0; i < newArray.length; i++) {
//			if(this.newArray[i] >= 0) {
//				counter++;
//			}
//		}
//		return counter;
	}

	@Override
	public int indexOf(int checkArgument) {
		for(int i = 0; i < newArray.length; i++) {
			if(newArray[i] == checkArgument) {
				return i;
			}
		}

		return -1;
	}

	@Override
	public int readElement(int testArgument) {
		for(int i = 0; i < newArray.length; i++) {
			if(i < 0 && i > newArray.length) {
				throw new IndexOutOfBoundsException("Out of bounds!");
			}
			else {
				return testArgument;
			}
		}
		return 0;
	}
	
	@Override
	public String toString() {
		return "IntArray [newArray = " + Arrays.toString(newArray) + " ]";
	}

}
