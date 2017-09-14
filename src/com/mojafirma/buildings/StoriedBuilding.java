package com.mojafirma.buildings;

public class StoriedBuilding extends Building{

    public StoriedBuilding(int height, int width, int length) {
        super(height, width, length);
    }

    @Override
    public int area() {
        return getWidth()*getLength()*2;
    }

    @Override
    public String toString() {
        return "StoriedBuilding{}";
    }
}
