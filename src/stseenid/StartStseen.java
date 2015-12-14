package stseenid;

import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.VBox;
import main.Main;

import static javafx.geometry.Pos.CENTER;

public class StartStseen {

    private BorderPane layout1;


    public StartStseen() {


        //main layout1
        this.layout1 = new BorderPane();

        // main layouti sees olev layout
        VBox layout2 = new VBox();
        layout1.setCenter(layout2);


        // tervituskiri
        Label tervitus = new Label("Tere tulemast MoneySplitter'isse!!");


        // loo uus grupp nupp
        Button looGrupp = new Button("Loo uus grupp");
        //loo grupp event nupp
        looGrupp.setOnAction(event -> Main.stseeniVahetus(Main.scene2));


        // vali grupp nupp
        Button valiGrupp = new Button("Vali grupp");
        // vali grupp event nupp
        valiGrupp.setOnAction(event -> {
            Main.stseeniVahetus(Main.scene4);
            ValiGruppStseen.refreshChBoxValiGrupp();
        });

        //lisan layout2'te elemendid
        layout2.getChildren().addAll(tervitus, looGrupp, valiGrupp);
        layout2.setAlignment(CENTER);
        layout2.setSpacing(20);

        // lisan menyyriba layouti
        layout1.setTop(Main.menyyObj.getMenuBar());

    }

    // tagastab layouti
    public BorderPane getLayout1() {
        return layout1;
    }
}