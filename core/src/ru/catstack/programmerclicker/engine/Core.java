package ru.catstack.programmerclicker.engine;

import com.badlogic.gdx.utils.viewport.Viewport;

public class Core {

    public static int WIDTH;
    public static int HEIGHT;
    public static int WIDTH_HALF;
    public static int HEIGHT_HALF;
    public static final int D_WIDTH = 480/2;
    public static final int D_HEIGHT = 800/2;
    public static final int D_WIDTH_HALF = D_WIDTH >> 1;
    public static final int D_HEIGHT_HALF = D_HEIGHT >> 1;
    public static Viewport viewport;
    public static float gameSpeed = 1;
    public static int codeLines = 0;
    public static int codeEverySecond = 0;
    public static int codeEveryClick = 1;
    public static float money = 0;
    public static float moneyEverySecond = 0;
    public static boolean onObjectClicked = false;

    public static void init(final int width, final int height) {
        WIDTH = width;
        HEIGHT = height;
        WIDTH_HALF = width >> 1;
        HEIGHT_HALF = height >> 1;
    }
}
