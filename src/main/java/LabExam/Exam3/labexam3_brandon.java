package LabExam.Exam3;

import javafx.application.Application;
import javafx.application.Platform;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.scene.control.TextArea;

public class labexam3_brandon extends Application {
    @Override
    public void start(Stage mainStage) {

        TextArea box = new TextArea();
        Scene scene = new Scene(box);

        mainStage.setTitle("Concurrent Output");
        mainStage.setScene(scene);
        mainStage.setMinHeight(200);
        mainStage.show();
        box.setWrapText(true);

        new Thread(() -> {
            try {
                for (int i = 0; i < 1000; i++) {
                    Platform.runLater(() -> box.appendText("a"));
                    Thread.sleep(80);
                }

            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }).start();

        new Thread(() -> {
            try {
                for (int g = 0; g < 1000; g++) {
                    Platform.runLater(() -> box.appendText("b"));
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
                    Platform.runLater(() -> box.appendText(num));
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