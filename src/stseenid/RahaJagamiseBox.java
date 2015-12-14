package stseenid;

import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.VBox;
import javafx.stage.Modality;
import javafx.stage.Stage;
import loogika.Liige;
import loogika.RahaJaga;

public class RahaJagamiseBox {

    public static void jagaRahaBox() {

        Stage aken = new Stage();
        aken.initModality(Modality.APPLICATION_MODAL);
        aken.setTitle("RAHA JAGAMINE");
        aken.setMinWidth(250);
        aken.setMaxHeight(400);

        //info tekst
        Label infoText = new Label("Siin näete summat mida keegi peab maksma,\n" +
                "  isikutele kellel miinus ees, tuleb maksta");

        // tabeli loomine
        TableView tabel = new TableView();
        tabel.setItems(RahaJaga.liikmeteKontodeUuendamine());
        TableColumn<Liige, String > kes = new TableColumn("Isik");
        kes.setCellValueFactory(new PropertyValueFactory<>("liikmeNimi"));
        kes.setMinWidth(50);
        TableColumn<Liige, Double> konto = new TableColumn("Kontoseis");
        konto.setCellValueFactory(new PropertyValueFactory<>("kontoSeis"));
        konto.setMinWidth(50);
        tabel.getColumns().addAll(kes, konto);
        tabel.setColumnResizePolicy(TableView.CONSTRAINED_RESIZE_POLICY);

        // layouti loomine ning elementide lisamine ning akna näitamine ja ootele panek
        VBox layout = new VBox();
        layout.getChildren().addAll(infoText, tabel);
        Scene stseen = new Scene(layout);
        aken.setScene(stseen);
        aken.showAndWait();

    }

}
