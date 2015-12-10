package loogika;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.control.ChoiceBox;

import java.io.Serializable;
import java.util.ArrayList;

public class Grupp implements Serializable {

    private String grupiNimi;
    public ArrayList<Liige> grupiLiikmed;

    // konstruktor grupi loomiseks
    public Grupp(String nimi) {
        this.grupiNimi = nimi;
        this.grupiLiikmed = new ArrayList<>();
    }

    // lisab liikme gruppi
    public void lisaLiige(Liige liige) {
        this.grupiLiikmed.add(liige);
    }


    @Override
    public String toString() {
        return this.grupiNimi;
    }

    // loob choiceboxi refreshimiseks stseenivahetuste ajal
    public ChoiceBox<Liige> getLiikmeListChBox() {
        ChoiceBox<Liige> kukualla = new ChoiceBox<>();
        for (Liige liige : grupiLiikmed) {
            kukualla.getItems().add(liige);
        }
        return kukualla;
    }

    // tagastab grupiliikmete arraylisti
    public ArrayList<Liige> getGrupiLiikmed() {
        return grupiLiikmed;
    }

    // tagastab observablelisti liikmete arraylistist
    public ObservableList<Liige> getLiikmeObsList() {
        return FXCollections.observableArrayList(getGrupiLiikmed());
    }

}

