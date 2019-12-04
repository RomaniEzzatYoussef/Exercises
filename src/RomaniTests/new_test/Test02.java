package RomaniTests.new_test;

public class Test02 
{
	public static void main(String[] args) 
	{
		A1 a = new A1(10.0 , 2);
		System.out.println(a.getArea());
		
		
	}
}

class B 
{
	private double radius;
	
	public B(double radius)
	{
		this.radius = radius;
	}
	
	public double getRadius() 
	{
		return radius;
	}
	
	public double getArea()
	{
		return radius * radius * Math.PI;
	}

}

class A1 extends B 
{
	private double length;
	
	public A1 (double radius , double length)
	{
		super(radius);
		this.length = length;
	}
	
	@Override
	public double getArea()
	{
		return super.getArea() * length;
	}
}