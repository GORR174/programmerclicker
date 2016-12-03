package ru.catstack.programmerclicker.objects.interior;

import com.badlogic.gdx.graphics.g2d.SpriteBatch;

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
    }

}
