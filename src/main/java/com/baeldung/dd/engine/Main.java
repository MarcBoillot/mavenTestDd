package com.baeldung.dd.engine;

import com.baeldung.dd.BDD.DataBase;
import com.baeldung.dd.BDD.DataBaseException;


public class Main {
    public static void main(String[] args) throws DataBaseException {
        System.out.println("Début du jeu");
        Menu menu = new Menu();
        menu.createChar();
        DataBase.getHeroes();
    }
}