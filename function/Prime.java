public class Prime {

	public static boolean isPrime(int n) {
		boolean isPrime = true;

		if( n == 2) {
			return true;
		}  
// no need of else statement in function because function return value so for n=2 for loop is not execute at all
		for(int i=2; i<=Math.sqrt(n); i++) {
			if(n % i == 0) { // completely dividing
				return false;
			}
		}		
		return isPrime;
	
	}

	public static void main(String[] args) {

		System.out.println(isPrime(5));
	}
}