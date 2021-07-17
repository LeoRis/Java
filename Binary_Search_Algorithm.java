
public class Binary_Search_Algorithm {
	int left = 0;
	int right = 0;
	int mid_element = 0;
	int mid_index = 0;
	
	public int binarySearch(int[] arr, int target) {
		this.left = 0;
		this.right = arr.length - 1;
		
		while(this.left <= this.right) {
			this.mid_index = this.left + (this.left - this.right) / 2;
			this.mid_element = arr[this.mid_index];
			
			if(this.mid_element < target) {
				left = mid_index + 1;
			}
			else if(this.mid_element > target) {
				right = mid_index - 1;
			}
			else {
				return mid_index;
			}
		}
		return -1;
	}
}
