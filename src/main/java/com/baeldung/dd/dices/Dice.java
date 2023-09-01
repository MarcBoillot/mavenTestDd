package com.baeldung.dd.dices;

/**
 * dé a 6 faces
 */
public class Dice implements Dices{
    /**
     *
     * @return retourne le resultat d'un dé a six face en random
     */
      @Override
    public int getResult() {
        return  (int)(Math.random() * 6)+1;
    }
}
