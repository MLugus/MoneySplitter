package main;

import javafx.geometry.Insets;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.VBox;

public class StartStseen {

    public static Button looGrupp, valiGrupp;
    public BorderPane layout1;
    public VBox layout2;
    private Label tervitus;


    public StartStseen() {


        //main layout1
        this.layout1 = new BorderPane();
        layout1.setPadding(new Insets(10, 20, 10, 20));

        // main layouti sees olev layout
        this.layout2 = new VBox();
        layout1.setCenter(layout2);


        // tervituskiri
        this.tervitus = new Label("Tere tulemast MoneySplitter'isse!!");


        // loo uus grupp nupp
        looGrupp = new Button("Loo uus grupp");


        // vali grupp nupp
        valiGrupp = new Button("Vali grupp");

        //lisan layout2'te elemendid
        layout2.getChildren().addAll(tervitus, looGrupp, valiGrupp);

    }

    public BorderPane getLayout1() {
        return layout1;
    }
}