package main;

import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;

import static javafx.geometry.Pos.CENTER;

public class LisaLiigeStseen {

    private VBox layout;
    private Button nupp;
    private TextField tekstv2li;
    private ChoiceBox dropDown;


    public LisaLiigeStseen() {

        this.layout = new VBox();
        this.nupp = new Button("LISA");
        this.tekstv2li = new TextField();
        this.tekstv2li.setPromptText("Liikme nimi");
        this.dropDown = new ChoiceBox();
        // dropDown.getItems().addAll(Main.getAndmeBaas());


    }

    public VBox getLayout() {
        layout.setAlignment(CENTER);
        layout.getChildren().addAll(tekstv2li, dropDown, nupp);
        return layout;
    }

}
