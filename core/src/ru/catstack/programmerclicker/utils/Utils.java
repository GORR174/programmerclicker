package ru.catstack.programmerclicker.utils;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.math.Rectangle;
import com.badlogic.gdx.math.Vector2;
import ru.catstack.programmerclicker.engine.Core;

public class Utils {

    public static boolean isObjectTouched(Rectangle rectangle){
        if(Gdx.input.isTouched()){
            Vector2 mCoords = Core.viewport.unproject(new Vector2(Gdx.input.getX(), Gdx.input.getY()));
            Rectangle mCoordsRect = new Rectangle(mCoords.x, mCoords.y, 1, 1);
            return mCoordsRect.overlaps(rectangle);
        }else {
            return false;
        }
    }

    public static boolean onObjectJustTouched(Rectangle rectangle){
        if(Gdx.input.justTouched()){
            Vector2 mCoords = Core.viewport.unproject(new Vector2(Gdx.input.getX(), Gdx.input.getY()));
            Rectangle mCoordsRect = new Rectangle(mCoords.x, mCoords.y, 1, 1);
            return mCoordsRect.overlaps(rectangle);
        }else {
            return false;
        }
    }

    public static float getDeltaY(){
        return (float)Core.D_HEIGHT/(float)Core.viewport.getScreenHeight()*(float)Gdx.input.getDeltaY();
    }
}
