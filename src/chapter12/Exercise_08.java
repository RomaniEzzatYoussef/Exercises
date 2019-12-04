package chapter12;

import java.util.Scanner;

/**
 *
 * 20/05/2019   9:44:20 PM
 *  
 * @author Romani Ezzat
 *
 *
 * Exercise_08
 *
 */
public class Exercise_08 {

	/**
	 * @param args
	 */
	public static void main(String[] args) 
	{
		try 
		{
			Scanner input = new Scanner(System.in);
			System.out.print("Enter a hexadecimal value: ");
			String hex = input.next().toUpperCase();
			System.out.print("The hexadecimal value of " + hex + " is " + hex2Dec(hex) + ".");
			
			input.close();
		}
		catch (Exception ex)
		{
			System.out.print(ex.getMessage());
		}
	}
	
	public static int hex2Dec(String hexString) throws HexFormatException 
	{
		int value = convertHexToDec(hexString.charAt(0));
		
	    for (int i = 1; i < hexString.length(); i++) 
	      value = value * 16 + convertHexToDec(hexString.charAt(i));

	    return value;
	  }

	  static int convertHexToDec(char ch) throws HexFormatException 
	  { 
		  if (ch >= 'A' && ch <= 'F')
				return 10 + ch - 'A';
			else if (ch >= '0' && ch <= '9')
				return ch - '0';
			else
				throw new HexFormatException(ch + " is not a hexadecimal value.");    
	  }
}

class HexFormatException extends Exception 
{
	private static final long serialVersionUID = 1L;

	public HexFormatException() 
	{
		super("Illegal hex character");		  
	}

	public HexFormatException(String message) 
	{
		super(message);
	}
}
