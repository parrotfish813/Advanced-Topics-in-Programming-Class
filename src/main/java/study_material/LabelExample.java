package study_material;

import javafx.application.Application;
import javafx.scene.ImageCursor;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

import java.awt.*;

public class LabelExample extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {

        FlowPane pane = new FlowPane();

        Image img = new Image("http://assets.stickpng.com/images/58afd6b70187e59a7d8a8f1c.png");
        Label node = new Label("test", new ImageView(img));
        Label node1 = new Label("test1", new ImageView(img));
        Label node2 = new Label("test2", new ImageView(img));
        Label node3 = new Label("test3", new ImageView(img));


        pane.getChildren().add(node);
        pane.getChildren().add(node1);
        pane.getChildren().add(node2);
        pane.getChildren().add(node3);

        Scene scene = new Scene(pane, 200, 200);
        primaryStage.setScene(scene); // Place the scene in the stage
        primaryStage.show();
    }
}
