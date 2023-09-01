package com.baeldung.dd.engine;

import com.baeldung.dd.BDD.DataBaseException;
import com.baeldung.dd.dices.Dice;
import com.baeldung.dd.engine.board.Board;
import com.baeldung.dd.exception.CharacterOutOfBoundException;

import java.util.Scanner;

/**
 * permet de lancer le jeu / elle gere l'ensemble (board position du joueur et le dé)
 */
public class Game {

    private int position;
    Scanner input;
    Board board;
    Dice dice;

    /**
     * instanciation du dé et du plateau
     */
    public Game() throws DataBaseException {
        this.input = new Scanner(System.in);
        this.dice = new Dice();
        this.position = 0;
        this.board = new Board();
        Menu menu = new Menu();
        menu.createChar();
    }
    public int getPosition() {
        return position;
    }
    public void game(){
        try {
            oneTurn();
        }catch(CharacterOutOfBoundException e){
            System.out.println(e);
        }
    }

    /**
     *
     * @throws CharacterOutOfBoundException retourne une erreur quand le joueur est hors plateau de jeu
     */
    private void oneTurn() throws CharacterOutOfBoundException {
        int diceResult = this.dice.getResult();
        System.out.println("Votre lancé est : "+diceResult);
        System.out.println("position avant lancé"+position);
        movePlayer(diceResult);
        System.out.println("position apres lancé "+position);
        newTurn();
        restart();
        //appeler la focntion rejouer
    }

    private void restart() throws CharacterOutOfBoundException {
        this.position = 0;
        newTurn();
    }

    private void newTurn() throws CharacterOutOfBoundException {
        while (true){
            System.out.println("1.lancer le dé \n2.Quitter ");
            String answer =new Menu().userInput();
            switch (answer){
                case "1":
                    oneTurn();
                    break;
                case "2":
                    System.exit(0);
                default:
                    System.out.println("incorect");
                    break;
            }

        }
    }

    private void movePlayer(int diceResult) {
        this.position += diceResult;
    }

    /*public void start(fr.campusNum.dd.board.engine.Board board) {
        try {
            while (getPosition() < board.getBoard().size()) {
                System.out.println("vous êtes a la case : " + getPosition() +  "\n"+board);

                //utilisation de l'interface pour choisir le dé

                fr.campusNum.dd.dices.Dices dice = new fr.campusNum.dd.dices.Dice();
                System.out.println("1.Lancer le dé \n2.Exit");
                String answer = input.next();

                while (!answer.equals("1")){
                    System.out.println("mauvais choix : \nAppuyer sur 1 pour lancer");
                    answer = input.next();
                }

                int deValue = dice.getResult();
                System.out.println("votre lancé : " + deValue);
                setPosition(getPosition() + deValue);

                if (getPosition() == board.getBoard().size()) {
                    System.out.println("Vous avez gagné\n");
                } else if (getPosition() > board.getBoard().size()) {
                    throw new fr.campusNum.dd.exception.CharacterOutOfBoundException("vous avez perdu");
                }
            }
        } catch (fr.campusNum.dd.exception.CharacterOutOfBoundException e) {
            System.out.println("Dommage : " + e.getMessage());
        }
        System.out.println("fin de partie");
    }*/
}
