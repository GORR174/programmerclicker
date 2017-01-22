package ru.catstack.programmerclicker.objects;

import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import ru.catstack.programmerclicker.resources.Fonts;
import ru.catstack.programmerclicker.resources.IMG;
import ru.catstack.programmerclicker.utils.TextUtils;

public class ShopItem extends Object {

    Button watchButton;
    Button buyButton;
    String name;

    public ShopItem(String name, float x, float y) {
        super(IMG.SHOP_ITEM.getTextureRegion(), x, y);
        watchButton = new Button(IMG.WATCH_BUTTON_UP, IMG.WATCH_BUTTON_DOWN, x+3, y+3);
        buyButton = new Button(IMG.BUY_BUTTON_UP, IMG.BUY_BUTTON_DOWN, x+85, y+3);
        this.name = name;
    }

    @Override
    public void update() {
        super.update();
        watchButton.update();
        buyButton.update();
    }

    @Override
    public void draw(SpriteBatch batch) {
        super.draw(batch);
        watchButton.draw(batch);
        buyButton.draw(batch);

        TextUtils.centerTextRender(Fonts.DEFAULT_SMALL_FONT.getFont(), name, sprite.getY()+14, batch);
    }
}
