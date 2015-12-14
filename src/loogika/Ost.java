package loogika;

public class Ost {

    private String ostuNimi;
    private Double hind;

    public Ost(String nimi, Double hind){
        this.ostuNimi = nimi;
        this.hind = hind;
    }
    public String getOstuNimi() {
        return ostuNimi;
    }

    public void setOstuNimi(String ostuNimi) {
        this.ostuNimi = ostuNimi;
    }

    public Double getHind() {
        return hind;
    }

    public void setHind(Double hind) {
        this.hind = hind;
    }
}
