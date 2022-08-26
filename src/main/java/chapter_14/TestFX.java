package chapter_14;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;

public class TestFX extends Application {

    @Override
    public void start(Stage primaryStage) {

        StackPane pane1 = new StackPane();

        //pane1.getChildren().add(new Button("Florida PolyCon"));

        Circle cir1 = new Circle();

        cir1.setRadius(500);
        cir1.setFill(Color.PINK);
        pane1.getChildren().add(cir1);

        Circle cir2 = new Circle();
        cir2.setRadius(100);
        cir2.setCenterX(225);
        cir2.setCenterY(225);
        cir2.setFill(Color.PURPLE);
        pane1.getChildren().add(cir2);

        Button bOk = new Button("Florida PolyCon");
        bOk.setPrefSize(100, 100);
        pane1.getChildren().add(bOk);

        Pane pane = new HBox(10);
        //pane.setPadding(new Insets(5, 5, 5));

        //Image image = new Image("image/us.gif");
        Image image = new Image("https://i.kym-cdn.com/entries/icons/original/000/022/949/4807767__142368ccb8bb9f59b40d26d9ae2434f4.jpg");
        pane1.getChildren().add(new ImageView(image));

        Scene scene1 = new Scene(pane1, 200, 250);
        primaryStage.setTitle("Button in a pane");
        pane1.setStyle("-fx-background-color: GOLD;");
        primaryStage.setScene(scene1);
        primaryStage.show();
    }
    public static void main(String[] args) {
        launch(args);
    }

}
