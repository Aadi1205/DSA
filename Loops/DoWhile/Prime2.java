// Prime number

import java.util.*;

public class Prime2
{
public static void main(String[] args)
{
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter any number: ");
	int n = sc.nextInt();
	
	boolean isPrime = true;
	
	if(n == 2) {
		System.out.println("2 is prime number");
	}

	else {

	for(int i=2; i<Math.sqrt(n); i++) {
		
		if(n%i==0) {
			isPrime = false;
		}
	}
	if(isPrime) {
		System.out.println("number is prime");
	}
	else {
		System.out.println("Number isn't prime");
	}
	}
	sc.close();	
}
}