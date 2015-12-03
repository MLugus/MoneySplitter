package main;

import javafx.scene.control.Menu;
import javafx.scene.control.MenuBar;
import javafx.scene.control.MenuItem;
import javafx.scene.control.SeparatorMenuItem;

public class Menyy {

    private Menu fileMenu;

    public Menyy() {
        // menu loomine jne.
        fileMenu = new Menu("_File");
        Menu looMenu = new Menu("Lisa/Loo");
        Menu kustutaMenu = new Menu("Kustuta");


        // fileMenu osad e. peamine menüü "file"
        fileMenu.getItems().addAll(looMenu, kustutaMenu);
        MenuItem j2lgi = new MenuItem("J2lgi kulutusi...");
        MenuItem jaga = new MenuItem("Jaga raha...");
        fileMenu.getItems().addAll(new SeparatorMenuItem(), j2lgi, jaga);

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
        lisaLiige.setOnAction(event -> Main.stseeniVahetus(Main.scene3));


    }

    public MenuBar getMenuBar() {
        // main menu bar
        MenuBar topMenu = new MenuBar();
        topMenu.getMenus().addAll(fileMenu);

        return topMenu;
    }


}
