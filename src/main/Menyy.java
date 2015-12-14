package main;

import javafx.scene.control.Menu;
import javafx.scene.control.MenuBar;
import javafx.scene.control.MenuItem;
import javafx.scene.control.SeparatorMenuItem;
import stseenid.LisaLiigeStseen;
import stseenid.TegeleGrupigaStseen;
import stseenid.ValiGruppStseen;

public class Menyy {

    private Menu fileMenu;

    public Menyy() {
        // menu loomine jne.
        fileMenu = new Menu("_File");
        Menu looMenu = new Menu("Lisa/Loo");
        Menu kustutaMenu = new Menu("Kustuta");


        // fileMenu osad e. peamine menüü "file"
        fileMenu.getItems().addAll(looMenu, kustutaMenu);
        MenuItem valiGrupp = new MenuItem("Vali grupp...");
        MenuItem tegelGrupp = new MenuItem("Tegele grupiga...");
        fileMenu.getItems().addAll(new SeparatorMenuItem(), valiGrupp, tegelGrupp);

        // looMenu osad e. pea menu sees
        MenuItem lisaLiige = new MenuItem("Lisa uus liige");
        MenuItem looGrupp = new MenuItem("Loo uus grupp");
        looMenu.getItems().addAll(lisaLiige, looGrupp);

        // kustutaMenu osad e. pea menu sees
        MenuItem kustutaGrupp = new MenuItem("Kustuta grupp...");
        MenuItem kustutaLiige = new MenuItem("Kustuta liige...");
        kustutaMenu.getItems().addAll(kustutaGrupp, kustutaLiige);

        //lisan nuppudele event stseeni vahetused
        looGrupp.setOnAction(event -> Main.stseeniVahetus(Main.scene2));
        lisaLiige.setOnAction(event -> {
            Main.stseeniVahetus(Main.scene3);
            LisaLiigeStseen.refreshChBox();
        });
        valiGrupp.setOnAction(event -> {
            Main.stseeniVahetus(Main.scene4);
            ValiGruppStseen.refreshChBoxValiGrupp();
        });
        tegelGrupp.setOnAction(event -> {
            Main.stseeniVahetus(Main.scene7);
            TegeleGrupigaStseen.refreshComboBoxTegeleLiige();
            TegeleGrupigaStseen.refreshTabel();
        });



    }

    // returnib menuBar'i
    public MenuBar getMenuBar() {
        // main menu bar
        MenuBar topMenu = new MenuBar();
        topMenu.getMenus().addAll(fileMenu);

        return topMenu;
    }


}
