
package chapter03;

import java.util.Scanner;

/**
 * 26/09/2017   11:46:28 PM
 *
 * @author Romani Ezzat
 *
 */
public class SortNumbers 
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		System.out.print("Enter The Amount of Numbers: ");
		int amount = input.nextInt();
		
		int[] a = new int[amount];
		
		System.out.print("Enter the numbers for sorting: ");
		for(int i = 0; i < a.length; i++)
			a[i] = input.nextInt();
		
		a = sortNumbers(a);
		
		System.out.print("\t1 for sorting Ascending "
				       + "\n\t2 for sorting Descending"
				       + "\nEnter: ");
		
		int typeOfSorting = input.nextInt();
		
		sortType(typeOfSorting , a);
		
		input.close();
	}
	/**
	 * Takes an array of unsorting Numbers and then
	 * Returns an array sorted
	 * @param a
	 * @return
	 */
	public static int[] sortNumbers(int[] a)
	{
		for (int x = 0; x < a.length-1; x++)
		{
			for (int i = x+1; i < a.length; i++)
			{
				if (a[x] > a[i])
				{
					int temp = a[x];
					a[x] = a[i];
					a[i] = temp;
				}
			}
		}
		
		return a;
	}
	/**
	 * this method take the type of sorting and numbers and then
	 * returns the numbers sorting by Ascending or Descending
	 * depending on the user choice
	 * @param typeOfSorting
	 * @param a
	 */
	public static void sortType(int typeOfSorting , int[] a)
	{
		if (typeOfSorting == 1)
		{
			System.out.print("\nThe Result: ");
			
			for (int i = 0; i < a.length; i++)
			{	
				System.out.print(a[i] + " ");
			}
		}
		
		if (typeOfSorting == 2)
		{
			System.out.print("\nThe Result: ");
			
			for (int i = a.length-1; i >= 0; i--)
			{	
				System.out.print(a[i] + " ");
			}
		}
	}
}
