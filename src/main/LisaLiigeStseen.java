package main;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.control.*;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.VBox;
import loogika.Grupp;
import loogika.Liige;
import static javafx.geometry.Pos.CENTER;

public class LisaLiigeStseen {

    private BorderPane layout1;
    private TextField tekstv2li;
    private static ComboBox<Grupp> dropDown;


    public LisaLiigeStseen() {

        layout1 = new BorderPane();
        VBox layout2 = new VBox();

        Button nupp = new Button("LISA");
        nupp.setOnAction(event -> {
            // lisab liikme
            Liige liige = new Liige(tekstv2li.getText(), dropDown.getValue().toString());
            Main.getAndmeBaas().gruppideList.get(Main.getAndmeBaas().gruppideList.indexOf(dropDown.getValue())).lisaLiige(liige);

            // toob ette nö alertboxi, et kysida kas lisada veel liige v6i mitte
            Boolean vastus = AlertBox.KysimusKast("MIS ON TEIE SOOV?", "Kas soovite lisada veel ühe liikme?");

            //kontrollin vastust ja käitun kohaselt
            if (vastus) {
                tekstv2li.clear();
            } else {

                ///////////// ESIALGU VIIB START STSEENI TAGASI
                Main.stseeniVahetus(Main.scene1);
                }

        });

        this.tekstv2li = new TextField();
        this.tekstv2li.setPromptText("Liikme nimi");

        Label infoText = new Label("Sisestage uue liikme nimi!");

        dropDown = Main.getAndmeBaas().getGruppideRefreshCombobx();

        layout1.setTop(Main.menyyObj.getMenuBar());

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
        ObservableList<Grupp> chBoxRefh = FXCollections.observableArrayList(Main.getAndmeBaas().gruppideList);
        dropDown.setItems(chBoxRefh);

    }
}
