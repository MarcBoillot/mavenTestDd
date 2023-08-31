package com.baeldung.dd.characters;
import com.baeldung.dd.characters.abilities.Sorts;

public class Magician extends Characters {
    private Sorts sort;
    private String philtre;
    private String Char = "fr.campusNum.dd.characters.Magician";

    public String getChar() {
        return Char;
    }
    public void setChar(String aChar) {
        Char = aChar;
    }



    public Sorts getSort() {
        return sort;
    }

    public void setSort(Sorts sort) {
        this.sort = sort;
    }


    public String getPhiltre() {
        return philtre;
    }
    public void setPhiltre(String philtre) {
        this.philtre = philtre;
    }
    public Magician(){
        super ();
    }
    public Magician(String name){
        super(name);
    }
    public Magician(String name, int life, int atk) {
        super(name, life, atk);
        this.type = "magicien";
    }

    public String toString() {
        return Char+": " +"\nName: "+ getName() + "\nLife: " + getLife() + "\nAttack: " + getStrength() + "\n";
    }
}
