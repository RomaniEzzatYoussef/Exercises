package chapter11;
/**
 *
 * 02/05/2019   6:20:41 PM
 *  
 * @author Romani Ezzat
 *
 *
 * Exercise_04
 *
 */

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;


public class Exercise_04 extends Application
{
	static String message = " ";
	/**
	 * @param args
	 */
	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter size of the list: ");
		ArrayList<Integer> list = fillList(input.nextInt()); 
		message += ("The largest number in the list is " + max(list) + ".");
		
		Application.launch(args);
		input.close();
	}
	
	@Override
	public void start(Stage primaryStage) throws Exception 
	{
		Label label = new Label(message);
		label.setFont(new javafx.scene.text.Font(20));;
		label.setStyle("-fx-border-color: black; -fx-text-fill: blue; -fx-background-color: aqua; -fx-font-weight: bold;");
		
		GridPane pane = new GridPane();
		pane.add(label, 0, 0);
		
		Scene scene = new Scene(pane);
		primaryStage.setScene(scene);
		primaryStage.show();
	}
	
	public static Integer max(ArrayList<Integer> list)
	{
		if (list.size() == 0)
			return null;
		
		int max = Integer.MIN_VALUE;
		
		for (int i = 0; i < list.size(); i++)
			if (max < list.get(i))
				max = list.get(i);
		
		return max;
	}
	
	public static ArrayList<Integer> fillList(int size)
	{
		Random randNum = new Random();
		ArrayList<Integer> tempList = new ArrayList<Integer>();
		
		message += ("Adding numbers: ");
		for (int i = 0; i <size; i++)
		{
			int number = randNum.nextInt(100) * 10;
			message += (number + " ");
			tempList.add(number);
		}
		message += ("\n");
		
		return tempList;

	}

	

}
