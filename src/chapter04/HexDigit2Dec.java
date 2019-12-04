package chapter04;

import java.util.Scanner;

/**
 *
 * 17/11/2017   8:54:18 PM
 *  
 * @author roman
 *
 *
 * HexDigit2Dec
 *
 */
public class HexDigit2Dec 
{

	/**
	 * @param args
	 */
	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a hex digit: ");
		String hexString = input.nextLine();
		
		if (hexString.length() != 1)
		{
			System.out.println("You must enter exactly one character");
			System.exit(1);
		}
		
		char ch = Character.toUpperCase(hexString.charAt(0));
		
		if (ch >= 'A' && ch <= 'F')
		{
			int value = ch - 'A' + 10;
			System.out.println("The decimal value for hex digit " + ch + " is " + value);
		}
		else if (Character.isDigit(ch))
		{
			System.out.println("The decimal value for hex digit " + ch + " is " + ch);
		}
		else
			System.out.println(ch + " is an invalid input");
		
		
		input.close();
	}

}
