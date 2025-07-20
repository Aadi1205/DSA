import java.util.Scanner;
public class Factorial {

	public static int fact(int a) {
		
	int f = 1;
	
	for(int i=1; i<=a; i++) {
		f = f*i;

	}
	return f;
	}

	public static void main(String[] args) {

	Scanner sc = new Scanner(System.in);
	
	int factorial = fact(5);
	System.out.println("factorial : " + factorial);
	sc.close();

		
	}
}