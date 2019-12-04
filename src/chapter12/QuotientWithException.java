package chapter12;

import java.util.Scanner;

/**
 *
 * 06/05/2019   7:53:00 PM
 *  
 * @author Romani Ezzat
 *
 *
 * QuotientWithException
 *
 */
public class QuotientWithException 
{

	/**
	 * @param args
	 */
	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		System.out.print("Enter two integers: ");
		int num1 = input.nextInt();
		int num2 = input.nextInt();
		
		try 
		{
			int result = quotient(num1, num2);
			System.out.println(num1 + " / " + num2 + " is " + result);
		} 
		catch (Exception e) 
		{
			System.out.println("Exception: an integer cannot be divide by zero.");
		}

		System.out.println("Execution continues ...");
		
		input.close();
	}
	
	public static int quotient(int num1, int num2)
	{
		if(num2 == 0)
		{
			throw new ArithmeticException("Divisor cannot be zero.");
		}
		
		return num1 / num2;
	}

}
