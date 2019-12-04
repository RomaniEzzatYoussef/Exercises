package chapter12.textInputOutput;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.GridPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

/**
 *
 * 22/05/2019   2:54:25 PM
 *  
 * @author Romani Ezzat
 *
 *
 * Test_04
 *
 */
public class Test_04 extends Application
{
	public static void main(String[] args) 
	{
		launch(args);
	}
	
	public static void m()
	{
		String s = "Returns a string whose value is this string, with any leading and trailingwhitespace removed. \r\n" + 
				"\r\n" + 
				"If this String object represents an empty charactersequence, or the first and last characters of character sequencerepresented by this String object both have codesgreater than '\\u005Cu0020' (the space character), then areference to this String object is returned. \r\n";
		String s1 = s.trim();
		System.out.println(s1);
	}

	@Override
	public void start(Stage primaryStage) throws Exception 
	{
		Label txt = new Label();
		Button btn = new Button("Change Circle Color");
		Circle circle = new Circle(125, 100, 50);
		GridPane pane = new GridPane();

		
		
		
		btn.setOnAction(new EventHandler<ActionEvent>() 
		{
			
			

			@Override
			public void handle(ActionEvent event) 
			{
				Circle c = new Circle((int)(Math.random() * 255), (int)(Math.random() * 255), (int)(Math.random() * 255));
				
				Rectangle r = new Rectangle((Math.random() * 255),(Math.random() * 255), (Math.random() * 255), (Math.random() * 255));
				
				r.setFill(Color.rgb((int)(Math.random() * 255), (int)(Math.random() * 255), (int)(Math.random() * 255)));
				r.setStroke(Color.BLACK);
				
				c.setFill(Color.rgb((int)(Math.random() * 255), (int)(Math.random() * 255), (int)(Math.random() * 255)));
				c.setStroke(Color.BLACK);

				circle.setFill(Color.rgb((int)(Math.random() * 255), (int)(Math.random() * 255), (int)(Math.random() * 255)));
				circle.setStroke(Color.BLACK);
				
				pane.add(c, 0, 3);
				
				pane.add(r, 1, 3);


                
			}    
			
		});
		
		
		
		pane.add(btn, 0, 0);
		pane.add(txt, 0, 1);
		pane.add(circle, 0, 2);
		
		
		Scene scene = new Scene(pane);
		primaryStage.setScene(scene);
		primaryStage.setTitle("Color Change");
		primaryStage.show();
	}
	
		

}

