package chapter03;

import java.util.Scanner;

/**
 * Financials: currency exchange
 * Write a program that prompts the user to enter the exchange rate from currency in U.S. dollars to Chinese RMB. 
 * Prompt the user to enter 0 to convert from U.S. dollars to Chinese RMB and 1 to convert from Chinese RMB and U.S. dollars. 
 * Prompt the user to enter the amount in U.S. dollars or Chinese RMB to convert it to Chinese RMB or U.S. dollars, respectively.
 *
 * 31/10/2017   1:12:23 PM
 *  
 * @author Romani Ezzat
 *
 *
 * Exercise_31
 *
 */
public class Exercise_31 
{

	/**
	 * @param args
	 */
	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter the currency amount: ");
		double currency = input.nextDouble();
		
		System.out.print("Enter the type of exchange 0 || 1: ");
		double exchange = input.nextInt();
		
		if (exchange == 0)
			System.out.print(currency * 8);
		else if (exchange == 1)
			System.out.print(currency / 8);
		else 
			System.out.println("Wrong Choise");
		
		
		input.close();
	}

}
