package chapter05;
/**
 * Conversion from kilograms to pounds and pounds to kilograms
 * Write a program that displays the following two tables side by side:
 * Kilograms 	Pounds 	| 	Pounds 	Kilograms 
 * 1 			2.2 	| 	20 		9.09 
 * 3 			6.6 	| 	25 		11.36 
 * ... 
 * 197 			433.4 	| 	510 	231.82 
 * 199 			437.8 	| 	515 	234.09
 * 
 * 29/11/2017   9:11:40 AM
 *  
 * @author roman
 *
 *
 * Exercise_05
 *
 */
public class Exercise_05 {

	/**
	 * @param args
	 */
	public static void main(String[] args) 
	{
		System.out.printf("%s %8s %5s %8s %12s \n", "Kilograms", "Pounds", "|", "Pounds", "Kilograms");
		
		int pounds = 20;
		for (int i = 1; i <= 199; i += 2)
		{
			System.out.printf("%-11d %-10.1f %-3s %-9d %.2f \n", i, (i * 2.2), "|", pounds, (pounds / 1.609));
			pounds += 5;
		}
	}

}
