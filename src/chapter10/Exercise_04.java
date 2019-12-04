package chapter10;

import utilities.MyPoint;

/**
 * The MyPoint class
 * Design a class named MyPoint to represent a point with x- and y-coordinates. 
 * The class contains: 
 * The data fields x and y that represent the coordinates with getter methods. 
 * A no-arg constructor that creates a point (0, 0). 
 * A constructor that constructs a point with specified coordinates.
 * A method named distance that returns the distance from this point to a specified point of the MyPoint type.
 * A method named distance that returns the distance from this point to another point with specified x- and y-coordinates.
 * Write a test program that creates the two points (0, 0) and (10, 30.5) and displays the distance between them.
 */

public class Exercise_04 
{
	public static void main(String[] args)
	{
		MyPoint pointObj1 = new MyPoint();
		MyPoint pointObj2 = new MyPoint(45.1 , 74.6);
		System.out.print("Distance: " + pointObj1.distance(pointObj2));
		System.out.print("\nDistance: " + pointObj1.distance(pointObj1 , pointObj2));
		
	}
}
