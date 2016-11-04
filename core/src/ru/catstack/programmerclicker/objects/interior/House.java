package ru.catstack.programmerclicker.objects.interior;

import ru.catstack.programmerclicker.objects.Player;
import ru.catstack.programmerclicker.objects.UpgradableObject;

public class House extends UpgradableObject {
    public House() {
        super(Player.getThisHouse().getUpgradeTexture(), 0, 0, Player.getThisHouse());
    }
}
