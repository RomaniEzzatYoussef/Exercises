package chapter06;

import java.util.Scanner;

/**
 * Geometry: area of a regular polygon
 * A regular polygon is an n-sided polygon in which all sides are of the same length and all angles have the same degree 
 * (i.e., the polygon is both equilateral and equiangular). 
 * Write a method that returns the area of a regular polygon using the following header: 
 * public static double area(double side) 
 * Write a main method that prompts the user to enter the number of sides and the 
 * side of a regular polygon and displays its area.
 *
 * 02/12/2017   1:35:56 PM
 *  
 * @author roman
 *
 *
 * Exercise_36
 *
 */
public class Exercise_36 {

	/**
	 * @param args
	 */
	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the side of the polygon: ");
		System.out.print("The area of the polygon is " + area(input.nextDouble()));
		
		input.close();		
	}
	
	public static double area(double side)
	{
		return (5 * Math.pow(side, 2))/ (4 * Math.tan(Math.PI / 5));
	}
}
