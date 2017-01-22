package ru.catstack.programmerclicker.resources;

import com.badlogic.gdx.graphics.Color;

public enum GameColor {

    BG2(0xFFFFCC),
    SHOP(0x002fa9),
    INTRO_BG(237, 212, 153);

    private final Color color;

    GameColor(float r, float g, float b) {
        color = new Color(r, g, b, 1);
    }

    GameColor(float r, float g, float b, float alpha) {
        color = new Color(r, g, b, alpha);
    }

    GameColor(int r, int g, int b) {
        color = new Color(r/255f, g/255f, b/255f, 1);
    }

    GameColor(int r, int g, int b, float alpha) {
        color = new Color(r/255f, g/255f, b/255f, alpha);
    }

    GameColor( final int newColor ) {
        this.color = hexToColor( newColor );
    }

    public final static Color hexToColor( int valueInHex ) {
        final int mask = 0xFF;

        final int int_r = (valueInHex >> 16);
        final int int_g = (valueInHex >> 8) & mask;
        final int int_b = valueInHex & mask;

        final float float_r = (float) int_r / (float) 0xFF;
        final float float_g = (float) int_g / (float) 0xFF;
        final float float_b = (float) int_b / (float) 0xFF;

        return new Color( float_r, float_g, float_b, 1 );
    }

    public Color get(){
        return color;
    }
}
