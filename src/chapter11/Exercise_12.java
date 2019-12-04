package chapter11;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * 06/05/2019   5:45:54 PM
 *  
 * @author Romani Ezzat
 *
 *
 * Exercise_12
 *
 */
public class Exercise_12 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		ArrayList<Double> list = new ArrayList<>();
		
		System.out.print("Enter 5 numbers: ");
		for (int i = 0; i < 5; i++)
			list.add(input.nextDouble());
		
		System.out.print("The sum is: " + sum(list));
		
		input.close();
	}
	
	public static double sum(ArrayList<Double> list) 
	{
		if (list.isEmpty())
			return 0d;
		
		double sum = 0;
		
		for (int i = 0; i < list.size(); i++)
			sum += list.get(i);
		
		return sum;
	}
}
