package chapter03;

import java.util.Scanner;

/**
 *
 * 30/10/2017   11:24:01 PM
 *  
 * @author Romani Ezzat
 *
 *
 * Test
 *
 */

public class Test 
{

	/**
	 * @param args
	 */
	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the time zone offset to GMT: ");
		int offset = input.nextInt();
		
		long totalMilliseconds = System.currentTimeMillis();
		
		long totalSeconds = totalMilliseconds / 1000;
		long currentSeconds = totalSeconds % 60;
		
		long totalMinutes = totalSeconds / 60;
		long currentMinutes = totalMinutes % 60;
		
		long totalHours = totalMinutes / 60;
		long currentHours = (totalHours + offset) % 24;
		
		System.out.print("The current time is " + currentHours + ":" + currentMinutes + ":" + currentSeconds + " GMT.");
		
		
		
		input.close();
	}

}
