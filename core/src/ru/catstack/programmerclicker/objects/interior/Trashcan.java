package ru.catstack.programmerclicker.objects.interior;

import ru.catstack.programmerclicker.objects.UpgradableObject;
import ru.catstack.programmerclicker.resources.UpgradeTypes;
import ru.catstack.programmerclicker.resources.Upgrades;

public class Trashcan extends UpgradableObject {
    public Trashcan(Upgrades thisUpgrade) {
        super(thisUpgrade, UpgradeTypes.TRASHCAN);
    }
}
