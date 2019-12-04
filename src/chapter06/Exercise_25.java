package chapter06;
/**
 * Convert milliseconds to hours, minutes, and seconds
 * Write a method that converts milliseconds to hours, minutes, and seconds using the following header: 
 * public static String convertMillis(long millis) 
 * The method returns a string as hours:minutes:seconds. 
 * For example, convertMillis(5500) returns a string 0:0:5, 
 * convertMillis(100000) returns a string 0:1:40, and convertMillis(555550000) returns a string 154:19:10.
 *
 * 02/12/2017   8:53:17 AM
 *  
 * @author roman
 *
 *
 * Exercise_25
 *
 */
public class Exercise_25 {

	/**
	 * @param args
	 */
	public static void main(String[] args) 
	{
		long milliseconds = System.currentTimeMillis();
		System.out.print(convertMillis(milliseconds));
	}	
	
	/**
	 * converts milliseconds to hours, minutes, and seconds
	 * 
	 * @param millis
	 * @return
	 */
	public static String convertMillis(long millis)
	{
		long seconds = (millis / 1000) % 60;
		long minutes = ((millis / 1000) / 60) % 60;
		long hours = (((millis / 1000) / 60) / 60) % 24;
		String time = hours + ":" + minutes + ":" + seconds;
		
		return time;
	}
}
