package ru.catstack.programmerclicker.engine;

import com.badlogic.gdx.Application;
import com.badlogic.gdx.Game;
import com.badlogic.gdx.Gdx;
import ru.catstack.programmerclicker.resources.ResourceManager;
import ru.catstack.programmerclicker.screens.GameScreen;
import ru.catstack.programmerclicker.screens.IntroScreen;
import ru.catstack.programmerclicker.screens.LoadingScreen;

public class MyGdxGame extends Game {

    @Override
    public void create () {
        Gdx.app.setLogLevel( Application.LOG_DEBUG );
        switchTo( SCREEN.LOADING );
    }

    public void switchTo( final SCREEN scr ) {
        if ( this.getScreen() != null ) {
            this.screen.dispose();
        }

        if ( scr == SCREEN.LOADING ) { setScreen( new LoadingScreen( this ) ); }
        else if ( scr == SCREEN.INTRO ) { setScreen( new IntroScreen( this ) ); }
        else if ( scr == SCREEN.GAME ) { setScreen( new GameScreen( this ) ); }
//        else if ( scr == SCREEN.MENU ) { setScreen( new MenuScreen( this ) ); }
        else if ( scr == SCREEN.EXIT ) { exit(); }

    }

    private void exit() {
        ResourceManager.unload();
        Gdx.app.exit();
    }

    public enum SCREEN {
        LOADING, MENU, INTRO, GAME, EXIT
    }

}
