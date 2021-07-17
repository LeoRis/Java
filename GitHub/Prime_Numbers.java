package GitHub;

public class Prime_Numbers {

	public static void main(String[] args) {
		
		int sum = 0;
		
		for(int i = 1; i < 100; i++) {
			boolean isPrime = true;
			for(int j = 2; j < i; j++) {
				if(i % j == 0) {
					isPrime = false;
					break;
				}
			}
			if(isPrime) {
				sum += i;
			}
		}
		System.out.println("The sum of the prime numbers until 100 is: " + sum);
	}
	
}