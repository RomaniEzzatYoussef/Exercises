package chapter02;
/**
 * Print a table
 * Write a program that displays the following table. Cast floating point numbers into integers.
 * a b pow(a, b)
 * 1 2 1
 * 2 3 8
 * 3 4 81
 * 4 5 1024
 * 5 6 15625
 */

public class Exercise_18 
{
	public static void main(String[] args)
	{
		float a = 1;
		float b = 2;
		
		System.out.print("a b pow(a, b)"
				+ "\n" + (int) a + ' ' + (int) b + ' ' + (int) Math.pow(a, b)
				+ "\n" + (int) ++a + ' ' + (int) ++b + ' ' + (int) Math.pow(a, b)
				+ "\n" + (int) ++a + ' ' + (int) ++b + ' ' + (int) Math.pow(a, b)
				+ "\n" + (int) ++a + ' ' + (int) ++b + ' ' + (int) Math.pow(a, b)
				+ "\n" + (int) ++a + ' ' + (int) ++b + ' ' + (int) Math.pow(a, b));
	}

}
