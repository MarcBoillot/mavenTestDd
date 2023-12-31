package com.baeldung.dd.characters;

/**
 * le character est le parent des class warrior et magician et il donne des attributs de reference
 */
public abstract class Characters {
    private String name;
    private  int life;
    private int strength;
    protected String type;

     public String getType() {
         return type;
     }

     public void setType(String type) {
         this.type = type;
     }
    public String getName() {
        return name;
    }
    public int getLife() {
        return life;
    }
    public int getStrength() {
        return strength;
    }

    public void setName(String name) {
        this.name = name;
    }
    public void setLife(int life) {
        this.life = life;
    }
    public void setStrength(int strength) {
        this.strength = strength;
    }

    public Characters(){
        this.name="default name";
        this.life=1;
        this.strength=1;
    }
    public Characters(String name){
        this.name=name;
        this.life=10;
        this.strength=20;
    }
    public Characters(String name, int life, int strength){
        this.name = name;
        this.life = life;
        this.strength = strength;
    }

    /**
     * Construct utile pour la bdd
     * @param type le type du character (magician ou warrior) en fonction de la bdd
     * @param name  le nom du character dans la bdd
     * @param strength  la force du character dans la bdd
     * @param life  la vie du character dans la bdd
     */
     public Characters(String type, String name, int strength, int life) {
         this.type = type;
         this.name = name;
         this.strength = strength;
         this.life = life;
     }

    /**
     *
     * @return retourne en string les attributs du character
     */
     public String toString() {
         return "  : " +"\nName: "+ getName() + "\nLife: " + getLife() + "\nAttack: " + getStrength() + "\n";
     }
}
