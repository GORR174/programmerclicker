package ru.catstack.programmerclicker.objects.interior;

import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import ru.catstack.programmerclicker.engine.Core;
import ru.catstack.programmerclicker.objects.Button;
import ru.catstack.programmerclicker.resources.IMG;
import ru.catstack.programmerclicker.resources.Upgrades;

public class ScreenItems {

    public static House house;
    public static Door door;
    public static Picture picture;
    public static Table table;
    public static Trashcan trashcan;
    public static Shelf shelf;
    public static Computer1 computer1;
    public static Computer2 computer2;
    public static Player player;

    public static Button b1;
    public static Button b2;
    public static Button b3;

    public static void init(){
        house = new House();
        door = new Door();
        picture = new Picture();
        table = new Table();
        trashcan = new Trashcan();
        shelf = new Shelf();
        computer1 = new Computer1();
        computer2 = new Computer2();
        player = new Player();

        b1 = new Button(IMG.PICTURE1.getTextureRegion(), Core.D_WIDTH_HALF/2-10, 10);
        b1.getSprite().scale(-0.5f);
        b1.setAction(() -> picture.setThisUpgrade(Upgrades.PICTURE1));
        b2 = new Button(IMG.PICTURE2.getTextureRegion(), Core.D_WIDTH_HALF-10, 10);
        b2.getSprite().scale(-0.5f);
        b2.setAction(() -> picture.setThisUpgrade(Upgrades.PICTURE2));
        b3 = new Button(IMG.PICTURE3.getTextureRegion(), Core.D_WIDTH_HALF+Core.D_WIDTH_HALF/2-10, 10);
        b3.getSprite().scale(-0.5f);
        b3.setAction(() -> picture.setThisUpgrade(Upgrades.PICTURE3));
    }

    public static void update(){
        house.update();
        door.update();
        picture.update();
        table.update();
        trashcan.update();
        shelf.update();
        computer1.update();
        computer2.update();
        player.update();

        b1.update();
        b2.update();
        b3.update();
    }

    public static void draw(SpriteBatch batch){
        house.draw(batch);
        door.draw(batch);
        picture.draw(batch);
        table.draw(batch);
        shelf.draw(batch);
        computer1.draw(batch);
        player.draw(batch);
        computer2.draw(batch);

        trashcan.draw(batch);

        b1.draw(batch);
        b2.draw(batch);
        b3.draw(batch);
    }

}
