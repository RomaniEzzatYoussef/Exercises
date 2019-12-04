package chapter12;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * 07/05/2019   6:53:36 PM
 *  
 * @author Romani Ezzat
 *
 *
 * CircleWithExceptions
 *
 */
public class CircleWithExceptions 
{

	/**
	 * @param args
	 */
	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		ArrayList<Circle> c = new ArrayList<>();
		try
		{
			for (int i = 0; i < 10; i++)
			{
				System.out.print("enter your radius for circle " + (i + 1) + ": ");
				c.add(new Circle(input.nextDouble()));
			}
				
		}
		catch(IllegalArgumentException ex) {
			System.out.println(ex.getMessage());
		}
		finally {
			System.out.println("We Still Here");
		}
		
		for (int i = 0; i < c.size(); i++)
			System.out.print("circle " + (i + 1) + ": radius is " + c.get(i).getRadius() + " with area: " + c.get(i).finArea() + "\n");
		
		System.out.println("Number of objects created: " + Circle.getNumberOfObjects());
		
		input.close();
	}

}

class Circle
{
	private double radius;
	private static int numberOfObjects = 0;
	
	public Circle()
	{
		
	}
	
	public Circle(double radius)
	{
		setRadius(radius);
		numberOfObjects++;
	}

	public double getRadius() 
	{
		return radius;
	}

	public void setRadius(double radius) throws IllegalArgumentException 
	{
		if (radius >= 0)
			this.radius = radius;
		else
			throw new IllegalArgumentException("Radius cannot be negative");
	}

	public static int getNumberOfObjects()
	{
		return numberOfObjects;
	}
	
	public double finArea()
	{
		return radius * radius * Math.PI;
	}
}
