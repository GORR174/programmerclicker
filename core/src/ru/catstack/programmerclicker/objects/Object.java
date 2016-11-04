package ru.catstack.programmerclicker.objects;

import com.badlogic.gdx.graphics.g2d.Sprite;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.graphics.g2d.TextureRegion;

public class Object {

    protected Sprite sprite;

    public Object(TextureRegion textureRegion, float x, float y){
        sprite = new Sprite(textureRegion);
        sprite.setX(x);
        sprite.setY(y);
    }

    public void update(){

    }

    public void draw(SpriteBatch batch){
        sprite.draw(batch);
    }
}
