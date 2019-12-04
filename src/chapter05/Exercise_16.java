package chapter05;

import java.util.Scanner;

/**
 * Find the factors of an integer
 * Write a program that reads an integer and displays all its smallest factors in increasing order. 
 * For example, if the input integer is 120, the output should be as follows: 2, 2, 2, 3, 5.
 * 
 * 29/11/2017   7:31:56 PM
 *  
 * @author roman
 *
 *
 * Exercise_16
 *
 */
public class Exercise_16 {

	/**
	 * @param args
	 */
	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		System.out.print("Enter an integer: ");
		int number = input.nextInt();
		
		int factor = 2;
		
		while (number != 1)
		{
			if (number % factor == 0)
			{
				System.out.print(factor + " ");
				number /= factor;
			}
			else
				++factor;
		}
		
		input.close();
	}

}
