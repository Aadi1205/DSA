// write a program to print the number N, entered by the user

public class Pattern1 {

	public static void main(String[] args) {
	
	int n = 5;
	
	for(int i=1; i<=n; i++) {
		for(int j=1; j<=n-i; j++) {
			System.out.println("*");
		}
	}
		
	}
}