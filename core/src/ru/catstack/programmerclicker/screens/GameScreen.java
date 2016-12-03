package ru.catstack.programmerclicker.screens;

import ru.catstack.programmerclicker.engine.MyGdxGame;
import ru.catstack.programmerclicker.objects.interior.*;

public class GameScreen extends Base2DScreen {

    public GameScreen(MyGdxGame myGdxGame) {
        super(myGdxGame);
    }

    @Override
    public void show(){
        super.show();
        ScreenItems.init();
    }

    @Override
    public void update(float delta) {
        super.update(delta);

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
