package ru.catstack.programmerclicker.objects.interior;

import ru.catstack.programmerclicker.objects.PlayerCore;
import ru.catstack.programmerclicker.objects.UpgradableObject;

public class Door extends UpgradableObject {

    public Door() {
        super(PlayerCore.getThisDoor());
    }
}
