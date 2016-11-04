package ru.catstack.programmerclicker.objects;

import ru.catstack.programmerclicker.resources.Upgrades;

public class Player {

    private static Upgrades thisHouse = Upgrades.HOUSE1;
    private static Upgrades thisDoor = Upgrades.DOOR1;

    public static Upgrades getThisHouse() {
        return thisHouse;
    }

    public static void setThisHouse(Upgrades thisHouse) {
        Player.thisHouse = thisHouse;
    }

    public static Upgrades getThisDoor() {
        return thisDoor;
    }

    public static void setThisDoor(Upgrades thisDoor) {
        Player.thisDoor = thisDoor;
    }
}
