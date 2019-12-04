package chapter05;

import java.util.Random;
import java.util.Scanner;

/**
 * Game: lottery
 * Generate a lottery of a two digit number. 
 * The two digits in the number are distinct. 
 * (Hint: Generate the first digit. Use a loop to continuously generate the second digit until it is different from the first digit.)
 * 
 * 30/11/2017   7:58:41 AM
 *  
 * @author roman
 *
 *
 * Exercise_32
 *
 */
public class Exercise_32 {

	/**
	 * @param args
	 */
	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		Random randNum = new Random();
		
		int num1 = randNum.nextInt(10);
		int num2 = randNum.nextInt(10);
		
		while (num1 == num2)
			num2 = randNum.nextInt(10);
		
		System.out.print("Lottery number: " + num1 + num2);
		
		input.close();
	}

}
