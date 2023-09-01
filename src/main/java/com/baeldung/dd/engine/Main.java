package com.baeldung.dd.engine;

import com.baeldung.dd.engine.Game;
import com.baeldung.dd.BDD.DataBaseException;

/**
 * lancement du programme
 */
public class Main {
    public static void main(String[] args) throws DataBaseException {
        System.out.println("Début du jeu");
        Game game = new Game();
    }
}