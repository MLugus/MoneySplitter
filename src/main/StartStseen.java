package main;

import javafx.geometry.Insets;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.MenuBar;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.VBox;

import static javafx.geometry.Pos.CENTER;

public class StartStseen {

    public Button looGrupp, valiGrupp;
    public BorderPane layout1;
    public VBox layout2;
    private Label tervitus;
    private Menyy menyyObj;


    public StartStseen() {


        //main layout1
        this.layout1 = new BorderPane();

        // main layouti sees olev layout
        this.layout2 = new VBox();
        layout1.setCenter(layout2);


        // tervituskiri
        this.tervitus = new Label("Tere tulemast MoneySplitter'isse!!");


        // loo uus grupp nupp
        looGrupp = new Button("Loo uus grupp");
        //loo grupp event nupp
        looGrupp.setOnAction(event -> Main.stseeniVahetus(Main.scene2));


        // vali grupp nupp
        valiGrupp = new Button("Vali grupp");

        //lisan layout2'te elemendid
        layout2.getChildren().addAll(tervitus, looGrupp, valiGrupp);
        layout2.setAlignment(CENTER);

        //loon menyy objekti
        menyyObj = new Menyy();


        // lisan menyyriba layouti
        layout1.setTop(Menyy.getMenuBar());

    }

    public BorderPane getLayout1() {
        return layout1;
    }
}