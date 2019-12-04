package chapter07;

import java.util.Arrays;

/**
 *
 * 05/12/2017   9:18:14 AM
 *  
 * @author roman
 *
 *
 * MethodInArrays
 *
 */
public class MethodInArrays {

	/**
	 * @param args
	 */
	public static void main(String[] args) 
	{
		// Sort and Parallel Sort Methods
		double[] numbers = {6.0, 4.4, 1.9, 2.9, 3.4, 3.5};
		Arrays.sort(numbers); // Sort the whole array
		System.out.printf("%-16s %s\n" , "Sort is " , Arrays.toString(numbers));
		Arrays.parallelSort(numbers); // Sort the whole array
		System.out.printf("%-16s%s\n" , "Parallel Sort is " , Arrays.toString(numbers));
		char[] chars = {'a', 'A', '4', 'F', 'D', 'P'};
		Arrays.sort(chars, 1, 3); // Sort part of the array
		System.out.printf("%-16s %s\n" , "Sort is " , Arrays.toString(chars));
		Arrays.parallelSort(chars, 1, 3); // Sort part of the array
		System.out.printf("%-16s%s\n" , "Parallel Sort is " , Arrays.toString(chars));
		
		
		// Fill Method
		int[] list01 = {2, 4, 7, 10};
		int[] list02 = {2, 4, 7, 7, 7, 10};
		Arrays.fill(list01, 5); // Fill 5 to the whole array
		Arrays.fill(list02, 1, 5, 8); // Fill 8 to a partial array
		System.out.printf("%-16s %s\n" , "Fill is " , Arrays.toString(list01));
		System.out.printf("%-16s %s\n" , "Fill is " , Arrays.toString(list02));
		
		
		//Equals Method
		int[] list1 = {2, 4, 7, 10};
		int[] list2 = {2, 4, 7, 10};
		int[] list3 = {4, 2, 7, 10};
		System.out.println(Arrays.equals(list1, list2)); // true
		System.out.println(Arrays.equals(list2, list3)); // false
		
		
		// Binary Search Method
		int[] list = {2, 4, 7, 10, 11, 45, 50, 59, 60, 66, 69, 70, 79};
		System.out.println("1. Index is " + Arrays.binarySearch(list, 11));
		System.out.println("2. Index is " + Arrays.binarySearch(list, 12));
		char[] c = {'a', 'c', 'g', 'x', 'y', 'z'};
		System.out.println("3. Index is " + Arrays.binarySearch(c, 'a'));
		System.out.println("4. Index is " + Arrays.binarySearch(c, 't'));
		
	}
	
	public static void printArray(double[] numbers)
	{
		for (double e : numbers)
			System.out.print(e + " ");
	}
	
	public static void printArray(char[] numbers)
	{
		for (char e : numbers)
			System.out.print(e + " ");
	}
	
	public static void printArray(int[] numbers)
	{
		for (int e : numbers)
			System.out.print(e + " ");
	}

}
