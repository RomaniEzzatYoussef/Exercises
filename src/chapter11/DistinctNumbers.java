package chapter11;

import java.awt.Component;
import java.util.ArrayList;
import java.util.Scanner;
import javax.swing.JOptionPane;


/**
 *
 * 28/04/2019   12:37:11 PM
 *  
 * @author Romani Ezzat
 *
 *
 * DistinctNumbers
 *
 */
public class DistinctNumbers {

	/**
	 * @param args
	 */
	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		
		ArrayList<Integer> list = new ArrayList<>();
		
		Component parentComponent = null;
		String m = "";
		int value;
		
		do {
			m = (JOptionPane.showInputDialog("Enter integers: " + input));
			if (Character.isDigit(m.charAt(0)))
				value = Integer.parseInt(m);
			else
				value = 0;
			
			if (!list.contains(value) && value != 0)
				list.add(value);
		} while (value != 0);
		
		
		String res = "";
		
		for (int i = 0; i < list.size(); i++)
			res += list.get(i) + " ";
		
		JOptionPane.showMessageDialog(parentComponent, res);
		input.close();
	}

}
