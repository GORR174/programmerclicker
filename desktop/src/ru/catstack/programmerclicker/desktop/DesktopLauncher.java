package ru.catstack.programmerclicker.desktop;

import com.badlogic.gdx.backends.lwjgl.LwjglApplication;
import com.badlogic.gdx.backends.lwjgl.LwjglApplicationConfiguration;
import ru.catstack.programmerclicker.engine.MyGdxGame;

public class DesktopLauncher {
    private static final String appName = DesktopLauncher.class.getPackage().getName();
    private static final SCREEN_CFG screenCfg = SCREEN_CFG.DEFAULT;

    public static void main (String[] arg) {
        LwjglApplicationConfiguration config = new LwjglApplicationConfiguration();

        config.width = screenCfg.getWidth();
        config.height = screenCfg.getHeight();
        config.title = appName + " [ " + config.width + " x " + config.height + " ]";

        new LwjglApplication(new MyGdxGame(), config);
    }

    enum SCREEN_CFG {
        GALAXY_TAB2( 1024, 554 ),
        SQUARE( 1024, 768 ),
        FULL_HD( 1920, 1080 ),
        SMALL( 320, 240 ),
        SCREEN_SHOT( 1024, 500 ),
        DEFAULT( 800, 480 );

        final boolean LANDSCAPE  = true;
        final boolean PORTRAIT = false;
        final boolean screenOrientation = LANDSCAPE;

        private final int width;
        private final int height;

        SCREEN_CFG(final int width, final int height) {
            this.width = width;
            this.height = height;
        }

        public int getWidth() {
            return screenOrientation ? width : height;
        }

        public int getHeight() {
            return screenOrientation ? height : width;
        }
    }
}
