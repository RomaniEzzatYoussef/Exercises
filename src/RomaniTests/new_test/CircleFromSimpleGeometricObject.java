package RomaniTests.new_test;

public class CircleFromSimpleGeometricObject extends SimpleGeometricObject
{
	private double radius;
	
	@Override
	
	public String toString()
	{
		return super.toString() + "\nradius is " + radius;
	}
	
	public CircleFromSimpleGeometricObject()
	{
		
	}
	
	
	public CircleFromSimpleGeometricObject(double radius)
	{
		this.setRadius(radius);
	}
	
	
	public CircleFromSimpleGeometricObject(double radius , String color , boolean filled)
	{
		this.setRadius(radius);
		setColor(color);
		setFilled(filled);
	}


	public double getRadius() 
	{
		return radius;
	}


	public void setRadius(double radius) 
	{
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
	
	
	public void printCircle()
	{
		System.out.println("The circle is created " + getDateCreated() + " and the radius is " + radius);
	}

}

