package com.baeldung.dd.characters;

import com.baeldung.dd.characters.abilities.Weapons;

/**
 * gtyftyfty
 */
public class Warrior extends Characters{
    private String Char = "fr.campusNum.dd.characters.Warrior";
    /**
     * gfgfg
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

    public void setWeapon(Weapons weapon) {
        this.weapon = weapon;
    }
    public String getShield() {
        return shield;
    }
    public void setShield(String shield) {
        this.shield = shield;
    }
    public Warrior (){
        super();
    }
    public Warrior(String name){
        super(name);
    }

    /**
     * ghjgghuyuuyu
     * @param name ghggh
     * @param life hhg (10max)
     * @param atk hhghgh
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
