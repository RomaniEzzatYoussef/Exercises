package RomaniTests.new_test;

public class CircleWithPrivateDataFieldsTest {

	public static void main(String[] args)
	{
		// Create a Circle with radius 5.0
	    CircleWithPrivateDataFields myCircle = new CircleWithPrivateDataFields(5.0);
	    System.out.println("The area of the circle of radius " + myCircle.getRadius() + " is " + myCircle.getArea());

	    // Increase myCircle's radius by 10%
	    myCircle.setRadius(myCircle.getRadius() * 1.1);
	    System.out.println("The area of the circle of radius " + myCircle.getRadius() + " is " + myCircle.getArea());
	    
	    CircleWithPrivateDataFields circle = new CircleWithPrivateDataFields(1);
	     // Print areas for radius 1, 2, 3, 4, and 5.
	    int n = 5;
	    printAreas(circle, n);
	     // See myCircle.radius and times
	    System.out.println("\n" + "Radius is " + circle.getRadius());
	    System.out.println("n is " + n);
	    
	    getChange();
	    
	}
	/** Print a table of areas for radius */
	public static void printAreas(CircleWithPrivateDataFields c, int times)
	{
		System.out.println("Radius \t\tArea");
	    
	    while (times >= 1)
	    {
	    	System.out.println(c.getRadius() + "\t\t" + c.getArea());
	    	c.setRadius(c.getRadius() + 1);
	    	times--;
	    	
	    }	

	}
	
	public static void getChange()
	{
		System.out.println("Hello Change");
	}

}
