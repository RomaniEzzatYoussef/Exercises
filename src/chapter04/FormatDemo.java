package chapter04;
/**
 *
 * 18/11/2017   7:13:29 AM
 *  
 * @author roman
 *
 *
 * FormatDemo
 *
 */
public class FormatDemo 
{

	/**
	 * @param args
	 */
	public static void main(String[] args) 
	{
		System.out.printf("%-10s%-10s%-10s%-10s%-10s\n", "Degrees" , "Radians" , "Sine" , "Cosine" , "Tangent");
		
		int degrees = 30;
		double radians = Math.toRadians(degrees);
		System.out.printf("%-10d%-10.4f%-10.4f%-10.4f%-10.4f\n", degrees , radians , Math.sin(radians) , Math.cos(radians) , Math.tan(radians));
		
		degrees = 60;
		radians = Math.toRadians(degrees);
		System.out.printf("%-10d%-10.4f%-10.4f%-10.4f%-10.4f\n", degrees , radians , Math.sin(radians) , Math.cos(radians) , Math.tan(radians));
		
		degrees = 90;
		radians = Math.toRadians(degrees);
		System.out.printf("%-10d%-10.4f%-10.4f%-10.4f%-10.4f\n", degrees , radians , Math.sin(radians) , Math.cos(radians) , Math.tan(radians));
		
		degrees = 120;
		radians = Math.toRadians(degrees);
		System.out.printf("%-10d%-10.4f%-10.4f%-10.4f%-10.4f\n", degrees , radians , Math.sin(radians) , Math.cos(radians) , Math.tan(radians));
		
		degrees = 180;
		radians = Math.toRadians(degrees);
		System.out.printf("%-10d%-10.4f%-10.4f%-10.4f%-10.4f\n", degrees , radians , Math.sin(radians) , Math.cos(radians) , Math.tan(radians));
		
		degrees = 270;
		radians = Math.toRadians(degrees);
		System.out.printf("%-10d%-10.4f%-10.4f%-10.4f%-10.4f\n", degrees , radians , Math.sin(radians) , Math.cos(radians) , Math.tan(radians));
		
		degrees = 360;
		radians = Math.toRadians(degrees);
		System.out.printf("%-10d%-10.4f%-10.4f%-10.4f%-10.4f\n", degrees , radians , Math.sin(radians) , Math.cos(radians) , Math.tan(radians));
	}

}
