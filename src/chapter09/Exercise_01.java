package chapter09;

/**
 * The Rectangle class
 * Following the example of the Circle class in Section 9.2, design a class named Rectangle to represent a rectangle. 
 * The class contains:
 * Two double data fields named width and height that specify the width and height of the rectangle. 
 * The default values are 1 for both width and height.
 * A no-arg constructor that creates a default rectangle.
 * A constructor that creates a rectangle with the specified width and height.
 * A method named getArea() that returns the area of this rectangle.
 * A method named getPerimeter() that returns the perimeter.
 * Write a test program that creates two Rectangle objects—one with width 4 and height 40 and the other with width 3.5 and height 35.9. 
 * Display the width, height, area, and perimeter of each rectangle in this order.
 */
public class Exercise_01 
{
	
	public static void main(String[] args)
	{
		Rectangle rectangle1 = new Rectangle();
		System.out.println("Width " + rectangle1.width
				+"\nHeight " + rectangle1.height
				+"\nArea " + rectangle1.getArea()
				+"\nPerimeter " + rectangle1.getPerimeter());
		
		Rectangle rectangle2 = new Rectangle(4 , 40);
		System.out.println("\nWidth " + rectangle2.width
				+"\nHeight " + rectangle2.height
				+"\nArea " + rectangle2.getArea()
				+"\nPerimeter " + rectangle2.getPerimeter());
		
		rectangle2 = new Rectangle(3.5 , 35.9);
		System.out.println("\nWidth " + rectangle2.width
				+"\nHeight " + rectangle2.height
				+"\nArea " + rectangle2.getArea()
				+"\nPerimeter " + rectangle2.getPerimeter());
	}
	
	

}

class Rectangle
{
	
	double width;
	double height;
	
	Rectangle()
	{
		this(1.0 , 1.0);
	}
	
	Rectangle(double width , double height)
	{
		this.width = width;
		this.height = height;
	}
	
	double getArea()
	{
		return(width * height);
	}
	
	double getPerimeter()
	{
		return (2 * (width + height));
	}
	
}
