import java.util.Scanner;
public class Swap {

	public static void swap(int a , int b) {
		
	//no overflow risk --> optimum solution
	a = a^b;
	b = a^b;
	a = a^b;

	// It requires extra memory
	// int temp = a;
	// a = b;
	// b = temp;
	
	// Risk of integer overflow if a + b exceeds the range of integers.
	a = a+b;
	b = a-b;
	a = a-b;

	// Works only if neither a nor b is zero.
	// Also risk of overflow.
	a = a*b;
	b = a/b;
	a = a/b;
	
	System.out.println("A: " + a + " B: " + b); 
	}

	public static void main(String[] args) {

	Scanner sc = new Scanner(System.in);
	
	int a = 5;
	int b = 10;
	swap(a,b);
	sc.close();
	
		
	}
}