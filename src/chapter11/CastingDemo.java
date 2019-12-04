package chapter11;
/**
 *
 * 24/04/2019   10:11:26 PM
 *  
 * @author Romani Ezzat
 *
 *
 * CastingDemo
 *
 */
public class CastingDemo 
{

	/**
	 * @param args
	 */
	public static void main(String[] args) 
	{
		Object circle = new Circle(1);
		Object rectangle = new Rectangle(1, 1);
		displayObject(circle);
		displayObject(rectangle);
		
		
//		Circle c = (Circle) new Object();  //exception: ClassCastException
//		displayObject(c);
	}
	
	public static void displayObject(Object obj)
	{
		if (obj instanceof Circle)
		{
			System.out.println("The circle area is " + ((Circle) obj).getArea());
			System.out.println("The circle diameter is " + ((Circle) obj).getDiameter());
		}
		
		else if (obj instanceof Rectangle)
		{
			System.out.println("The rectangle area is " + ((Rectangle) obj).getArea());
		}
	}

}
