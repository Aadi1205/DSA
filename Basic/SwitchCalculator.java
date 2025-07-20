import java.util.*;

public class SwitchCalculator
{
public static void main(String[] args)
{
	Scanner sc = new Scanner(System.in);
	
	System.out.println("Enter any 2 numbers:");
	int a = sc.nextInt();
	int b = sc.nextInt();

	System.out.println("Enter Operation: '+,-,*,/'");
	char ch = sc.next().charAt(0);

	switch(ch) {
		case '+' : System.out.println(a+b);
			   break;
	
		case '-' : System.out.println(a-b);
			   break;

		
		case '*' : System.out.println(a*b);
			   break;

	
		case '/' : System.out.println(a/b);
			   break;
		default : System.out.println("Please enter valid Operation");

	}



	sc.close();
}
}