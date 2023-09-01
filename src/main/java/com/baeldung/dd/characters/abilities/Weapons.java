package com.baeldung.dd.characters.abilities;

public class Weapons {
    /**
     * seul le warrior pourra posseder des armes
     */
    private String weapon;
    private int powerWeapon;
    public int getPowerWeapon() {
        return powerWeapon;
    }

    /**
     *
     * @param powerWeapon defini la puissance d'attaque de l'arme
     */
    public void setPowerWeapon(int powerWeapon) {
        this.powerWeapon = powerWeapon;
    }
    public String getWeapon() {
        return weapon;
    }

    /**
     *
     * @param weapon defini le nom de l'arme
     */
    public void setWeapon(String weapon) {
        this.weapon = weapon;
    }
    public Weapons(String weapon) {
        this.weapon=weapon;
    }
}
