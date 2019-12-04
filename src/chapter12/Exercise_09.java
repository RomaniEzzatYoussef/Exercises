package chapter12;

import java.util.Scanner;

/**
 *
 * 20/05/2019   10:02:06 PM
 *  
 * @author Romani Ezzat
 *
 *
 * Exercise_09
 *
 */
public class Exercise_09 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		try
		{
			Scanner input = new Scanner(System.in);
			System.out.print("Enter a binary string: ");
			String binaryStr = input.next();
			System.out.print("The decimal of " + binaryStr + " is " + bin2Dec(binaryStr));
			
			input.close();
		}
		catch (Exception ex)
		{
			System.out.println(ex.getMessage());
		}
	}
	
	public static int bin2Dec(String binaryString) throws BinaryFormatExeption
	{
		int value = convertBin2Dec(Character.getNumericValue(binaryString.charAt(binaryString.length() - 1)), 0);
		
		for (int i = binaryString.length() - 2; i >= 0; i--)
			value += convertBin2Dec(Character.getNumericValue(binaryString.charAt(i)), binaryString.length() - i - 1);
		
		return value;
	}
	
	public static int convertBin2Dec(int binary, int pow) throws BinaryFormatExeption
	{
		if (binary == 0)
			return 0;
		else if (binary == 1)
			return (int) Math.pow(2, pow);
		else
			throw new BinaryFormatExeption();
	}
}

class BinaryFormatExeption extends Exception 
{
	private static final long serialVersionUID = 1L;

	BinaryFormatExeption() 
	{
		super("Illegal binary character");
	}

	BinaryFormatExeption(String message) 
	{
	    super(message);
	}
}
