package Examples;

import javafx.application.Application;
import javafx.application.Platform;
import javafx.scene.Scene;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;
import javafx.scene.text.Text;

public class DisplayTextFix extends Application {
    @Override
    public void start(Stage primaryStage) {

        HBox pane = new HBox();

        Scene scene = new Scene(pane, 1500, 700);
        primaryStage.setTitle("Lab Exam 3");
        primaryStage.setScene(scene);
        primaryStage.show();

        new Thread(() -> {
            try {
                for (int i = 0; i < 1000; i++) {
                    Platform.runLater(() -> pane.getChildren().add(new Text("a")));
                    Thread.sleep(80);
                }

            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }).start();

        new Thread(() -> {
            try {
                for (int g = 0; g < 1000; g++) {
                    Platform.runLater(() -> pane.getChildren().add(new Text("b")));
                    Thread.sleep(80);
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }).start();

        new Thread(() -> {
            try {
                for (int g = 0; g < 150; g++) {
                    String num = Integer.toString(g);
                    Platform.runLater(() -> pane.getChildren().add(new Text(num)));
                    Thread.sleep(80);
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }).start();

    }

    public static void main(String[] args) {
        launch(args);
    }
}