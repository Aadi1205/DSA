//print reverse of the number 

import java.util.*;

public class Reverse
{
public static void main(String[] args)
{
	int num = 1234;
	int rev = 0;
	int n;
	while(num>0) {
		n = num%10;
		rev = rev*10 + n;
		num = num/10; //	n /= 10
	}

	System.out.println("The revese of the number is: " + rev);


	
}
}