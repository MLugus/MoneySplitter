package loogika;

import javafx.scene.layout.GridPane;

import java.util.ArrayList;

public class Grupp {

    private String grupiNimi;
    private ArrayList<Liige> grupiLiikmed;


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
}

