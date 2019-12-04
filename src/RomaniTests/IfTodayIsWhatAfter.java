package RomaniTests;

import java.util.Scanner;

public class IfTodayIsWhatAfter {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Where As Saturday   0"
				+ "\n\t Sunday     1"
				+ "\n\t Monday     2"
				+ "\n\t Tuesday    3"
				+ "\n\t Wednesday  4"
				+ "\n\t Thursday   5"
				+ "\n\t Friday     6"
				+ "\nEnter your current day: ");
		int currentDay = input.nextInt();
		
		System.out.print("Enter amount of days: ");
		int amountOfDays = input.nextInt();
		
		String msg = "The day after " + amountOfDays + " days, is ";
		
		if ((currentDay + amountOfDays) % 7 == 0)
			System.out.println(msg + "Saturday");
		else if((currentDay + amountOfDays) % 7 == 1)
			System.out.println(msg + "Sunday");
		else if((currentDay + amountOfDays) % 7 == 2)
			System.out.println(msg + "Monday");
		else if((currentDay + amountOfDays) % 7 == 3)
			System.out.println(msg + "Tuesday");
		else if((currentDay + amountOfDays) % 7 == 4)
			System.out.println(msg + "Wednesday");
		else if((currentDay + amountOfDays) % 7 == 5)
			System.out.println(msg + "Thursday");
		else
			System.out.println(msg + "Friday");
		
		input.close();

	}

}
