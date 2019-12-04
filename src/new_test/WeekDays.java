package new_test;

import java.util.Scanner;

public class WeekDays 
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		System.out.print("Enter number of day: ");
		int day = input.nextInt();
		
		String dayName = "Invalid input";
		
		switch (day) { 
		  case 0: dayName = "Sunday"; break;
		  case 1: dayName = "Monday"; break;
		  case 2: dayName = "Tuesday"; break;
		  case 3: dayName = "Wednesday"; break;
		  case 4: dayName = "Thurday"; break;
		  case 5: dayName = "Friday"; break;
		  case 6: dayName = "Saturday"; break;
		}

		System.out.println(dayName);
		
		input.close();
	}
}
