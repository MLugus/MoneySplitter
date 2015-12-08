package main;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.VBox;
import loogika.Grupp;

import static javafx.geometry.Pos.CENTER;

public class KustutaGruppStseen {

    private static ChoiceBox<Grupp> grupiDropDown;


    private BorderPane layout1;

    public KustutaGruppStseen() {

        // layoutide loomine
        layout1 = new BorderPane();
        VBox layout2 = new VBox();

        //Tervitus kirja loomine
        Label infoText = new Label("Palun valige grupp mida soovite kustutada");

        //loon Choicebox'id ja täidan need esialgse infoga
        grupiDropDown = Main.getAndmeBaas().getGruppideListChBox();

        //loon nupu ja lisan funktsinaalsuse
        Button nupp = new Button("Kustuta");
        nupp.setOnAction(event -> {
            Boolean vastus = AlertBox.KysimusKast("KAS IKKA KUSTUTAN", "Olete te kindlad, et tahate liiget kustutada?");
            if (vastus) {
                Main.getAndmeBaas().gruppideList.remove(Main.getAndmeBaas().gruppideList.indexOf(grupiDropDown.getValue()));
                refreshChBoxKustGrup();
            }
        });

        // loon menüü
        layout1.setTop(Main.menyyObj.getMenuBar());

        //lisan layout2'le elemendid ning teen asetuse ja lisan layout1'te
        layout2.getChildren().addAll(infoText, grupiDropDown, nupp);
        layout2.setAlignment(CENTER);
        layout2.setSpacing(20);
        layout1.setCenter(layout2);
    }

    // uuendab choiceboxi
    public static void refreshChBoxKustGrup() {
        ObservableList<Grupp> chBoxRefh = FXCollections.observableArrayList(Main.getAndmeBaas().gruppideList);
        grupiDropDown.setItems(chBoxRefh);

    }

    public BorderPane getLayout1() {
        return layout1;
    }

}
