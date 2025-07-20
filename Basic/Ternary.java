// what wil be the value of x and y in the follwing program

import java.util.*;

public class Ternary
{
public static void main(String[] args)
{
	Scanner sc = new Scanner(System.in);
	
	int a = 63, b = 36;
	Boolean x = (a<b) ? true : false;
	int y = (a>b) ? a: b;
	
	System.out.println("Boolean x :" + x);
	System.out.println("Int y : " + y);


	sc.close();
}
}