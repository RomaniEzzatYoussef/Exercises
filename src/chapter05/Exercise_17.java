package chapter05;

import java.util.Scanner;

/**
 * Display pyramid
 * Write a program that prompts the user to enter an integer from 1 to 15 and displays a pyramid, as shown in the following sample run:
 *
 * 29/11/2017   7:55:38 PM
 *  
 * @author roman
 *
 *
 * Exercise_17
 *
 */
public class Exercise_17 {

	/**
	 * @param args
	 */
	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a number from 1 to 15: ");
		int number = input.nextInt();
		
		for (int i = 1; i <= number; i++) 
		{
			for (int j = number; j > i; j--)
				System.out.print("  ");
			
			for (int k = i; k > 0; k--)
				System.out.print(k + " ");
			
			for (int l = 2; l <= i; l++)
				System.out.print(l + " ");
			
			System.out.println();
		}
		
		input.close();
	}

}
