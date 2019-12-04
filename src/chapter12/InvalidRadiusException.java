package chapter12;
/**
 *
 * 07/05/2019   9:24:01 PM
 *  
 * @author Romani Ezzat
 *
 *
 * CustomException
 *
 */
public class InvalidRadiusException extends Exception 
{

	private double radius;
	
	public InvalidRadiusException(double radius) {
		super("Invalid radius " + radius);
		setRadius(radius);
	}

	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}

}