package main;

import javafx.scene.control.*;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.VBox;
import loogika.Grupp;


import static javafx.geometry.Pos.CENTER;

public class LooGruppStseen {

    private BorderPane layout1;
    private Label looGrpSelgitus;
    private VBox layout2;
    private Button nupp;
    private TextField tekstv2li;


    public LooGruppStseen() {
        this.layout1 = new BorderPane();
        this.layout2 = new VBox();
        this.nupp = new Button("LISA");
        this.looGrpSelgitus = new Label("Palun sisestage uue grupi nimi!");
        this.tekstv2li = new TextField();
        this.tekstv2li.setPromptText("Grupi nimi");
        layout2.setAlignment(CENTER);
        layout2.getChildren().addAll(looGrpSelgitus, tekstv2li, nupp);
        layout1.setTop(Menyy.getMenuBar());
        layout1.setCenter(layout2);

        nupp.setOnAction(event -> {
            //uus grupp
            Grupp grupp = new Grupp(tekstv2li.getText());
            //lisan andmebaasi
            Main.getAndmeBaas().lisaGrupp(grupp);

        });


    }

    public VBox getLayout2() {


        return layout2;
    }

} // class l6pp
