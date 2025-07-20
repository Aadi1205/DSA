import java.util.Scanner;
public class Product {

	public static int multiply(int a , int b) {
		
	int product = a*b;
	return product;
	
	}

	public static void main(String[] args) {

	Scanner sc = new Scanner(System.in);
	
	int product = multiply(5,2);
	System.out.println("Product is: " + product);
	sc.close();
	
		
	}
}