package chapter03;

import java.util.Scanner;

/**
 * Business: check ISBN-10
 * An ISBN-10 (International Standard Book Number) consists of 10 digits: d1d2d3d4d5d6d7d8d9d10
 * The last digit, d10, is a checksum, which is calculated from the other nine digits using the following formula: 
 * ((d1 * 1) + (d2 * 2) + (d3 * 3) + (d4 * 4) + (d5 * 5) + (d6 * 6) + (d7 * 7) + (d8 * 8) + (d9 * 9)) % 11
 * If the checksum is 10, the last digit is denoted as X according to the ISBN-10 convention. 
 * Write a program that prompts the user to enter the first 9 digits and displays the 10-digit ISBN (including leading zeros). 
 * Your program should read the input as an integer. 
 * 
 * 
 * 27/09/2017   11:46:28 AM
 *
 * @author Romani Ezzat
 *
 */
public class Exercise_09 
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the first 9 digits of an ISBN as integer: ");
		int isbn10 = input.nextInt();
		
		isbn(isbn10);
		
		
		isbn10(isbn10);
		
		
		input.close();
	}
	
	public static void isbn(int isbn10)
	{
		int d9 = isbn10 % 10; 
		isbn10 /= 10;
		
		int d8 = isbn10 % 10; 
		isbn10 /= 10;
		
		int d7 = isbn10 % 10; 
		isbn10 /= 10;
		
		int d6 = isbn10 % 10; 
		isbn10 /= 10;
		
		int d5 = isbn10 % 10; 
		isbn10 /= 10;
		
		int d4 = isbn10 % 10;
		isbn10 /= 10;
		
		int d3 = isbn10 % 10;
		isbn10 /= 10;
		
		int d2 = isbn10 % 10;
		isbn10 /= 10;
		
		int d1 = isbn10 % 10;
		
		int d10 = ((d1 * 1) + (d2 * 2) + (d3 * 3) + (d4 * 4) + (d5 * 5) + (d6 * 6) + (d7 * 7) + (d8 * 8) + (d9 * 9)) % 11;
		
		if (d10 == 10)
			System.out.println("" + d1 + d2 + d3 + d4 + d5 + d6 + d7 + d8 + d9 + "X");
		else
			System.out.println("" + d1 + d2 + d3 + d4 + d5 + d6 + d7 + d8 + d9 + d10);
	}
	
	public static void isbn10(int isbn10)
	{
		int[] d = new int[10];
		
		for(int i = d.length-2; i >= 0; i--)
		{
			d[i] = isbn10 % 10;
			isbn10 /= 10;
		}
		
		d[9] = (d[0] * 0) + ((d[1] * 1) + (d[2] * 2) + (d[3] * 3) + (d[4] * 4) + (d[5] * 5) + (d[6] * 6) + (d[7] * 7) + (d[8] * 8)) % 11;
		
		if (d[9] == 10)
			System.out.print("" + d[0] + d[1] + d[2] + d[3] + d[4] + d[5] + d[6] + d[7] + d[8] + "X");
		else
			System.out.print("" + d[0] + d[1] + d[2] + d[3] + d[4] + d[5] + d[6] + d[7] + d[8] + d[9]);
	}
}
