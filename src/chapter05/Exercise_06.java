package chapter05;
/**
 * Conversion from miles to kilometers
 * Write a program that displays the following two tables side by side:
 * Miles 	Kilometers 	| 	Kilometers 	Miles 
 * 1 		1.609 		| 	20 			12.430 
 * 2 		3.218 		| 	25 			15.538 
 * ... 
 * 9 		14.481 		| 	60 			37.290 
 * 10 		16.090 		| 	65 			40.398
 *
 * 29/11/2017   9:22:55 AM
 *  
 * @author roman
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
		System.out.printf("%s %12s %3s %8s %7s \n", "Miles", "Kilometers", "|", " Kilometers", "Miles");
		
		int kilometer = 20;
		for (int i = 1; i <= 10; i++)
		{
			System.out.printf("%-7d %-12.3f %-2s %-12d %.3f \n", i, (i * 1.609), "|", kilometer, (kilometer / 1.609));
			kilometer += 5;
		}
	}

}
