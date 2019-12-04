package new_test;
import java.util.Date;
public class SimpleGeometricObject 
{
	private String color = "white";
	private boolean filled;
	private Date dateCreated;
	
	public SimpleGeometricObject()
	{
		setDateCreated(new Date());
	}
	
	
	public SimpleGeometricObject(String color , boolean filled)
	{
		setDateCreated(new Date());
		this.setColor(color);
		this.setFilled(filled);
	}


	public String getColor() {
		
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
	
	public void setDateCreated(Date dateCreated)
	{
		this.dateCreated = dateCreated;
	}


	public String toString()
	{
		return "created on " + dateCreated + "\ncolor: " + color + " and filled: " + filled;
	}
	
	

}
