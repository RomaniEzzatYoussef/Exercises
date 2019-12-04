package chapter10;

import java.util.Scanner;

/**
 *
 * 16/04/2019   9:48:39 PM
 *  
 * @author Romani Ezzat
 *
 *
 * PalindromeIgnoreNonAlphanumeric
 *
 */
public class PalindromeIgnoreNonAlphanumeric 
{

	/**
	 * @param args
	 */
	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a String: ");
		String s = input.nextLine();
		
		System.out.println("Ignoring non-alphanumeric characters, \nis "+ s + " a palindrome? " + isPalindrome(s));
		
		input.close();
	}
	
	public static boolean isPalindrome(String s)
	{
		String s1 = filter(s);
		String s2 = reverse(s1);
		
		return s2.equals(s1);
	}
	
	public static String filter(String s)
	{
		StringBuilder stringBuilder = new StringBuilder();
		
		for (int i = 0; i < s.length(); i++)
		{
			if (Character.isLetterOrDigit(s.charAt(i)))
			{
				stringBuilder.append(s.charAt(i));
			}
		}
		
		return stringBuilder.toString();
	}
	
	public static String reverse(String s)
	{
		StringBuilder stringBuilder = new StringBuilder(s);
		stringBuilder.reverse();
		
		return stringBuilder.toString();
	}

}
