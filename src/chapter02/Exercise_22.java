package chapter02;

import java.util.Scanner;

/**
 * Financial application: monetary units
 * Rewrite Listing 2.10, ComputeChange.java, to fix the possible loss of accuracy 
 * when converting a double value to an int value. 
 * Enter the input as an integer whose last two digits represent the cents.
 */

public class Exercise_22 
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the amount in double, for example 1156: ");
		int amount = input.nextInt();
		
		int yourAmount = amount;
		
		int dollars = amount / 100;
		amount %= 100;
		
		int quarters = amount / 25;
		amount %= 25;
		
		int dimes = amount / 10;
		amount %= 10;
		
		int nickels = amount / 5;
		amount %= 5;
		
		int pennies = amount;
		
		
		System.out.println("Your amount " + yourAmount + " consists of");
		System.out.println(" " + dollars + " dollars");
		System.out.println(" " + quarters + " quarters ");
		System.out.println(" " + dimes + " dimes");
		System.out.println(" " + nickels + " nickels");
		System.out.println(" " + pennies + " pennies");
		
		input.close();
	}

}
