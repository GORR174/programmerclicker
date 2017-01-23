package ru.catstack.programmerclicker.objects.interior;

import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import ru.catstack.programmerclicker.engine.Core;
import ru.catstack.programmerclicker.objects.Button;
import ru.catstack.programmerclicker.objects.PlayerCore;
import ru.catstack.programmerclicker.resources.Fonts;
import ru.catstack.programmerclicker.resources.IMG;
import ru.catstack.programmerclicker.resources.Upgrades;
import ru.catstack.programmerclicker.screens.Shop;
import ru.catstack.programmerclicker.utils.TextUtils;

public class ScreenItems {

    private PlayerCore playerCore = new PlayerCore();

    private Button b1;
    private Button b2;
    private Button b3;

    private Button shopButton;
    public Shop shop = new Shop();

    public void init(){
        itemsIni();
        guiIni();
        shop.ini();

        b1 = new Button(IMG.PICTURE1.getTextureRegion(), Core.D_WIDTH_HALF/2-10, 10);
        b1.getSprite().scale(-0.5f);
        b1.setAction(() -> playerCore.picture.setThisUpgrade(Upgrades.PICTURE1));
        b2 = new Button(IMG.PICTURE2.getTextureRegion(), Core.D_WIDTH_HALF-10, 10);
        b2.getSprite().scale(-0.5f);
        b2.setAction(() -> playerCore.picture.setThisUpgrade(Upgrades.PICTURE2));
        b3 = new Button(IMG.PICTURE3.getTextureRegion(), Core.D_WIDTH_HALF+Core.D_WIDTH_HALF/2-10, 10);
        b3.getSprite().scale(-0.5f);
        b3.setAction(() -> playerCore.picture.setThisUpgrade(Upgrades.PICTURE3));
    }

    public void update(){
        itemsUpdate();
        if(shop.isOpen)
            shop.update();
        else
            guiUpdate();
    }

    public void draw(SpriteBatch batch){
        itemsDraw(batch);

        if(shop.isOpen)
            shop.draw(batch);
        else
            guiDraw(batch);
    }

    private void itemsIni(){
        playerCore.ini();
    }

    private void itemsUpdate(){
        playerCore.update();
    }

    private void itemsDraw(SpriteBatch batch){
        playerCore.draw(batch);
    }

    public void guiIni(){
        shopButton = new Button(IMG.SHOP_BUTTON_UP.getTextureRegion(), IMG.SHOP_BUTTON_DOWN.getTextureRegion(), 4, 374);
        shopButton.setAction(() -> shop.isOpen = true);
    }

    public void guiUpdate(){
        shopButton.update();

        b1.update();
        b2.update();
        b3.update();
    }

    public void guiDraw(SpriteBatch batch){
        batch.draw(IMG.HUD.getTextureRegion(), 0, 364);
        shopButton.draw(batch);
        TextUtils.centerTextRender(Fonts.DEFAULT_FONT.getFont(), String.valueOf(Core.codeLines), 392, batch);

        b1.draw(batch);
        b2.draw(batch);
        b3.draw(batch);
    }

}
