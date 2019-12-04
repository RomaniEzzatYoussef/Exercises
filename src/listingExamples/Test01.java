package listingExamples;

import java.util.Scanner;

/**
 *
 * 10/03/2019   7:11:30 AM
 *  
 * @author Romani Ezzat
 *
 *
 * Test01
 *
 */
public class Test01 
{

	/**
	 * @param args
	 */
	public static void main(String[] args) 
	{
		System.out.println(0B1111); // Displays 15
		System.out.println(07777); // Displays 4095
		System.out.println(0XFFFF); // Displays 65535
		System.out.println(0xFFFF);
		System.out.println(0b010010);
		
		
		
		double m = 2 , r = 6;
		
		double d = 1.0 * m * (r * r);
		System.out.println(d);
		
		
		
		System.out.println(Math.pow(2, 3.5));
		
		System.out.println("25 / 4 is " + 25 / 4);
		System.out.println("25 / 4.0 is " + 25 / 4.0);
		System.out.println("3 * 2 / 4 is " + 3 * 2 / 4);
		System.out.println("3.0 * 2 / 4 is " + 3.0 * 2 / 4);
		
		System.out.println(2 * (5 / 2 + 5 / 2));
		System.out.println(2 * 5 / 2 + 2 * 5 / 2);
		System.out.println(2 * (5 / 2));
		System.out.println(2 * 5 / 2);
		
		System.out.println(56 % 6 + " " +  78 % -4 + " " + -34 % 5 + " " + -34 % -5 + "  "+ 5 % 1 + " " + 1 % 5);
		
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the number of Today: ");
		int today = input.nextInt();
		
		System.out.print("Enter the number after: ");
		int daysAfter = input.nextInt();
		
		int dayAfter = (today + daysAfter) % 7;
		
		System.out.println("today " + today + " After " + daysAfter + " will be day " + dayAfter);
		
		input.close();
	}

}
