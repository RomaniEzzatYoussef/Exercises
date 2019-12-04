package chapter07;

import java.util.Scanner;

/**
 *
 * 05/12/2017   7:07:20 AM
 *  
 * @author roman
 *
 *
 * LinearSearch
 *
 */
public class LinearSearch 
{

	/**
	 * @param args
	 */
	public static void main(String[] args) 
	{
		{
			double[] list = {5 , 2 , 4 , 3 , 7 , 6 , 1 , 9 , 0 , 8};
			sortingArray(list);
			
			for (double e : list)
				System.out.print(e + " ");
		}
		
		{
			int[] list = {2, 4, 7, 10, 11, 45, 50, 59, 60, 66, 69, 70, 79};
			int i = binarySearch(list, 2); // Returns 0
			int j = binarySearch(list, 11); // Returns 4
			int k = binarySearch(list, 12); // Returns –6
			int l = binarySearch(list, 1); // Returns –1
			int m = binarySearch(list, 3); // Returns –2
			
			System.out.println("\n\ni:" + i + " j:" + j + " k:" + k + " l:" + l + " m:" + m);
		}
		
		
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a length for array: ");
		int[] a = new int[input.nextInt()];
		
		System.out.print("Enter the numbers: ");
		for (int i = 0; i < a.length; i++)
			a[i] = input.nextInt();
		
		System.out.print("Enter a key: ");
		int key = input.nextInt();
		int index = binarySearch(a, key);
		
		System.out.println("The index is " + index);
		
		
		input.close();
		int[] list = {1, 4, 4, 2, 5, -3, 6, 2};
		int i = linearSearch(list, 4); // Returns 1
		int j = linearSearch(list, -4); // Returns -1
		int k = linearSearch(list, -3); // Returns 5
		
		System.out.println(i);
		System.out.println(j);
		System.out.println(k);
	}
	
	public static void sortingArray(double[] list)
	{
		for (int i = 0; i < list.length; i++)
		{
			for (int j = i + 1; j < list.length; j++)
			{
				if (list[i] > list[j])
				{
					double temp = list[i];
					list[i] = list[j];
					list[j] = temp;
				}
			}
		}
	}
	
	public static int[] sortingArray(int[] list)
	{
		for (int i = 0; i < list.length; i++)
		{
			for (int j = i + 1; j < list.length; j++)
			{
				if (list[i] > list[j])
				{
					int temp = list[i];
					list[i] = list[j];
					list[j] = temp;
				}
			}
		}
		
		return list;
	}
	
	/**
	 * Use binary search to find the key in the list
	 * @param list
	 * @param key
	 * @return
	 */
	public static int binarySearch(int[] list, int key)
	{
		int low = 0;
		int high = list.length - 1;
		
		while (high >= low)
		{
			int mid = (low + high) / 2;
			
			if (key < list[mid])
				high = mid - 1;
			
			else if (key == list[mid])
				return mid;
			
			else
				low = mid + 1;
		}
		
		return -low -1;
	}
	
	/**
	 * Linear search is useful for finding an element in a small array or an unsorted array
	 * linear search is inefficient for a large array
	 * @param list
	 * @param key
	 * @return
	 */
	public static int linearSearch(int[] list , int key)
	{
		for (int i = 0; i < list.length; i++)
			if (key == list[i])
				return i;
		
		return -1;
	}

}
