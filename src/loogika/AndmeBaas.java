package loogika;

import javafx.scene.control.ComboBox;

import java.util.ArrayList;

public class AndmeBaas {

    public ArrayList<Grupp> gruppideList;

    public AndmeBaas() {

        this.gruppideList = new ArrayList<>();
    }

    public void lisaGrupp(Grupp grupp) {
        this.gruppideList.add(grupp);
    }

    public ComboBox<Grupp> getGruppideRefreshCombobx() {
        ComboBox<Grupp> kukualla = new ComboBox<>();
        for (Grupp grupp : gruppideList) {
            kukualla.getItems().add(grupp);
        }
        return kukualla;
    }

    public ArrayList<Liige> valmistaLiikmedKirjutamiseks() {
        ArrayList<Liige> liikmeteList = new ArrayList<>();
        for (Grupp g : this.gruppideList) {
            for (Liige l : g.grupiLiikmed) {
                liikmeteList.add(l);

            }
        }
        return liikmeteList;
    }

}
