package chapter03;

import java.util.Scanner;

/**
 * Geometry: point in a rectangle?
 * Write a program that prompts the user to enter a point (x, y) 
 * and checks whether the point is within the rectangle centered at (0, 0) with width 10 and height 5. 
 * For example, (2, 2) is inside the rectangle 
 * and (6, 4) is outside the rectangle, as shown in Figure 3.7b. 
 * (Hint: A point is in the rectangle if its horizontal distance to (0, 0) is less than or equal to 10 / 2 
 * and its vertical distance to (0, 0) is less than or equal to 5.0 / 2. Test your program to cover all cases.)
 * 
 * 12/10/2017   12:13:09 PM
 *  
 * @author Romani Ezzat
 *
 *
 * Exercise_23
 *
 */
public class Exercise_23 
{

	/**
	 * @param args
	 */
	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the coordinates: ");
		double x = input.nextDouble();
		double y = input.nextDouble();
		double xDistance = Math.pow(x * x, 0.5);
		double yDistance = Math.pow(y * y, 0.5);
		
		if ((xDistance < (5.0 / 2)) && (yDistance < (10 / 2)))
			System.out.print("(" + x + ", " + y + ") is in the rectangle");
		else
			System.out.print("(" + x + ", " + y + ") is not in the rectangle");
		
		input.close();
	}

}
