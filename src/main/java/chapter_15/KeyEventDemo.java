package chapter_15;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

public class KeyEventDemo extends Application {
  @Override // Override the start method in the Application class
  public void start(Stage primaryStage) {
    // Create a pane and set its properties
    Pane pane = new Pane();
    Image img = new Image("https://static.wikia.nocookie.net/p__/images/b/bd/AnnoyingOrange.png/revision/latest/top-crop/width/360/height/360?cb=20210426021237&path-prefix=protagonist");
    ImageView imageView1 = new ImageView(img);
    pane.getChildren().add(imageView1);
    Scene scene = new Scene(pane);
    primaryStage.setTitle("KeyEventDemo"); // Set the stage title
    primaryStage.setScene(scene); // Place the scene in the stage
    primaryStage.show(); // Display the stage

    imageView1.setOnKeyPressed(e -> {
      switch (e.getCode()) {
        case DOWN: imageView1.setY(imageView1.getY() + 20); break;
        case UP:  imageView1.setY(imageView1.getY() - 20); break;
        case LEFT: imageView1.setX(imageView1.getX() - 20); break;
        case RIGHT: imageView1.setX(imageView1.getX() + 20); break;
      }
    });
    imageView1.requestFocus(); // text is focused to receive key input
  }

  public static void main(String[] args) {
    launch(args);
  }
} 

