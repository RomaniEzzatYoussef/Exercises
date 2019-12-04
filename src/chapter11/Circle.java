package chapter11;
/**
 *
 * 23/04/2019   10:57:51 AM
 *  
 * @author Romani Ezzat
 *
 *
 * CircleFromGeometricObject
 *
 */
public class Circle extends Geometric 
{
	private double radius;

	public Circle() 
	{
		// TODO Auto-generated constructor stub
	}
	
	public Circle(double radius)
	{
		this.radius = radius;
	}
	
	public Circle(double radius , String color, boolean filled)
	{
		super(color, filled);
		this.radius = radius;
		
	}
	
	public double getArea()
	{
		return radius * radius * Math.PI;
	}
	
	public double getDiameter()
	{
		return 2 * radius;
	}
	
	public double getPerimeter()
	{
		return 2 * radius * Math.PI;
	}
	
	public double getRadius() 
	{
		return radius;
	}

	public void setRadius(double radius) 
	{
		this.radius = radius;
	}
	
	@Override
	public String toString()
	{
		return super.toString() + "\nradius is " + radius;
	}
	
	@Override
	public boolean equals(Object obj)
	{
		if (obj instanceof Circle)
			return this.radius == ((Circle) obj).radius;
		
		return false;
//		else
//			return this = obj;
	}
	
	public String toString1()
	{
		return super.toString();
	}
	
	public char[] toCharArray()
	{
		return (super.toString() + " hello").toCharArray();
	}
	
	public void printCircle()
	{
		System.out.println("The circle is created " + getDateCreated() + " and the radius is " + radius);
	}
}
