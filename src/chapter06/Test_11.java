package chapter06;

import java.util.Scanner;

/**
 *
 * 18/03/2019   1:01:49 PM
 *  
 * @author Romani Ezzat
 *
 *
 * Test_11
 *
 */
public class Test_11 
{

	/**
	 * @param args
	 */
	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		System.out.print("Enter Digits: ");
		long digits = input.nextLong();
		
		
		String i = reverseString(digits);
		
		System.out.println(i);
		
		input.close();
	}
	
	public static String reverseString(long reverse)
	{
		return new StringBuilder(Long.toString(reverse)).reverse().toString();
	}

}
