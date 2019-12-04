package chapter05;

import java.util.Scanner;

/**
 *
 * 28/11/2017   7:15:06 AM
 *  
 * @author roman
 *
 *
 * Dec2Hex
 *
 */
public class InDec2Hex 
{

	/**
	 * @param args
	 */
	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a decimal number: ");
		int decimal = input.nextInt();
		int d = decimal;
		String hex = "";
		
		while (decimal != 0)
		{
			int hexValue = decimal % 16;
			char hexDigit = (hexValue <= 9 && hexValue >= 0) ? (char) (hexValue + '0') : (char) (hexValue - 10 + 'A');
			hex = hexDigit + hex;
			decimal /= 16;
		}
		
		System.out.println("The hex number for decimal " + d + " is " + hex);
		
		input.close();
	}

}
