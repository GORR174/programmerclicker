package ru.catstack.programmerclicker.objects.interior;

import ru.catstack.programmerclicker.objects.PlayerCore;
import ru.catstack.programmerclicker.objects.UpgradableObject;

public class Picture extends UpgradableObject {
    public Picture() {
        super(PlayerCore.getThisPicture());
    }
}
