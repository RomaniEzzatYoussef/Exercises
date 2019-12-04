package chapter04;
/**
 * Random character
 * Write a program that displays a random uppercase letter using the Math.random() method.
 *
 * 18/11/2017   2:17:57 PM
 *  
 * @author roman
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
		int number = (int) (Math.random() * 26) + 65;
		
		System.out.print((char) number);
	}

}
