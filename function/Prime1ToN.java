public class Prime1ToN {


	public static boolean isPrime(int n) {
		
		boolean isPrime = true;
		
		if( n == 2) {
			return true;
		}
		for(int i=2; i<=Math.sqrt(n); i++) {
			if( n % i == 0) {
				return false;
			}
		}
		return isPrime;
	}

	public static void prime(int a, int b) {
		
		for(int i=a; i<b; i++) {
			
			if(isPrime(i)) { // true
				System.out.print(i + " " );
			}	
		}	
	}

	public static void main(String args[]) {
		
		prime(5,99);


	}
}