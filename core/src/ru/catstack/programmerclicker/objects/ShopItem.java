package ru.catstack.programmerclicker.objects;

import com.badlogic.gdx.graphics.g2d.Sprite;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.graphics.g2d.TextureRegion;
import ru.catstack.programmerclicker.resources.IMG;

public class ShopItem extends Object {

    TextureRegion textureRegion;
    Sprite sprite1;

    public ShopItem(TextureRegion img, float x, float y) {
        super(IMG.SHOP_ITEM.getTextureRegion(), x, y);
        textureRegion = img;
        float t = (float) img.getRegionHeight()/(float) 16;
        sprite1 = new Sprite(textureRegion);
        sprite1.scale(-t);
        sprite1.setX(sprite.getX()+6);
        sprite1.setY(sprite.getY()+3);
    }

    @Override
    public void update() {
        super.update();
    }

    @Override
    public void draw(SpriteBatch batch) {
        super.draw(batch);
        sprite1.draw(batch);
    }
}
