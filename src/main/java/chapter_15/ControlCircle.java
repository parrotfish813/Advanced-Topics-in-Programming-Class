package chapter_15;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.BorderPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.text.Font;
import javafx.scene.text.FontPosture;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class ControlCircle extends Application {

  private CirclePane circlePane = new CirclePane();

  @Override // Override the start method in the Application class
  public void start(Stage primaryStage) {
    // Hold two buttons in an HBox
    HBox hBox = new HBox();
    hBox.setSpacing(10);
    hBox.setAlignment(Pos.CENTER);

    Button btEnlarge = new Button("Enlarge");
    Button btShrink = new Button("Shrink");
    hBox.getChildren().add(btEnlarge);
    hBox.getChildren().add(btShrink);

    Button btColorBlue = new Button("Blue");
    hBox.getChildren().add(btColorBlue);
    Button btColorWhite = new Button("White");
    hBox.getChildren().add(btColorWhite);

    // Create and register the handler
    btEnlarge.setOnAction(new EnlargeHandler());
    btShrink.setOnAction(new ShrinkHandler());
    btColorBlue.setOnAction(new ColorHandlerBlue());
    btColorWhite.setOnAction(new ColorHandlerWhite());
     
    BorderPane borderPane = new BorderPane();
    borderPane.setCenter(circlePane);
    borderPane.setBottom(hBox);
    borderPane.setAlignment(hBox, Pos.CENTER);

    Text tx1 = new Text("Hello there motherfucker");
    hBox.getChildren().add(tx1);

    Pane paneLabel = new Pane();

    Label label = new Label("JavaFX");
    label.setFont(Font.font("Times New Roman",
            FontWeight.BOLD, FontPosture.ITALIC, 20));
    paneLabel.getChildren().add(label);

     // Create a scene and place it in the stage
    Scene scene = new Scene(borderPane, 500, 500);
    primaryStage.setTitle("ControlCircle"); // Set the stage title
    primaryStage.setScene(scene); // Place the scene in the stage
    primaryStage.show(); // Display the stage
  }
 
  class EnlargeHandler implements EventHandler<ActionEvent> {
    @Override // Override the handle method
    public void handle(ActionEvent e) {
      circlePane.enlarge();
    }
  }
  
  class ShrinkHandler implements EventHandler<ActionEvent> {
    @Override // Override the handle method
    public void handle(ActionEvent e) {
      circlePane.shrink();
    }
  }

  class ColorHandlerBlue implements EventHandler<ActionEvent> {
    @Override // Override the handle method
    public void handle(ActionEvent e) {
      circlePane.fillBlue();
    }
  }
  class ColorHandlerWhite implements EventHandler<ActionEvent> {
    @Override // Override the handle method
    public void handle(ActionEvent e) {
      circlePane.fillWhite();
    }
  }

  public static void main(String[] args) {
    launch(args);
  }
}

class CirclePane extends StackPane {
  private Circle circle = new Circle(50); 
  
  public CirclePane() {
    getChildren().add(circle);
    circle.setStroke(Color.BLACK);
    circle.setFill(Color.WHITE);
  }
  
  public void enlarge() {
    circle.setRadius(circle.getRadius() + 2);
  }
  
  public void shrink() {
   if (circle.getRadius() > 2) {
     circle.setRadius(circle.getRadius() - 2);
   }

   else {
     circle.setRadius(circle.getRadius());
   }
  }

  public void fillBlue() {
    circle.setFill(Color.BLUE);
  }
  public void fillWhite() {
    circle.setFill(Color.WHITE);
  }

}