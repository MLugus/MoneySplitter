package main;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.geometry.Pos;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.VBox;
import loogika.Liige;

public class TegeleGrupigaStseen {

    private BorderPane layout1;
    private static ComboBox<Liige> liikmeDropDown;
    public static int selectedLiige;


    public TegeleGrupigaStseen() {

        // layoutide loomine
        layout1 = new BorderPane();
        VBox layout2 = new VBox();
        VBox layout3 = new VBox();
        VBox layout4 = new VBox();

        //info text
        Label infoText = new Label("vali grupp ja vali liige, et lisada oste.");

        //loon comboboxi
        liikmeDropDown = new ComboBox<>();
        liikmeDropDown.setMinWidth(100);

        //lisan tulbad tabelile ning määran reeglistiku
        TableColumn<Liige, String> ostuNimi = new TableColumn("Ostu nimi");
        ostuNimi.setMinWidth(50);
        ostuNimi.setCellValueFactory(new PropertyValueFactory<>(""));

        TableColumn<Liige, Double> hind = new TableColumn("Hind");
        hind.setMinWidth(50);
        hind.setCellValueFactory(new PropertyValueFactory<Liige, Double>("hind"));
        TableView<Liige> tabel = new TableView();
        // tabel.setItems(Main.getAndmeBaas().gruppideList.get(Main.getSelectedGrupp()).getLiikmeObsList());
        tabel.getColumns().addAll(ostuNimi, hind);
        tabel.setColumnResizePolicy(TableView.CONSTRAINED_RESIZE_POLICY);

        //loon nupud ja lisan funktsionaalsuse
        Button nupp1 = new Button("LISA OST");
        nupp1.setOnAction(event -> {
            selectedLiige = Main.getAndmeBaas().gruppideList.get(Main.getSelectedGrupp()).grupiLiikmed.indexOf(liikmeDropDown.getValue());
            LisaOstBox.lisaOstBox();
            System.out.println(selectedLiige);
        });
        Button nupp2 = new Button("Jaga raha");
        nupp2.setOnAction(event -> RahaJagamiseBox.jagaRahaBox());

        //loon lõppliku layouti
        layout1.setTop(Main.menyyObj.getMenuBar());
        layout2.setAlignment(Pos.CENTER);
        layout2.getChildren().add(liikmeDropDown);
        layout1.setRight(layout2);
        layout3.setAlignment(Pos.CENTER);
        layout3.getChildren().add(tabel);
        layout1.setLeft(layout3);
        layout4.setAlignment(Pos.CENTER);
        layout4.getChildren().addAll(nupp1, nupp2);
        layout1.setCenter(layout4);


    }

    // uuendab comboboxi stseeni tulemisel
    public static void refreshComboBoxTegeleLiige() {
        ObservableList<Liige> chBoxRefh = FXCollections.observableArrayList(Main.getAndmeBaas().gruppideList.get(Main.getSelectedGrupp()).grupiLiikmed);
        liikmeDropDown.setItems(chBoxRefh);
    }

    // tagastab layouti
    public BorderPane getLayout1() {
        return layout1;
    }

}
