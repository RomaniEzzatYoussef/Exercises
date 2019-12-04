package chapter09;

import java.util.Date;
import java.util.Random;
import java.util.Scanner;

import javafx.geometry.Point2D;

/**
 *
 * 14/12/2017   6:01:58 PM
 *  
 * @author roman
 *
 *
 * Test_01
 *
 */
public class Test_01 {

	/**
	 * @param args
	 */
	public static void main(String[] args) 
	{
		// Date Class
		System.out.println("Date 's getTime() method is " + new Date().getTime());
		System.out.println("Date 's toString() method is " + new Date().toString());
		System.out.println("Date 's toString() method is " + new Date(533333333).toString());
		
		
		// Random Class
		Random random1 = new Random(3);
		System.out.print("From random1: ");
		for (int i = 0; i < 10; i++)
			System.out.print(random1.nextInt(1000) + " ");
		
		Random random2 = new Random(3);
		System.out.print("\nFrom random2: ");
		for (int i = 0; i < 10; i++)
			System.out.print(random2.nextInt(1000) + " ");
		
		System.out.println();
		
		// Point2D Class
		Scanner input = new Scanner(System.in);
		System.out.print("Enter point1's x-, y-coordinates: ");
		double x1 = input.nextDouble();
		double y1 = input.nextDouble();
		
		System.out.print("Enter point2's x-, y-coordinates: ");
		double x2 = input.nextDouble();
		double y2 = input.nextDouble();
		
		Point2D p1 = new Point2D(x1 , y1);
		Point2D p2 = new Point2D(x2 , y2);
		
		System.out.println("p1 is " + p1.toString());
		System.out.println("p2 is " + p2.toString());
		System.out.println("The distance between p1 and p2 is " + p1.distance(p2));
		
		input.close();
	}

}
