package main;

import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;

import static javafx.geometry.Pos.CENTER;

/**
 * Created by Madis on 18.11.2015.
 */
public class LooGruppStseen {

    private Label looGrpSelgitus;
    public VBox layout;
    private Button nupp;
    private TextField tekstv2li;


    public LooGruppStseen() {
        layout = new VBox();
        nupp = new Button("OK");
        looGrpSelgitus = new Label("Palun sisestage uue grupi nimi!");
        tekstv2li = new TextField();
        tekstv2li.setPromptText("Grupi nimi");


    }

    public VBox getLayout() {

        layout.setAlignment(CENTER);
        layout.getChildren().addAll(looGrpSelgitus, tekstv2li, nupp);

        return layout;
    }

} // class l6pp
