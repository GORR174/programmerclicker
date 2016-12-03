package ru.catstack.programmerclicker.objects.interior;

import ru.catstack.programmerclicker.objects.PlayerCore;
import ru.catstack.programmerclicker.objects.UpgradableObject;

public class House extends UpgradableObject {
    public House() {
        super(PlayerCore.getThisHouse());
    }
}
