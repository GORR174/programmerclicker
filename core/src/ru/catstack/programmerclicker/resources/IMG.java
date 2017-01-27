package ru.catstack.programmerclicker.resources;

import com.badlogic.gdx.assets.AssetManager;
import com.badlogic.gdx.graphics.g2d.TextureAtlas;
import com.badlogic.gdx.graphics.g2d.TextureRegion;

public enum IMG {
    CATSTACK("BigObjects/CatStackGames120x120"),
    HOUSE1("BigObjects/House1"),
    DOOR1("Objects/Door1"),
    TABLE1("Objects/Table1"),
    PICTURE0("Objects/Picture0"),
    PICTURE1("Objects/Picture1"),
    PICTURE2("Objects/Picture2"),
    PICTURE3("Objects/Picture3"),
    TRASHCAN1("BigObjects/Trashcan1"),
    SHELF1("Objects/Shelf1"),
    COMPUTER1_1("Objects/Computer1"),
    COMPUTER1_2("Objects/Computer2"),
    PLAYER1("Objects/Player1"),
    HUD("GUI/HUD"),
    SHOP_BUTTON_UP("GUI/ShopBUp"),
    SHOP_BUTTON_DOWN("GUI/ShopBDown"),
    SHOP_GUI("BigObjects/ShopGUI"),
    SHOP_CLOSE_BUTTON_UP("GUI/ShopCloseButtonUp"),
    SHOP_CLOSE_BUTTON_DOWN("GUI/ShopCloseButtonDown"),
    SHOP_ITEM("GUI/ShopItem"),
    BUY_BUTTON_UP("GUI/BuyButtonUp"),
    BUY_BUTTON_DOWN("GUI/BuyButtonDown"),
    WATCH_BUTTON_UP("GUI/WatchButtonUp"),
    WATCH_BUTTON_DOWN("GUI/WatchButtonDown"),
    LEFT_BUTTON_UP("GUI/LeftButtonUp"),
    LEFT_BUTTON_DOWN("GUI/LeftButtonDown"),
    RIGHT_BUTTON_UP("GUI/RightButtonUp"),
    RIGHT_BUTTON_DOWN("GUI/RightButtonDown"),
    ;

    private static final String ATLAS_PATH = "ProgrammerClicker.pack";
    private static TextureAtlas atlas = null;
    private String name;

    IMG(String name) {
        this.name = name;
    }

    public static void load(AssetManager manager){
        manager.load(ATLAS_PATH, TextureAtlas.class);
    }

    public static void build(AssetManager manager){
        atlas = manager.get(ATLAS_PATH, TextureAtlas.class);
    }

    public TextureRegion getTextureRegion(){
        return atlas.findRegion(name);
    }

    public static void unload(AssetManager manager) {
        manager.unload(ATLAS_PATH);
        atlas.dispose();
    }

    public int getHalfWidth() {
        return atlas.findRegion(name).originalWidth>>1;
    }

    public int getHalfHeight() {
        return atlas.findRegion(name).originalHeight>>1;
    }
}
