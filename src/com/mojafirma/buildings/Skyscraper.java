package com.mojafirma.buildings;

/**
 * Created by Bartek on 2017-07-12.
 */
public class Skyscraper extends Building {
    private int numberFloor;

    public Skyscraper(int height, int width, int length, int numberFloor) {
        super(height, width, length);
        this.numberFloor = numberFloor;
    }

    @Override
    public int area() {
        return getWidth()*getLength()*(numberFloor+1);
    }

    @Override
    public String toString() {
        return "Skyscraper{" +
                "numberFloor=" + numberFloor +
                '}';
    }
}
