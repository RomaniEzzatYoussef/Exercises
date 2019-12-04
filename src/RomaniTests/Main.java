package RomaniTests;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

/**
 *
 * 30/10/2019   8:44:03 PM
 *  
 * @author Romani Ezzat
 *
 *
 * Test001
 *
 */
public class Main extends Application
{
    boolean result;

	@Override
	public void start(Stage window) throws Exception 
	{
		window.setTitle("Romani Program");
        window.setOnCloseRequest(e -> {
            e.consume();
            result = Confirm_Box.display("Confirm Exit", "Do you want to exit the Program?");
            if (result) {
                System.out.println("Closing Fine");
                window.close();
            }
        });
		
        Button startMe = new Button("Start Me");
        startMe.setOnAction(e -> startMe());
        
        BorderPane layout = new BorderPane();
        layout.setCenter(startMe);
        Scene scene = new Scene(layout, 1350, 700);
        window.setScene(scene);
        window.setMaximized(true);
        window.show();
	}
	
	public void startMe()
	{
		String num1 = Confirm_Box.promptWindow("Prompt Window", "Enter your first Number:");
		String num2 = Confirm_Box.promptWindow("Prompt Window", "Enter your first Number:");
		int sum = Integer.parseInt(num1) + Integer.parseInt(num2);
		Confirm_Box.display("Result", sum+"");
	}

	public static void main(String[] args) 
	{
		launch(args);
	}
}
