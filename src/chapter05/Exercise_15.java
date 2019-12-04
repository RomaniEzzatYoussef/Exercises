package chapter05;
/**
 * Display the ASCII character table
 * Write a program that prints the characters in the ASCII character table from ! to ~. 
 * Display ten characters per line. 
 * The ASCII table is shown in Appendix B. 
 * Characters are separated by exactly one space.
 *
 * 29/11/2017   7:19:21 PM
 *  
 * @author roman
 *
 *
 * Exercise_15
 *
 */
public class Exercise_15 {

	/**
	 * @param args
	 */
	public static void main(String[] args) 
	{
		int counter = 0;
		
		for (int i = (int) '!'; i <= (int)'~'; i++)
		{
			counter++;
			
			if (counter % 10 == 0)
				System.out.println((char) i +" ");
			else
				System.out.print((char) i +" ");
		}
	}

}
