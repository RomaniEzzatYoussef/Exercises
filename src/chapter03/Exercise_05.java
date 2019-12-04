package chapter03;

import java.util.Scanner;

/**
 * Find future dates
 * Write a program that prompts the user to enter an integer for today’s day of the week 
 * (Sunday is 0, Monday is 1, …, and Saturday is 6). 
 * Also prompt the user to enter the number of days after today for a future day and display the future day of the week.
 */

public class Exercise_05 
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		System.out.print("Enter today's day: ");
		int today = input.nextInt();
		
        String d = "Today is " + whatDayIs(today);
        
        System.out.print("Enter the number of days elapsed since today: ");
		int elapsed = (today + input.nextInt()) % 7;
		
		d += " and the future day is " + whatDayIs(elapsed);
		
		System.out.println(d);
		
		input.close();
	}
	
	public static String whatDayIs(int elapsed)
	{
		if (elapsed == 0)
			return "Sunday";
		else if (elapsed == 1)
			return "Monday";
		else if (elapsed == 2)
			return "Tuesday";
		else if (elapsed == 3)
			return "Wednesday";
		else if (elapsed == 4)
			return "Thursday";
		else if (elapsed == 5)
			return "Friday";
		else if (elapsed == 6)
			return "Saturday";
		else
			return null;
	}
}
