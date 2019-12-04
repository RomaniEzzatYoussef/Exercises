package chapter12.textInputOutput;

import java.util.Scanner;

/**
 *
 * 08/05/2019   6:16:46 PM
 *  
 * @author Romani Ezzat
 *
 *
 * Test_02
 *
 */
public class Test_02 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter: ");
		int intValue = input.nextInt();
		double doubleValue = input.nextDouble();
		String line = input.next();
		
		System.out.println(intValue + " " + doubleValue + " " + line);
	}

}
