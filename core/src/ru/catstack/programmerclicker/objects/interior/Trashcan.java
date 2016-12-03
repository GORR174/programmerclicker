package ru.catstack.programmerclicker.objects.interior;

import ru.catstack.programmerclicker.objects.PlayerCore;
import ru.catstack.programmerclicker.objects.UpgradableObject;

public class Trashcan extends UpgradableObject {
    public Trashcan() {
        super(PlayerCore.getThisTrashcan());
    }
}
