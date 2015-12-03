package main;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.control.*;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.VBox;
import loogika.AndmeBaas;
import loogika.Grupp;

import java.util.ArrayList;

import static javafx.geometry.Pos.CENTER;

public class LisaLiigeStseen {

    private BorderPane layout1;
    private VBox layout2;
    private Button nupp;
    private TextField tekstv2li;
    private Label infoText;
    private static ChoiceBox<Grupp> dropDown;
    private static ObservableList<Grupp> chBoxRefh;


    public LisaLiigeStseen() {

        this.layout1 = new BorderPane();
        this.layout2 = new VBox();

        this.nupp = new Button("LISA");
        this.nupp.setOnAction(event -> {
            /////// lisab liikme (see veel ei tööta)


            // toob ette nö alertboxi, et kysida kas lisada veel liige v6i mitte
            Boolean vastus = AskBox.kysimusKast();

            //kontrollin vastust ja käitun kohaselt
            if (vastus) {
                tekstv2li.clear();
            } else {

                ///////////// ESIALGU VIIB START STSEENI TAGASI
                    Main.stseeniVahetus(Main.scene1); //// ei vii millegipärast
                }

        });

        this.tekstv2li = new TextField();
        this.tekstv2li.setPromptText("Liikme nimi");

        this.infoText = new Label("Sisestage uue liikme nimi!");

        dropDown = Main.getAndmeBaas().getGruppideListChBox();

        layout1.setTop(Menyy.getMenuBar());

        // lisan layouti boarder panei
        layout2.setAlignment(CENTER);
        layout2.getChildren().addAll(infoText, tekstv2li, dropDown, nupp);
        layout2.setSpacing(20);
        layout1.setCenter(layout2);


    }

    public BorderPane getLayout1() {
        return layout1;
    }


    public static void refreshChBox() {
        chBoxRefh = FXCollections.observableArrayList(Main.getAndmeBaas().gruppideList);
        dropDown.setItems(chBoxRefh);

    }
}
