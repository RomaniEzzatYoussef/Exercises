package chapter09;

public class Circle 
{
	private double radius = 1;
	private static int numberOfObjects = 0;
	
	public Circle()
	{
		numberOfObjects++;
	}
	
	public Circle(double radius)
	{
		this.radius = radius;
		numberOfObjects++;
	}
	
	public double getRadius()
	{
		return radius;
	}
	
	public double getArea()
	{
		return radius * radius * Math.PI;
	}
	
	public double getPerimeter()
	{
		return 2 * radius * Math.PI;
	}
	
	public void setRadius(double radius)
	{
		this.radius = (radius >= 0) ? radius : 0;
	}
	
	public static int getNumberOfObjects()
	{
		return numberOfObjects;
	}
	
	public static void main(String[] args)
	{
		Circle c1 = new Circle(5.0);
		System.out.println("The area of the circle of radius " + c1.getRadius() + " is " + c1.getArea());
		
		c1.setRadius(c1.getRadius() * 1.1);
		
		System.out.println("The area of the circle of radius " + c1.getRadius() + " is " + c1.getArea());
		
		System.out.println("Number of Object till now is " + Circle.getNumberOfObjects());
		
		Circle c2 = new Circle(25);
		System.out.println("The area of the circle of radius " + c2.getRadius() + " is " + c2.getArea());
		
		System.out.println("Number of Object till now is " + Circle.getNumberOfObjects());
		
		c2.radius = 100;
		System.out.println("The area of the circle of radius " + c2.radius + " is " + c2.getArea());
		
		Circle c3 = new Circle(125);
		System.out.println("The area of the circle of radius " + c3.radius + " is " + c3.getArea());
		
		c3.setRadius(315);
		System.out.println("The area of the circle of radius " + c3.radius + " is " + c3.getArea());
		
		System.out.println("Number of Object till now is " + Circle.numberOfObjects);
		
	}
}
