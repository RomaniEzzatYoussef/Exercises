package chapter11;
/**
 *
 * 23/04/2019   4:05:24 PM
 *  
 * @author Romani Ezzat
 *
 *
 * TestCircleRectangle
 *
 */
public class TestCircleRectangle 
{

	/**
	 * @param args
	 */
	public static void main(String[] args) 
	{
		Circle c1 = new Circle();
		Circle c3 = new Circle(1);
		Circle c2 = new Circle(1, "Blue" , true);
		
		System.out.println("A circle " + c2.toString());
		System.out.println("The color is " + c2.getColor());
		System.out.println("The radius is " + c2.getRadius());
		System.out.println("The area is " + c2.getArea());
		System.out.println("The diameter is " + c2.getDiameter());
		
		Rectangle r1 = new Rectangle();
		Rectangle r2 = new Rectangle(2, 4, "Red", true);
		//Rectangle r3 = new Rectangle();
		System.out.println("\nA rectangle " + r2.toString());
		System.out.println("The area is " + r2.getArea());
		System.out.println("The perimeter is " + r2.getPerimeter());
		
		Circle circle = new Circle(1);
		Geometric geometric = new Geometric();
		
		//c1 = (Circle) geometric;
		
		geometric = circle;
		
		
		
		System.out.println((circle instanceof Geometric) + " " + (geometric instanceof Geometric) 
				+ " " + (circle instanceof Circle) + " " + (geometric instanceof Circle));
	}

}
