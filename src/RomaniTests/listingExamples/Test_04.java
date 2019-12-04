package RomaniTests.listingExamples;

import java.util.Scanner;

/**
 *
 * 12/03/2019   1:13:16 PM
 *  
 * @author Romani Ezzat
 *
 *
 * Test_04
 *
 */
public class Test_04 
{

	/**
	 * @param args
	 */
	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a double: ");
		double x = input.nextDouble();
		double y = input.nextDouble();
		double z = input.nextDouble();
		System.out.println("(x < y && y < z) is " + (x < y && y < z));
		System.out.println("(x < y || y < z) is " + (x < y || y < z));
		System.out.println("!(x < y) is " + !(x < y));
		System.out.println("(x + y < z) is " + (x + y < z));
		System.out.println("(x + y > z) is " + (x + y > z));
		
		
		System.out.println("Enter an integer: ");
		int x1 = input.nextInt();;
		input.close();
		
		if ((x1 >= 50) && (x1 <= 100))
			System.out.println("true value...");
		else
			System.out.println("false value...");
		
		
		if ((x1 != 1) == !(x1 == 1))
			System.out.println("On...");
		else
			System.out.println("Off...");
	}

}
