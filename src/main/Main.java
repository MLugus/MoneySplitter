package main;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;
import loogika.AndmeBaas;

import java.util.ArrayList;

public class Main extends Application {


    public static Scene scene1, scene2, scene3;
    public BorderPane layout1, layout2, layout3;
    public LooGruppStseen looGruppStseenObj;
    private static Stage aken;
    public static Menyy menyyObj;

    //andmebaas
    private static AndmeBaas andmeBaas;

    public static void main(String[] args) {
        launch(args);
    } // main.Main meetodi l6pp


    @Override
    public void start(Stage primaryStage) throws Exception {

        aken = primaryStage;

        //loon menyy objekti
        menyyObj = new Menyy();

        // loon StartStseen tyypi objekti
        StartStseen startStseenObj = new StartStseen();
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


        //loon uue stseeni objekti e. liikmete lisamise objekti
        LisaLiigeStseen lisaLiigeStseenObj = new LisaLiigeStseen();
        layout3 = lisaLiigeStseenObj.getLayout1();
        scene3 = new Scene(layout3, 350, 475);

    }

    // returnib main'is loodud AndmeBaas'i tüüpi objekti
    public static AndmeBaas getAndmeBaas() {
        return andmeBaas;
    }

    //// tagastab VB gruppide arraylisti
    //// public static ArrayList<Grupp> getGruppList(){return andmeBaas.gruppideList;}

    //meetod stseenide vahetuseks
    public static void stseeniVahetus(Scene stseen) {
        aken.setScene(stseen);
    }



} // class l6pp
