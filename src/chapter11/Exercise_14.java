package chapter11;

import java.util.ArrayList;
import java.util.Random;

/**
 *
 * 06/05/2019   6:02:57 PM
 *  
 * @author Romani Ezzat
 *
 *
 * Exercise_14
 *
 */
public class Exercise_14 
{

	/**
	 * @param args
	 */
	public static void main(String[] args) 
	{
		ArrayList<Integer> list1 = generateList(5);
		ArrayList<Integer> list2 = generateList(5);
		
		list1 = union(list1, list2);
		
		System.out.print("List after union: ");
		for (int i = 0; i < list1.size(); i ++)
			System.out.print(list1.get(i) + " ");
	}
	
	public static ArrayList<Integer> union(ArrayList<Integer> list1, ArrayList<Integer> list2)
	{
		if (list1.isEmpty() && list2.isEmpty())
		{
			System.out.print("Both list is empty!");
			return list1;
		}
		
		for (int i = 0; i < list2.size(); i++)
			list1.add(list2.get(i));
		
		return list1;
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
