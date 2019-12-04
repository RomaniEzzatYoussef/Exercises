package chapter12.textInputOutput;

import com.sun.javafx.scene.text.TextLine;

import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.util.Duration;

/**
 *
 * 30/05/2019 3:24:41 PM
 * 
 * @author Romani Ezzat
 *
 *
 *         BallPane
 *
 */
public class BallPane extends Pane {

	
	
	public final double radius = 20;
	private double x = radius, y = radius;
	private double dx = 1, dy = 1;
	private Circle circle = new Circle(x, y, radius);
	private Timeline animation;

	public BallPane() {
		circle.setFill(Color.GREEN);
		getChildren().add(circle);

		animation = new Timeline(new KeyFrame(Duration.millis(5), e -> moveBall()));
		animation.setCycleCount(Timeline.INDEFINITE);
		 animation.play(); // Start animation
	}

	public void play() {
		animation.play();
	}

	public void pause() {
		animation.pause();
	}

	public void increaseSpeed() {
		animation.setRate(animation.getRate() + 0.1);
	}

	public void decreaseSpeed() {
		animation.setRate(animation.getRate() > 0 ? animation.getRate() - 0.1 : 0);
	}

	
	protected void moveBall() {
		// Check boundaries
		if (x < radius || x > getWidth() - radius) {
			dx *= -1; // Change ball move direction
		}
		if (y < radius || y > getHeight() - radius) {
			dy *= -1; // Change ball move direction
		}

		// Adjust ball position
		x += dx;
		y += dy;
		circle.setCenterX(x);
		circle.setCenterY(y);
	}

}
