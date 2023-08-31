package com.baeldung.dd.characters.abilities;

public class Weapons {
    private String weapon;
    private int powerWeapon;
    public int getPowerWeapon() {
        return powerWeapon;
    }
    public void setPowerWeapon(int powerWeapon) {
        this.powerWeapon = powerWeapon;
    }
    public String getWeapon() {
        return weapon;
    }
    public void setWeapon(String weapon) {
        this.weapon = weapon;
    }
    public Weapons(String weapon) {
        this.weapon=weapon;
    }
}
