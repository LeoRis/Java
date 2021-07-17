import java.io.BufferedReader;
import java.io.InputStreamReader;


public class Chocolate_CoinChangeProblem {

	public static void main(String[] args) throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		int[] coins = {1, 2};
		
		System.out.println(chocolate(coins, n));
	}


    public static int chocolate(int[] S, int N) {
        // if the total is 0, return 1
        if (N == 0) {
            return 1;
        }
 
        // return 0 if total becomes negative
        if (N < 0) {
            return 0;
        }
 
        // initialize the total number of ways to 0
        int result = 0;
 
        // do for each coin
        for (int i = 0; i < S.length; i++) {
            // recur to see if total can be reached by including
            // current coin `S[i]`
            result += chocolate(S, N - S[i]);
        }
 
        // return the total number of ways
        return result;
    }
    
}