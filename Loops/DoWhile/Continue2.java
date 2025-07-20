// display all numbers entered by user except multiples of 10

import java.util.*;

public class Continue2
{
public static void main(String[] args)
{
	Scanner sc = new Scanner(System.in);
	while(true)
	{	
		System.out.println("Enter your number");
		int n = sc.nextInt();
		
		if(n%10 == 0) {
			continue;
		}
		System.out.println("Number was: " + n);

		sc.close();
	}
	
}
}