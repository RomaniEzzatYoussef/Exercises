package chapter08;

/**
 *
 * 09/12/2017   11:44:58 AM
 *  
 * @author roman
 *
 *
 * Weather
 *
 */
public class Weather 
{

	/**
	 * @param args
	 */
	public static void main(String[] args) 
	{
		double[][][] data = new double[10][24][2];
		
		for (int i = 0; i < 10 * 24; i++)
		{
			int day = (int) (Math.random() * 10 + 1);
			int hour = (int) (Math.random() * 24 + 1);
			double temperature = Math.random() * 100;
			double humidity = Math.random() * 100;
			data[day - 1][hour - 1][0] = temperature;
			data[day - 1][hour - 1][1] = humidity;
		}
		
		for (int i = 0; i < 10; i++) 
		{
			double dailyTemperatureTotal = 0;
			double dailyHumidityTotal = 0;
			for (int j = 0; j < 24; j++) 
			{
				dailyTemperatureTotal += data[i][j][0];
				dailyHumidityTotal += data[i][j][1];
			}
			
			System.out.println("Day " + i + "'s average temperature is " + dailyTemperatureTotal / 24);
			System.out.println("Day " + i + "'s average humidity is " + dailyHumidityTotal / 24);
		}
		
	}

}
