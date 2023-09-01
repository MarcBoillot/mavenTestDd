package com.baeldung.dd.engine;

import com.baeldung.dd.BDD.DataBase;
import com.baeldung.dd.BDD.DataBaseException;
import com.baeldung.dd.characters.Characters;
import com.baeldung.dd.characters.Magician;
import com.baeldung.dd.characters.Warrior;

import java.util.List;
import java.util.Scanner;

/**
 * permet l'interaction entre l'utilisateur et le programme
 */
public class Menu {
    /**
     * je recupere les données contenu dans ma bdd dans ma table hero
     * @param hero
     */
    public void displayHeroDetails(Characters hero) {
        /**
         * je recupere et affiche le type
         */
        System.out.println("Type: " + hero.getType());
        /**
         * je recupere le nom
         */
        System.out.println("Nom: " + hero.getName());
        /**
         * je recupere la force
         */
        System.out.println("Force: " + hero.getStrength());
        /**
         * je recupere la vie
         */
        System.out.println("Vie: " + hero.getLife());
        System.out.println("------------------------");
    }

    public void createChar() throws DataBaseException {
        System.out.println("choississez un personnage : \n1: magician  \n2: warrior \n3: Exit");
        //recuperation des input dans une variable avec la methode scanner
        String answer =userInput();
        //selection de choix avec la methode switch


        /**
         * j'instancie un nouveau scanner
         */
        Scanner scanner = new Scanner(System.in);
        /**
         * j'ai un tableau de characters que je nomme heroes et qui a pour valeur ce qui est contenu dans la bdd
         */
        List<Characters> heroes = DataBase.getHeroes();

        System.out.println("Veuillez sélectionner un personnage :");
        /**
         * je parcours le tableau grace a l'index pour tout recuperer en fonction de la longueur du tableau heroes
         */
        for (int i = 0; i < heroes.size(); i++) {
            Characters hero = heroes.get(i);
            /**
             * j'affiche les éléments des différentes column
             */
            System.out.println((i + 1) + ". " + hero.getName() + " (" + hero.getType() + ")" );
            System.out.println("Vie : "+hero.getLife());
            System.out.println("Force :"+hero.getStrength());
            System.out.println("---------------------------");
        }
        /**
         * la variable choice va recuperer l'entree terminal
         */
        int choice = scanner.nextInt();
        scanner.nextLine();
        /**
         * condition pour le choix de l'utilisateur
         */
        if (choice >= 1 && choice <= heroes.size()) {
            Characters selectedHero = heroes.get(choice - 1);
            System.out.println("Vous avez choisi " + selectedHero.getType() + " !");
            displayHeroDetails(selectedHero);
        } else {
            System.out.println("Choix invalide !");
        }


        switch(answer){

            case "1":
                System.out.println("magician !");
                createCharacter(answer);
                System.out.println();
                break;
            case "2":
                System.out.println("warrior !");
                createCharacter(answer);
                System.out.println();
                break;
            case "3":
                System.out.println("Exit");
                break;
            default:
                System.out.println("Choix incorrect");
                createChar();
                break;
        }
    }
    public void createCharacter(String answer) throws DataBaseException {

/**
 * j'instancie le personnage choisi pour lui donner un nom
 */
        System.out.println("Donnez un nom a votre personnage");
        String name =userInput();
        switch (answer){
            case "1":
                Characters magician = new Magician(name);
                System.out.println("reponse1"+magician);
                modify(magician);
                break;
            case"2":
                Characters warrior = new Warrior(name);
                System.out.println("reponse2"+warrior);
                modify(warrior);
                break;
        }
        System.out.println();
    }

    /**
     * menu pour modifier mon personnage
     * @param characters
     */
    public void modify(Characters characters) throws DataBaseException {
        System.out.println("Souhaitez vous : \n1: Voir votre personnage  \n2: Modifier votre personnage \n3: Lancer partie \n4: Exit");
        String answer = userInput();
            switch (answer) {

                case "1":

                    System.out.println("Mes Stats !");
                    System.out.println(characters);
                    System.out.println();

                    break;
                case "2":
                    updateMenu(characters);
                    break;
                case "3":
                    new Game().game();
                    break;
                case "4":
                    System.out.println("Exit");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Choix incorrect");
                    break;
            }
        /**
         * recurence pour re-proposer le menu
         */
        if(answer.equals("1") || answer.equals("2") ){
            modify(characters);
        }
    }

    /**
     * j'instancie le game pour lancer le jeu
     */
//    private void launcher() throws DataBaseException {
//
//    }

    private void updateMenu(Characters characters) {
        System.out.println("Modifier !");
        System.out.println("Renommer mon personnage");
        String name = userInput();

        System.out.println("Donnez vos points de vie");
        int life = userInputInt();

        System.out.println("Donnez votre force d'attaque");
        int strength = userInputInt();

        update_character(characters, name, life, strength);

        System.out.println(characters);
        System.out.println();

        System.out.println();
    }
    public String userInput(){
       Scanner input = new Scanner(System.in);
       return input.nextLine();
    }
    private int userInputInt(){
        Scanner input = new Scanner(System.in);
        return input.nextInt();
    }

    /**
     *
     * @param characters le character choisi
     * @param name  le nom du character
     * @param life  la vie du character
     * @param strength  la force du character
     */
    private void update_character(Characters characters, String name, int life, int strength) {
        characters.setName(name);
        characters.setLife(life);
        characters.setStrength(strength);
    }
}