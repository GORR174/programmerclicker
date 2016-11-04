package ru.catstack.programmerclicker.resources;

import com.badlogic.gdx.graphics.g2d.TextureRegion;

public enum Upgrades {

    HOUSE1(IMG.HOUSE1.getTextureRegion(), 0, true),
    DOOR1(IMG.DOOR1.getTextureRegion(), 0, true),

    ;

    private TextureRegion upgradeTexture;
    private int price;
    private boolean isHaving;

    Upgrades(TextureRegion upgradeTexture, int price) {
        this.upgradeTexture = upgradeTexture;
        this.price = price;
        isHaving = false;
    }

    Upgrades(TextureRegion upgradeTexture, int price, boolean isHaving) {
        this.upgradeTexture = upgradeTexture;
        this.price = price;
        this.isHaving = isHaving;
    }

    public TextureRegion getUpgradeTexture() {
        return upgradeTexture;
    }

    public int getPrice() {
        return price;
    }

    public boolean isHaving() {
        return isHaving;
    }
}
