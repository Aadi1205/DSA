// write a program to find factorial of any number entered by the user
import java.util.Scanner;
public class LoopQ3 {

	public static void main(String args[]) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number" );
		int n = sc.nextInt();

		int fact = 1;
		for(int i=1; i<=n; i++) {
			fact *= i;
		}
		System.out.println("Factorial of " + n + " is " + fact);

		sc.close();
	 }
}