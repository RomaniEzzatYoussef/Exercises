package RomaniTests.new_oop_tests;
/**
 *
 * 10/04/2019   1:01:24 PM
 *  
 * @author Romani Ezzat
 *
 *
 * TestCircleWithPrivateDataFields
 *
 */
public class TestCircleWithPrivateDataFields 
{

	/**
	 * @param args
	 */
	public static void main(String[] args) 
	{
		CircleWithPrivateDataFields myCircle = new CircleWithPrivateDataFields(5.0);
		System.out.println("The area of the circle of radius " + myCircle.getRadius() + " is " + myCircle.getArea());
		
		myCircle.setRadius(myCircle.getRadius() * 1.1); 
		System.out.println("The area of the circle of radius " + myCircle.getRadius() + " is " + myCircle.getArea());

		System.out.println("The number of objects created is " + CircleWithPrivateDataFields.getNumberOfObjects());
	}

}
