package ru.catstack.programmerclicker.engine;

import com.badlogic.gdx.utils.viewport.Viewport;

public class Core {

    public static int WIDTH;
    public static int HEIGHT;
    public static int WIDTH_HALF;
    public static int HEIGHT_HALF;
    public static final int D_WIDTH = 480/4;
    public static final int D_HEIGHT = 800/4;
    public static final int D_WIDTH_HALF = D_WIDTH >> 1;
    public static final int D_HEIGHT_HALF = D_HEIGHT >> 1;
    public static Viewport viewport;
    public static float gameSpeed = 1;
    public static int codeLines = 0;

    public static void init(final int width, final int height) {
        WIDTH = width;
        HEIGHT = height;
        WIDTH_HALF = width >> 1;
        HEIGHT_HALF = height >> 1;
    }
}
