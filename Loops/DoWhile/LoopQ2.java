// write a program that reads a set of integers and then prints the sum of the even and odd integers;

import java.util.*;

public class LoopQ2
{
public static void main(String[] args)
{
	Scanner sc = new Scanner(System.in);
	int n, choice, evenSum = 0, oddSum = 0;
	
 	do {
		System.out.println("Enter the number" );
		n = sc.nextInt();
		
		if( n % 2 == 0) {
			evenSum += n;
		}
		else {
			oddSum += n;
		}
		
		System.out.println("Do you want to continue? Press 1 for yes or 0 for no" );
		
	choice = sc.nextInt();
	
	} while(choice == 1);
	
	System.out.println("Sum of even numbers:" + evenSum);			
	System.out.println("Sum of odd numbers: " + oddSum);

	sc.close();
	
}
}