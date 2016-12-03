package ru.catstack.programmerclicker.objects.interior;

import ru.catstack.programmerclicker.objects.PlayerCore;
import ru.catstack.programmerclicker.objects.UpgradableObject;

public class Table extends UpgradableObject {
    public Table() {
        super(PlayerCore.getThisTable());
    }
}
