package ru.catstack.programmerclicker.objects;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.g2d.TextureRegion;
import ru.catstack.programmerclicker.engine.Core;
import ru.catstack.programmerclicker.resources.IMG;
import ru.catstack.programmerclicker.utils.Utils;

public class Button extends Object{

    private Runnable action = () -> {};
    private boolean isTouched = false;
    private TextureRegion upTexture;
    private TextureRegion downTexture;

    public Button(TextureRegion upTexture, TextureRegion downTexture, float x, float y){
        super(upTexture, x, y);
        this.upTexture = upTexture;
        this.downTexture = downTexture;
    }

    public Button(IMG upTexture, IMG downTexture, float x, float y){
        super(upTexture.getTextureRegion(), x, y);
        this.upTexture = upTexture.getTextureRegion();
        this.downTexture = downTexture.getTextureRegion();
    }

    public Button(TextureRegion upTexture, float x, float y){
        super(upTexture, x, y);
        this.upTexture = upTexture;
    }

    @Override
    public void update(){
        if(Utils.isObjectTouched(sprite.getBoundingRectangle())){
            isTouched = true;
            Core.onObjectClicked = true;
            if(downTexture != null) sprite.setRegion(downTexture);
        } else if(isTouched && !Gdx.input.isTouched()) {
            isTouched = false;
            action.run();
            sprite.setRegion(upTexture);
        } else if(isTouched && Gdx.input.isTouched()){
            isTouched = false;
            sprite.setRegion(upTexture);
        }
    }

    public void setAction(Runnable action) {
        this.action = action;
    }

    public void setTexture(TextureRegion upTexture){
        setTexture(upTexture, downTexture);
    }

    public void setTexture(TextureRegion upTexture, TextureRegion downTexture){
        this.upTexture = upTexture;
        this.downTexture = downTexture;
        sprite.setRegion(upTexture);
    }

    public void setTexture(IMG upTexture){
        setTexture(upTexture.getTextureRegion());
    }

    public void setTexture(IMG upTexture, IMG downTexture){
        setTexture(upTexture.getTextureRegion(), downTexture.getTextureRegion());
    }

    public TextureRegion getUpTexture() {
        return upTexture;
    }

    public TextureRegion getDownTexture() {
        return downTexture;
    }
}
