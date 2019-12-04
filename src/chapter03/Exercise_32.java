package chapter03;

import java.util.Scanner;

/**
 * Geometry: point position
 * Write a program that prompts the user to enter the three points for p0, p1, and p2 
 * and displays whether p2 is on the left of the line from p0 to p1, on the right, or on the same line.
 *
 * 31/10/2017   3:40:07 PM
 *  
 * @author Romani Ezzat
 *
 *
 * Exercise_32
 *
 */
public class Exercise_32 
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
		
		if (condition > 0)
			System.out.print("p2 is on the left side of the line");
		else if (condition == 0)
			System.out.print("p2 is on the same line");
		else
			System.out.print("p2 is on the right side of the line");
		
		input.close();
	}

}
