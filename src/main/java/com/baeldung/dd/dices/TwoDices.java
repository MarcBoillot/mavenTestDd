package com.baeldung.dd.dices;

/**
 * deux dés a six faces
 */
public class TwoDices implements Dices{
    /**
     *
     * @return retourne le resultat aléatoire de deux dés a six faces
     */
    @Override
    public int getResult() {
        return (int)(Math.random() * 6)+1 + (int)(Math.random() * 6)+1;
    }
}
