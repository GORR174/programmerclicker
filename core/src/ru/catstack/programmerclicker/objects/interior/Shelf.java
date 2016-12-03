package ru.catstack.programmerclicker.objects.interior;

import ru.catstack.programmerclicker.objects.PlayerCore;
import ru.catstack.programmerclicker.objects.UpgradableObject;

public class Shelf extends UpgradableObject {
    public Shelf() {
        super(PlayerCore.getThisShelf());
    }
}
