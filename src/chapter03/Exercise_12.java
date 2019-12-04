package chapter03;

import java.util.Scanner;

/**
 * Palindrome number
 * Write a program that prompts the user to enter a three-digit integer 
 * and determines whether it is a palindrome number. 
 * A number is palindrome if it reads the same from right to left and from left to right.
 * 
 * 
 * 
 * 28/09/2017   5:34:56 PM
 *
 * @author Romani Ezzat
 *
 */
public class Exercise_12 
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a three-digit integer: ");
		int digit = input.nextInt();
		
		isPalindrome(digit);
		
		t5(digit);
		
		
		
		input.close();
	}
	
	public static void isPalindrome(int digit)
	{
		int lhs = digit / 100;
		int rhs = digit % 10;
		
		if (rhs == lhs) 
			System.out.println(digit + " is a palindrome!");
			
		else
			System.out.println(digit + " not is a palindrome!");
	}
	
	public static void t3(int num)
	{
		int d1 = num / 100;
		int d2 = (num % 100) /10;
		int d3 = num % 10;
		
		System.out.println(d1 + " " + d2 + " " + d3);
	}
	
	public static void t4(int num)
	{
		int d1 = num / 1000;
		int d2 = (num % 1000) /100;
		int d3 = (num % 100) /10;
		int d4 = num % 10;
		
		System.out.println(d1 + " " + d2 + " " + d3 + " " + d4);
	}
	
	public static void t5(int num)
	{
		int d1 = num / 10000;
		int d2 = (num % 10000) / 1000;
		int d3 = (num % 1000) / 100;
		int d4 = (num % 100) / 10;
		int d5 = num % 10;
		
		System.out.println(d1 + " " + d2 + " " + d3 + " " + d4 + " " + d5);
	}
}
