// Prime number

import java.util.*;

public class Prime
{
public static void main(String[] args)
{
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter any number:");
	int n = sc.nextInt();
	int flag = 0;
	for(int i=2; i<n; i++)
	{
		if(i%n==0) {
			flag++;
		}
	}
	if(flag == 0) {
		System.out.println("Prime Number! ");
	}
	else {
		System.out.println("Not a Prime Number! ");
	}	
	sc.close();
}
}