package chapter11;

import java.util.Scanner;

/**
 *
 * 06/05/2019   6:06:05 PM
 *  
 * @author Romani Ezzat
 *
 *
 * Exercise_15
 *
 */
public class Exercise_15 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		System.out.println("Enter number of points in the polygon:");
		int points = input.nextInt();
		double[] xpoints = new double[points];
		double[] ypoints = new double[points];
		
		System.out.println("Enter the " + points + " points in the polygon clockwise:");
		
		for(int i = 0; i < points; i++)
		{
			System.out.print("x-coordinate: ");
			xpoints[i] = input.nextDouble();
			System.out.print("y-coordinate: ");
			ypoints[i] = input.nextDouble();
		}
		
        double sum = 0.0;
        for (int i = 0; i < points; i++) 
        {	
        	if(i == points - 1)
        		sum = sum + (xpoints[i] * ypoints[0]) - (ypoints[i] * xpoints[0]);
        	else
        		sum = sum + (xpoints[i] * ypoints[i+1]) - (ypoints[i] * xpoints[i+1]);
        }
        System.out.println("The area of the polygon is " + (Math.abs(sum) * .5));
		
        input.close();
	}
}
