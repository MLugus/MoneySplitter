package loogika;

import java.io.*;

public class DataWrite {

    private Object data;

    public DataWrite(Object data) {

        this.data = data;

    }

    // kirjutab vajaliku arraylisti failiks
    public void writeDisk() {

        FileOutputStream fOut;
        ObjectOutputStream objOut;

        try {
            fOut = new FileOutputStream("MinuData.data");

            objOut = new ObjectOutputStream(fOut);
            objOut.writeObject(this.data);

            objOut.close();
            fOut.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
