package ru.catstack.programmerclicker.objects.interior;

import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import ru.catstack.programmerclicker.engine.Core;
import ru.catstack.programmerclicker.objects.Button;
import ru.catstack.programmerclicker.objects.PlayerCore;
import ru.catstack.programmerclicker.resources.Fonts;
import ru.catstack.programmerclicker.resources.IMG;
import ru.catstack.programmerclicker.screens.Shop;
import ru.catstack.programmerclicker.utils.TextUtils;

public class ScreenItems {

    private PlayerCore playerCore = new PlayerCore();

    private Button shopButton;
    public Shop shop = new Shop();

    public void init(){
        itemsIni();
        guiIni();
        shop.ini();
    }

    public void update(){
        itemsUpdate();
        if(Shop.isOpen())
            shop.update();
        else
            guiUpdate();
    }

    public void draw(SpriteBatch batch){
        itemsDraw(batch);

        if(Shop.isOpen())
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
        shopButton.setAction(new Runnable() {
            @Override
            public void run() {
                Shop.Open();
            }
        });
    }

    public void guiUpdate(){
        shopButton.update();
    }

    public void guiDraw(SpriteBatch batch){
        batch.draw(IMG.HUD.getTextureRegion(), 0, 364);
        shopButton.draw(batch);
        TextUtils.centerTextRender(Fonts.DEFAULT_FONT.getFont(), String.valueOf(Core.codeLines), 392, batch);
    }

}
