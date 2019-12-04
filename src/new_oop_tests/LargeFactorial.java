package new_oop_tests;

import java.math.BigInteger;

public class LargeFactorial 
{
	public static void main(String[] args) 
	{
		System.out.println("50! is \n" + factorial(50));
		
		
		java.math.BigInteger x = new java.math.BigInteger("3");
		java.math.BigInteger y = new java.math.BigInteger("7");
		java.math.BigInteger z = x.add(y);
		System.out.println("x is " + x);
		System.out.println("y is " + y);
		System.out.println("z is " + z);
		
		
		String[] tokens = "Java HTML Perl".split(" ");
		
		for (int i = 0; i < tokens.length; i++)
			System.out.print(tokens[i] + " ");
		
	}

	public static BigInteger factorial(long n) 
	{
		BigInteger result = BigInteger.ONE;
		for (int i = 1; i <= n; i++)
			result = result.multiply(new BigInteger(i+""));

		return result; 
	}
}