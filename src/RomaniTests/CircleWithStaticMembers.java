package RomaniTests;

public class CircleWithStaticMembers {
	
	double radius;
	static int numberOfObjects;
	
	CircleWithStaticMembers()
	{
		radius = 1;
		numberOfObjects++;
	}
	
	CircleWithStaticMembers(double newRadius)
	{
		radius = newRadius;
		numberOfObjects++;
	}
	
	static int getNumberOfObjects()
	{
		return numberOfObjects;
	}
	
	double getArea()
	{
		return radius * radius * Math.PI;
	}
	

}
