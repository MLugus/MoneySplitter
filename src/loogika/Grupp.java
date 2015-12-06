package loogika;

import javafx.scene.control.ChoiceBox;
import javafx.scene.layout.GridPane;

import java.util.ArrayList;

public class Grupp {

    private String grupiNimi;
    public ArrayList<Liige> grupiLiikmed;
    private double ostudeSumma;


    public Grupp(String nimi) {
        this.grupiNimi = nimi;
        this.grupiLiikmed = new ArrayList<>();
        this.ostudeSumma = 0.0;
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

}

