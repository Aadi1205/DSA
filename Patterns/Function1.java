import java.util.Scanner;
public class Function1 {
	
	public static void calculateSum() {

		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int sum = a + b;
		System.out.println("Sum is= " + sum);
		sc.close();
	
	}

	public static void main(String[] args) {

		
		calculateSum();
		
	}
}