package ru.catstack.programmerclicker.screens;

import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import ru.catstack.programmerclicker.objects.Button;
import ru.catstack.programmerclicker.objects.ShopItems;
import ru.catstack.programmerclicker.resources.Fonts;
import ru.catstack.programmerclicker.resources.IMG;
import ru.catstack.programmerclicker.resources.Upgrades;
import ru.catstack.programmerclicker.utils.TextUtils;

public class Shop {

    private static boolean isOpen = false;

    private Button close;

//    private ArrayList<ShopItem> shopItems = new ArrayList<>();
    private ShopItems shopItems = new ShopItems();

    public void ini(){
        close = new Button(IMG.SHOP_CLOSE_BUTTON_UP.getTextureRegion(), IMG.SHOP_CLOSE_BUTTON_DOWN.getTextureRegion(), 208, 376);
        close.setAction(() -> isOpen = false);

        shopItems.addShopItem("Awesome curse", Upgrades.PICTURE1);
        shopItems.addShopItem("Mystery Girl", Upgrades.PICTURE3);
        shopItems.addShopItem("Through the window", Upgrades.PICTURE2);
        shopItems.addShopItem("Test 1", Upgrades.PICTURE3);
        shopItems.addShopItem("Test 2", Upgrades.PICTURE3);
        shopItems.addShopItem("Test 3", Upgrades.PICTURE3);
        shopItems.addShopItem("Test 4", Upgrades.PICTURE3);
        shopItems.addShopItem("Test 5", Upgrades.PICTURE3);
        shopItems.addShopItem("Test 6", Upgrades.PICTURE3);
        shopItems.addShopItem("Test 7", Upgrades.PICTURE3);
        shopItems.addShopItem("Test 8", Upgrades.PICTURE3);
        shopItems.addShopItem("Test 9", Upgrades.PICTURE3);
        shopItems.addShopItem("Test 10", Upgrades.PICTURE3);
        shopItems.addShopItem("Test 11", Upgrades.PICTURE3);
    }

    public void update(){
        close.update();

        shopItems.update();
    }

    public void draw(SpriteBatch batch){
        batch.draw(IMG.SHOP_GUI.getTextureRegion(), 0, 0);
        close.draw(batch);
        TextUtils.centerTextRender(Fonts.DEFAULT_SMALL_FONT.getFont(), "Shop", 384, batch);

        shopItems.draw(batch);
    }

    public static boolean isOpen() {
        return isOpen;
    }

    public static void Open() {
        Shop.isOpen = true;
    }

    public static void Close() {
        Shop.isOpen = false;
    }
}
