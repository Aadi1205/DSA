public class Palindrome {
	
	public static void pal(int num) {
		
		int n = num;
		int rev = 0;
		int temp;
		
		while(n>0) {
			temp = n%10;
			rev = rev*10 + temp;
			n /= 10;
			
		}
		if( num == rev ) {
			System.out.println("The number " + num + " is palindrome");	
		}
		else {
			System.out.println(num + " is not a palindrome");
		}
	}
	
	public static void main(String[] args) {
		
		pal(121);
			
	}
}