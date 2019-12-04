package chapter05;

import java.util.Scanner;

/**
 *
 * 28/11/2017   9:53:01 AM
 *  
 * @author roman
 *
 *
 * Test_06
 *
 */
public class Test_06 
{

	/**
	 * @param args
	 */
	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		{
			System.out.print("Enter a value for n: ");
			int n = input.nextInt();
			
			int factor = 2;
			
			while (factor <= n && n % factor != 0)
				factor++;
			
			System.out.println("The smallest factor other than 1 for " + n + " is " + factor);
		}
		
		{
			System.out.print("Enter a value for n: ");
			int n = input.nextInt();
			
			boolean found = false;
			int factor = 2;
			
			while (factor <= n && !found)
			{
				if (n % factor == 0)
					found = true;
				else
					factor++;
			}
			
			System.out.println("The smallest factor other than 1 for " + n + " is " + factor);
		}
		
		System.out.print("Enter a value for n: ");
		int n = input.nextInt();
		
		int factor = 2;
		
		while (factor <= n)
		{
			if (n % factor == 0)
				break;
			
			factor++;
		}
		
		System.out.println("The smallest factor other than 1 for " + n + " is " + factor);
		
		input.close();
	}

}
