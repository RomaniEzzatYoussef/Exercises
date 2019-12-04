package utilities;

public class MyPoint 
{
	private double x;
	private double y;
	
	public MyPoint()
	{
		this(0 , 0);
	}
	
	public MyPoint(double x , double y)
	{
		this.x = x;
		this.y = y;
	}

	public double getX() 
	{
		return x;
	}

	public double getY() 
	{
		return y;
	}
	
	public double distance(MyPoint p2)
	{
		return distance(this , p2);
	}
	
	public double distance(MyPoint p1, MyPoint p2)
	{
		return Math.sqrt(Math.pow((p1.x - p2.x), 2) + Math.pow((p1.y - p2.y), 2));
	}
}
