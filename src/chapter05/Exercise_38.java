package chapter05;

import java.util.Scanner;

/**
 * Decimal to octal
 * Write a program that prompts the user to enter a decimal integer and displays its corresponding octal value. 
 * Don’t use Java’s Integer.toOctalString(int) in this program.
 * 
 * 30/11/2017   8:27:48 AM
 *  
 * @author roman
 *
 *
 * Exercise_38
 *
 */
public class Exercise_38 {

	/**
	 * @param args
	 */
	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the number: ");
		int decimalNumber = input.nextInt();
		
		String octalNumber = "";
		
		while (decimalNumber != 0)
		{
			octalNumber += (decimalNumber % 8);
			decimalNumber /= 8;
		}
		
		octalNumber = new StringBuilder(octalNumber).reverse().toString();
		
		System.out.print(octalNumber);
		
        input.close();
	}

}
