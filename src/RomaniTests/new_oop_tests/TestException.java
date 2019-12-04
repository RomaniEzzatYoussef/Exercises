package RomaniTests.new_oop_tests;

public class TestException 
{
	
	private double radius;
	static int numOfObjects = 0;
	
	public TestException()
	{
		this(1.0);
	}
	
	public TestException(double newRadius)
	{
		setRadius(newRadius);
		numOfObjects++;
	}
	
	public double getRadius()
	{
		return radius;
	}
	
	public void setRadius(double newRadius) throws IllegalArgumentException
	{
		if (newRadius >= 0)
			radius = newRadius;
		else
			throw new IllegalArgumentException("Radius cannot be negative");
	}

	public static int getNumOfObjects() {
		return numOfObjects;
	}

	public double finalArea()
	{
		return radius * radius * 3.14159;
	}
	
}
