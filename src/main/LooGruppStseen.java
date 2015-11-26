package main;

import javafx.scene.control.*;
import javafx.scene.layout.VBox;
import loogika.Grupp;


import static javafx.geometry.Pos.CENTER;

public class LooGruppStseen {

    private Label looGrpSelgitus;
    private VBox layout;
    Button nupp;
    private TextField tekstv2li;


    public LooGruppStseen() {
        this.layout = new VBox();
        this.nupp = new Button("LISA");
        this.looGrpSelgitus = new Label("Palun sisestage uue grupi nimi!");
        this.tekstv2li = new TextField();
        this.tekstv2li.setPromptText("Grupi nimi");


        nupp.setOnAction(event -> {
            //uus grupp
            Grupp grupp = new Grupp(tekstv2li.getText());
            //lisan andmebaasi
            Main.getAndmeBaas().lisaGrupp(grupp);

        });



    }

    public VBox getLayout() {

        layout.setAlignment(CENTER);
        layout.getChildren().addAll(looGrpSelgitus, tekstv2li, nupp);

        return layout;
    }

} // class l6pp
