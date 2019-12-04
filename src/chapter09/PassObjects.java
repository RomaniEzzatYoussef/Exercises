package chapter09;

import java.util.Scanner;

/**
 *
 * 28/12/2017   9:17:51 PM
 *  
 * @author roman
 *
 *
 * PassObjects
 *
 */
public class PassObjects {

	/**
	 * @param args
	 */
	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a value for radius: ");
		Circle c = new Circle(input.nextInt());
		
		int n = 5;
		printAreas(c , n);
		
		System.out.println("\n" + "Radius is " + c.getRadius());
		System.out.print("n is " + n);
		
		input.close();
	}
	
	public static void printAreas(Circle c , int n)
	{
		System.out.println("Radius \t\t Area");
		
		while (n > 0)
		{
			System.out.println(c.getRadius() + " \t\t " + c.getArea());
			c.setRadius(c.getRadius() + 1);
			n--;
		}
	}

}
