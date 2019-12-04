package chapter07;

import java.util.Scanner;

/**
 *
 * 03/12/2017   11:11:40 AM
 *  
 * @author roman
 *
 *
 * Test_03
 *
 */
public class Test_03 
{

	/**
	 * @param args
	 */
	public static void main(String[] args) 
	{
		double[] myList = new double[10];
		
		Scanner input = new Scanner(System.in);
		System.out.print("Enter " + myList.length + " Values: ");
		
		/*for (double e : myList)
			e = input.nextDouble();
		
		for (double e : myList)
			e = Math.random() * 100 + 1;*/
		
		for (int i = 0; i < myList.length; i++)
			myList[i] = Math.random() * 100 + 1;
		
		// For each loop is just using to display array or sum it;
		for (double e : myList)
			System.out.println(e);
		
		double sum = 0;
		for(double e : myList)
			sum += e;
		
		System.out.println("sum is " + sum);
		
		input.close();
		
	}

}
