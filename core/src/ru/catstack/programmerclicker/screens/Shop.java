package ru.catstack.programmerclicker.screens;

import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import ru.catstack.programmerclicker.objects.Button;
import ru.catstack.programmerclicker.objects.ShopItem;
import ru.catstack.programmerclicker.resources.Fonts;
import ru.catstack.programmerclicker.resources.IMG;
import ru.catstack.programmerclicker.utils.TextUtils;

import java.util.ArrayList;

public class Shop {

    public boolean isOpen = false;

    private Button close;

    private ArrayList<ShopItem> shopItems = new ArrayList<>();

    public void ini(){
        close = new Button(IMG.SHOP_CLOSE_BUTTON_UP.getTextureRegion(), IMG.SHOP_CLOSE_BUTTON_DOWN.getTextureRegion(), 208, 376);
        close.setAction(() -> isOpen = false);

        shopItems.add(new ShopItem("Awesome curse", 16, 296));
        shopItems.add(new ShopItem("Mystery Girl", 16, shopItems.get(0).getSprite().getY()-50));
        shopItems.add(new ShopItem("Through the window", 16, shopItems.get(1).getSprite().getY()-50));
        shopItems.add(new ShopItem("Through the window1", 16, shopItems.get(2).getSprite().getY()-50));
        shopItems.add(new ShopItem("Through the window2", 16, shopItems.get(3).getSprite().getY()-50));
        shopItems.add(new ShopItem("Through the windo3", 16, shopItems.get(4).getSprite().getY()-50));
    }

    public void update(){
        close.update();

        for (ShopItem shopItem : shopItems) {
            shopItem.update();
        }
    }

    public void draw(SpriteBatch batch){
        batch.draw(IMG.SHOP_GUI.getTextureRegion(), 0, 0);
        close.draw(batch);
        TextUtils.centerTextRender(Fonts.DEFAULT_SMALL_FONT.getFont(), "Shop", 384, batch);

        for (ShopItem shopItem : shopItems) {
            shopItem.draw(batch);
        }
    }
}
