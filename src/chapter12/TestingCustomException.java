package chapter12;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * 07/05/2019   9:36:12 PM
 *  
 * @author Romani Ezzat
 *
 *
 * TestingCustomException
 *
 */
public class TestingCustomException 
{

	/**
	 * @param args
	 */
	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		ArrayList<CustomExceptionCircle> c = new ArrayList<>();
		try
		{
			for (int i = 0; i < 10; i++)
			{
				System.out.print("enter your radius for circle " + (i + 1) + ": ");
				c.add(new CustomExceptionCircle(input.nextDouble()));
			}
				
		}
		
		catch(InvalidRadiusException ex) {
			System.out.println(ex.getMessage());
		}
		finally {
			System.out.println("Finally clause Still Here");
		}
		
		for (int i = 0; i < c.size(); i++)
			System.out.print("circle " + (i + 1) + ": radius is " + c.get(i).getRadius() + " with area: " + c.get(i).finArea() + "\n");
		
		System.out.println("Number of objects created: " + CustomExceptionCircle.getNumberOfObjects());
		
		input.close();
	}

}

class CustomExceptionCircle
{

	private double radius;
	private static int numberOfObjects = 0;
	
	public CustomExceptionCircle() throws InvalidRadiusException {
		this(1.0);
	}
	
	public CustomExceptionCircle(double radius) throws InvalidRadiusException{
		setRadius(radius);
		numberOfObjects++;
	}

	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) throws InvalidRadiusException{
		if (radius >= 0)
			this.radius = radius;
		else
			throw new InvalidRadiusException(radius);
	}
	
	public double finArea()
	{
		return radius * radius * Math.PI;
	}

	public static int getNumberOfObjects() {
		return numberOfObjects;
	}


}
