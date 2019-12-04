package chapter03;

import java.util.Scanner;

/**
 * Geometry: intersecting point
 * Two points on line 1 are given as (x1, y1) and (x2, y2) and on line 2 as (x3, y3) and (x4, y4), as shown in Figure 3.8a–b.
 * Write a program that prompts the user to enter four points and displays the intersecting point.
 * 
 * 12/10/2017   12:21:12 PM
 *  
 * @author Romani Ezzat
 *
 *
 * Exercise_25
 *
 */
public class Exercise_25 
{

	/**
	 * @param args
	 */
	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		System.out.print("Enter four points: ");
		double x1 = input.nextDouble();
		double y1 = input.nextDouble();
		double x2 = input.nextDouble();
		double y2 = input.nextDouble();
		double x3 = input.nextDouble();
		double y3 = input.nextDouble();
		double x4 = input.nextDouble();
		double y4 = input.nextDouble();
		
		double a = y1 - y2;
		double b = -(x1 - x2);
		double c = y3 - y4;
		double d = -(x3 - x4);
		double e = (y1 - y2) * x1 - (x1 - x2) * y1;
		double f = (y3 - y4) * x3 - (x3 - x4) * y3;
		
		double checkLinearEquation = (a * d) - (b * c);
		double x = ((e * d) - (b * f)) / checkLinearEquation;
		double y = ((a * f) - (e * c)) / checkLinearEquation;
		
		if (checkLinearEquation == 0)
			System.out.print("The two lines are parallel.");
		else
			System.out.print("(" + x + ", " + y + ")");
	
		input.close();
	}

}
