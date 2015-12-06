package loogika;

public class Ost {

    private String ostuNimi;
    private double ostuHind;

    public Ost(String ostuNimi, double rahaSumma) {

        this.ostuNimi = ostuNimi;
        this.ostuHind = rahaSumma;

    }

    public String getOstuNimi() {
        return this.ostuNimi;
    }

    public double getOstuHind() {
        return this.ostuHind;
    }

    @Override
    public String toString() {
        return this.ostuNimi;
    }
}
