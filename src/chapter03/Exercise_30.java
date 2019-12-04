package chapter03;

import java.util.Scanner;

/**
 * Current time
 * Revise Programming Exercise 2.8 to display the hour using a 12-hour clock.
 * 
 * 19/10/2017   7:57:31 AM
 *  
 * @author Romani Ezzat
 *
 *
 * Exercise_30
 *
 */
public class Exercise_30 
{

	/**
	 * @param args
	 */
	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the time zone offset to GMT: ");
		int offset = input.nextInt();
		
		long totalMilliseconds = System.currentTimeMillis();
		
		long totalSeconds = totalMilliseconds / 1000;
		long currentSecond = totalSeconds % 60;
		
		long totalMinutes = totalSeconds / 60;
		long currentMinute = totalMinutes % 60;
		
		long totalHours = totalMinutes / 60;
		long currentHour = ((totalHours + offset) % 24);
		
		System.out.print("The current time is " + currentHour + ":" + currentMinute + ":" + currentSecond + " GMT.");
		
		input.close();
	}
	
	public static void doSomething()
	{
		String status = "I am Happy";
		
		System.out.println(status);
	}
	
	

}
