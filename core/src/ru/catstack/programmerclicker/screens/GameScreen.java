package ru.catstack.programmerclicker.screens;

import com.badlogic.gdx.Gdx;
import ru.catstack.programmerclicker.engine.Core;
import ru.catstack.programmerclicker.engine.MyGdxGame;
import ru.catstack.programmerclicker.objects.interior.ScreenItems;
import ru.catstack.programmerclicker.resources.Fonts;
import ru.catstack.programmerclicker.utils.TextUtils;
import ru.catstack.programmerclicker.utils.Timer;

public class GameScreen extends Base2DScreen {

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
        ScreenItems.init();
    }

    @Override
    public void update(float delta) {
        super.update(delta);

        everySecond.update(delta);
        if(Gdx.input.justTouched())
            Core.codeLines += Core.codeEveryClick;

        ScreenItems.update();
    }

    @Override
    public void draw() {
        super.draw();
        batch.begin();
        ScreenItems.draw(batch);
        TextUtils.centerTextRender(Fonts.DEFAULT_FONT.getFont(), String.valueOf(Core.codeLines), Core.D_HEIGHT_HALF+64, batch);
        batch.end();
    }
}
