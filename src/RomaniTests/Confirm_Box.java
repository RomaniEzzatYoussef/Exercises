package RomaniTests;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.text.Font;
import javafx.stage.Modality;
import javafx.stage.Stage;

/**
 *
 * 31/10/2019   1:57:09 PM
 *  
 * @author Romani Ezzat
 *
 *
 * ConfirmBox
 *
 */
public class Confirm_Box 
{
	static  boolean answer;
    static Stage window;

    public static boolean display(String title , String message)
    {
        window = new Stage();
        window.initModality(Modality.APPLICATION_MODAL);
        window.setTitle(title);
        window.setMinWidth(250);
        Label label = new Label();
        label.setStyle("-fx-text-fill : White;" +
                "-fx-text-style : bold");
        label.setFont(Font.font(20));
        label.setAlignment(Pos.CENTER);
        label.setPadding(new Insets(10 , 10 , 10 ,10 ));
        label.setText(message);

        Button yesButton = new Button("Yes");
        Button noButton = new Button("No");

        yesButton.setOnAction(e -> {
            answer = true;
            window.close();
        });
        noButton.setOnAction(e -> {
            Application.setUserAgentStylesheet(Application.STYLESHEET_CASPIAN);
            answer = false;
            window.close();
        });


        HBox hBox = new HBox(5);
        hBox.setPadding(new Insets(10 , 10 , 10 ,10 ));
        hBox.setAlignment(Pos.CENTER);
        hBox.getChildren().addAll(yesButton , noButton);


        BorderPane borderPane = new BorderPane();
        borderPane.setTop(label);
        borderPane.setCenter(hBox);
        borderPane.setStyle("-fx-background-color: #302F2F");

        Scene scene = new Scene(borderPane , 400 , 150);
        window.setScene(scene);
        window.showAndWait();

        return answer;
    }
    
    public static String promptWindow(String title , String message)
    {
        window = new Stage();
        window.initModality(Modality.APPLICATION_MODAL);
        window.setTitle(title);
        window.setMinWidth(250);
        Label label = new Label();
        label.setStyle("-fx-text-fill : White;" +
                "-fx-text-style : bold");
        label.setFont(Font.font(20));
        label.setAlignment(Pos.CENTER);
        label.setPadding(new Insets(10 , 10 , 10 ,10 ));
        label.setText(message);

        TextField input = new TextField();
        Button yesButton = new Button("Yes");
        Button noButton = new Button("No");

        yesButton.setOnAction(e -> {
            answer = true;
            window.close();
        });
        noButton.setOnAction(e -> {
            Application.setUserAgentStylesheet(Application.STYLESHEET_CASPIAN);
            answer = false;
            window.close();
        });


        HBox hBox = new HBox(5);
        hBox.setPadding(new Insets(10 , 10 , 10 ,10 ));
        hBox.setAlignment(Pos.CENTER);
        hBox.getChildren().addAll(yesButton , noButton);


        BorderPane borderPane = new BorderPane();
        borderPane.setTop(label);
        borderPane.setCenter(input);
        borderPane.setBottom(hBox);
        borderPane.setStyle("-fx-background-color: #302F2F");

        Scene scene = new Scene(borderPane , 400 , 150);
        window.setScene(scene);
        window.showAndWait();

        return input.getText().toString();
    }

}
