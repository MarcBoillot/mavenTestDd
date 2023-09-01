package com.baeldung.dd.dices;

/**
 * dé a 8 faces
 */
public class HeightFaceDice implements Dices{
    /**
     *
     * @return retourne le resultat aléatoire d'un dé a 8 faces
     */
    @Override
    public int getResult() {
        return (int)(Math.random() * 8)+1;
    }
}
