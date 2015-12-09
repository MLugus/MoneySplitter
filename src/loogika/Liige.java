package loogika;

import com.sun.javafx.collections.MappingChange;

import java.io.Serializable;
import java.util.*;

public class Liige implements Serializable {

    private String liikmeNimi;
    private double kontoSeis;
    public Map<String, Double> ostud;
    private String kuuluvus;

    public Liige(String nimi, String kuuluvus) {

        this.liikmeNimi = nimi;
        this.kontoSeis = 0.0;
        this.ostud = new HashMap<>();
        this.kuuluvus = kuuluvus;

    }

    // lisab ostu liikmele
    public void lisaOst(String ostuNimi, Double hind) {
        this.ostud.put(ostuNimi, hind);
        this.kontoSeis = hind + kontoSeis;

    }

    public String toString() {
        return this.liikmeNimi;
    }

    public String getKuuluvus() {
        return kuuluvus;
    }
}
