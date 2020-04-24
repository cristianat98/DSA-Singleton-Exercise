package edu.upc.dsa;

public class Main {

    public static void main(String[] args) {
        // Manzana en 4 idiomas diferentes
        System.out.println(I18NManager.getInstance().getText("cat", "p1"));
        System.out.println(I18NManager.getInstance().getText("esp", "p1"));
        System.out.println(I18NManager.getInstance().getText("fr", "p1"));
        System.out.println(I18NManager.getInstance().getText("ger", "p1"));
        // Cubo en 4 idiomas diferentes
        System.out.println(I18NManager.getInstance().getText("cat", "p2"));
        System.out.println(I18NManager.getInstance().getText("esp", "p2"));
        System.out.println(I18NManager.getInstance().getText("fr", "p2"));
        System.out.println(I18NManager.getInstance().getText("ger", "p2"));
    }
}