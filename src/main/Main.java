package main;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import loogika.AndmeBaas;

public class Main extends Application {

    public static Button looGrupp, valiGrupp;
    public static Scene scene1, scene2, scene3;
    public static GridPane layout1;
    public static VBox layout2, layout3;
    public static MenuBar topMenu;
    public static Menu fileMenu, looMenu, kustutaMenu;
    public LooGruppStseen looGruppStseenObj;
    private LisaLiigeStseen lisaLiigeStseenObj;

    //andmebaas
    private static AndmeBaas andmeBaas;

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
        MenuItem j2lgi = new MenuItem("J2lgi kulutusi...");
        MenuItem jaga = new MenuItem("Jaga raha...");
        fileMenu.getItems().addAll(new SeparatorMenuItem(), j2lgi, jaga);

        // looMenu osad e. pea menu sees
        MenuItem lisaLiige = new MenuItem("Lisa uus liige");
        MenuItem looGrupp1 = new MenuItem("Loo uus grupp");
        looMenu.getItems().addAll(lisaLiige, looGrupp1);

        // kustutaMenu osad e. pea menu sees
        MenuItem kustutaGrupp = new MenuItem("Kustuta grupp...");
        MenuItem kustutaLiige = new MenuItem("Kustuta liige...");
        kustutaMenu.getItems().addAll(kustutaGrupp, kustutaLiige);

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
        scene1 = new Scene(layout1, 350, 475);
        primaryStage.setScene(scene1);
        primaryStage.show();


        //andmebaas
        andmeBaas = new AndmeBaas();



        //loo uus grupp objekti loomine
        looGruppStseenObj = new LooGruppStseen();
        //võta layout LooGruppStseen objektist
        layout2 = looGruppStseenObj.getLayout();
        //loo uus grupp stseen
        scene2 = new Scene(layout2, 350, 475);

        // loo uus grupp nupp event
        looGrupp.setOnAction(event -> primaryStage.setScene(scene2));
        looGrupp1.setOnAction(event -> primaryStage.setScene(scene2));
        looGruppStseenObj.nupp.setOnAction(event1 -> primaryStage.setScene(scene3));

        //loon uue stseeni objekti e. liikmete lisamise objekti
        lisaLiigeStseenObj = new LisaLiigeStseen();
        layout3 = lisaLiigeStseenObj.getLayout();
        scene3 = new Scene(layout3, 350, 475);

        // lisa liige nupp event
        lisaLiige.setOnAction(event -> primaryStage.setScene(scene3));

    }

    public static AndmeBaas getAndmeBaas() {
        return andmeBaas;
    }



} // class l6pp
