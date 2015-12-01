package main;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import loogika.AndmeBaas;

public class Main extends Application {


    public static Scene scene1, scene2, scene3;
    public BorderPane layout1, layout2, layout3;
    public LooGruppStseen looGruppStseenObj;
    private LisaLiigeStseen lisaLiigeStseenObj;
    private StartStseen startStseenObj;
    private static Stage aken;

    //andmebaas
    private static AndmeBaas andmeBaas;

    public static void main(String[] args) {
        launch(args);
    } // main.Main meetodi l6pp


    @Override
    public void start(Stage primaryStage) throws Exception {

        aken = primaryStage;

        // loon StartStseen tyypi objekti
        startStseenObj = new StartStseen();
        this.layout1 = startStseenObj.getLayout1();

        // scene1 ja window
        aken.setTitle("MoneySplitter");
        scene1 = new Scene(layout1, 350, 475);
        aken.setScene(scene1);
        aken.show();


        //andmebaas
        andmeBaas = new AndmeBaas();


        //loo uus grupp objekti loomine
        this.looGruppStseenObj = new LooGruppStseen();
        //võta layout LooGruppStseen objektist
        this.layout2 = looGruppStseenObj.getLayout1();
        //loo uus grupp stseen
        scene2 = new Scene(layout2, 350, 475);

        // loo uus grupp nupp event
        // looGrupp.setOnAction(event -> primaryStage.setScene(scene2));
        // looGrupp1.setOnAction(event -> primaryStage.setScene(scene2));
        // looGruppStseenObj.nupp.setOnAction(event1 -> primaryStage.setScene(scene3));

        //loon uue stseeni objekti e. liikmete lisamise objekti
        lisaLiigeStseenObj = new LisaLiigeStseen();
        layout3 = lisaLiigeStseenObj.getLayout1();
        scene3 = new Scene(layout3, 350, 475);

        // lisa liige nupp event
        //  lisaLiige.setOnAction(event -> primaryStage.setScene(scene3));

    }

    public static AndmeBaas getAndmeBaas() {
        return andmeBaas;
    }

    //meetod stseenide vaehtuseks
    public static void stseeniVahetus(Scene stseen) {
        aken.setScene(stseen);
    }



} // class l6pp
