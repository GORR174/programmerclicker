package ru.catstack.programmerclicker.objects;

import ru.catstack.programmerclicker.resources.UpgradeTypes;
import ru.catstack.programmerclicker.resources.Upgrades;

public class UpgradableObject extends Object{

    private Upgrades thisUpgrade;
    private UpgradeTypes type;

    public UpgradableObject(Upgrades thisUpgrade, UpgradeTypes type) {
        super(thisUpgrade.getUpgradeTexture(), thisUpgrade.getX(), thisUpgrade.getY());
        this.thisUpgrade = thisUpgrade;
        this.type = type;
    }

    public void setThisUpgrade(Upgrades thisUpgrade){
        this.thisUpgrade = thisUpgrade;
    }

    @Override
    public void update() {
        //set new TextureRegion if TRegion of this object != current TRegion
        if(!sprite.getTexture().equals(thisUpgrade.getUpgradeTexture())){
            sprite.setRegion(thisUpgrade.getUpgradeTexture());
            sprite.setSize(thisUpgrade.getUpgradeTexture().getRegionWidth(), thisUpgrade.getUpgradeTexture().getRegionHeight());
            sprite.setX(thisUpgrade.getX());
            sprite.setY(thisUpgrade.getY());
        }
    }

    public UpgradeTypes getType() {
        return type;
    }
}
