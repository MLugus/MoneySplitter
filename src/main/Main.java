package main;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;
import loogika.AndmeBaas;

public class Main extends Application {


    public static Scene scene1, scene2, scene3, scene4, scene5, scene6, scene7;
    public BorderPane layout1, layout2, layout3, layout4, layout5, layout6, layout7;
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
        //andmebaas
        andmeBaas = new AndmeBaas();

        //loon menyy objekti
        menyyObj = new Menyy();

        // loon StartStseen tyypi objekti
        StartStseen startStseenObj = new StartStseen();
        this.layout1 = startStseenObj.getLayout1();

        // scene1 ja window
        aken.setTitle("MoneySplitter");
        scene1 = new Scene(layout1, 350, 475);
        aken.setScene(scene1);

        //loo uus grupp objekti loomine ja layouti võtmine
        LooGruppStseen looGruppStseenObj = new LooGruppStseen();
        this.layout2 = looGruppStseenObj.getLayout1();
        //loo uus grupp stseen
        scene2 = new Scene(layout2, 350, 475);


        //loon uue stseeni objekti e. liikmete lisamise objekti
        LisaLiigeStseen lisaLiigeStseenObj = new LisaLiigeStseen();
        layout3 = lisaLiigeStseenObj.getLayout1();
        scene3 = new Scene(layout3, 350, 475);

        //loon uue vali grupp stseeni ja lisan ka layouti
        ValiGruppStseen valiGruppStseenObj = new ValiGruppStseen();
        layout4 = valiGruppStseenObj.getLayout1();
        scene4 = new Scene(layout4, 350, 475);

        //loon uue kustuta grupp stseeni ja lisan ka layoutid
        KustutaGruppStseen kustutaGruppStseenObj = new KustutaGruppStseen();
        layout5 = kustutaGruppStseenObj.getLayout1();
        scene5 = new Scene(layout5, 350, 475);

        //loon uue kustuta likme stseeni ja toon üle ka layouti
        KustutaLiigeStseen kustutaLiigeStseenObj = new KustutaLiigeStseen();
        layout6 = kustutaLiigeStseenObj.getLayout1();
        scene6 = new Scene(layout6, 350, 475);

        //loon tgele grupiga stseeni objekti ja lisan layouti
        TegeleGrupigaStseen tegeleGrupigaStseenObj = new TegeleGrupigaStseen();
        layout7 = tegeleGrupigaStseenObj.getLayout1();
        scene7 = new Scene(layout7, 350, 475);


        aken.show();

    }

    // returnib main'is loodud AndmeBaas'i tüüpi objekti
    public static AndmeBaas getAndmeBaas() {
        return andmeBaas;
    }

    //meetod stseenide vahetuseks
    public static void stseeniVahetus(Scene stseen) {
        aken.setScene(stseen);
    }



} // class l6pp
