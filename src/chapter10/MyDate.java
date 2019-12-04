package chapter10;

import java.util.Calendar;
import java.util.GregorianCalendar;

/**
 *
 * 21/04/2019   4:15:34 PM
 *  
 * @author Romani Ezzat
 *
 *
 * MyDate
 *
 */
public class MyDate 
{
	private int year, month, day;

	public MyDate() 
	{
		GregorianCalendar date = new GregorianCalendar();
		year = date.get(Calendar.YEAR);
		month = date.get(Calendar.MONTH);
		day = date.get(Calendar.DAY_OF_MONTH);
	}
	
	public MyDate(long elapsedTime)
	{
		GregorianCalendar date = new GregorianCalendar();
		date.setTimeInMillis(elapsedTime);
		
		year = date.get(Calendar.YEAR);
		month = date.get(Calendar.MONTH);
		day = date.get(Calendar.DAY_OF_MONTH);
	}
	
	public MyDate(int year, int month, int day)
	{
		this.year = year;
		this.month = month;
		this.day = day;
	}
	/**
	 * @return the year
	 */
	public int getYear() {
		return year;
	}

	/**
	 * @param year the year to set
	 */
	public void setYear(int year) {
		this.year = year;
	}

	/**
	 * @return the month
	 */
	public int getMonth() {
		return month;
	}

	/**
	 * @param month the month to set
	 */
	public void setMonth(int month) {
		this.month = month;
	}

	/**
	 * @return the day
	 */
	public int getDay() {
		return day;
	}

	/**
	 * @param day the day to set
	 */
	public void setDay(int day) {
		this.day = day;
	}
	
	@Override
	public String toString()
	{
		return getDay() + "-" + getMonth() + "-" + getYear();
	}
}
