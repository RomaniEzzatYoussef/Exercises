package chapter06;

import java.util.Scanner;

/**
 *
 * 01/12/2017   8:19:55 AM
 *  
 * @author roman
 *
 *
 * GreatestCommonDivisorMethod
 *
 */
public class GreatestCommonDivisorMethod {

	/**
	 * @param args
	 */
	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		System.out.print("Enter number1 and number2: ");
		int n1 = input.nextInt();
		int n2 = input.nextInt();
		
		System.out.println("The greatest common divisor for " + n1 + " and " + n2 + " is " + gcd(n1, n2));
		
		
		input.close();
	}
	
	public static int gcd(int n1 , int n2)
	{
		int gcd = 1;
		for (int i = 2; i <= n1 && i <= n2; i++)
			if (n1 % i == 0 && n2 % i == 0)
				gcd = i;
		
		return gcd;
				
	}

}
