package chapter04;
/**
 * Generate vehicle plate numbers
 * Assume a vehicle plate number consists of three uppercase letters followed by four digits. 
 * Write a program to generate a plate number.
 *
 * 18/11/2017   11:35:41 PM
 *  
 * @author roman
 *
 *
 * Exercise_25
 *
 */
public class Exercise_25 {

	/**
	 * @param args
	 */
	public static void main(String[] args)
	{
		char c1 = (char) (Math.random() * 26 + 65);
		char c2 = (char) (Math.random() * 26 + 65);
		char c3 = (char) (Math.random() * 26 + 65);
		int digits = (int) (Math.random() * 9000 + 1000);
		
		System.out.print("" + c1 + c2 + c3 + "-" + digits);
	}

}
