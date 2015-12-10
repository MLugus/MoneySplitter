package main;

import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.layout.VBox;
import javafx.stage.Modality;
import javafx.stage.Stage;

public class RahaJagamiseBox {

    public static void jagaRahaBox() {

        Stage aken = new Stage();
        aken.initModality(Modality.APPLICATION_MODAL);
        aken.setTitle("RAHA JAGAMINE");
        aken.setMinWidth(250);
        aken.setMaxHeight(400);

        //info tekst
        Label infoText = new Label("Siin näete kes peab kellele ja kui palju maksma.");

        // tabeli loomine
        TableView tabel = new TableView();
        TableColumn kes = new TableColumn("Kes");
        kes.setMinWidth(50);
        TableColumn kellele = new TableColumn("Kellele");
        kellele.setMinWidth(50);
        TableColumn kuiPalju = new TableColumn("Kui palju");
        kuiPalju.setMinWidth(50);
        tabel.getColumns().addAll(kes, kellele, kuiPalju);
        tabel.setColumnResizePolicy(TableView.CONSTRAINED_RESIZE_POLICY);


        VBox layout = new VBox();
        layout.getChildren().addAll(infoText, tabel);
        Scene stseen = new Scene(layout);
        aken.setScene(stseen);
        aken.showAndWait();

    }

}
