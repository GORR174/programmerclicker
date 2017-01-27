package ru.catstack.programmerclicker.utils;

import com.badlogic.gdx.graphics.g2d.BitmapFont;
import com.badlogic.gdx.graphics.g2d.GlyphLayout;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import ru.catstack.programmerclicker.engine.Core;

public class TextUtils {

    public static float getHalfOfText(BitmapFont font, String text){
        GlyphLayout layout = new GlyphLayout();
        layout.setText(font, text);
        return layout.width/2f;
    }

    public static float getCenterOfText(BitmapFont font, String text){
        GlyphLayout layout = new GlyphLayout();
        layout.setText(font, text);
        return Core.D_WIDTH_HALF-layout.width/2f;
    }

    public static void centerTextRender(BitmapFont font, String text, float y, SpriteBatch batch){
        GlyphLayout layout = new GlyphLayout(font, text);
        font.draw(batch, text, Core.D_WIDTH_HALF-layout.width/2f, y);
    }
}
