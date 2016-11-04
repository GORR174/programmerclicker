package ru.catstack.programmerclicker.objects;

import com.badlogic.gdx.graphics.g2d.TextureRegion;
import ru.catstack.programmerclicker.resources.Upgrades;

public class UpgradableObject extends Object{

    private Upgrades thisUpgrade;

    public UpgradableObject(TextureRegion textureRegion, float x, float y, Upgrades thisUpgrade) {
        super(textureRegion, x, y);
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
        }
    }
}
