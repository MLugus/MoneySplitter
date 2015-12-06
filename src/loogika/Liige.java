package loogika;

import java.util.ArrayList;

public class Liige {

    private String liikmeNimi;
    private double kontoSeis;
    private ArrayList<Ost> Ostud;

    public Liige(String nimi) {

        this.liikmeNimi = nimi;
        this.kontoSeis = 0.0;
        this.Ostud = new ArrayList<>();
    }

    // lisab ostu liikmele
    public void lisaOst(Ost ost) {
        this.Ostud.add(ost);
        this.kontoSeis += ost.getOstuHind();

    }

    public String toString() {
        return this.liikmeNimi;
    }

}
