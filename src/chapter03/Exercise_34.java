package chapter03;

import java.util.Scanner;

/**
 * Geometry: point on line segment
 * Programming Exercise 3.32 shows how to test whether a point is on an unbounded line. 
 * Revise Programming Exercise 3.32 to test whether a point is on a line segment. 
 * Write a program that prompts the user to enter the three points for p0, p1, and p2 
 * and displays whether p2 is on the line segment from p0 to p1.
 *
 * 31/10/2017   4:43:25 PM
 *  
 * @author Romani Ezzat
 *
 *
 * Exercise_34
 *
 */
public class Exercise_34 
{

	/**
	 * @param args
	 */
	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter the three points: ");
		double x0 = input.nextDouble();
		double y0 = input.nextDouble();
		double x1 = input.nextDouble();
		double y1 = input.nextDouble();
		double x2 = input.nextDouble();
		double y2 = input.nextDouble();
		
		double condition = (x1 - x0) * (y2 - y0) - (x2 - x0) * (y1 - y0);
		
		if ((condition < 0.01) && (x0 <= x2) && (x2 <= x1))
			System.out.print("It is on the line segment!");
		
		input.close();
	}

}
