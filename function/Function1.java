import java.util.Scanner;

public class Function1 {
	// function definition
	public static void calculateSum(int a, int b) { // parameters or formal parameters

		int sum = a + b;
		System.out.println("Sum is= " + sum);

	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter two Numbers:");
		int a = sc.nextInt();
		int b = sc.nextInt();
		calculateSum(a, b); // arguments or actual parameter
		sc.close();

	}
}