package chapter03;

import java.util.Scanner;

/**
 * Geometry: two rectangles
 * Write a program that prompts the user to enter the center x-, y-coordinates, width, 
 * and height of two rectangles and determines whether the second rectangle is inside the first or overlaps with the first, 
 * as shown in Figure 3.9.
 *
 * 12/10/2017   3:14:21 PM
 *  
 * @author Romani Ezzat
 *
 *
 * Exercise_28
 *
 */
public class Exercise_28 
{

	/**
	 * @param args
	 */
	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the x y coordinates and the width and height: ");
		double x1 = input.nextDouble();
		double y1 = input.nextDouble();
		double width1 = input.nextDouble();
		double height1 = input.nextDouble();
		
		System.out.print("Enter the x y coordinates and the width and height: ");
		double x2 = input.nextDouble();
		double y2 = input.nextDouble();
		double width2 = input.nextDouble();
		double height2 = input.nextDouble();
		
		double xDistance;
		double yDistance;
		
		if (x1 > x2)
			xDistance = x1 - x2;
		else
			xDistance = x2 - x1;
		
		if (y1 > y2)
			yDistance = y1 - y2;
		else
			yDistance = y2 - y1;
		
		if ((xDistance <= (width1 - width2) / 2) && (yDistance <= (height1 - height2) / 2))
			System.out.print("Rectangle 1 overlaps Rectangle 2");
		else if ((xDistance <= (width1 + width2) / 2) && (yDistance <= (height1 + height2) / 2))
			System.out.print("Rectangle 2 overlaps Rectangle 1");
		else
			System.out.print("There are no overlaps.");
		input.close();
	}

}
