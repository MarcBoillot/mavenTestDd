package com.baeldung.dd.characters;

import com.baeldung.dd.characters.abilities.Weapons;

/**
 * la class warrior est un enfant de character
 */
public class Warrior extends Characters{
    private String Char = "com.baeldung.dd.characters.Warrior";
    /**
     *
     */
    private Weapons weapon;
    private String shield;

    public String getChar() {
        return Char;
    }

    public void setChar(String aChar) {
        Char = aChar;
    }

    public Weapons getWeapon() {
        return weapon;
    }

    /**
     *
     * @param weapon seul le warrior a des armes
     */
    public void setWeapon(Weapons weapon) {
        this.weapon = weapon;
    }

    public String getShield() {
        return shield;
    }

    /**
     *
     * @param shield seul le warrior a un bouclier
     */
    public void setShield(String shield) {
        this.shield = shield;
    }

    /**
     * construct vide
     */
    public Warrior (){
        super();
    }

    /**
     * construct warrior ou l'on prends juste le nom
     * @param name
     */
    public Warrior(String name){
        super(name);
    }

    /**
     * construct du warrior
     * @param name le nom du warrior
     * @param life vie du warrior (10max)
     * @param atk attaque du warrior (4 max)
     */
    public Warrior(String name, int life, int atk) {
        super(name, life, atk);
        this.type = "warrior";
    }

    /**
     *
     * @return
     */
    public String toString() {
        return Char+": " +"\nName: "+ getName() + "\nLife: " + getLife() + "\nAttack: " + getStrength() + "\n";
    }
}
