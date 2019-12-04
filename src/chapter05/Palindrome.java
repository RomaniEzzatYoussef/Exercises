package chapter05;

import java.util.Scanner;

/**
 *
 * 29/11/2017   7:04:30 AM
 *  
 * @author roman
 *
 *
 * Palindrome
 *
 */
public class Palindrome {

	/**
	 * @param args
	 */
	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a string: ");
		String s = input.nextLine();
		
		int low = 0;
		int high = s.length() - 1;
		boolean isPalindrome = true;
		
		while (low < high)
		{
			if (s.charAt(low) != s.charAt(high))
			{
				isPalindrome = false;
				break;
			}
			
			low++;
			high--;
		}
		
		if (isPalindrome)
			System.out.println(s + " is a palindrome");
		else
			System.out.println(s + " is not a palindrome");
		
		input.close();
	}
}
