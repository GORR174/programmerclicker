package ru.catstack.programmerclicker.objects;

import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import ru.catstack.programmerclicker.engine.Core;
import ru.catstack.programmerclicker.objects.interior.*;
import ru.catstack.programmerclicker.resources.Upgrades;

public class PlayerCore {

    public House house;
    public Door door;
    public Picture picture;
    public Table table;
    public Trashcan trashcan;
    public Shelf shelf;
    public Computer1 computer1;
    public Computer2 computer2;
    public Player player;

    public void ini(){
        house = new House(Upgrades.HOUSE1);
        door = new Door(Upgrades.DOOR1);
        picture = new Picture(Upgrades.PICTURE1);
        table = new Table(Upgrades.TABLE1);
        trashcan = new Trashcan(Upgrades.TRASHCAN1);
        shelf = new Shelf(Upgrades.SHELF1);
        computer1 = new Computer1(Upgrades.COMPUTER1_1);
        computer2 = new Computer2(Upgrades.COMPUTER1_2);
        player = new Player(Upgrades.PlAYER1);
        Core.playerCore = this;
    }

    public void update() {
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

    public void draw(SpriteBatch batch){
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

    public void setUpgrade(Upgrades upgrade){
        switch (upgrade.getType()) {
            case PICTURE:
                picture.setThisUpgrade(upgrade);
                break;
            case COMPUTER1:
                picture.setThisUpgrade(upgrade);
                break;
            case COMPUTER2:
                computer2.setThisUpgrade(upgrade);
                break;
            case DOOR:
                door.setThisUpgrade(upgrade);
                break;
            case HOUSE:
                house.setThisUpgrade(upgrade);
                break;
            case PLAYER:
                player.setThisUpgrade(upgrade);
                break;
            case SHELF:
                shelf.setThisUpgrade(upgrade);
                break;
            case TABLE:
                table.setThisUpgrade(upgrade);
                break;
            case TRASHCAN:
                trashcan.setThisUpgrade(upgrade);
                break;
        }
    }
}
