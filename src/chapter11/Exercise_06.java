package chapter11;

import java.util.ArrayList;
import java.util.Date;

import chapter10.Loan;

/**
 *
 * 02/05/2019   10:33:24 PM
 *  
 * @author Romani Ezzat
 *
 *
 * Exercise_06
 *
 */
public class Exercise_06 {

	/**
	 * @param args
	 */
	public static void main(String[] args) 
	{
		ArrayList list = new ArrayList();
		
		list.add(new Loan());
		list.add(new Date());
		list.add("Java Chapter 11");
		
		for (int i = 0; i < list.size(); i++)
			System.out.println(list.get(i).toString());
	
	}

}
