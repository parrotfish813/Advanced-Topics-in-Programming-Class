package Homework.homework_4;

import javafx.application.Application;
import javafx.application.Platform;
import javafx.scene.Scene;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

public class FlagRisingAnimationWithThread extends Application {
  private double flagY = 200;

  @Override // Override the start method in the Application class
  public void start(Stage primaryStage) {
    // Create a pane 
    Pane pane = new Pane();

    ImageView imageView = new ImageView("http://liveexample.pearsoncmg.com/book/image/us.gif");

    pane.getChildren().add(imageView);

    imageView.setX(50);
    imageView.setY(flagY);

    new Thread(() -> {
      try {
        while (flagY >= 0) {
          Platform.runLater(() -> imageView.setY(--flagY));
          Thread.sleep(20);
        }
      }
      catch(InterruptedException ex){
        ex.printStackTrace();
      }
    }).start();

    // Create a scene and place it in the stage
    Scene scene = new Scene(pane, 250, 200);
    primaryStage.setTitle("FlagRisingAnimation"); // Set the stage title
    primaryStage.setScene(scene); // Place the scene in the stage
    primaryStage.show(); // Display the stage
  }

  public static void main(String[] args) {
    launch(args);
  }
}
