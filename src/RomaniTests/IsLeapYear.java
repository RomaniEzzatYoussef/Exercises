package RomaniTests;

import java.util.Scanner;

public class IsLeapYear 
{
	public static void main(String[] args)
	{
		
		Scanner input = new Scanner(System.in);
		
		long currentTimeInSeconds = (System.currentTimeMillis())/ 1000;
		
		long hour = ((currentTimeInSeconds / 60) / 60) % 24;
		long minute = ((currentTimeInSeconds / 60) % 60);
		long second = currentTimeInSeconds % 60;
		
		System.out.println("The current time is " + (hour + 2) + ":" + minute + ":" + second); 
		
		System.out.print("Enter the year: ");
		int year = input.nextInt();
		
		boolean isLeapYear = ((year % 4 == 0) && (year % 100 != 0)) || (year % 400 == 0);
		
		if (isLeapYear)
			System.out.println("Is a leap year");
		
		else
			System.out.println("Is not a leap year");
		
		
		input.close();
	}
}
