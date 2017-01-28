package ru.catstack.programmerclicker.objects;

import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import ru.catstack.programmerclicker.engine.Core;
import ru.catstack.programmerclicker.resources.Fonts;
import ru.catstack.programmerclicker.resources.IMG;
import ru.catstack.programmerclicker.resources.Upgrades;
import ru.catstack.programmerclicker.screens.Shop;
import ru.catstack.programmerclicker.utils.TextUtils;

public class ShopItem extends Object {

    private Button watchButton;
    private Button buyButton;
    private String name;
    private Upgrades upgrade;

    public ShopItem(String name, Upgrades upgrade, float x, float y) {
        super(IMG.SHOP_ITEM.getTextureRegion(), x, y);
        watchButton = new Button(IMG.WATCH_BUTTON_UP, IMG.WATCH_BUTTON_DOWN, x+6, y+6);
        buyButton = new Button(IMG.BUY_BUTTON_UP, IMG.BUY_BUTTON_DOWN, x+170, y+6);
        watchButton.setAction(new Runnable() {
            @Override
            public void run() {
                Shop.saveUpgrade = Core.playerCore.getUpgradeByType(ShopItem.this.upgrade.getType());
                Core.playerCore.setUpgrade(upgrade);
                Shop.hide();
            }
        });
        // TODO: 27.01.2017 add buying system & have texture
        buyButton.setAction(new Runnable() {
            @Override
            public void run() {
                if (ShopItem.this.upgrade.isHaving()) {
                    Core.playerCore.setUpgrade(upgrade);
                }
            }
        });
        this.name = name;
        this.upgrade = upgrade;
    }

    @Override
    public void update() {
        super.update();
        watchButton.update();
        buyButton.update();
        if(Core.playerCore.getUpgradeByType(upgrade.getType()).equals(upgrade) && !buyButton.getUpTexture().equals(IMG.SETTED_BUTTON_UP.getTextureRegion()))
            buyButton.setTexture(IMG.SETTED_BUTTON_UP, IMG.SETTED_BUTTON_DOWN);
        else if(!Core.playerCore.getUpgradeByType(upgrade.getType()).equals(upgrade) && buyButton.getUpTexture().equals(IMG.SETTED_BUTTON_UP.getTextureRegion()))
            buyButton.setTexture(IMG.BUY_BUTTON_UP, IMG.BUY_BUTTON_DOWN);
    }

    @Override
    public void draw(SpriteBatch batch) {
        super.draw(batch);
        watchButton.draw(batch);
        buyButton.draw(batch);

        TextUtils.centerTextRender(Fonts.DEFAULT_SMALL_FONT.getFont(), name, sprite.getY()+24, batch);
    }
}
