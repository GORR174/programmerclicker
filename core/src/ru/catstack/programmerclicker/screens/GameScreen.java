package ru.catstack.programmerclicker.screens;

import ru.catstack.programmerclicker.engine.MyGdxGame;
import ru.catstack.programmerclicker.objects.interior.*;
import ru.catstack.programmerclicker.utils.Timer;

public class GameScreen extends Base2DScreen {

    public GameScreen(MyGdxGame myGdxGame) {
        super(myGdxGame);
    }

    Timer everySecond = new Timer(1, () -> System.out.println("Every second!"));

    @Override
    public void show(){
        super.show();
        ScreenItems.init();
    }

    @Override
    public void update(float delta) {
        super.update(delta);

        everySecond.update(delta);

        ScreenItems.update();
    }

    @Override
    public void draw() {
        super.draw();
        batch.begin();
        ScreenItems.draw(batch);
        batch.end();
    }
}
