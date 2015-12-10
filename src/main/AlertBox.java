package main;

import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.stage.Modality;
import javafx.stage.Stage;

public class AlertBox {

    static boolean vastus;

    public static boolean KysimusKast(String pealkiri, String infoText) {

        Stage aken = new Stage();
        aken.initModality(Modality.APPLICATION_MODAL);
        aken.setTitle(pealkiri);
        aken.setMinWidth(250);

        //teavitus kiri
        Label teavitusKiri = new Label(infoText);

        //"ei" ja "jah" nupud teavitus kastil
        Button jahNupp = new Button("jah");
        Button eiNupp = new Button("Ei");

        //loon evendid nuppudele
        jahNupp.setOnAction(event -> {
            vastus = true;
            aken.close();
        });
        eiNupp.setOnAction(event -> {
            vastus = false;
            aken.close();
        });
        // loob vajaliku layouti ja stseeni ning paneb akna ette ja ootele
        VBox layout1 = new VBox();
        layout1.getChildren().addAll(teavitusKiri, jahNupp, eiNupp);
        layout1.setAlignment(Pos.CENTER);
        Scene scene = new Scene(layout1);
        aken.setScene(scene);
        aken.showAndWait();


        return vastus;
    }

}
