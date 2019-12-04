package carSystem;

import java.util.Date;

/**
 *
 * 09/05/2019   6:33:51 AM
 *  
 * @author Romani Ezzat
 *
 *
 * Shape
 *
 */
public class Shape {
	
	private String color = "White";
	private boolean filled;
	private Date dateCreated;
	
	public Shape()
	{
		dateCreated = new Date();
	}
	
	public Shape(String color, boolean filled)
	{
		dateCreated = new Date();
		this.color = color;
		this.filled = filled;
	}
	
	public String getColor() 
	{
		return color;
	}
	
	public void setColor(String color) 
	{
		this.color = color;
	}
	
	public boolean isFilled() 
	{
		return filled;
	}
	
	public void setFilled(boolean filled) 
	{
		this.filled = filled;
	}

	public Date getDateCreated() 
	{
		return dateCreated;
	}
	
	public String toString()
	{
		return "Created on " + dateCreated + "\ncolor: " + color + " and filled: " + filled;
	}
	
	public  double getArea() {
		return 0;
	}
	
	public double getPerimeter() {
		return 0;
	}


}

class Circle extends Shape
{
	private double radius;

	public Circle() 
	{
		this(1.0);
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

	@Override
	public String toString()
	{
		return super.toString() + " for radius: " + radius;
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
	public double getPerimeter()
	{
		return 2 * radius * Math.PI;
	}

	public double getDiameter()
	{
		return 2 * radius;
	}
}

class Square extends Shape
{
	private double length;

	public Square() 
	{
		this(1.0);
	}
	
	public Square(double length)
	{
		this.setLength(length);
	}
	
	public Square(double length , String color, boolean filled)
	{
		super(color, filled);
		this.setLength(length);
	}

	public double getLength() {
		return length;
	}

	public void setLength(double length) {
		this.length = length;
	}
	
	public double getArea()
	{
		return length * length;
	}
	
	public double getPerimeter()
	{
		return 4 * length;
	}
	
	@Override
	public String toString()
	{
		return super.toString() + " for length: " + length;
	}
	
	
	
}
