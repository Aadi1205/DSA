//print sum of first n natural numbers

import java.util.*;

public class SumOfNaturalNo
{
public static void main(String[] args)
{
	Scanner sc = new Scanner(System.in);
	
	System.out.println("Enter number:");
	int n = sc.nextInt();
	int sum = 0;
	int count = 1;
	while(count<=n) {
		sum += count;
		count ++;
	}
	System.out.println("Sum is: " + sum);


	sc.close();
}
}