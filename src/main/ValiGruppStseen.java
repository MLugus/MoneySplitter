package main;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.VBox;
import loogika.Grupp;

import static javafx.geometry.Pos.CENTER;

public class ValiGruppStseen {

    private Button nupp;
    private static ComboBox<Grupp> grupiDropDown;


    private BorderPane layout1;

    public ValiGruppStseen() {

        // layoutide loomine
        layout1 = new BorderPane();
        VBox layout2 = new VBox();

        //Tervitus kirja loomine
        Label infoText = new Label("Vali grupp, millega tegeleda edaspidi!");

        //loon Choicebox'id ja täidan need esialgse infoga
        grupiDropDown = Main.getAndmeBaas().getGruppideRefreshCombobx();

        //loon nupu ja lisan funktsinaalsuse
        nupp = new Button("VALI!");
        nupp.setOnAction(event -> {
            Main.setSelectedGrupp(Main.getAndmeBaas().gruppideList.indexOf(grupiDropDown.getValue()));
            TegeleGrupigaStseen.refreshComboBoxTegeleLiige();
            Main.stseeniVahetus(Main.scene7);
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
    public static void refreshChBoxValiGrupp() {
        ObservableList<Grupp> chBoxRefh = FXCollections.observableArrayList(Main.getAndmeBaas().gruppideList);
        grupiDropDown.setItems(chBoxRefh);

    }

    public BorderPane getLayout1() {
        return layout1;
    }
}