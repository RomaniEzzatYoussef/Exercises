package chapter03;

import java.util.Scanner;

/**
 * Geometry: points in triangle?
 * Suppose a right triangle is placed in a plane as shown below. 
 * The right-angle point is placed at (0, 0), and the other two points are placed at (200, 0), 
 * and (0, 100). Write a program that prompts the user to enter a point with x- and y-coordinates 
 * and determines whether the point is inside the triangle.
 *
 * 12/10/2017   3:08:55 PM
 *  
 * @author Romani Ezzat
 *
 *
 * Exercise_27
 *
 */
public class Exercise_27 {

	/**
	 * @param args
	 */
	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		System.out.print("Enter x y coordinates: ");
		double x = input.nextDouble();
		double y = input.nextDouble();
		
		double y1 = y - x * 0.5;
		
		if (y1 < 100)
			System.out.print("The points are in the triangle");
		
		else
			System.out.print("The points are not in the triangle");
		
		input.close();
	}

}
