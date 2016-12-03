package ru.catstack.programmerclicker.objects;

import ru.catstack.programmerclicker.resources.Upgrades;

public class PlayerCore {

    private static Upgrades thisHouse = Upgrades.HOUSE1;
    private static Upgrades thisDoor = Upgrades.DOOR1;
    private static Upgrades thisPicture = Upgrades.PICTURE1;
    private static Upgrades thisTable = Upgrades.TABLE1;
    private static Upgrades thisTrashcan = Upgrades.TRASHCAN1;
    private static Upgrades thisShelf = Upgrades.SHELF1;
    private static Upgrades thisComputer1 = Upgrades.COMPUTER1_1;
    private static Upgrades thisComputer2 = Upgrades.COMPUTER1_2;
    private static Upgrades thisPlayer = Upgrades.PlAYER1;

    public static Upgrades getThisHouse() {
        return thisHouse;
    }

    public static Upgrades getThisDoor() {
        return thisDoor;
    }

    public static Upgrades getThisPicture() {
        return thisPicture;
    }

    public static Upgrades getThisTable() {
        return thisTable;
    }

    public static Upgrades getThisTrashcan() {
        return thisTrashcan;
    }

    public static Upgrades getThisShelf() {
        return thisShelf;
    }

    public static Upgrades getThisComputer1() {
        return thisComputer1;
    }

    public static Upgrades getThisComputer2() {
        return thisComputer2;
    }

    public static Upgrades getThisPlayer() {
        return thisPlayer;
    }
}
