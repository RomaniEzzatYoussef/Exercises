package chapter12;

import java.util.Scanner;

/**
 *
 * 16/05/2019   6:34:50 AM
 *  
 * @author Romani Ezzat
 *
 *
 * Exercise_07
 *
 */
public class Exercise_07 {

	/**
	 * @param args
	 */
	public static void main(String[] args) 
	{
		try
		{
			Scanner input = new Scanner(System.in);
			System.out.print("Enter a binay string: ");
			String binaryStr = input.next();
			System.out.print("The decimal of " + binaryStr + " is " + bin2dec(binaryStr));
			input.close();

		}
		
		catch (Exception e) 
		{
			System.out.println(e.getMessage());
		}
		

	}

	public static int bin2dec(String binaryStr)
	{
		int value = convertBin2Dec(Character.getNumericValue(binaryStr.charAt(binaryStr.length() - 1)), 0);
		
		for (int i = binaryStr.length()-2; i >= 0; i--)
			value += convertBin2Dec(Character.getNumericValue(binaryStr.charAt(i)), binaryStr.length() - i -1);
		
		return value;
	}
	
	public static int convertBin2Dec(int binary, int pow)
	{
		if (binary == 0)
			return 0;
		else if (binary == 1)
			return (int) Math.pow(2, pow);
		else
			throw new NumberFormatException(binary + " is not a binary.");
	}
}
