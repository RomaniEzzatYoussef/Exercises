package chapter07;


import java.util.Arrays;
import java.util.Scanner;

/**
 * Sort characters in a string
 * Write a method that returns a sorted string using the following header: 
 * public static String sort(String s) 
 * For example, sort("acb") returns abc. 
 * Write a test program that prompts the user to enter a string and displays the sorted string.
 * 
 * 07/12/2017   12:36:20 PM
 *  
 * @author roman
 *
 *
 * Exercise_34
 *
 */
public class Exercise_34 
{

	/**
	 * @param args
	 */
	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		System.out.print("Enetr a String: ");
		System.out.print("Sorted string: " + sort(input.nextLine()));
		
		input.close();
	}
	
	public static String sort(String s)
	{
		char[] str = s.toCharArray();
		Arrays.sort(str);
		
		String s1 = "";
		for (int i = 0; i < str.length; i++)
			s1 += str[i];
		return s1;
	}

}
