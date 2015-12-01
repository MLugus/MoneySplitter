package main;

import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.stage.Modality;
import javafx.stage.Stage;

public class AskBox {

    static boolean vastus;

    public static boolean kysimusKast() {

        Stage aken = new Stage();
        aken.initModality(Modality.APPLICATION_MODAL);
        aken.setTitle("LISA UUS LIIGE VÕI LIIGU EDASI");
        aken.setMinWidth(250);

        //teavitus kiri
        Label teavitusKiri = new Label("Kas soovid lisada veel ühe liikme?");

        //"ei" ja "jah" nupud teavitus kastil
        Button lisaLiigeNupp = new Button("jah");
        Button edasiNupp = new Button("Ei");

        //loon evendid nuppudele
        lisaLiigeNupp.setOnAction(event -> {
            vastus = true;
            aken.close();
        });
        edasiNupp.setOnAction(event -> {
            vastus = false;
            aken.close();
        });

        VBox layout1 = new VBox();
        layout1.getChildren().addAll(teavitusKiri, lisaLiigeNupp, edasiNupp);
        layout1.setAlignment(Pos.CENTER);
        Scene scene = new Scene(layout1);
        aken.setScene(scene);
        aken.showAndWait();


        return vastus;
    }

}
