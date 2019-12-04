package chapter03;

import java.util.Scanner;

/**
 * Use the &&, || and ^ operators
 * Write a program that prompts the user to enter an integer and determines 
 * whether it is divisible by 5 and 6, 
 * whether it is divisible by 5 or 6, and 
 * whether it is divisible by 5 or 6, but not both.
 *
 * 12/10/2017   12:53:14 PM
 *  
 * @author Romani Ezzat
 *
 *
 * Exercise_26
 *
 */
public class Exercise_26 
{

	/**
	 * @param args
	 */
	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		System.out.print("Enter an integer: ");
		int divisible = input.nextInt();
		
		if ((divisible % 5 == 0) && (divisible % 6 == 0))
			System.out.println(divisible + " is divisible by 5 && 6");
		if ((divisible % 5 == 0) || (divisible % 6 == 0))
			System.out.println(divisible + " is divisible by 5 || 6");
		if ((divisible % 5 == 0) ^ (divisible % 6 == 0))
			System.out.print(divisible + " is divisible by 5 ^ 6 but not both");
			
		input.close();
	}

}
