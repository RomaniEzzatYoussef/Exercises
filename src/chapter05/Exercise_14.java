package chapter05;

import java.util.Scanner;

/**
 * Compute the greatest common divisor
 * Another solution for Listing 5.9 to find the greatest common divisor of two integers n1 and n2 is as follows: 
 * First find d to be the minimum of n1 and n2, then check whether d, d-1, d-2, . . . , 2, 
 * or 1 is a divisor for both n1 and n2 in this order. 
 * The first such common divisor is the greatest common divisor for n1 and n2. 
 * Write a program that prompts the user to enter two positive integers and displays the gcd.
 * 
 * 29/11/2017   6:55:42 PM
 *  
 * @author roman
 *
 *
 * Exercise_14
 *
 */
public class Exercise_14 {

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
		
		int d;
		
		if (n1 < n2)
			d = n1;
		else
			d = n2;
		
		while (!(n1 % d == 0 && n2 % d == 0))
			d--;
		
		System.out.println("GCD: " + d);
		
		
		
		{
			int gcd = 1;
			
			for (int k = 2; k <= n1 && k <= n2; k++)
				if (n1 % k == 0 && n2 % k == 0)
					gcd = k;
			
			System.out.println("The greatest common divisor for " + n1 + " and " + n2 + " is " + gcd);
		}
		
		
		
		input.close();
	}

}
