package loogika;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class AndmeBaas {

    ArrayList<Grupp> gruppideList;

    public AndmeBaas() {

        this.gruppideList = new ArrayList<>();
    }

    public void lisaGrupp(Grupp grupp) {
        this.gruppideList.add(grupp);
    }

}
