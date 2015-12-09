package loogika;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class DataWrite {

    public void kirjutaData() {

        try {
            FileOutputStream fileOut = new FileOutputStream("MinuData.data");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

    }

}
