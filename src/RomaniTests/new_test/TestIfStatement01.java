/**
 * 
 */
package RomaniTests.new_test;

import java.util.Scanner;

/**
 * @author romani
 *
 */
public class TestIfStatement01
{

	/**
	 * @param args
	 */
	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the number: ");
		int number = input.nextInt();
		
		if (number % 2 == 0)
			System.out.println(number + " is even");
		
		else if (number % 5 == 0)
			System.out.println(number + " is multiple of 5");
		
		System.out.println("----------------------------------------");
		
		if (number % 2 == 0)
			System.out.println(number + " is even");
		
		if (number % 5 == 0)
			System.out.println(number + " is multiple of 5");
		
		
		input.close();

	}

}
