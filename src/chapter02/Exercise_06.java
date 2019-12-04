package chapter02;

import java.util.Scanner;

/**
 * Sum the digits in an integer 
 * Write a program that reads an integer between 0 and 1000 and adds all the digits in the integer. 
 * For example, if an integer is 932, the sum of all its digits is 14.
 * Hint: Use the % operator to extract digits, and use the / operator to remove the extracted digit.
 */
public class Exercise_06 
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		System.out.print("Enter an integer between 0 and 1000: ");
		int digit = input.nextInt();
		
		int sum = (digit % 10); // (932 % 10 ===> 2)
		digit /= 10; // (932 / 10 ===> 93)
		sum += (digit % 10) + (digit /= 10); //  2  + (93 % 10 ===> 3) + (93 / 10 ===> 9)
		
		System.out.println("The sum is: " + sum);
		System.out.println("digit is: " + digit);
		
		input.close();
	}

}
