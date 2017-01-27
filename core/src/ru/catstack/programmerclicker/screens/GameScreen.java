package ru.catstack.programmerclicker.screens;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.math.Vector2;
import ru.catstack.programmerclicker.engine.Core;
import ru.catstack.programmerclicker.engine.FlyingText;
import ru.catstack.programmerclicker.engine.MyGdxGame;
import ru.catstack.programmerclicker.objects.interior.ScreenItems;
import ru.catstack.programmerclicker.utils.Timer;

import java.util.ArrayList;

public class GameScreen extends Base2DScreen {

    private ScreenItems screenItems = new ScreenItems();
    private ArrayList<FlyingText> texts = new ArrayList<>();

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
            if (Gdx.input.justTouched() && !Core.onObjectClicked) {
                Core.codeLines += Core.codeEveryClick;
                Vector2 mousePos = Core.viewport.unproject(new Vector2(Gdx.input.getX(), Gdx.input.getY()));
                texts.add(new FlyingText(String.valueOf(Core.codeEveryClick), mousePos.x, mousePos.y, texts));
            }
        }

        for (FlyingText text : texts) {
            if(!text.update()) {
                texts.remove(text);
                break;
            }
        }

        Core.onObjectClicked = false;
    }

    @Override
    public void draw() {
        super.draw();
        batch.begin();
        screenItems.draw(batch);
        for (FlyingText text : texts) {
            text.draw(batch);
        }
        batch.end();
    }
}
