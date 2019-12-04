package chapter11;
/**
 *
 * 23/04/2019   3:52:14 PM
 *  
 * @author Romani Ezzat
 *
 *
 * Rectangle
 *
 */
public class Rectangle extends Geometric 
{
	private double width;
	private double height;
	
	public Rectangle() 
	{
		// TODO Auto-generated constructor stub
	}
	
	public Rectangle(double width, double height) 
	{
		this.width = width;
		this.height = height;
	}
	
	public Rectangle(double width, double height, String color, boolean filled) 
	{
		super(color, filled);
		this.width = width;
		this.height = height;
	}
	
	
	public double getWidth() 
	{
		return width;
	}
	
	public void setWidth(double width) 
	{
		this.width = width;
	}
	
	public double getHeight() 
	{
		return height;
	}
	
	public void setHeight(double height) 
	{
		this.height = height;
	}
	
	public double getArea()
	{
		return width * height;
	}
	
	public double getPerimeter()
	{
		return 2 * (width * height);
	}
	
}
