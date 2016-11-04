package ru.catstack.programmerclicker.resources;

import com.badlogic.gdx.assets.AssetManager;
import com.badlogic.gdx.graphics.g2d.TextureAtlas;
import com.badlogic.gdx.graphics.g2d.TextureRegion;

public enum IMG {
    CATSTACK("CatStackGames360x360"),
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
