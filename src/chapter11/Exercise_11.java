package chapter11;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * 06/05/2019   5:03:02 PM
 *  
 * @author Romani Ezzat
 *
 *
 * Exercise_11
 *
 */
public class Exercise_11 
{

	/**
	 * @param args
	 */
	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		System.out.print("Enter 5 numbers: ");
		ArrayList<Integer> list = new ArrayList<>();
		
		for(int i = 0; i < 5; i++)
			list.add(input.nextInt());
		
		sortKevin(list);
		
		for (int i = 0; i < list.size(); i++)
			System.out.print(list.get(i) + " ");
		
		input.close();
	}
	
	public static void sort(ArrayList<Integer> list) 
	{
		if (list.isEmpty())
		{
			System.out.println("List is empty, nothing to sort");
			return;
		}
		
		for (int i = 0; i < list.size() - 1; i++)
		{
			for (int j = i + 1; j < list.size(); j++)
			{
				if (list.get(i) > list.get(j))
				{
					int temp = list.get(i);
					list.set(i, list.get(j));
					list.set(j, temp);
				}
				
			}
			
		}
		
	}
	
	public static void sortKevin(ArrayList<Integer> list) 
	{
		if (list.isEmpty())
		{
			System.out.println("List is empty, nothing to sort");
			return;
		}
		
		for (int i = 0; i < list.size() - 1; i++)
		{
			int min = i;
			
			for (int j = i + 1; j < list.size(); j++)
				if (list.get(min) > list.get(j))
					min = j;
			
			if (min != i)
				swap(list, min, i);
		}
	}
	
	public static void swap(ArrayList<Integer> list, int minIndex, int curIndex)
	{
		int tempEle = list.get(minIndex);
		list.set(minIndex, list.get(curIndex));
		list.set(curIndex, tempEle);		
	}
}
