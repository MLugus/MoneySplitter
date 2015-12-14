package loogika;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import main.Main;

import java.util.ArrayList;

public class RahaJaga {

    private static ArrayList<Liige> liikmeteList;
    private static double kohustusSumma;

    // uuendab kontoseisud vastavalt kohustusmaksule
    public static ObservableList<Liige> liikmeteKontodeUuendamine() {

        liikmeteList = Main.getAndmeBaas().gruppideList.get(Main.getSelectedGrupp()).getLiikmeListKloon();
        kohustusSumma = koguSumma(liikmeteList) / liikmeteList.size();
        liikmeteltKohustusMax();

        return FXCollections.observableArrayList(liikmeteList);
    }

    // leiab kogu summa
    private static double koguSumma(ArrayList<Liige> liikmed) {
        Double summa = 0.0;
        for (Liige x : liikmed) {
            summa = summa + x.getKontoSeis();
        }
        return summa;
    }

    // leiab kohustusliku summa mida iga liige peab maksma ehk kogusumma jagada liikmete arvuga
    private static void liikmeteltKohustusMax() {
        for (Liige x : liikmeteList) {
            double liikmeKontoSeis = x.getKontoSeis();
            double liikmeUusSeis = kohustusSumma - liikmeKontoSeis;
            x.setKontoSeis(liikmeUusSeis);
        }
    }

}
