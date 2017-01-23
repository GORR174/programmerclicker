package ru.catstack.programmerclicker.objects;

import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import ru.catstack.programmerclicker.resources.Upgrades;

import java.lang.*;
import java.util.ArrayList;

public class ShopItems extends ArrayList<ShopItem>{

    private int thisPage = 1;
    private int pages;
    private final float ITEMS_PER_PAGE = 6;

    public void addShopItem(String name, Upgrades upgrade){
        if(size() % ITEMS_PER_PAGE != 0) {
            add(new ShopItem(name, upgrade, 16, get(size() - 1).getSprite().getY() - 50));
        }else {
            add(new ShopItem(name, upgrade, 16, 296));
        }

        pages = (int)Math.ceil(size()/ITEMS_PER_PAGE);
    }

    public void update(){

        int startPage = (int)(thisPage*ITEMS_PER_PAGE-6);
        int countPagesOnThisPage = size()/(float)thisPage > ITEMS_PER_PAGE ? 6 : (int)(ITEMS_PER_PAGE-(ITEMS_PER_PAGE*thisPage-size()));
        int endPage = startPage+countPagesOnThisPage;

        for (int i=startPage; i<=endPage-1; i++) {
            get(i).update();
        }
    }

    public void draw(SpriteBatch batch){

        int startPage = (int)(thisPage*ITEMS_PER_PAGE-6);
        int countPagesOnThisPage = size()/(float)thisPage > ITEMS_PER_PAGE ? 6 : (int)(ITEMS_PER_PAGE-(ITEMS_PER_PAGE*thisPage-size()));
        int endPage = startPage+countPagesOnThisPage;

        for (int i=startPage; i<=endPage-1; i++) {
            get(i).draw(batch);
        }
//        for (ShopItem shopItem : this) {
//            shopItem.draw(batch);
//        }
    }

    public void addPage(){
        thisPage++;
    }

    public void subtractPage(){
        thisPage--;
    }

    public void setThisPage(int thisPage) {
        this.thisPage = thisPage;
    }
}
