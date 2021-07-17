public class SortingAlgorithms {
	
	public void swap(int[] array, int x, int y) {
		int temp = 0;
		temp = array[x];
		array[x] = array[y];
		array[y] = temp;
	}
		
//	public void bubbleSort(int[] array) {
//		for(int i = 0; i < array.length - 1; i++) {
//			for(int j = 0; j < array.length - i - 1; j++) {
//				if(array[j] > array[j + 1]) {
	
					// Using either swap() method or the manually written algorithm (in all sorting methods)
//					swap(array, j, j + 1);
	
					// Manually swapping algorithm
//					int temp = array[j];
//					array[j] = array[j + 1];
//					array[j + 1] = temp;
//				}
//			}
//		}
	
	public void bubbleSort(int[] array) {
		int n = array.length;
	    boolean sorted = false;
	    int temp;
	    
	    while(!sorted) {
	        sorted = true;
	        for (int i = 0; i < n - 1; i++) {
	            if (array[i] > array[i + 1]) {
//	            	swap(array, i, i + 1);
	                temp = array[i];
	                array[i] = array[i + 1];
	                array[i + 1] = temp;
	                sorted = false;
	            }
	        }
	    }

	}
		
	public void selectionSort(int[] array) {
		int n = array.length;
		int temp = 0;
		
		for(int i = 0; i < n - 1; i++) {
			for(int j = i; j < n; j++) {
				if(array[i] < array[j]) {
//					swap(array, i, j);
					temp = array[i];
					array[i] = array[j];
					array[j] = temp;
				}
			}
		}
	}
	
    public void insertionSort(int[] array) {
        int n = array.length;
        for(int i = 0; i < n; i++) {
            int key = array[i];
            int j = i - 1;
 
            /* Move elements of array[0..i-1], that are
               greater than key, to one position ahead
               of their current position */
            while(j >= 0 && array[j] > key) {
            	array[j + 1] = array[j];
                j = j - 1;
            }
            array[j + 1] = key;
        }
    }
    
    public int partition(int[] array, int begin, int end) {
        int pivot = end;

        int counter = begin;
        for (int i = begin; i < end; i++) {
            if (array[i] < array[pivot]) {
                int temp = array[counter];
                array[counter] = array[i];
                array[i] = temp;
                counter++;
            }
        }
        int temp = array[pivot];
        array[pivot] = array[counter];
        array[counter] = temp;

        return counter;
    }

    public void quickSort(int[] array, int begin, int end) {
        if (end <= begin) return;
        int pivot = partition(array, begin, end);
        quickSort(array, begin, pivot - 1);
        quickSort(array, pivot + 1, end);
    }
	
	public void print(int[] array) {
		System.out.println("Here is the sorted array: ");
		for(int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");
		}
	}

}