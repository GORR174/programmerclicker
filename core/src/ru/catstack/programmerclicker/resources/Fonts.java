package ru.catstack.programmerclicker.resources;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.Color;
import com.badlogic.gdx.graphics.g2d.BitmapFont;
import com.badlogic.gdx.graphics.g2d.freetype.FreeTypeFontGenerator;
import com.badlogic.gdx.graphics.g2d.freetype.FreeTypeFontGenerator.FreeTypeFontParameter;

public enum Fonts {
    DEFAULT_FONT("Minecraft_rus.ttf", 8, 0.6f, Color.WHITE, Color.BLACK),
    DEFAULT_SMALL_FONT("Minecraft_rus.ttf", 7, 0f, GameColor.SHOP.get(), Color.WHITE),
    ;

    private final String path;
    private final int size;
    private final float borderSize;
    private final Color color;
    private final Color borderColor;
    private BitmapFont bitmapFont;

    Fonts(String path, int size, float borderSize, Color color, Color borderColor ) {
        this.path = path;
        this.size = size;
        this.borderSize = borderSize;
        this.color = color;
        this.borderColor = borderColor;

        FreeTypeFontGenerator gen = new FreeTypeFontGenerator(Gdx.files.internal("fonts/" + path));
        FreeTypeFontParameter p = new FreeTypeFontParameter();
        p.size = size;
        p.borderWidth = borderSize;
        p.color = color;
        p.borderColor = borderColor;
        p.characters = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz1234567890\"!`?'.,;:()[]{}<>|/@\\^$-%+=#_&~*\u007F\u0080\u0081\u0082\u0083\u0084\u0085\u0086\u0087\u0088\u0089\u008A\u008B\u008C\u008D\u008E\u008F\u0090\u0091\u0092\u0093\u0094\u0095\u0096\u0097\u0098\u0099\u009A\u009B\u009C\u009D\u009E\u009F ¡¢£¤¥¦§¨©ª«¬\u00AD®¯°±²³´µ¶·¸¹º»¼½¾¿ÀÁÂÃÄÅÆÇÈÉÊËÌÍÎÏÐÑÒÓÔÕÖ×ØÙÚÛÜÝÞßàáâãäåæçèéêëìíîïðñòóôõö÷øùúûüýþÿАБВГДЕЁЖЗИЙКЛМНОПРСТУФХЦЧШЩЪЫЬЭЮЯабвгдеёжзийклмнопрстуфхцчшщъыьэюя";
        bitmapFont = gen.generateFont(p);
    }

    public BitmapFont getFont(){
        return bitmapFont;
    }


}
