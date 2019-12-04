package RomaniTests.new_oop_tests;

import java.util.Date;
import java.util.Random;
import java.util.Scanner;

import javafx.geometry.Point2D;

public class TeatPoint2D 
{
	public static void main(String[] args)
	{
		Date d = new Date();
		System.out.println("current date is: " + d.toString());
		
		Random r = new Random(1);
		System.out.println(r.nextInt(1000));
		
		Random random1 = new Random(3);
		System.out.print("From random1: ");
		for (int i = 0; i < 10; i++)
			System.out.print(random1.nextInt(1000) + " ");
		
		Random random2 = new Random(3);
		System.out.print("\nFrom random2: ");
		for (int i = 0; i < 10; i++)
			System.out.print(random2.nextInt(1000) + " ");
		
		System.out.println("\n-------------------------------------------------------");
		
		Scanner input = new Scanner(System.in);
		System.out.print("Enter point1's x-, y-coordinates: ");
	    double x1 = input.nextDouble();
	    double y1 = input.nextDouble();
	    
	    System.out.print("Enter point2's x-, y-coordinates: ");
	    double x2 = input.nextDouble();
	    double y2 = input.nextDouble();

	    Point2D p1 = new Point2D(x1, y1); 
	    Point2D p2 = new Point2D(x2, y2);
	    
	    System.out.println("p1 is " + p1.toString());
	    System.out.println("p2 is " + p2.toString());
	    System.out.println("The distance between p1 and p2 is " + p1.distance(p2));
	    System.out.println("The midpoint between p1 and p2 is " + p1.midpoint(p2).toString());
	
	    input.close();
	}
}

