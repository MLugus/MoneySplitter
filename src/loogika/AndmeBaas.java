package loogika;

import javafx.scene.control.ChoiceBox;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class AndmeBaas {

    public static ArrayList<Grupp> gruppideList;

    public AndmeBaas() {

        this.gruppideList = new ArrayList<>();
    }

    public void lisaGrupp(Grupp grupp) {
        this.gruppideList.add(grupp);
    }

    public static ChoiceBox<Grupp> getGruppideListChBox() {
        ChoiceBox<Grupp> kukualla = new ChoiceBox<>();
        for (Grupp grupp : gruppideList) {
            kukualla.getItems().add(grupp);
        }
        return kukualla;
    }

}
