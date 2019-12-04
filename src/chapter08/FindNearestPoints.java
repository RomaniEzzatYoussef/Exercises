package chapter08;

import java.util.Scanner;

/**
 *
 * 07/12/2017   11:45:10 PM
 *  
 * @author roman
 *
 *
 * FindNearestPoints
 *
 */
public class FindNearestPoints {

	/**
	 * @param args
	 */
	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the number of points: ");
		int numPoints = input.nextInt();
		
		double[][] points = new double[numPoints][2];
		
		for (int r = 0; r < points.length; r++)
		{
			points[r][0] = Math.random() * 100;
			points[r][1] = Math.random() * 100;
		}
		
		int p1 = 0;
		int p2 = 1; // Initial two points
		double shortestDistance = distance(points[p1][0], points[p1][1], points[p2][0], points[p2][1]);
		
		for (int i = 0; i < points.length; i++) 
		{
			for (int j = i + 1; j < points.length; j++)
			{
				double distance = distance(points[i][0], points[i][1], points[j][0], points[j][1]);
				
				if (shortestDistance > distance) 
				{
					p1 = i; // Update p1
					p2 = j; // Update p2
					shortestDistance = distance;
				}
			}
		}
		
		System.out.println("The closest two points are " + "(" + points[p1][0] + ", " + points[p1][1] + ") and (" + points[p2][0] + ", " + points[p2][1] + ")");
		
		input.close();
	}
	
	public static double distance(double x1, double y1, double x2, double y2)
	{
		return Math.sqrt((x2 - x1) * (x2 - x1) + (y2 - y1) * (y2 - y1));
	}

}
