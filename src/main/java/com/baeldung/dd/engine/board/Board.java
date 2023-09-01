package com.baeldung.dd.engine.board;

import java.util.ArrayList;
import java.util.List;
public class Board {
    private List<Cases> board;

    public Board(){
        board = generateBoard();
    }
    public List<Cases> getBoard(){
        return board;
    }

    /**
     *
     * @return retourne le plateau complet une fois parcouru le nb de case (64 car i commence a 0) defini dans un tableau
     */
    public List<Cases> generateBoard (){
        board = new ArrayList<>();
        for (int i = 0; i < 63;i ++) {
            board.add(new Cases(i+1));
        }
        return board;
    }

    /**
     *
     * @return retourne le nombre de case du plateau en string
     */
    @Override
    public String toString() {
        return ""+board;
    }
}
