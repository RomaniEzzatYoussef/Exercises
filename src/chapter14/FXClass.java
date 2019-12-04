package chapter14;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.FlowPane;
//import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.text.Font;
import javafx.scene.text.FontPosture;
import javafx.scene.text.FontWeight;
import javafx.stage.Stage;

/**
 *
 * 01/05/2019   11:29:07 AM
 *  
 * @author Romani Ezzat
 *
 *
 * FXClass
 *
 */
public class FXClass extends Application
{
	public static void main(String[] args)
	{
		System.out.println("launch application");
		launch(args);
	}
	
	
	@Override
	public void start(Stage primaryStage) throws Exception 
	{
		Button btn = new Button("OK");
		btn.setStyle("-fx-border-color: blue;");
		
		TextField tfMi = new TextField();
		tfMi.setPrefColumnCount(3);
		
		FlowPane stackPane = new FlowPane();
		stackPane.getChildren().addAll(new Label("First Name:"), new TextField(), new Label("MI:"));
		stackPane.getChildren().addAll(tfMi, new Label("Last Name:"), new TextField() ,new Label("             "), btn);
		stackPane.setStyle("-fx-border-color: blue; -fx-background-color: aqua;");
		
		Scene scene = new Scene(stackPane, 50, 50);
		
		primaryStage.setTitle("MyJavaFxProgram");
		primaryStage.setHeight(600);
		primaryStage.setWidth(600);
		primaryStage.setScene(scene);
		primaryStage.setResizable(true);
		primaryStage.show();
		
		// New Stage
		
		btn.setOnAction(new EventHandler<ActionEvent>() 
		{
			
			@Override
			public void handle(ActionEvent event) 
			{	
				Image image = new Image("file:///E:/Pictures/11376453_940033382715734_1830064455_n.jpg");
				ImageView imageView = new ImageView(image);
				imageView.setFitHeight(400);
				imageView.setFitWidth(200);
				
				Button changeBtn = new Button("Change Circle Color");
				btn.setStyle("-fx-border-color: blue;");
				
				Image image1 = new Image("file:///E:/Pictures/56862250_2394161773948676_6114837753558466560_n.jpg");
				ImageView imageView1 = new ImageView(image1);
				imageView1.setFitHeight(500);
				imageView1.setFitWidth(500);
				imageView1.setRotate(30);
				
				Label label = new Label("Java FX");
				label.setFont(Font.font("Times New Roman", FontWeight.BOLD, FontPosture.ITALIC, 55));
				
				FlowPane pane = new FlowPane();
				pane.setPadding(new Insets(101, 12, 13, 14));
				pane.setHgap(5);
				pane.setVgap(100);
				pane.setPadding(new Insets(5, 5, 5, 5));
				pane.getChildren().addAll(getCircle(), changeBtn, label, imageView1, imageView);
				
				//Scene scene1 = new Scene(stackPane);
				
				Stage stage = new Stage();
				stage.setTitle("Button in a pan at Second Stage");
				stage.setHeight(600);
				stage.setWidth(900);
				stage.setScene(new Scene(pane, 200, 250));
				//stage.setResizable(false);
				stage.show();
				
				changeBtn.setOnAction(new EventHandler<ActionEvent>() {

					@Override
					public void handle(ActionEvent event) 
					{
						changeCircleColor(getCircle());
					}
				});
			}
		});
		
	}
	
	public Circle getCircle()
	{
		Circle circle = new Circle();
		circle.setCenterX(0);
		circle.setCenterY(0);
		circle.setRadius(250);
		circle.setStroke(Color.GREY);
		circle.setFill(Color.AQUA);
		
		
		return circle;
	}
	
	public void changeCircleColor(Circle c)
	{
		c.setFill(Color.RED);
	}

}
