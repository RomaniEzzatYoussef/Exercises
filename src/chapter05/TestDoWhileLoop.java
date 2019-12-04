package chapter05;

import java.util.Scanner;

/**
 *
 * 16/03/2019   11:37:32 AM
 *  
 * @author Romani Ezzat
 *
 *
 * TestDoWhileLoop
 *
 */
public class TestDoWhileLoop 
{

	/**
	 * @param args
	 */
	public static void main(String[] args) 
	{
		int data;
		int sum = 0;
		Scanner input = new Scanner(System.in);
		
		do
		{
			System.out.print("Enter an integer (the input ends if it is 0): ");
			data = input.nextInt();
			sum += data;
		} while (data != 0);
		
		System.out.println("The sum is " + sum);
		
		input.close();
	}

}
