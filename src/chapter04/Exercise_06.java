package chapter04;
/**
 * Random points on a circle
 * Write a program that generates three random points on a circle centered at (0, 0) with radius 40 
 * and display three angles in a triangle formed by these three points, as shown in Figure 4.7a. 
 * (Hint: Generate a random angle a in radians between 0 and 2pi, as shown in Figure 4.7b 
 * and the point determined by this angle is (r*cos(a), r*sin(a)).)
 *
 * 18/11/2017   12:34:58 PM
 *  
 * @author romani
 *
 *
 * Exercise_06
 *
 */
public class Exercise_06 {

	/**
	 * @param args
	 */
	public static void main(String[] args) 
	{
		int radius = 40;
		double theta = Math.random() * 2 * Math.PI;
		double x = radius * Math.cos(theta);
		double y = radius * Math.sin(theta);
		
		System.out.println("(" + x + "," + y + ")");
		
		theta = Math.random() * 2 * Math.PI;
		x = radius * Math.cos(theta);
		y = radius * Math.sin(theta);
		System.out.println("(" + x + "," + y + ")");
		
		theta = Math.random() * 2 * Math.PI;
		x = radius * Math.cos(theta);
		y = radius * Math.sin(theta);
		System.out.print("(" + x + "," + y + ")");
	}

}
