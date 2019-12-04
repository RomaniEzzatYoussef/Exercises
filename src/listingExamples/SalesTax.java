package listingExamples;

import java.util.Scanner;

/**
 *
 * 10/03/2019   11:58:35 AM
 *  
 * @author Romani Ezzat
 *
 *
 * SalesTax
 *
 */
public class SalesTax 
{

	/**
	 * @param args
	 */
	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		System.out.print("Enter purchase amount: ");
		double purchaseAmount = input.nextDouble();
		
		double tax = purchaseAmount * 0.06;
		System.out.println("Sales tax is $" + (int)(tax * 100) / 100.0);
		
		input.close();
	}

}
