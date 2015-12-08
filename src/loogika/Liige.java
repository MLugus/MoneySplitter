package loogika;

import com.sun.javafx.collections.MappingChange;

import java.util.*;

public class Liige {

    private String liikmeNimi;
    private double kontoSeis;
    public Map<String, Double> ostud;

    public Liige(String nimi) {

        this.liikmeNimi = nimi;
        this.kontoSeis = 0.0;
        this.ostud = new HashMap<>();

    }

    // lisab ostu liikmele
    public void lisaOst(String ostuNimi, Double hind) {
        this.ostud.put(ostuNimi, hind);
        this.kontoSeis = hind + kontoSeis;

    }

    public String toString() {
        return this.liikmeNimi;
    }

}
