package chapter04;

import java.util.Scanner;

/**
 *
 * 09/11/2017   6:35:36 AM
 *  
 * @author roman
 *
 *
 * ComputeAngles
 *
 */
public class FComputeAngles {

	/**
	 * @param args
	 */
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		System.out.print("Enter three points: ");
		double x1 = input.nextDouble();
		double y1 = input.nextDouble();
		double x2 = input.nextDouble();
		double y2 = input.nextDouble();
		double x3 = input.nextDouble();
		double y3 = input.nextDouble();
		
		
		double a = Math.sqrt((x2 - x3) * (x2 - x3) + (y2 - y3) * (y2 - y3));
		double b = Math.sqrt((x1 - x3) * (x1 - x3) + (y1 - y3) * (y1 - y3));
		double c = Math.sqrt((x1 - x2) * (x1 - x2) + (y1 - y2) * (y1 - y2));
		
		double A = Math.toDegrees(Math.cos((a * a - b * b - c * c) / (-2 * b * c)));
		double B = Math.toDegrees(Math.cos((b * b - a * a - c * c) / (-2 * a * c)));
		double C = Math.toDegrees(Math.cos((c * c - b * b - a * a) / (-2 * b * b)));
		
		System.out.println("The three angles are " + Math.round(A * 100) / 100.0 + " " +
				Math.round(B * 100) / 100.0 + " " + 
				Math.round(C * 100) / 100.0);
		
		
		
		input.close();
	}

}
