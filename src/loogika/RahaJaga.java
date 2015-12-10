package loogika;

import main.Main;

import java.util.ArrayList;

public class RahaJaga {

    private ArrayList<Liige> liikmeteList;
    private double kohustusSumma;

    public void liikmeteKontodeUuendamine() {

        this.liikmeteList = Main.getAndmeBaas().gruppideList.get(Main.getSelectedGrupp()).getGrupiLiikmed();
        this.kohustusSumma = koguSumma(liikmeteList) / liikmeteList.size();
        liikmeteltKohustusMax();


    }

    private double koguSumma(ArrayList<Liige> liikmed) {
        double summa = 0;
        for (Liige x : liikmed) {
            summa = summa + x.getKontoSeis();
        }
        return summa;
    }

    private void liikmeteltKohustusMax() {
        for (Liige x : this.liikmeteList) {
            double liikmeKontoSeis = x.getKontoSeis();
            double liikmeUusSeis = this.kohustusSumma - liikmeKontoSeis;
            x.setKontoSeis(liikmeUusSeis);
        }
    }

}
