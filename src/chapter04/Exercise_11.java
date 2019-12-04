package chapter04;

import java.util.Scanner;

/**
 * Decimal to hex
 * Write a program that prompts the user to enter an integer between 0 and 15 and displays its corresponding hex number.
 *
 * 18/11/2017   12:57:50 PM
 *  
 * @author roman
 *
 *
 * Exercise_11
 *
 */
public class Exercise_11 {

	/**
	 * @param args
	 */
	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a decimal value (0 to 15): ");
		int d = input.nextInt();
		
		if (d >= 0 && d <= 9)
			System.out.print("The hex value is " + d);
		else if (d >= 10 && d <= 15)
			System.out.print("The hex value is " + (char) (d + 55));
		else
			System.out.println("Wrong input");
		
		input.close();
	}

}
