import java.util.ArrayList;
import java.util.List;

public class RemoveBlanks {
	
	public static List<Integer> solution(int[] a) {
		
		List<Integer> answer = new ArrayList<Integer>();
		
		for(int i = 0; i < a.length; i++) {
			if(a[i] != ' ') {
				answer.add(a[i]);				
			}
		}
		
		return answer;
	}

	public static void main(String[] args) {
	
		int[] test = new int[]{1,' ', 3, 4, 5};
		
		System.out.println(solution(test));

	}

}
