package chapter04;

import java.util.Scanner;

/**
 * Geometry: great circle distance
 * The great circle distance is the distance between two points on the surface of a sphere. 
 * Let (x1, y1) and (x2, y2) be the geographical latitude and longitude of two points.
 * Write a program that prompts the user to enter the latitude and longitude of two points on the earth in degrees 
 * and displays its great circle distance. The average earth radius is 6,371.01 km. 
 * Note that you need to convert the degrees into radians using the Math.toRadians method 
 * since the Java trigonometric methods use radians. The latitude and longitude degrees in the formula are for north and west. 
 * Use negative to indicate south and east degrees.
 *
 * 18/11/2017   10:59:57 AM
 *  
 * @author roman
 *
 *
 * Exercise_02
 *
 */
public class Exercise_02 {

	/**
	 * @param args
	 */
	public static void main(String[] args) 
	{
		final double AVERAGE_EARTH_RADIUS = 6371.01;
		
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the coordinates for the first point: ");
		double x1 = input.nextDouble();
		double y1 = input.nextDouble();
		
		System.out.print("Enter the coordinates for the second point: ");
		double x2 = input.nextDouble();
		double y2 = input.nextDouble();
		
		double d = AVERAGE_EARTH_RADIUS * Math.acos(Math.sin(Math.toRadians(x1)) * 
													Math.sin(Math.toRadians(x2)) * 
													Math.cos(Math.toRadians(x1)) * 
													Math.cos(Math.toRadians(x2)) * 
													Math.cos(Math.toRadians(y1 - y2)));
		
		System.out.print("The distance is " + d);
		
		input.close();
	}

}
