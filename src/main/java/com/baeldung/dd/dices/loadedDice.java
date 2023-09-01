package com.baeldung.dd.dices;

/**
 * dé pipé
 */
public class loadedDice implements Dices{
    /**
     * retourne le resultat d'un dé a 1 face c'est un dé trucké pour faire des verif de plateau
     * @return
     */
    @Override
    public int getResult() {
        return 1;
    }
}
