package loogika;

public class Liige {

    private String liikmeNimi;
    private double kontoSeis;

    /**
     * konstruktor
     *
     * @param nimi
     */
    public Liige(String nimi) {

        this.liikmeNimi = nimi;
        this.kontoSeis = 0.0;
    }

    public String toString() {
        return this.liikmeNimi;
    }

}
