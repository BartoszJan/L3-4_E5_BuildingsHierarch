package com.mojafirma.buildings;

/**
 * Created by Bartek on 2017-07-12.
 */
public class Building {
    private int height;
    private int width;
    private int length;

    public Building(int height, int width, int length) {
        this.height = height;
        this.width = width;
        this.length = length;
    }

    public int area(){
        return width*length;
    }

    @Override
    public String toString() {
        return "Building{" +
                "height=" + height +
                ", width=" + width +
                ", length=" + length +
                '}';
    }

    public int getHeight() {
        return height;
    }

    public int getWidth() {
        return width;
    }

    public int getLength() {
        return length;
    }

}
