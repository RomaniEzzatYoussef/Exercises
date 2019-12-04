package RomaniTests;

import java.util.Scanner;

public class DisplayHours 
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		System.out.print("Enter an integer for milliSeconds: ");
		int milliSeconds = input.nextInt();
		
		int seconds = milliSeconds / 1000;
		int remainingSeconds = milliSeconds % 60;
		
		int minutes = seconds / 60;
		int remainingMinutes = seconds % 60;
		
		int hours = minutes / 60;
		int remainingHour = minutes % 24;
		
		int day = hours / 24;
		int remainingDay = hours % 24;
		
		System.out.println(milliSeconds + " milliSecond(s) is " +  remainingDay + " day(s) and " + remainingHour + " hour(s) and " + 
		remainingMinutes + " minute(s) and " + remainingSeconds + " seconds" );
		
		
		int k = (int)Math.pow(2, 4);
		System.out.println(k);
		
		
		System.out.println("hello");
		
		input.close();
	}
}
