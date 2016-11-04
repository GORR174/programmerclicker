package ru.catstack.programmerclicker.resources;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.assets.AssetManager;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.utils.Logger;

public class ResourceManager {

    private static AssetManager manager;
    private static final String className = ResourceManager.class.getSimpleName();

    public static void load(){

        manager = new AssetManager();
        manager.getLogger().setLevel(Logger.DEBUG);
        Texture.setAssetManager(manager);

        IMG.load(manager);
        Gdx.app.debug( className, "load" );
    }

    public static void build(){
        manager.finishLoading();
        IMG.build(manager);
        Gdx.app.debug(className, "build");
    }

    public static void unload(){
        IMG.unload(manager);
        manager.finishLoading();
        manager.dispose();
        Gdx.app.debug(className, "unload");
    }

}
