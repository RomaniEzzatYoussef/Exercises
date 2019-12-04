package chapter11;

import java.util.Date;

/**
 *
 * 23/04/2019   7:34:16 AM
 *  
 * @author Romani Ezzat
 *
 *
 * GeometricObject
 *
 */
public  class Geometric 
{
	private String color = "White";
	private boolean filled;
	private Date dateCreated;
	
	public Geometric()
	{
		dateCreated = new Date();
	}
	
	public Geometric(String color, boolean filled)
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
