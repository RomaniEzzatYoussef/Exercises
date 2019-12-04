package chapter11;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * 02/05/2019   11:31:14 PM
 *  
 * @author Romani Ezzat
 *
 *
 * Exercise_07
 *
 */
public class Exercise_07 
{

	/**
	 * @param args
	 */
	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		System.out.print("Enter size of list: ");
		ArrayList<Integer> list = generateList(input.nextInt());
		printList(list);
		
		shuffle(list);
		
		System.out.print("Numbers after shuffle: ");
		printList(list);
		
		input.close();
	}
	
	public static void shuffle(ArrayList<Integer> list)
	{
		Random r = new Random();
		for (int i = 0; i < list.size(); i++)
		{
			int x = r.nextInt(list.size());
			
			int temp = list.get(i);
			list.set(i, list.get(x));
			list.set(x, temp);
		}
	}
	
	public static void printList(ArrayList<Integer> list)
	{
		for (int i = 0; i < list.size(); i++)
			System.out.print(list.get(i) + " ");
		
		System.out.println();
	}
	
	public static ArrayList<Integer> generateList(int size)
	{
		Random r = new Random();
		ArrayList<Integer> list = new ArrayList<>();
		System.out.print("Numbers generated: ");
		for (int i = 0; i < size; i++)
			list.add(i, r.nextInt(100));
		
		return list;
		
	}
	

}
