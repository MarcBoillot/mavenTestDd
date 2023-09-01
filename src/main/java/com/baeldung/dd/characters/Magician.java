package com.baeldung.dd.characters;
import com.baeldung.dd.characters.abilities.Sorts;

/**
 * le magician est un enfant de character et herite donc de ses attributs
 */
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

    /**
     *
     * @param sort seul le magician dispose de sort
     */
    public void setSort(Sorts sort) {
        this.sort = sort;
    }


    public String getPhiltre() {
        return philtre;
    }

    /**
     *
     * @param philtre seul le magician a des potions
     */
    public void setPhiltre(String philtre) {
        this.philtre = philtre;
    }

    /**
     * construct du magician vide
     */
    public Magician(){
        super ();
    }

    /**
     * construct du magician ou l'on prend juste le name
     * @param name
     */
    public Magician(String name){
        super(name);
    }

    /**
     * construct du magician ou l'on recupere le name la vie et l'attaque
     * @param name nom du magician
     * @param life  vie ( 4 max )
     * @param atk   attaque ( 10 max)
     */
    public Magician(String name, int life, int atk) {
        super(name, life, atk);
        this.type = "magicien";
    }

    public String toString() {
        return Char+": " +"\nName: "+ getName() + "\nLife: " + getLife() + "\nAttack: " + getStrength() + "\n";
    }
}
