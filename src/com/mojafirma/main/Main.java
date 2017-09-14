package com.mojafirma.main;

import com.mojafirma.buildings.Building;
import com.mojafirma.buildings.Skyscraper;
import com.mojafirma.buildings.StoriedBuilding;

public class Main {
    public static void main(String[] args) {
        Building building1 = new Building(10,7,10);
        System.out.println(building1);
        System.out.println(building1.area());
        StoriedBuilding building2 = new StoriedBuilding(10,7,10);
        System.out.println(building2);
        System.out.println(building2.area());
        Skyscraper building3 = new Skyscraper(10,7,10, 10);
        System.out.println(building3);
        System.out.println(building3.area());
    }
}
