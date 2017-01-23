package ru.catstack.programmerclicker.objects.interior;

import ru.catstack.programmerclicker.objects.UpgradableObject;
import ru.catstack.programmerclicker.resources.UpgradeTypes;
import ru.catstack.programmerclicker.resources.Upgrades;

public class Door extends UpgradableObject {

    public Door(Upgrades thisUpgrade) {
        super(thisUpgrade, UpgradeTypes.DOOR);
    }
}
