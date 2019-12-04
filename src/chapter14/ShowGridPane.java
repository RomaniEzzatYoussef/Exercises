package chapter14;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

/**
 *
 * 01/05/2019   7:26:13 PM
 *  
 * @author Romani Ezzat
 *
 *
 * ShowGridPane
 *
 */
public class ShowGridPane extends Application 
{

	/**
	 * @param args
	 */
	public static void main(String[] args) 
	{
		Application.launch(args);
	}

	@Override
	public void start(Stage primaryStage) throws Exception 
	{
		GridPane pane = new GridPane();
		pane.setAlignment(Pos.CENTER);
		pane.setPadding(new Insets(11.5, 12.5, 13.5, 14.5));
		pane.setHgap(5.5);
		pane.setVgap(5.5);
		
		pane.add(new Label("First Name:"), 0, 1);
		pane.add(new TextField(), 1, 1);
		pane.add(new Label("Last Name:"), 0, 2);
		pane.add(new TextField(), 1, 2);
		pane.add(new Label("Email:"), 0, 3);
		pane.add(new TextField(), 1, 3);
		pane.setStyle("-fx-background-color: aqua");
		
		Button btn = new Button("Add Name");
		pane.add(btn, 1, 4);
		
		Scene scene = new Scene(pane);
		primaryStage.setScene(scene);
		primaryStage.setTitle("Enter you name?");
		primaryStage.show();
		
	}

}
