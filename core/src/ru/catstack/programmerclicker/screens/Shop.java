package ru.catstack.programmerclicker.screens;

import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import ru.catstack.programmerclicker.objects.Button;
import ru.catstack.programmerclicker.objects.ShopItem;
import ru.catstack.programmerclicker.resources.IMG;

public class Shop {

    public static boolean isOpen = false;

    private static Button close;

    private static ShopItem shopItem1;

    public static void ini(){
        close = new Button(IMG.SHOP_CLOSE_BUTTON_UP.getTextureRegion(), IMG.SHOP_CLOSE_BUTTON_DOWN.getTextureRegion(), 208, 376);
        close.setAction(() -> isOpen = false);

        shopItem1 = new ShopItem("Girl picture", 16, 296);
    }

    public static void update(){
        close.update();

        shopItem1.update();
    }

    public static void draw(SpriteBatch batch){
        batch.draw(IMG.SHOP_GUI.getTextureRegion(), 0, 0);
        close.draw(batch);

        shopItem1.draw(batch);
    }
}
