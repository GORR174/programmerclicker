package ru.catstack.programmerclicker.screens;

import com.badlogic.gdx.Gdx;
import ru.catstack.programmerclicker.engine.Core;
import ru.catstack.programmerclicker.engine.MyGdxGame;
import ru.catstack.programmerclicker.objects.interior.ScreenItems;
import ru.catstack.programmerclicker.utils.Timer;

public class GameScreen extends Base2DScreen {

    private ScreenItems screenItems = new ScreenItems();

    public GameScreen(MyGdxGame myGdxGame) {
        super(myGdxGame);
    }

    Timer everySecond = new Timer(1, () -> {
        Core.codeLines += Core.codeEverySecond;
        Core.money += Core.moneyEverySecond;
    });

    @Override
    public void show(){
        super.show();
        screenItems.init();
    }

    @Override
    public void update(float delta) {
        super.update(delta);

        screenItems.update();

        if(!Shop.isOpen()) {
            everySecond.update(delta);
            if (Gdx.input.justTouched() && !Core.onObjectClicked)
                Core.codeLines += Core.codeEveryClick;
        }

        Core.onObjectClicked = false;
    }

    @Override
    public void draw() {
        super.draw();
        batch.begin();
        screenItems.draw(batch);
        batch.end();
    }
}
