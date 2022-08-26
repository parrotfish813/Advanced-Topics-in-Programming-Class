package chapter_15;
import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;

public class HandleEventOk extends Application {
@Override // Override the start method in the Application class
public void start(Stage primaryStage) {
    // Create a pane and set its properties
    HBox pane = new HBox(10);
    pane.setAlignment(Pos.CENTER);
    Button btOK = new Button("OK");
    OkHandlerClass handler1 = new OkHandlerClass();
    btOK.setOnAction(handler1);
    pane.getChildren().addAll(btOK);
    // Create a scene and place it in the stage
    Scene scene = new Scene(pane, 200, 250);
    primaryStage.setTitle("HandleEventOK"); // Set the stage title
    primaryStage.setScene(scene); // Place the scene in the stage
    primaryStage.show(); // Display the stage

    Button btCancel = new Button("Cancel");
    btCancel.setPrefSize(60, 25);
    CancelHandlerClass handler2 = new CancelHandlerClass();
    btCancel.setOnAction(handler2);
    pane.getChildren().addAll(btCancel);

    }
 /* The main method is only needed for the IDE with limited JavaFX support.  */
public static void main(String[] args) {
    launch(args);
    }
} 
class OkHandlerClass implements EventHandler<ActionEvent> {
  @Override
  public void handle(ActionEvent e) {
      System.out.println("OK button clicked");
  }
}

class CancelHandlerClass implements EventHandler<ActionEvent> {
    @Override
    public void handle(ActionEvent e) {
        System.exit(0);
    }
}