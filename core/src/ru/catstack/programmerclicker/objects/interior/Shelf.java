package ru.catstack.programmerclicker.objects.interior;

import ru.catstack.programmerclicker.objects.UpgradableObject;
import ru.catstack.programmerclicker.resources.UpgradeTypes;
import ru.catstack.programmerclicker.resources.Upgrades;

public class Shelf extends UpgradableObject {
    public Shelf(Upgrades thisUpgrade) {
        super(thisUpgrade, UpgradeTypes.SHELF);
    }
}
