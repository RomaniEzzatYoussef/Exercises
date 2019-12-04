package chapter10;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

/**
 *
 * 04/04/2018   5:04:21 PM
 *  
 * @author roman
 *
 *
 * NewFX
 *
 */
public class NewFX extends Application 
{

	@Override
	public void start(Stage arg0) throws Exception 
	{
		String show = getSeconds();
		StackPane pane = new StackPane();
		Button btOK = new Button("ok");
		Label label = new Label(show);
		btOK.setStyle("-fx-border-color: blue;");
		pane.getChildren().add(btOK);
		pane.getChildren().add(label);
		pane.setRotate(45);
		pane.setStyle("-fx-border-color: red; -fx-background-color: lightgray;");
		Scene scene = new Scene(pane, 400, 100);
		
		Stage primaryStage = new Stage();
		primaryStage.setTitle("NodeStyleRotateDemo");
		primaryStage.setScene(scene);
		primaryStage.show();
	}
	
	public static void main(String[] args)
	{
		launch(args);
	}
	
	public static String getSeconds()
	{
		String show = "";
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
												show = "Century " + century + " \tTen Years " + tenYears + " Year " + year + " \t\tSeason " + season + " Month "
														+ month + " Week " + week + " \tDay " + day + " \tHour " + hour + " Minute " + minute + " Second " + second;
												try {
													Thread.sleep(1000);
												} catch (InterruptedException e) {
													// TODO Auto-generated catch block
													e.printStackTrace();
												}
											}
		return show;
	}

}
