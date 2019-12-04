package chapter05;

import java.util.Scanner;

/**
 *
 * 27/11/2017   12:33:14 PM
 *  
 * @author roman
 *
 *
 * GreatestCommonDivisorer
 *
 */
public class GreatestCommonDivisorer {

	/**
	 * @param args
	 */
	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		System.out.print("Enter first integer: ");
		int n1 = input.nextInt();
		
		System.out.print("Enter second integer: ");
		int n2 = input.nextInt();
		
		int gcd = 1;
		
		for (int k = 2; k <= n1 && k <= n2; k++)
			if (n1 % k == 0 && n2 % k == 0)
				gcd = k;
		
		System.out.println("The greatest common divisor for " + n1 + " and " + n2 + " is " + gcd);
		
		input.close();
	}

}
