import java.util.*;

public class LargestOf3
{
public static void main(String[] args)
{
	Scanner sc = new Scanner(System.in);
		
	System.out.println("Enter 3 numbers:");
	int a = sc.nextInt();
	int b = sc.nextInt();
	int c = sc.nextInt();
	
	if(a>=b && a>=c) {
		System.out.println("Largest ele is A: " + a);
	}
	else if (b>=c) {
		System.out.println("Largest ele is B: " + b);
	}
	else {
		System.out.println("Largest ele is C: " + c);
	}
	sc.close();
}
}