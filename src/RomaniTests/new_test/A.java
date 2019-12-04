/**
 * 
 */
package RomaniTests.new_test;

import java.util.Scanner;

/**
 * @author romani
 *
 */
public class A 
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the score: ");
		int score = input.nextInt();
		
		if (score >= 90)
			System.out.println("A");
		else
			if (score >= 80)
				System.out.println("B");
			else
				if (score >= 70)
					System.out.println("C");
				else 
					if (score >= 60)
						System.out.println("D");
					else
						System.out.println("F");
		
		/*
		 *  equivalent to ===>
		
		if (score >= 90)
			System.out.println("A");
		else if (score >= 80)
			System.out.println("B");
		else if (score >= 70)
			System.out.println("C");
		else if (score >= 60)
			System.out.println("D");
		else
			System.out.println("F");
		
		*/
		
		input.close();
	}
}
