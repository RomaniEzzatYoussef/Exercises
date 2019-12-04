package chapter03;
/**
 *
 * Random point
 * Write a program that displays a random coordinate in a rectangle. 
 * The rectangle is centered at (0, 0) with width 100 and height 200.
 * 
 * 10/10/2017   3:26:28 PM
 *  
 * @author Romani Ezzat
 *
 *
 * Exercise_16
 *
 */
public class Exercise_16 {

	/**
	 * @param args
	 */
	public static void main(String[] args) 
	{
		int x = (int) (Math.random() * 51 * 2 - 50);
		int y = (int) (Math.random() * 101 * 2 - 100);
		
		System.out.print("Random rectangle coordinates: (" + x + ", " + y +").");
	}

}
