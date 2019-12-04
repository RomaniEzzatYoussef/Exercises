package chapter06;

import java.util.Scanner;

/**
 *
 * 01/12/2017   10:53:46 AM
 *  
 * @author roman
 *
 *
 * Hex2Dec
 *
 */
public class Hex2Dec {

	/**
	 * @param args
	 */
	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a hex number: ");
		String hex = input.nextLine();
		
		System.out.println("The decimal value for hex number " + hex + " is " + hexToDecimal(hex.toUpperCase()));
		
		input.close();
	}
	
	public static int hexToDecimal(String hex)
	{
		int decimalValue = 0;
		for (int i = 0; i < hex.length(); i++)
		{
			char hexChar = hex.charAt(i);
			decimalValue = decimalValue * 16 + hexCharToDecimal(hexChar);
		}
		
		return decimalValue;
	}
	
	public static int hexCharToDecimal(char ch)
	{
		if (ch >= 'A' && ch <= 'F')
			return 10 + ch - 'A';
		else
			return ch - '0';
	}

}
