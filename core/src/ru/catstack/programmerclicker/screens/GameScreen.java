package ru.catstack.programmerclicker.screens;

import ru.catstack.programmerclicker.engine.MyGdxGame;
import ru.catstack.programmerclicker.objects.interior.Door;
import ru.catstack.programmerclicker.objects.interior.House;

public class GameScreen extends Base2DScreen {

    private House house;
    private Door door;

    public GameScreen(MyGdxGame myGdxGame) {
        super(myGdxGame);
    }

    @Override
    public void show(){
        super.show();
        house = new House();
        door = new Door();
    }

    @Override
    public void update(float delta) {
        super.update(delta);

        house.update();
        door.update();
    }

    @Override
    public void draw() {
        super.draw();
        batch.begin();
        house.draw(batch);
        door.draw(batch);
        batch.end();
    }
}
