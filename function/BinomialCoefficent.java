// C(n, r) = n! / (r! * (n - r)!)

import java.util.Scanner;
public class BinomialCoefficent {

	public static int fact(int a) {
		
	int f = 1;
	
	for(int i=1; i<=a; i++) {
		f = f*i;

	}
	return f;
	}
	
	public static double binomial(int n, int r) {

		int a = fact(n);
		int b = fact(r);
		int c = fact(n-r);
	
		double BC = a/(b*c);
		return BC;
	}
	
	public static void main(String[] args) {

	Scanner sc = new Scanner(System.in);
	
	System.out.println("Enter the value of n and r:");
	int n = sc.nextInt();
	int r = sc.nextInt();
	double BC = binomial(n,r);
	System.out.println("Binomial coefficient is : " + BC);
	sc.close();

		
	}
}