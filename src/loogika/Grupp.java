package loogika;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.control.ChoiceBox;

import java.io.Serializable;
import java.util.ArrayList;

public class Grupp implements Serializable {

    private String grupiNimi;
    public ArrayList<Liige> grupiLiikmed;


    public Grupp(String nimi) {
        this.grupiNimi = nimi;
        this.grupiLiikmed = new ArrayList<>();
    }

    public void lisaLiige(Liige liige) {
        this.grupiLiikmed.add(liige);
    }


    @Override
    public String toString() {
        return this.grupiNimi;
    }

    public ChoiceBox<Liige> getLiikmeListChBox() {
        ChoiceBox<Liige> kukualla = new ChoiceBox<>();
        for (Liige liige : grupiLiikmed) {
            kukualla.getItems().add(liige);
        }
        return kukualla;
    }

    public ArrayList<Liige> getGrupiLiikmed() {
        return grupiLiikmed;
    }

    public ObservableList<Liige> getLiikmeObsList() {
        ObservableList<Liige> liikmeList = FXCollections.observableArrayList(getGrupiLiikmed());

        return liikmeList;
    }

}

