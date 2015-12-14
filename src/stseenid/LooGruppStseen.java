package stseenid;

import javafx.scene.control.*;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.VBox;
import loogika.Grupp;
import main.Main;

import static javafx.geometry.Pos.CENTER;

public class LooGruppStseen {

    private BorderPane layout1;
    private TextField tekstv2li;


    public LooGruppStseen() {
        // layoutide loomine
        this.layout1 = new BorderPane();
        VBox layout2 = new VBox();
        // infotekst
        Label looGrpSelgitus = new Label("Palun sisestage uue grupi nimi!");
        // textfieldi loomine
        this.tekstv2li = new TextField();
        this.tekstv2li.setPromptText("Grupi nimi");

        // nupu loomine ja funktsionaalsuse lisamine
        Button nupp = new Button("LISA");
        nupp.setOnAction(event -> {
            //uus grupp
            Grupp grupp = new Grupp(tekstv2li.getText());
            //lisan andmebaasi
            Main.getAndmeBaas().lisaGrupp(grupp);
            //viib stage'i stseen3'me e liikme lisamisse
            Main.stseeniVahetus(Main.scene3);
            // uuendab choiceboxi stseen kolmes
            LisaLiigeStseen.refreshChBox();

        });
        // layoutiga tegelemine, elementide lisamine jne
        layout2.setAlignment(CENTER);
        layout2.getChildren().addAll(looGrpSelgitus, tekstv2li, nupp);
        layout2.setSpacing(20);
        layout1.setTop(Main.menyyObj.getMenuBar());
        layout1.setCenter(layout2);

    }

    // tagastab layouti
    public BorderPane getLayout1() {
        return layout1;
    }

} // class l6pp
