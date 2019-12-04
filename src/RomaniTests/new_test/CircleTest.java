package RomaniTests.new_test;

public class CircleTest {
	
	public static void main(String[] args)
	{
		Circle c1 = new Circle(1);
		Circle c2 = new Circle(2);
		
		swap1(c1, c2);
		System.out.println("After swap1: circle1 = " + c1.radius + " circle2 = " + c2.radius);
		
		swap2(c1, c2);
		System.out.println("After swap2: circle1 = " + c1.radius + " circle2 = " + c2.radius);
		
	}
	
	public static void swap1(Circle c1 , Circle c2)
	{
		Circle temp = c1;
		c1 = c2;
		c2 = temp;
	}
	
	public static void swap2(Circle c1 , Circle c2)
	{
		double temp = c1.radius;
		c1.radius = c2.radius;
		c2.radius = temp;
	}

}
