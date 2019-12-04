package chapter03;

import java.util.Scanner;

/**
 * Algebra: solve 2 x 2 linear equations
 * Write a program that prompts the user to enter a, b, c, d, e, and f and displays the result. 
 * If ad - bc is 0, report that “The equation has no solution.”
 * ax + by = e
 * cx + dy = f
 * x = (ed - bf)/(ad - bc)
 * y = (af - ec)/(ad - bc)
 */

public class Exercise_03 
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the values for a, b, c, d, e, and f: ");
		double a = input.nextDouble();
		double b = input.nextDouble();
		double c = input.nextDouble();
		double d = input.nextDouble();
		double e = input.nextDouble();
		double f = input.nextDouble();
		
		double x = ((e * d) - (b * f)) / ((a * d) - (b * c));
		double y = ((a * f) - (e * c)) / ((a * d) - (b * c));
		double checkSolution = (a * d) - (b * c);
		
		if (checkSolution == 0)
		{
			System.out.print("The equation has no solution.");
		}
		else
		{
			System.out.print(x + " " + y);
		}
		
		input.close();
	}
}
