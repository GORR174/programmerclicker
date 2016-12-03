package ru.catstack.programmerclicker.objects.interior;

import ru.catstack.programmerclicker.objects.PlayerCore;
import ru.catstack.programmerclicker.objects.UpgradableObject;

public class Player extends UpgradableObject {
    public Player() {
        super(PlayerCore.getThisPlayer());
    }
}
