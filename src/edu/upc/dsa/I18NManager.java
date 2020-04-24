package edu.upc.dsa;

import java.util.ResourceBundle;

public class I18NManager {
    //Referencia estatica de la instancia
    private static I18NManager instance;
    //Package location as in this case it's outside the main directory
    private static final String PACKAGE = "";
    //Resource bundle
    private ResourceBundle cat, esp, fr, ger;

    //Private Constructor
    private I18NManager() {
        this.cat = ResourceBundle.getBundle(PACKAGE + "cat");
        this.esp = ResourceBundle.getBundle(PACKAGE + "esp");
        this.fr = ResourceBundle.getBundle(PACKAGE + "fr");
        this.ger = ResourceBundle.getBundle(PACKAGE + "ger");
    }

    //Singular static access function for the instance
    public static I18NManager getInstance() {
        if (instance == null) instance = new I18NManager();
        return instance;
    }

    //Pattern function
    public String getText(String idioma, String key) {
        ResourceBundle rs = null;
        if (idioma.equals("esp")) rs = this.esp;
        else if (idioma.equals("fr")) rs = this.fr;
        else if (idioma.equals("ger")) rs = this.ger;
        else rs = this.cat;
        return rs.getString(key);
    }
}
