package gui;
import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;;

public class NewJFX extends Application
{

	@Override
	public void start(Stage primaryStage) throws Exception 
	{	
		primaryStage.setTitle("JavaFX Welcome");
		primaryStage.show();
		GridPane grid = new GridPane();
		grid.setAlignment(Pos.CENTER);
		
		Scene scene = new Scene(grid , 300 , 300);
		primaryStage.setScene(scene);
	}
	
	public static void main(String[] args)
	{
		launch(args);
	}
	
}
