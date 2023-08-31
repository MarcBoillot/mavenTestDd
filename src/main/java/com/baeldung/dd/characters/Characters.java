package com.baeldung.dd.characters;

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
     public Characters(String type, String name, int strength, int life) {
         this.type = type;
         this.name = name;
         this.strength = strength;
         this.life = life;
     }
     public String toString() {
         return "  : " +"\nName: "+ getName() + "\nLife: " + getLife() + "\nAttack: " + getStrength() + "\n";
     }
}
