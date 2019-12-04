package chapter11;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * 06/05/2019   6:12:49 PM
 *  
 * @author Romani Ezzat
 *
 *
 * Exercise_17
 *
 */
public class Exercise_17 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter an integer: ");
		int m = input.nextInt();
		
		ArrayList<Integer> factorList = findFactors(m);
		System.out.println("Factors of " + m + " are " + factorList.toString());
		
		int n = productOddNumbers(factorList);
		
		if (n != 0)
			System.out.print(" = " + n +
					"\nn = " + n +
					", m = " + m +
					"\nn * m = " + (n * m) + 
					"\nThe perfect square is " + Math.sqrt(n * m));
		else
			System.out.println("There is no perfect square.");
		input.close();
	}
	
	public static int productOddNumbers(ArrayList<Integer> factorList)
	{
		if (factorList.isEmpty())
			return 0;
		
		ArrayList<Boolean> oddFactorList = new ArrayList<>();
		int product = 1;
		
		for (int i = 0; i <= factorList.get(factorList.size() - 1); i++)
			oddFactorList.add(false);
			
		for (int i = 0; i < factorList.size(); i++)
			oddFactorList.set(factorList.get(i), !oddFactorList.get(factorList.get(i)));
		
		boolean noSquare = true;
		for (int i = 0; i < oddFactorList.size(); i++)
			if (oddFactorList.get(i) == true)
			{
				noSquare = false;
				break;
			}
		
		if (noSquare)
			return 0;
		
		System.out.print("The odd factors are: 1");
		for (int i = 2; i < oddFactorList.size(); i++)
			if (oddFactorList.get(i))
			{
				product *= i;
				System.out.print(" * " + i);
			}
		
		return product;
	}
	
	public static ArrayList<Integer> findFactors(int number)
	{
		int factors = 2;
		ArrayList<Integer> tempFactorList = new ArrayList<>();
		
		while (number != 1)
		{
			if (number % factors == 0)
			{
				tempFactorList.add(factors);
				number /= factors;
			}
			else
				factors++;
		}
		
		return tempFactorList;
	}
}
