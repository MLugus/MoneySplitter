package main;

import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.VBox;

import static javafx.geometry.Pos.CENTER;

public class LisaLiigeStseen {

    private BorderPane layout1;
    private VBox layout2;
    private Button nupp;
    private TextField tekstv2li;
    private ChoiceBox dropDown;


    public LisaLiigeStseen() {

        this.layout1 = new BorderPane();
        this.layout2 = new VBox();
        this.nupp = new Button("LISA");
        this.tekstv2li = new TextField();
        this.tekstv2li.setPromptText("Liikme nimi");
        this.dropDown = new ChoiceBox();
        // dropDown.getItems().addAll(Main.getAndmeBaas());


        layout1.setTop(Menyy.getMenuBar());

        // lisan layouti boarder panei
        layout2.setAlignment(CENTER);
        layout2.getChildren().addAll(tekstv2li, dropDown, nupp);
        layout1.setCenter(layout2);


    }

    public BorderPane getLayout1() {
        return layout1;
    }

}
