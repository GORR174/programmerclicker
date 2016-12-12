package ru.catstack.programmerclicker.objects;

import com.badlogic.gdx.graphics.g2d.TextureRegion;
import ru.catstack.programmerclicker.utils.Utils;

public class Button extends Object{

    Runnable action = () -> {};

    public Button(TextureRegion textureRegion, float x, float y){
        super(textureRegion, x, y);
    }

    @Override
    public void update(){
        if(Utils.onObjectTouched(sprite.getBoundingRectangle())){
            action.run();
        }
    }

    public void setAction(Runnable action) {
        this.action = action;
    }
}
