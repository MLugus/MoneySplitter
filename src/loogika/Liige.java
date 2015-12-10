package loogika;

import java.io.Serializable;
import java.util.*;

public class Liige implements Serializable {

    private String liikmeNimi;


    private double kontoSeis;
    public Map<String, Double> ostud;

    // konstruktor liikme loomiseks
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

    // tagastab liikme nime
    public String toString() {
        return this.liikmeNimi;
    }

    // tagastab kontoseisu
    public double getKontoSeis() {
        return kontoSeis;
    }

    // muudab konto seisu
    public void setKontoSeis(double kontoSeis) {
        this.kontoSeis = kontoSeis;
    }


}
