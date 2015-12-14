package loogika;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.control.ChoiceBox;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.stream.Collectors;

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

    public ArrayList<Liige> getLiikmeListKloon(){
        ArrayList<Liige> liige = new ArrayList<>();
        for (Liige x : grupiLiikmed){
            Liige l = x.getClone();
            liige.add(l);
        }
        return liige;
    }

}

