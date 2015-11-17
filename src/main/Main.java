package main;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Main extends Application {

    Button button;

    public static void main(String[] args) {
    launch(args);
    } // main.Main meetodi l6pp

    @Override
    public void start(Stage primaryStage) throws Exception {
        primaryStage.setTitle("MoneySplitter");

        Button nupp = new Button("vajuta mind");
        Button nupp2 = new Button("mine tagasi");

        Label label = new Label("mingi kiri");

        StackPane layout = new StackPane();
        layout.getChildren().add(nupp);

        VBox layout1 = new VBox();
        layout1.getChildren().addAll(nupp2, label);

        Scene scene = new Scene(layout, 300, 250);
        primaryStage.setScene(scene);
        primaryStage.show();

        Scene scene1 = new Scene(layout1, 300, 250);

        nupp.setOnAction(event -> primaryStage.setScene(scene1));
        nupp2.setOnAction(event -> primaryStage.setScene(scene));


    }

} // class l6pp
