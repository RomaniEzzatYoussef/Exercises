package chapter12;

import java.util.Scanner;

/**
 *
 * 14/05/2019   7:27:34 AM
 *  
 * @author Romani Ezzat
 *
 *
 * Exercise_06
 *
 */
public class Exercise_06 
{

	/**
	 * @param args
	 */
	public static void main(String[] args) 
	{
		try
		{
			Scanner input = new Scanner(System.in);
			System.out.print("Enter a hexadecimal number: ");
			String hex = input.next().toUpperCase();
			System.out.println("The decimal value of " + hex + " is " + hexToDec(hex));
			
			input.close();
			
		}
		catch (NumberFormatException ex)
		{
			
		}
	}
	
	public static int hexToDec(String hex)
	{
		int value = convertHexToDec(hex.charAt(0));
		
		for (int i = 1; i < hex.length(); i++)
			value = value * 16 + convertHexToDec(hex.charAt(i));
		
		return value;
	}
	
	public static int convertHexToDec(char ch)
	{
		if (ch >= 'A' && ch <= 'F')
			return 10 + ch - 'A';
		else if (ch >= '0' && ch <= '9')
			return ch - '0';
		else
			throw new NumberFormatException("Illegal character " + ch);
	}
	

}
