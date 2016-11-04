package ru.catstack.programmerclicker.screens;

import ru.catstack.programmerclicker.engine.MyGdxGame;
import ru.catstack.programmerclicker.resources.ResourceManager;

public class LoadingScreen extends Base2DScreen {
    public LoadingScreen(MyGdxGame game) {
        super(game);
    }

    @Override
    public void show(){
        super.show();

        ResourceManager.load();
        ResourceManager.build();

        super.setScreen(MyGdxGame.SCREEN.INTRO);
    }
}
