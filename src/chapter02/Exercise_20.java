package chapter02;

import java.util.Scanner;

/**
 * Financial application: calculate interest
 * Write a program that reads the balance and the annual percentage interest rate 
 * and displays the interest for the next month.
 * interest = balance * (annualInterestRate/1200) 
 */

public class Exercise_20 
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the balance and the annual interest rate: ");
		double balance = input.nextDouble();
		double annualInterestRate = input.nextDouble();
		
		double interest = balance * (annualInterestRate / 1200);
		
		System.out.println("The interest for the next month is " + interest);
		
		
		input.close();
	}

}
