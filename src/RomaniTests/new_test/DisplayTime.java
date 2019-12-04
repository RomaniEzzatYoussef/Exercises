package RomaniTests.new_test;

public class DisplayTime {

	public static void main(String[] args)
	{

		
	    long totalMilliseconds = System.currentTimeMillis(); // Obtain the total milliseconds since midnight, Jan 1, 1970

	    
	    long totalSeconds = totalMilliseconds / 1000;// Obtain the total seconds since midnight, Jan 1, 1970

	    
	    long currentSecond = totalSeconds % 60;// Compute the current second in the minute in the hour

	    
	    long totalMinutes = totalSeconds / 60;// Obtain the total minutes

	    
	    long currentMinute = totalMinutes % 60;// Compute the current minute in the hour

	    
	    long totalHours = totalMinutes / 60;// Obtain the total hours

	    
	    long currentHour = totalHours % 24;// Compute the current hour

	    // Display results
	    System.out.println("Current time is " + currentHour + ":" + currentMinute + ":" + currentSecond + " GMT");

	}

}
