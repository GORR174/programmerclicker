package ru.catstack.programmerclicker.objects;

import com.badlogic.gdx.graphics.g2d.Sprite;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.graphics.g2d.TextureRegion;
import com.badlogic.gdx.math.Rectangle;

public class Object {

    protected Sprite sprite;

    public Object(TextureRegion textureRegion, float x, float y){
        sprite = new Sprite(textureRegion);
        sprite.setX(x);
        sprite.setY(y);
    }

    public Rectangle getSpriteRectangle(){
        return sprite.getBoundingRectangle();
    }

    public Sprite getSprite() {
        return sprite;
    }

    public void update(){

    }

    public void draw(SpriteBatch batch){
        sprite.draw(batch);
    }
}
