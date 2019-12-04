package chapter04;

import java.util.Scanner;

/**
 * Geometry: area of a regular polygon
 * A regular polygon is an n-sided polygon in which all sides are of the same length 
 * and all angles have the same degree (i.e., the polygon is both equilateral and equiangular).
 *
 * 18/11/2017   12:26:28 PM
 *  
 * @author romani
 *
 *
 * Exercise_05
 *
 */
public class Exercise_05 {

	/**
	 * @param args
	 */
	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the number of sides: ");
		int n = input.nextInt();
		
		System.out.print("Enter the length of the side: ");
		double s = input.nextDouble();
		
		double area = (n * Math.pow(s, 2)) / (4 * Math.tan(Math.PI / n));
		System.out.printf("The area of the polygon is: %.2f", area );
		
		input.close();
	}

}
