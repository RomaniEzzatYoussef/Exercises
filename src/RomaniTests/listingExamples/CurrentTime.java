package RomaniTests.listingExamples;

import java.util.Scanner;

/**
 *
 * 11/03/2019   9:08:46 AM
 *  
 * @author Romani Ezzat
 *
 *
 * CurrentTime
 *
 */
public class CurrentTime {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
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
