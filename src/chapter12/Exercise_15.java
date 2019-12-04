package chapter12;

import java.io.*;
import java.util.*;

/**
 *
 * 20/07/2019   7:03:46 PM
 *  
 * @author Romani Ezzat
 *
 *
 * Exercise_15
 *
 */
public class Exercise_15 
{

	/**
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException 
	{
		File fileName = new File("RomaniFiles/chp12_e15.txt");
		
		if (!fileName.exists())
		{
			System.out.println("File does not exist, creating file..");
			fileName.createNewFile();
		}
		
		try
		{
			Random randNumbers = new Random();
			Scanner input = new Scanner(System.in);
			System.out.print("Enter the size of the list: ");
			int size = input.nextInt();
			
			PrintWriter writer = new PrintWriter(fileName); 
			
			for (int i = 1; i <= size; i++)
				if (i % 10 == 0)
					writer.println(randNumbers.nextInt(size));
				else 
					writer.print(randNumbers.nextInt(size) + " ");
			
			writer.close();
			input.close();
		}
		catch (Exception ex)
		{
			System.out.print(ex.getMessage());
		}
		
		try (Scanner textReader = new Scanner(fileName);)
		{
			ArrayList<Integer> list = new ArrayList<>();
			
			while (textReader.hasNext())
				list.add(textReader.nextInt());
			
			sort(list);
			
			for (int i = 0; i < list.size(); i++)
				if ((i + 1) % 10 == 0)
					System.out.println(list.get(i) + " ");
				else 
					System.out.print(list.get(i) + " ");
		}
		catch (Exception ex)
		{
			System.out.print(ex.getMessage());
		}
	}
	
	public static void sort(ArrayList<Integer> list)
	{
		for (int i = 0; i < list.size() - 1; i++)
		{
			int min = i;
			
			for (int j = i + 1; j < list.size(); j++)
				if (list.get(min) > list.get(j))
					min = j;
			
			if (min != i)
				swap(list, i, min);
		}
	}
	
	public static void swap(ArrayList<Integer> list, int curIndex, int minIndex)
	{
		int tempNum = list.get(curIndex);
		list.set(curIndex, list.get(minIndex));
		list.set(minIndex, tempNum);
	}
}
