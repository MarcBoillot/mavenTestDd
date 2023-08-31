package com.baeldung.dd.dices;

public class TwoDices implements Dices{
    @Override
    public int getResult() {
        return (int)(Math.random() * 6)+1 + (int)(Math.random() * 6)+1;
    }
}
