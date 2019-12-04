package chapter03;

import java.util.Scanner;

/**
 * Financial: compare costs
 * Suppose you shop for rice in two different packages. 
 * You would like to write a program to compare the cost. 
 * The program prompts the user to enter the weight and price of the each package and displays the one with the better price.
 *
 * 31/10/2017   4:37:35 PM
 *  
 * @author Romani Ezzat
 *
 *
 * Exercise_33
 *
 */
public class Exercise_33 
{

	/**
	 * @param args
	 */
	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter the weight and price for package 1: ");
		double weight1 = input.nextDouble();
		double price1 = input.nextDouble();
		double package1 = price1 / weight1;
		
		System.out.print("Enter the weight and price for package 2: ");
		double weight2 = input.nextDouble();
		double price2 = input.nextDouble();
		double package2 = price2 / weight2;
		
		if (package1 > package2)
			System.out.print("Package 1 is the better deal");
		else if (package2 > package1)
			System.out.print("Package 2 is the better deal");
		else
			System.out.print("Both package are the same deal"); 
		
		input.close();
	}

}
