public class SumOfDigits {
	
	public static int sum(int num) {
		
		int n = num;
		int sum = 0;
		int rem;
		
		while(n>0) {
			rem = n%10;
			sum += rem;
			n /= 10;
			
		}
		return sum;
		
	}
	
	public static void main(String[] args) {
		
		System.out.println("sum of digits: " + sum(121));
			
	}
}