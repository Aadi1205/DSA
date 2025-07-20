//write a java program that takes a year from the user and print whether that the year is a leap year or not;

import java.util.*;

public class LeapYear
{
public static void main(String[] args)
{
	Scanner sc = new Scanner(System.in);
	
	System.out.println("Enter Year:");
	int year = sc.nextInt();
	
	boolean x = (year % 4) == 0;
	boolean y = (year % 100) != 0;
	boolean z = ((year % 100 == 0) && (year % 400 == 0));
	
	if(x && (y || z)) {
		System.out.println(year + " is a Leap Year");
	}
	else {
		System.out.println(year + " is not a Leap Year");
	}


	sc.close();
}
}