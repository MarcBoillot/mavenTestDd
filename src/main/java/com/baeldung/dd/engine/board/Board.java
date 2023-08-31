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
    public List<Cases> generateBoard (){
        board = new ArrayList<>();
        for (int i = 0; i < 63;i ++) {
            board.add(new Cases(i+1));
        }
        return board;
    }

    @Override
    public String toString() {
        return ""+board;
    }
}
