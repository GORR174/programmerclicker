package ru.catstack.programmerclicker.resources;

import com.badlogic.gdx.graphics.g2d.TextureRegion;

public enum Upgrades {

    HOUSE1(IMG.HOUSE1.getTextureRegion(), 0, 0, 0, UpgradeTypes.HOUSE, true),
    DOOR1(IMG.DOOR1.getTextureRegion(), 156, 212, 0, UpgradeTypes.DOOR, true),
    PICTURE1(IMG.PICTURE1.getTextureRegion(), 60, 308, 0, UpgradeTypes.PICTURE, true),
    PICTURE2(IMG.PICTURE2.getTextureRegion(), 48, 300, 0, UpgradeTypes.PICTURE, true),
    PICTURE3(IMG.PICTURE3.getTextureRegion(), 60, 308, 0,  UpgradeTypes.PICTURE, true),
    TABLE1(IMG.TABLE1.getTextureRegion(), 12, 94, 0, UpgradeTypes.TABLE, true),
    TRASHCAN1(IMG.TRASHCAN1.getTextureRegion(), 0, 0, 0, UpgradeTypes.TRASHCAN, true),
    SHELF1(IMG.SHELF1.getTextureRegion(), 0, 180, 0, UpgradeTypes.SHELF, true),
    COMPUTER1_1(IMG.COMPUTER1_1.getTextureRegion(), 80, 154, 0, UpgradeTypes.COMPUTER1, true),
    COMPUTER1_2(IMG.COMPUTER1_2.getTextureRegion(), 78, 100, 0, UpgradeTypes.COMPUTER2, true),
    PlAYER1(IMG.PLAYER1.getTextureRegion(), 70, 162, 0, UpgradeTypes.PLAYER, true)

    ;

    private TextureRegion upgradeTexture;
    private int price;
    private boolean isHaving;
    private float x, y;
    private UpgradeTypes type;

    Upgrades(TextureRegion upgradeTexture, float x, float y, int price, UpgradeTypes type) {
        this(upgradeTexture, x, y, price, type, false);
    }

    Upgrades(TextureRegion upgradeTexture, float x, float y, int price, UpgradeTypes type, boolean isHaving) {
        this.upgradeTexture = upgradeTexture;
        this.price = price;
        this.isHaving = isHaving;
        this.x = x;
        this.y = y;
        this.type = type;
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

    public void setHaving(boolean having) {
        isHaving = having;
    }

    public UpgradeTypes getType() {
        return type;
    }
}
