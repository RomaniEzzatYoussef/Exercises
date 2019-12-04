package chapter12;

import java.util.Scanner;

/**
 *
 * 09/05/2019   9:12:53 PM
 *  
 * @author Romani Ezzat
 *
 *
 * Exercise_02
 *
 */
public class Exercise_02 
{

	/**
	 * @param args
	 */
	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		
		int num1 = 0;
		int num2 = 0;
		boolean correctInput = false;
		
		System.out.print("Enter two numbers: ");
		
		while (!correctInput)
		{
			try 
			{
				num1 = input.nextInt();
				num2 = input.nextInt();
				correctInput = true;
			}
			catch (Exception e)
			{
				System.out.print("Incorrect input and re-enter two integers: ");
				input.nextLine();
			}
		}
		
		System.out.println(num1 + " + " + num2 + " = " + (num1 + num2));
		input.close();
	}

}
