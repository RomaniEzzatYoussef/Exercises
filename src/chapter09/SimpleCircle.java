package chapter09;
/**
 *
 * 10/04/2019   4:40:10 AM
 *  
 * @author Romani Ezzat
 *
 *
 * SimpleCircle
 *
 */
public class SimpleCircle 
{

	/**
	 * @param args
	 */
	public static void main(String[] args) 
	{
		SimpleCircle c1 = new SimpleCircle();
		System.out.println("The area of the circle of radius " + c1.radius + " is " + c1.getArea());
		
		SimpleCircle c2 = new SimpleCircle(25);
		System.out.println("The area of the circle of radius " + c2.radius + " is " + c2.getArea());
		
		SimpleCircle c3 = new SimpleCircle(125);
		System.out.println("The area of the circle of radius " + c3.radius + " is " + c3.getArea());
		
		c2.radius = 100;
		System.out.println("The area of the circle of radius " + c2.radius + " is " + c2.getArea());
	}
	
	double radius;
	
	SimpleCircle()
	{
		
	}
	
	SimpleCircle(double newRadius)
	{
		radius = newRadius;
	}
	
	double getArea()
	{
		return radius * radius * Math.PI;
	}
	
	double getPerimeter()
	{
		return 2 * radius * Math.PI;
	}
	
	void setRadius(double newRadius)
	{
		radius = newRadius;
	}
	
	
}
