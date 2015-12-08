package main;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import loogika.Grupp;
import loogika.Liige;

public class TegeleGrupigaStseen {

    private BorderPane layout1;
    private static ComboBox<Grupp> grupiDropDown;
    private static ComboBox<Liige> liikmeDropDown;


    public TegeleGrupigaStseen() {

        // layoutide loomine
        layout1 = new BorderPane();
        HBox layout2 = new HBox();

        VBox layout3 = new VBox();

        //info text
        Label infoText = new Label("vali grupp ja vali liige, et lisada oste.");

        //loon nupud ja lisan funktsionaalsuse
        Button nupp1 = new Button("LISA OST");
        Button nupp2 = new Button("Jälgi kulutusi");
        Button nupp3 = new Button("Jaga raha");

        //loon lõppliku layouti
        layout1.setTop(Main.menyyObj.getMenuBar());
        layout2.getChildren().addAll(nupp2, nupp3);
        layout2.setAlignment(Pos.CENTER);
        layout1.setBottom(layout2);
        layout1.setLeft(grupiDropDown);
        layout1.setRight(liikmeDropDown);
        layout3.setAlignment(Pos.CENTER);
        layout3.getChildren().add(nupp1);

    }

    // uuendab comboboxi
    public static void refreshComboBoxTegeleGrup() {
        ObservableList<Grupp> chBoxRefh = FXCollections.observableArrayList(Main.getAndmeBaas().gruppideList);
        grupiDropDown.setItems(chBoxRefh);

    }

    public static void refreshComboBoxTegeleLiige() {
        ObservableList<Liige> chBoxRefh = FXCollections.observableArrayList(Main.getAndmeBaas().gruppideList.get(Main.getAndmeBaas().gruppideList.indexOf(grupiDropDown.getValue())).grupiLiikmed);
        liikmeDropDown.setItems(chBoxRefh);
    }

    public BorderPane getLayout1() {
        return layout1;
    }

}
