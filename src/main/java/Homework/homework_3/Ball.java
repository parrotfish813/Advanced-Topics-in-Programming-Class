package Homework.homework_3;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Bounds;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;

public class Ball extends Application {
    Circle circle = new Circle();
    Pane bc = new Pane();
    public BorderPane borderPane;

    @Override
    public void start(Stage primaryStage) {
        //Setting the size, color and starting position of the ball
        bc.getChildren().add(circle);
        circle.setCenterX(125.0f);
        circle.setCenterY(115.0f);
        circle.setRadius(25.0f);
        circle.setStroke(Color.BLACK);
        circle.setFill(Color.WHITE);

        //Setting up the buttons
        HBox pane = new HBox();
        pane.setSpacing(10);
        pane.setAlignment(Pos.CENTER);
        Button btUp = new Button("Up");
        Button btDown = new Button("Down");
        Button btLeft = new Button("Left");
        Button btRight = new Button("Right");

        //Putting the buttons in the pane
        pane.getChildren().add(btLeft);
        pane.getChildren().add(btRight);
        pane.getChildren().add(btUp);
        pane.getChildren().add(btDown);

        //Creating the border pane and centering it on the ball
        borderPane = new BorderPane();
        borderPane.setCenter(bc);
        borderPane.setBottom(pane);
        BorderPane.setAlignment(pane, Pos.CENTER);

        //Setting up the function of the buttons
        btUp.setOnAction(new UpHandler());
        btDown.setOnAction(new DownHandler());
        btLeft.setOnAction(new LeftHandler());
        btRight.setOnAction(new RightHandler());

        //Creating the scene
        Scene scene = new Scene(borderPane, 250, 250);
        primaryStage.setTitle("Ball"); // Set the stage title
        primaryStage.setScene(scene); // Place the scene in the stage
        primaryStage.show();
    }

    //Handler that moves the ball up
    class UpHandler implements EventHandler<ActionEvent> {
        public void handle(ActionEvent e) {
            if (moveAcceptable("up"))
                circle.setCenterY(circle.getCenterY() - 10);
        }
    }

    //Handler that moves the ball down
    class DownHandler implements EventHandler<ActionEvent> {
        public void handle(ActionEvent e) {
            if (moveAcceptable("Down")) {
                circle.setCenterY(circle.getCenterY() + 10);
            }
        }
    }

    //Handler that moves the ball to the left
    class LeftHandler implements EventHandler<ActionEvent> {
        public void handle(ActionEvent e) {
            if (moveAcceptable("Left")) {
                circle.setCenterX(circle.getCenterX() - 10);
            }
        }
    }

    //Handler that moves the ball to the right
    class RightHandler implements EventHandler<ActionEvent> {
        public void handle(ActionEvent e) {
            if (moveAcceptable("Right")) {
                circle.setCenterX(circle.getCenterX() + 10);
            }
        }
    }

    //Function that tests if the ball is in bounds
    public boolean moveAcceptable(String direction) {
        //Getting the bondery and assinging it to a new variable
        final Bounds bounds = borderPane.getLayoutBounds();

        //Checking if the ball is higher than the bounds
        if (direction.equalsIgnoreCase("up")) {
            return (circle.getCenterY() > (bounds.getMinY() + circle.getRadius()));
        }

        //Checking if the ball is lower then the bounds
        else if (direction.equalsIgnoreCase("down")) {
            return circle.getCenterY() < (bounds.getMaxY() - circle.getRadius());
        }

        //Checking if the ball is to the right of the bounds
        else if (direction.equalsIgnoreCase("right")) {
            return circle.getCenterX() < (bounds.getMaxX() - circle.getRadius());
        }

        //Checking if the ball is to the left of the bounds
        else {
            return circle.getCenterX() > (bounds.getMinX() + circle.getRadius());
        }
    }

    public static void main(String[] args) { launch(args); }
}
