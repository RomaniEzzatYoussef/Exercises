package chapter02;

import java.util.Scanner;

/**
 * Current time 
 * Listing 2.7, ShowCurrentTime.java, gives a program that displays the current time in GMT. 
 * Revise the program so that it prompts the user to enter the time zone offset to GMT and displays the time in the specified time zone.
 */

public class Exercise_08 
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the offset to GMT: ");
		int offset = input.nextInt();
		
		long currentTimeInSeconds = System.currentTimeMillis() / 1000;
		
		long hour = (currentTimeInSeconds / 60) / 60;
		long minute = (currentTimeInSeconds / 60) % 60;
		long second = currentTimeInSeconds % 60;
		
		System.out.println("The current time is: " + (hour + offset) % 24 + ":" + (minute) + ":" + (second));
		
		input.close();
	}

}
