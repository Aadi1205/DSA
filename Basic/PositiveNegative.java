// write a java program to get a number from the user and print where iit is positive or negative

import java.util.*;

public class PositiveNegative
{
public static void main(String[] args)
{
	Scanner sc = new Scanner(System.in);
	
	System.out.println("Enter a number");
	int num = sc.nextInt();
	
	if(num>0) {
		System.out.println("The number is positive");
	}
	else if(num<0) {
		System.out.println("The number is negative");
	}
	else {
		System.out.println("The number is zero");
	}



	sc.close();
}
}