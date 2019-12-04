package chapter12.textInputOutput;

import javafx.animation.PauseTransition;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.input.KeyCode;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

/**
 *
 * 30/05/2019 5:41:40 PM
 * 
 * @author Romani Ezzat
 *
 *
 *         BounceBallControl
 *
 */
public class BounceBallControl extends Application 
{

	/**
	 * @param args
	 */
	public static void main(String[] args) 
	{
		launch(args);
	}

	@Override
	public void start(Stage primaryStage) throws Exception 
	{
		BallPane b = new BallPane();
		b.setOnMousePressed(e -> b.pause());
		b.setOnMouseReleased(e -> b.play());
		b.setOnKeyPressed(e -> 
		{
			if (e.getCode() == KeyCode.UP) 
			{
				b.increaseSpeed();
			}
			
			else if (e.getCode() == KeyCode.DOWN) 
			{
				b.decreaseSpeed();
			}
		});


		Scene scene = new Scene(b, 250, 150);
		primaryStage.setScene(scene);
		primaryStage.show();
		b.requestFocus();

	}

}
