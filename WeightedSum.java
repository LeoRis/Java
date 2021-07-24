import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.util.Scanner;

public class WeightedSum {
    
    static int solve(int numbers[], int N, int K) {
    	int sum = 0;
    	
    	for(int i = 0; i < N; i++) {
    		if(i <= K) {
    			sum += numbers[i] * (i + 1); 
    		}
    	}
    	
    	return sum;
    }
    
    public static void main(String[] args) throws Exception {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
    	
//    	Scanner input = new Scanner(System.in);
    	
//        System.out.println("Array size: ");
        int N = Integer.parseInt(st.nextToken());
//        int N = input.nextInt();
        
//        System.out.println("Key: ");
        int K = Integer.parseInt(st.nextToken());
//        int K = input.nextInt();
        
        int numbers[] = new int[N];
        
        st = new StringTokenizer(br.readLine());
        
        for (int i = 0; i < N; i++) {
            numbers[i] = Integer.parseInt(st.nextToken());
//        	numbers[i] = input.nextInt();
        }
        
        int res = solve(numbers, N, K);
        System.out.println(res);
        
        br.close();
//        input.close();
        
    }
    
}
