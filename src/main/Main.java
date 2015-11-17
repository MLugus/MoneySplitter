package main;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.*;
import javafx.stage.Stage;

public class Main extends Application {

    Button looGrupp, valiGrupp;
    Scene scene;
    GridPane layout1;
    MenuBar topMenu;
    Menu fileMenu, looMenu, kustutaMenu;

    public static void main(String[] args) {
        launch(args);
    } // main.Main meetodi l6pp

    @Override
    public void start(Stage primaryStage) throws Exception {

        // menu loomine jne.
        fileMenu = new Menu("_File");
        looMenu = new Menu("Lisa/Loo");
        kustutaMenu = new Menu("Kustuta");


        // fileMenu osad e. peamine menüü "file"
        fileMenu.getItems().addAll(looMenu, kustutaMenu);
        fileMenu.getItems().add(new SeparatorMenuItem());
        MenuItem j2lgi = new MenuItem("J2lgi kulutusi...");
        fileMenu.getItems().add(j2lgi);
        MenuItem jaga = new MenuItem("Jaga raha...");
        fileMenu.getItems().add(jaga);

        // looMenu osad e. pea menu sees
        MenuItem lisaLiige = new MenuItem("Lisa uus liige...");
        looMenu.getItems().add(lisaLiige);
        MenuItem looGrupp1 = new MenuItem("Loo uus grupp");
        looMenu.getItems().add(looGrupp1);

        // kustutaMenu osad e. pea menu sees
        MenuItem kustutaGrupp = new MenuItem("Kustuta grupp...");
        kustutaMenu.getItems().add(kustutaGrupp);
        MenuItem kustutaLiige = new MenuItem("Kustuta liige...");
        kustutaMenu.getItems().add(kustutaLiige);

        // main menu bar
        topMenu = new MenuBar();
        topMenu.getMenus().addAll(fileMenu);
        GridPane.setConstraints(topMenu, 0, 0);

        //main layout1
        layout1 = new GridPane();
        layout1.setPadding(new Insets(0, 10, 10, 0));
        layout1.setVgap(8);
        layout1.setHgap(10);

        // tervituskiri
        Label tervitus = new Label("Tere tulemast MoneySplitter'isse!!");
        GridPane.setConstraints(tervitus, 8, 3);

        // loo uus grupp nupp
        looGrupp = new Button("Loo uus grupp");
        GridPane.setConstraints(looGrupp, 8, 12);

        // vali grupp nupp
        valiGrupp = new Button("Vali grupp");
        GridPane.setConstraints(valiGrupp, 8, 15);

        //lisan kõik osad layouti
        layout1.getChildren().addAll(valiGrupp, looGrupp, tervitus, topMenu);

        // scene1 ja window
        primaryStage.setTitle("MoneySplitter");
        scene = new Scene(layout1, 350, 475);
        primaryStage.setScene(scene);
        primaryStage.show();


    }

} // class l6pp
