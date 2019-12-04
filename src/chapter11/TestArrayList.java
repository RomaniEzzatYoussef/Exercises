package chapter11;

import java.awt.Component;
import java.util.ArrayList;

import javax.swing.JOptionPane;

/**
 *
 * 25/04/2019   5:02:37 PM
 *  
 * @author Romani Ezzat
 *
 *
 * TestArrayList
 *
 */
public class TestArrayList 
{

	/**
	 * @param args
	 */
	public static void main(String[] args) 
	{
		ArrayList<String> cities = new ArrayList<>();
		
		cities.add("London");
		cities.add("Denver");
		cities.add("Paris");
		cities.add("Miami");
		cities.add("Seoul");
		cities.add("Tokyo");
		
		String s1 = ("List size: " + cities.size() + "");
		s1 += ("\nIs Miami in the list? " + cities.contains("Miami"));
		s1 += ("\nThe location of Denver int the list? " + cities.indexOf("Denver"));
		s1 += ("\nIs the list empty? " + cities.isEmpty());
	
		Component parentComponent = null;
		JOptionPane.showMessageDialog(parentComponent, s1);
		
		System.out.println(cities.toString());

		cities.add(2, "Xian");
		
		cities.remove("Miami");
		cities.remove(1);
		
		System.out.println(cities.toString());
		System.out.println(cities);

		for (int i = 0; i < cities.size(); i++)
			System.out.print(cities.get(i) + " ");
		
		System.out.println();
		
		ArrayList<Circle> circles = new ArrayList<>();
		
		circles.add(new Circle(2));
		circles.add(new Circle(3));
		
		System.out.println("The area of the circle? " + circles.get(0).getArea());
	}

}
