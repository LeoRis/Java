import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class SumOfAbsoluteDifferences {
    
    static int solve(int numbers[], int N, int K) {
    	
    	int sum = 0;
    	int i = 0;

    	while(i < K) {
   			sum += Math.abs((numbers[i + 1]) - numbers[i]);
    		i++;
    	}
    	
    	return sum;
    }
    
    public static void main(String[] args) throws Exception {
        int i,j;
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());
        
        int numbers[] = new int[N];
        
        st = new StringTokenizer(br.readLine());
        for (i = 0; i < N; i++) {
            numbers[i] = Integer.parseInt(st.nextToken());
        }
        
        int res = solve(numbers, N, K);
        System.out.println(res);
        
        br.close();
        
    }
    
}