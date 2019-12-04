package chapter2;

public class ShowCurrentTime {
  public static void main(String[] args)
  {
  	long milli_seconds = System.currentTimeMillis();
		
		long total_seconds = milli_seconds / 1000;
		long current_second = total_seconds % 60;
		
		long total_minutes = total_seconds / 60;
		long current_minute = total_minutes % 60;
		
		long total_hours = total_minutes / 60;
		long current_hour = total_hours % 24;
		
		for (int i = 0; i < 100; i++)
		{
			
		}
		
		System.out.println("Current time is " + (current_hour + 2)+ ":" + current_minute + ":" + current_second + " GMT");
		
  }
}
