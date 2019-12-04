package new_test;

public class Test02 
{
	public static void main(String[] args) 
	{
		A a = new A(10.0 , 2);
		System.out.println(a.toString());
		
		
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

class A extends B 
{
	private double length;
	
	public A (double radius , double length)
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