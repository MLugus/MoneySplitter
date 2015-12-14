package stseenid;

import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.stage.Modality;
import javafx.stage.Stage;
import main.Main;

public class LisaOstBox {

    public static void lisaOstBox() {
        // uue akna loomine
        Stage aken = new Stage();
        aken.initModality(Modality.APPLICATION_MODAL);
        aken.setTitle("OSTU LISAMINE");
        aken.setMinWidth(250);

        //loon info teksti
        Label infoText = new Label("Sisesta ostu nimi ja hind!");

        //loon textFieldid info sisestamiseks
        TextField ostuNimi = new TextField();
        ostuNimi.setPromptText("Ostu nimi");
        TextField ostuHind = new TextField();
        ostuHind.setPromptText("Hind");

        //loon nupud ja nende funktsionaalsuse
        Button nupp1 = new Button("LISA OST!");
        nupp1.setOnAction(event1 -> {
            Main.getAndmeBaas().gruppideList.get(Main.getSelectedGrupp()).grupiLiikmed.get(
                    TegeleGrupigaStseen.selectedLiige).lisaOst(ostuNimi.getText(), Double.parseDouble(ostuHind.getText()));

            aken.close();

            System.out.println(Main.getAndmeBaas().gruppideList.get(Main.getSelectedGrupp()).grupiLiikmed.get(
                    TegeleGrupigaStseen.selectedLiige).ostud);
        });
        Button nupp2 = new Button("Cancel");
        nupp2.setOnAction(event -> aken.close());
        // layoutide ja scene loomine ning akna n2itamine ja ootele panek
        VBox layout1 = new VBox();
        layout1.setAlignment(Pos.CENTER);
        layout1.getChildren().addAll(infoText, ostuNimi, ostuHind, nupp1, nupp2);
        Scene scene1 = new Scene(layout1);
        aken.setScene(scene1);
        aken.showAndWait();
    }

}
