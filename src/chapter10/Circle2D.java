package chapter10;
/**
 *
 * 21/04/2019   2:50:13 PM
 *  
 * @author Romani Ezzat
 *
 *
 * Circle2D
 *
 */
public class Circle2D 
{
	private double x, y, radius;

	public Circle2D()
	{
		this(0, 0, 1);
	}
	
	public Circle2D(double x, double y, double radius)
	{
		this.x = x;
		this.y = y;
		this.radius = radius;
	}
	
	public double  getArea()
	{
		return (Math.pow(radius, 2) * Math.PI);
	}
	
	public double getPerimeter()
	{
		return (radius * 2 * Math.PI);
	}
	
	public boolean contains(double x2, double y2)
	{
		double distance = Math.sqrt(Math.pow((x - x2), 2) + Math.pow((y - y2), 2) );
		
		if (distance < radius)
			return true;
		
		return false;
	}
	
	public boolean contains(Circle2D circle)
	{
		double distance = Math.sqrt(Math.pow((x - circle.x), 2) + Math.pow((y - circle.y), 2) );
		
		if (distance <= Math.abs(radius) - circle.radius)
			return true;
		
		return false;
	}
	
	public boolean overlaps(Circle2D circle)
	{
		double distance = Math.sqrt(Math.pow((x - circle.x), 2) + Math.pow((y - circle.y), 2) );
		
		if (distance <= Math.abs(radius) + circle.radius)
			return true;
		
		return false;
	}
	
	/**
	 * @return the radius
	 */
	public double getRadius() {
		return radius;
	}

	/**
	 * @return the x
	 */
	public double getX() {
		return x;
	}

	/**
	 * @return the y
	 */
	public double getY() {
		return y;
	}
	
	
}
