package ru.catstack.programmerclicker.objects.interior;

import ru.catstack.programmerclicker.objects.Player;
import ru.catstack.programmerclicker.objects.UpgradableObject;

public class Door extends UpgradableObject {

    public Door() {
        super(Player.getThisDoor().getUpgradeTexture(), 0, 0, Player.getThisDoor());
    }
}
