package ru.catstack.programmerclicker.resources;

import com.badlogic.gdx.graphics.g2d.TextureRegion;

public enum Upgrades {

    HOUSE1(IMG.HOUSE1.getTextureRegion(), 0, 0, 0, true),
    DOOR1(IMG.DOOR1.getTextureRegion(), 78, 106, 0, true),
    PICTURE1(IMG.PICTURE1.getTextureRegion(), 30, 154, 0, true),
    PICTURE2(IMG.PICTURE2.getTextureRegion(), 24, 150, 0, true),
    PICTURE3(IMG.PICTURE3.getTextureRegion(), 30, 154, 0, true),
    TABLE1(IMG.TABLE1.getTextureRegion(), 6, 47, 0, true),
    TRASHCAN1(IMG.TRASHCAN1.getTextureRegion(), 0, 0, 0, true),
    SHELF1(IMG.SHELF1.getTextureRegion(), 0, 90, 0, true),
    COMPUTER1_1(IMG.COMPUTER1_1.getTextureRegion(), 40, 77, 0, true),
    COMPUTER1_2(IMG.COMPUTER1_2.getTextureRegion(), 39, 50, 0, true),
    PlAYER1(IMG.PLAYER1.getTextureRegion(), 35, 81, 0, true)

    ;

    private TextureRegion upgradeTexture;
    private int price;
    private boolean isHaving;
    private float x, y;

    Upgrades(TextureRegion upgradeTexture, float x, float y, int price) {
        this.upgradeTexture = upgradeTexture;
        this.price = price;
        isHaving = false;
        this.x = x;
        this.y = y;
    }

    Upgrades(TextureRegion upgradeTexture, float x, float y, int price, boolean isHaving) {
        this.upgradeTexture = upgradeTexture;
        this.price = price;
        this.isHaving = isHaving;
        this.x = x;
        this.y = y;
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

    public float getX() {
        return x;
    }

    public float getY() {
        return y;
    }
}
