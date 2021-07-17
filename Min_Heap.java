
public class Min_Heap {
	private int[] min_heap;
	private int size = 0;
	
	public Min_Heap(int initial_capacity) {
		this.min_heap = new int[initial_capacity];
		this.size = 0; // Number of actual elements in the array
	}
	
	public Min_Heap(int[] arr) {
		this.size = arr.length;
		this.min_heap = heapify(arr);
	}
	
	public void swap_values(int index_a, int index_b, int[] arr) {
		int temp_value = arr[index_a];
		arr[index_a] = arr[index_b];
		arr[index_b] = temp_value;
	}
	
	public int get_parent_index(int child_index) {
		return (child_index - 1) / 2;
	}
	
	public int get_left_index(int parent_index) {
		return (2 * parent_index) + 1;
	}
	
	public int get_right_index(int parent_index) {
		return (2 * parent_index) + 2;
	}
	
	public boolean is_full() {
		return this.size == this.min_heap.length;
	}
	
	public boolean is_empty() {
		return this.size == 0;
	}
	
	public boolean is_valid_index(int index) {
		return index >= 0 && index < this.size;
	}
	
	public int get_left_child(int parent_index) {
		return parent_index;
	}
	
	public int get_right_child(int parent_index) {
		return parent_index;
	}
	
	public void sift_up(int child_index, int[] arr) {
		int parent_index = get_parent_index(child_index);
		
		while(is_valid_index(parent_index) && arr[parent_index] > arr[child_index]) {
			swap_values(child_index, parent_index, arr);
			child_index = parent_index;
			parent_index = get_parent_index(child_index);
		}
	}
	
	public void sift_down(int parent_index, int[] arr) {
		int left_child_index = get_left_child(parent_index);
		boolean is_left_valid = is_valid_index(left_child_index);
		
		while(is_left_valid) {
			int smaller_child_index = left_child_index;
			int right_child_index = get_right_child(parent_index);
			boolean is_right_valid = is_valid_index(right_child_index);
			
			if(is_right_valid && arr[right_child_index] < arr[left_child_index]) {
				smaller_child_index = right_child_index;
			}
			
			if(arr[smaller_child_index] < arr[parent_index]) {
				swap_values(smaller_child_index, parent_index, arr);
				parent_index = smaller_child_index;
				left_child_index = get_left_child(parent_index);
				is_left_valid = is_valid_index(left_child_index);
			}
			else {
				break;
			}
		}
	}
	
	public void resize_heap() {
		int[] new_heap = new int[this.size * 2];
		
		for(int i = 0; i < this.size - 1; i++) {
			new_heap[i] = this.min_heap[i];
		}
		this.min_heap = new_heap;
	}
	
	public void insert(int value) {
		if(is_full()) {
			resize_heap();
		}
		this.min_heap[this.size] = value;
		sift_up(this.size, this.min_heap);
		this.size++;
	}
	
	public void delete_min() {
		if(!is_empty()) {
			swap_values(0, this.size - 1, this.min_heap);
			this.size--;
//			sift_down(0);
		}
	}
	
	public int[] heapify(int[] arr) {
		int start_index = get_parent_index(this.size - 1);
		
		if(is_valid_index(start_index)) {
			for(int i = start_index; i >= 0; i--) {
				sift_down(i, arr);
			}
		}
		return arr;
	}
}
