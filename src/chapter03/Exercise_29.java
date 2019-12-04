package chapter03;

import java.util.Scanner;

/**
 * Geometry: two circles
 * Write a program that prompts the user to enter the center coordinates and radii of two circles 
 * and determines whether the second circle is inside the first or overlaps with the first, as shown in Figure 3.10. 
 * (Hint: circle2 is inside circle1 if the distance between the two centers 6 = |r1 - r2| 
 * and circle2 overlaps circle1 if the distance between the two centers <= r1 + r2. 
 * Test your program to cover all cases.)
 * 
 * 19/10/2017   7:53:18 AM
 *  
 * @author Romani Ezzat
 *
 *
 * Exercise_29
 *
 */
public class Exercise_29 
{

	/**
	 * @param args
	 */
	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the coordinates and the radii for the first circle: ");
		double x1 = input.nextDouble();
		double y1 = input.nextDouble();
		double radii1 = input.nextDouble();
		
		System.out.print("Enter the coordinates and the radii for the second circle: ");
		double x2 = input.nextDouble();
		double y2 = input.nextDouble();
		double radii2 = input.nextDouble();
		
		double distance = Math.pow(((x1 - x2) * (x1 - x2)) + ((y1 - y2) * (y1 - y2)), 0.5);
		
		if (distance + radii2 <= radii1)
			System.out.print("Circle 2 inside Circle 1");
		else if (distance <= radii1 + radii2)
			System.out.print("Circle 2 overlaps Circle 1");
		else
			System.out.print("There are no overlaps");
		
		input.close();
	}

}
