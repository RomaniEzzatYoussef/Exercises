package RomaniTests;

public class Task01 {

	public static void main(String[] args) {
		
		for (int century = 0; century < 10; century++)
			for (int tenYears = 0; tenYears < 10; tenYears++)
				for (int year = 0; year < 4; year++)
					for (int season = 0; season < 3; season++)
						for (int month = 0; month < 4; month++)
							for(int week = 0; week < 7; week++)
								for (int day = 0; day < 24; day++)
									for (int hour = 0; hour < 60; hour++)
										for (int minute = 0; minute < 60; minute++)
											for (int second = 0; second < 60; second++)
											{
												System.out.println("Century " + century + " \tTen Years " + tenYears + " Year " + year + " \t\tSeason " + season + " Month "
														+ month + " Week " + week + " \tDay " + day + " \tHour " + hour + " Minute " + minute + " Second " + second);
												try {
													Thread.sleep(1000);
												} catch (InterruptedException e) {
													// TODO Auto-generated catch block
													e.printStackTrace();
												}
											}
				

	}

}
