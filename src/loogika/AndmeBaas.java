package loogika;

import javafx.scene.control.ComboBox;
import main.Main;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.Objects;

public class AndmeBaas {

    public ArrayList<Grupp> gruppideList;

    public AndmeBaas() {

        this.gruppideList = new ArrayList<>();
    }

    public void lisaGrupp(Grupp grupp) {
        this.gruppideList.add(grupp);
    }

    public ComboBox<Grupp> getGruppideRefreshCombobx() {
        ComboBox<Grupp> kukualla = new ComboBox<>();
        for (Grupp grupp : gruppideList) {
            kukualla.getItems().add(grupp);
        }
        return kukualla;
    }

    // loeb failist objekti välja
    public Object loeObjDiskilt() {
        FileInputStream fIn = null;
        ObjectInputStream objIn = null;
        Object obj = null;

        try {
            fIn = new FileInputStream("MinuData.data");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        if (fIn != null) {
            try {
                objIn = new ObjectInputStream(fIn);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        // Read an object
        try {
            obj = objIn.readObject();

        } catch (ClassNotFoundException | NullPointerException | IOException e) {
            e.printStackTrace();
        }
        return obj;

    }

    // castib failist loetud objekti arraylistiks
    public ArrayList<Grupp> loeData() {

        ArrayList<Grupp> liikmeteList = new ArrayList<>();
        Object obj = loeObjDiskilt();
        if (obj instanceof ArrayList) {
            liikmeteList = (ArrayList) obj;
        }
        return liikmeteList;

    }

    // paneb failist loetud objektid uuesti vajalikke arraylistidesse
    public void taastaAndmed() {

        Main.getAndmeBaas().gruppideList = loeData();
    }


}