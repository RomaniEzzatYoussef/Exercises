package chapter02;

import java.util.Scanner;

/**
 * Financial application: calculate future investment value
 * Write a program that reads in investment amount, annual interest rate, 
 * and number of years, and displays the future investment value using the following formula:
 * futureInvestmentValue = investmentAmount * (1 + monthlyInterestRate) numberOfYears * 12
 */
public class Exercise_21 
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		System.out.print("Enter investment amount: ");
		double investmentAmount = input.nextDouble();
		
		System.out.print("Enter annual interest rate: ");
		double monthlyInterestRate = (input.nextDouble()) / 1200;
		
		System.out.print("Enter the number of years: ");
		int numberOfYears = input.nextInt();
		
		double futureInvestmentValue = investmentAmount * Math.pow(( 1 + monthlyInterestRate) , (numberOfYears * 12));
		
		
		System.out.println("The future investment value for " + numberOfYears + " year is " + futureInvestmentValue);
		
		
		input.close();
	}

}
