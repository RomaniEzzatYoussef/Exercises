package chapter11;

import java.util.ArrayList;
import java.util.Random;

/**
 *
 * 06/05/2019   5:49:59 PM
 *  
 * @author Romani Ezzat
 *
 *
 * Exercise_13
 *
 */
public class Exercise_13 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		ArrayList<Integer> list = generateList(10);
		removeDuplicate(list);
		
		System.out.print("Numbers after duplicates remopved: ");
		for (int i = 0; i < list.size(); i++)
			System.out.print(list.get(i) + " ");
	}
	
	public static void removeDuplicate(ArrayList<Integer> list)
	{
		if (list.isEmpty())
		{
			System.out.println("List is empty.");
			return;
		}
		
		sort(list);
		System.out.print("Numbers after sort: ");
		for (int i = 0; i < list.size(); i++)
			System.out.print(list.get(i) + " ");
		System.out.println();
		
		for (int i = 0; i < list.size() - 1; i++)
			if (list.get(i) == list.get(i + 1))
			{
				list.remove(i + 1);
				i--;
			}
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
	
	public static ArrayList<Integer> generateList(int size)
	{
		ArrayList<Integer> tempList = new ArrayList<>();
		Random randNum = new Random();
		
		System.out.print("Numbers generated to list: ");
		for (int i = 0; i < size; i++)
		{
			int number = randNum.nextInt(size);
			System.out.print(number + " ");
			tempList.add(number);
		}
		System.out.println();
		
		return tempList;
	}
}