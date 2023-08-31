package com.baeldung.dd.engine.board;

import java.util.ArrayList;

public class Cases {
    public int getCaseNumber() {
        return caseNumber;
    }

    public void setCaseNumber(int caseNumber) {
        this.caseNumber = caseNumber;
    }

    private int caseNumber;
    public Cases(int caseNumber) {
        this.caseNumber = caseNumber;
    }

    @Override
    public String toString() {
        return "case "+ caseNumber;
    }
}