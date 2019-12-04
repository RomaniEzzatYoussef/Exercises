package chapter11;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

import javax.swing.JOptionPane;

/**
 *
 * 29/04/2019   3:47:34 PM
 *  
 * @author Romani Ezzat
 *
 *
 * UsefulMethodsForLists
 *
 */
public class UsefulMethodsForLists 
{

	/**
	 * @param args
	 */
	public static void main(String[] args) 
	{
		
		sort();
		shuffle();
		min();
		max();
		
		
	}
	
	public static void sort()
	{
		Double[] nums = {15.2, 3.0, 14.21, 13.245, 6.0};
		ArrayList<Double> numbers = new ArrayList<>(Arrays.asList(nums));
		Collections.sort(numbers);
		
		JOptionPane.showMessageDialog(null, numbers);
	}
	
	public static void shuffle()
	{
		Double[] nums = {15.2, 3.0, 14.21, 13.245, 6.0};
		ArrayList<Double> numbers = new ArrayList<>(Arrays.asList(nums));
		Collections.shuffle(numbers);
		
		JOptionPane.showMessageDialog(null, numbers);
	}
	
	public static void max()
	{
		Double[] nums = {15.2, 3.0, 14.21, 13.245, 6.0};
		ArrayList<Double> numbers = new ArrayList<>(Arrays.asList(nums));
		
		
		JOptionPane.showMessageDialog(null, Collections.max(numbers));
	}
	
	public static void min()
	{
		Double[] nums = {15.2, 3.0, 14.21, 13.245, 6.0};
		ArrayList<Double> numbers = new ArrayList<>(Arrays.asList(nums));
		
		JOptionPane.showMessageDialog(null, Collections.min(numbers));
	}
	
	public static ArrayList<String> a()
	{
		String[] array = {"red", "green", "blue"};
		ArrayList<String> list = new ArrayList<>(Arrays.asList(array));
		
		for (int i = 0; i < array.length; i++)
			list.add(array[i]);
		
		return list;
	}
	
	public static void b()
	{
		String[] a = new String[a().size()];
		a().toArray(a);
		
		JOptionPane.showMessageDialog(null, printArray(a));
	}
	
	public static String printArray(String[] a)
	{
		String m = "";
		
		for (int i = 0; i < a.length; i++)
			m += a[i] + " ";
		
		return m;
	}

}
