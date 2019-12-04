package chapter09;
/**
 *
 * 28/12/2017   9:05:36 PM
 *  
 * @author roman
 *
 *
 * Test_02
 *
 */
public class Test_02 {

	/**
	 * @param args
	 */
	public static void main(String[] args) 
	{
		Circle c = new Circle(5.0);
		printCircle(c);
		
	}
	
	public static void printCircle(Circle c)
	{
		System.out.println("The area of the circle of radius " + c.getRadius() +  " is " + c.getArea());
	}

}
