package com.baeldung.dd.characters.abilities;

public class Sorts {
    /**
     * seul le magician pourra posséder des sorts
     */
    private String sort;
    public String getSort() {
        return sort;
    }

    /**
     *
     * @param sort defini le nom du sort que pourra posseder le magician
     */
    public void setSort(String sort) {
        this.sort = sort;
    }
}
