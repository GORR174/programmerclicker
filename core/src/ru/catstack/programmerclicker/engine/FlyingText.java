package ru.catstack.programmerclicker.engine;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.g2d.BitmapFont;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import ru.catstack.programmerclicker.resources.Fonts;
import ru.catstack.programmerclicker.utils.TextUtils;
import ru.catstack.programmerclicker.utils.Timer;

import java.util.ArrayList;
import java.util.Random;

public class FlyingText {

    private String text;
    private float x;
    private float y;
    private BitmapFont font;
    private boolean delete = false;
    private float alpha = 1;

    private Timer timer;

    public FlyingText(String text, float x, float y, ArrayList<FlyingText> texts){
        this.x = x;
        this.y = y;
        this.text = text;
        font = Fonts.DEFAULT_SMALL_FONT.getFont();
        font = new BitmapFont(font.getData(), font.getRegion(), font.usesIntegerPositions());
        timer = new Timer(1+new Random().nextInt(3)+new Random().nextFloat(), new Runnable() {
            @Override
            public void run() {
                delete = true;
            }
        });
    }

    public boolean update(){
        y+= Gdx.graphics.getDeltaTime()*100;
        x+= Gdx.graphics.getDeltaTime()*10*(new Random().nextInt(3)-1);

        alpha = 1.1f-timer.getThisTime()/timer.getFinalTime();

        font.setColor(1, 1, 1, alpha);
        timer.update(Gdx.graphics.getDeltaTime());
        if(delete)
            return false;
        return true;
    }

    public void draw(SpriteBatch batch){
        font.draw(batch, text, x-TextUtils.getHalfOfText(font, text), y);
    }
}
