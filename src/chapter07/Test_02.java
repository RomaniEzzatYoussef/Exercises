package chapter07;

import java.util.Scanner;

/**
 *
 * 03/12/2017   8:19:46 AM
 *  
 * @author roman
 *
 *
 * Test_02
 *
 */
public class Test_02 
{

	/**
	 * @param args
	 */
	public static void main(String[] args) 
	{
		// Our Array
		double[] myList = new double[10];
		
		// 01- Initializing arrays with input values
		Scanner input = new Scanner(System.in);
		System.out.print("Enter " + myList.length + " Values: ");
		for (int i = 0; i < myList.length; i++)
			myList[i] = input.nextDouble();
		
		// 02- Initializing arrays with random values
		for (int i = 0; i < myList.length; i++)
			myList[i] = Math.random() * 100 + 1;
		
		// 03- Displaying arrays
		for (int i = 0; i < myList.length; i++)
			System.out.println("myList[" + i + "] = " + myList[i]);
		
		System.out.println(myList);
		
		char[] city = {'E', 'z', ' ', 'Z', 'a', 'w' , 'a' , 'r' , 'a'};
		System.out.println(city);
		
		// 04- Summing all elements
		double sum = 0;
		for (int i = 0; i < myList.length; i++)
			sum += myList[i];
		System.out.println("Sum is " + sum);
		
		// 05- Finding the largest element
		int x = 0;
		double largestElement = myList[0];
		for (int i = 1; i < myList.length; i++)
		{
			if (largestElement < myList[i])
			{
				largestElement = myList[i];
				x = i;
			}
		}
		
		System.out.println("Largest Element is " + "myList[" + x + "]"  + " = " + largestElement);
		
		// 06- Finding the smallest index of the largest element
		double max = myList[0];
		int indexOfMax = 0;
		for (int i = 1; i < myList.length; i++) 
		{
			if (myList[i] > max) 
			{
				max = myList[i];
				indexOfMax = i;
			}
		}
		
		System.out.println("Max Element is " + "myList[" + indexOfMax + "]"  + " = " + max);
		System.out.println();
		
		// 07- Random shuffling
		for (int i = myList.length - 1; i > 0; i--)
		{
			int j = (int) (Math.random() * (i + 1));
			
			double temp = myList[i];
			myList[i] = myList[j];
			myList[j] = temp;
		}
		
		for (int i = 0; i < myList.length; i++)
			System.out.println("myList[" + i + "] = " + myList[i]);
		
		// 08- Shifting elements
		double temp = myList[0];
		for (int i = 1; i < myList.length; i++)
			myList[i - 1] = myList[i];
		
		myList[myList.length - 1] = temp;
		
		System.out.println();
		for (int i = 0; i < myList.length; i++)
			System.out.println("myList[" + i + "] = " + myList[i]);
		
		
		// 09- Simplifying coding
		String[] months = {"January" , "February" , "March" , "April" , "May" , "June" , "July" , "August" , "September" , "October" , "November" , "December"};
		System.out.print("Enter a month number (1 to 12): ");
		int month = input.nextInt();
		System.out.println("The month is " + months[month - 1]);
		
		// 10- for each element e in myList
		for (double e : myList)
			System.out.println(e);
			
		
		input.close();
			
	}

}
