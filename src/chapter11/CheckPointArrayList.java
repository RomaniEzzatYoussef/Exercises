package chapter11;

import java.util.ArrayList;
import java.util.Arrays;

import javax.swing.JOptionPane;

/**
 *
 * 29/04/2019   12:47:50 PM
 *  
 * @author Romani Ezzat
 *
 *
 * CheckPointArrayList
 *
 */
public class CheckPointArrayList 
{

	/**
	 * @param args
	 */
	public static void main(String[] args) 
	{
		c();
	}
	
	public static void c()
	{
		ArrayList<Integer> list = new ArrayList<>();
		list.add(1);
		list.add(2);
		list.add(3);
		list.remove(1);
		JOptionPane.showMessageDialog(null, list);
	}
	
	public static void b()
	{
		String[] a = {"Dallas", "Dallas", "Houston","Dallas"};
		
		ArrayList<String> list = new ArrayList<String>(Arrays.asList(a));
		list.remove("Dallas");
		
		
		String message = "Elements are: \n" , message1 = "Elements are: \n";
		
		for (String e : list)
			message += e + " "; 
		JOptionPane.showMessageDialog(null, message);
		
		for (int i = 0; i < list.size(); i++)
			list.remove("Dallas");
		for (String e : list)
			message1 += e + " "; 
		JOptionPane.showMessageDialog(null, message1);
		
	}
	
	public static void a()
	{
		ArrayList<String> list1 = new ArrayList<>();
		 list1.add("Denver");
		 list1.add("Austin");
		 //list.add(new java.util.Date());
		 String city = list1.get(0);
		 list1.set(1, "Dallas");
		 System.out.println(list1.get(1));
	}
	
	public static void ab()
	{
		ArrayList<Double> list = new ArrayList<>();
		
		list.add(new Double(15.2));
		list.add(1, 14.2);
		list.add(0, 13.5);
		list.add(19.0);
		
		String message = "" , message1 = "";
		
		message += "Size of list: " + list.size() + "\nThe Contents of list is: \n";
		for (double i : list)
			message += i + " ";
		
		JOptionPane.showMessageDialog(null, message);
		
		list.remove(list.size()-1);
		message1 += "Size of list: " + list.size() + "\nThe Contents of list is: \n";
		for (double i : list)
			message1 += i + " ";
		
		message1 += "\nlist contains 19.0: " + list.contains(19.0);
		message1 += "\nget element 2 from list: " + list.get(2);
		JOptionPane.showMessageDialog(null, message1);
		
		
		 Object[] options = { "OK", "CANCEL" };
		 JOptionPane.showOptionDialog(null, "Click OK to continue", "Warning",
		             JOptionPane.DEFAULT_OPTION, JOptionPane.WARNING_MESSAGE,
		             null, options, options[0]);
		
		
		 Object[] possibleValues = { "First", "Second", "Third" };
		 Object selectedValue = JOptionPane.showInputDialog(null,
		             "Choose one", "Input",
		             JOptionPane.INFORMATION_MESSAGE, null,
		             possibleValues, possibleValues[0]);
	}

}
