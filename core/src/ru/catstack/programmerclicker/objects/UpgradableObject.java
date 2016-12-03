package ru.catstack.programmerclicker.objects;

import ru.catstack.programmerclicker.resources.Upgrades;

public class UpgradableObject extends Object{

    private Upgrades thisUpgrade;

    public UpgradableObject(Upgrades thisUpgrade) {
        super(thisUpgrade.getUpgradeTexture(), thisUpgrade.getX(), thisUpgrade.getY());
        this.thisUpgrade = thisUpgrade;
    }

    public void setThisUpgrade(Upgrades thisUpgrade){
        this.thisUpgrade = thisUpgrade;
    }

    @Override
    public void update() {
        //set new TextureRegion if TRegion of this object != current TRegion
        if(!sprite.getTexture().equals(thisUpgrade.getUpgradeTexture())){
            sprite.setRegion(thisUpgrade.getUpgradeTexture());
            sprite.setX(thisUpgrade.getX());
            sprite.setY(thisUpgrade.getY());
        }
    }
}
