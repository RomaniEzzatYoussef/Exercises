package chapter05;
/**
 * Conversion from miles to kilometers
 * Write a program that displays the following table (note that 1 mile is 1.609 kilometers): 
 * Miles 	Kilometers 
 * 1 		1.609 
 * 2 		3.218 
 * ... 
 * 9 		14.481 
 * 10 		16.090
 *
 * 29/11/2017   9:03:04 AM
 *  
 * @author roman
 *
 *
 * Exercise_04
 *
 */
public class Exercise_04 {

	/**
	 * @param args
	 */
	public static void main(String[] args) 
	{
		System.out.printf("%-10s %-10s \n", "Miles", "Kilometers");
		
		for (int i = 1; i <= 10; i++)
		{
			System.out.printf("%-10d %-10.3f \n", i, (i * 1.609));
		}
	}

}
