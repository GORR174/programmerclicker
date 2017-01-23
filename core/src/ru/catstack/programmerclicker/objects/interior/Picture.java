package ru.catstack.programmerclicker.objects.interior;

import ru.catstack.programmerclicker.objects.UpgradableObject;
import ru.catstack.programmerclicker.resources.UpgradeTypes;
import ru.catstack.programmerclicker.resources.Upgrades;

public class Picture extends UpgradableObject {
    public Picture(Upgrades thisUpgrade) {
        super(thisUpgrade, UpgradeTypes.PICTURE);
    }
}
