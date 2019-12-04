package chapter02;

import java.util.Scanner;

/**
 * Financial application: calculate tips 
 * Write a program that reads the subtotal and the gratuity rate, then computes the gratuity and total. 
 * For example, if the user enters 10 for subtotal and 15% for gratuity rate, the program displays $1.5 as gratuity and $11.5 as total.
 */
public class Exercise_05 
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the bill: ");
		double bill = input.nextDouble();
		
		System.out.print("Enter the gratuity: ");
		double gratuity = input.nextDouble();
		
		double gratuityCost = bill * (gratuity / 100);
		double totalCost = bill + gratuityCost;
		
		System.out.println("The gratuity is $" + gratuityCost);
		System.out.println("The total cost is $" + totalCost);
		
		input.close();
	}
}
