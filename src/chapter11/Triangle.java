package chapter11;

import chapter11.Geometric;

/**
 *
 * 30/04/2019   6:00:45 PM
 *  
 * @author Romani Ezzat
 *
 *
 * Triangle
 *
 */
public class Triangle extends Geometric
{
	
	private double side1;
	private double side2;
	private double side3;
	
	public Triangle()
	{
		this(1.0, 1.0, 1.0);
	}
	
	public Triangle(double s1, double s2, double s3)
	{
		this.side1 = s1;
		this.side2 = s2;
		this.side3 = s3;
	}
	
	/**
	 * @param args
	 */
	public static void main(String[] args) 
	{

	}

	public double getSide1() 
	{
		return side1;
	}

	public void setSide1(double side1) 
	{
		this.side1 = side1;
	}

	public double getSide2() 
	{
		return side2;
	}

	public void setSide2(double side2) 
	{
		this.side2 = side2;
	}

	public double getSide3() 
	{
		return side3;
	}

	public void setSide3(double side3) 
	{
		this.side3 = side3;
	}

	@Override
	public double getArea() 
	{
		double p = (side1 + side2 + side3) / 3;
		
		return Math.sqrt(p * (p - side1) * (p - side2) * (p - side3));
	}

	@Override
	public double getPerimeter() 
	{
		
		return (side1 + side2 + side3);
	}
	
	@Override
	public String toString()
	{
		return "Triangle: side1 = " + side1 + " side2 = " + side2 + " side3 = " + side3;
	}

}
