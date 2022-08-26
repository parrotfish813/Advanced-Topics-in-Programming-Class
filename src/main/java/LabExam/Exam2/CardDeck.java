package LabExam.Exam2;

import java.util.ArrayList;
import java.util.Random;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

public class CardDeck extends Application {

    @Override
    public void start(Stage primaryStage) {

        Random rand = new Random();

        int num1 = rand.nextInt(52);
        int num2 = rand.nextInt(52);
        int num3 = rand.nextInt(52);

        String card1 = "http://liveexample.pearsoncmg.com/book/image/card/" + num1 + ".png";
        String card2 = "http://liveexample.pearsoncmg.com/book/image/card/" + num2 + ".png";
        String card3 = "http://liveexample.pearsoncmg.com/book/image/card/" + num3 + ".png";

        primaryStage.setTitle("Shuffling Deck Program");

        BorderPane bPane1 = new BorderPane();
        HBox pane1 = new HBox(10);
        HBox pane2 = new HBox(10);

        ImageView view0 = new ImageView(new Image(card1));
        ImageView view1 = new ImageView(new Image(card2));
        ImageView view2 = new ImageView(new Image(card3));

        pane1.setAlignment(Pos.CENTER);
        pane2.setAlignment(Pos.CENTER);

        pane1.getChildren().addAll(view0, view1, view2);

        bPane1.setCenter(pane1);
        bPane1.setBottom(pane2);

        Scene scene1 = new Scene(bPane1, 600, 650);
        primaryStage.setScene(scene1);
        primaryStage.show();

    }

    public static void main(String[] args) {
        launch(args);
    }
}