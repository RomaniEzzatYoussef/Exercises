package chapter11;
/**
 *
 * 24/04/2019   8:54:43 AM
 *  
 * @author Romani Ezzat
 *
 *
 * PolymorphismDemo
 *
 */
public class PolymorphismDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) 
	{
		displayObject(new Circle (1, "Red", true));
		displayObject(new Rectangle(5, 6, "Blue", true));
	}

	public static void displayObject(Geometric g)
	{
		System.out.println("Created on " + g.getDateCreated() + ". Color is " + g.getColor());
	}
}
