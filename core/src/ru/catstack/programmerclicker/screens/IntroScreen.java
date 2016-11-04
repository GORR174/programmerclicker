package ru.catstack.programmerclicker.screens;

import com.badlogic.gdx.graphics.g2d.Sprite;
import ru.catstack.programmerclicker.engine.Core;
import ru.catstack.programmerclicker.engine.MyGdxGame;
import ru.catstack.programmerclicker.resources.GameColor;
import ru.catstack.programmerclicker.resources.IMG;

public class IntroScreen extends Base2DScreen {

    private Sprite catStack;
    private float speed = 800;
    private float maxSpeed = 800;
    private int count = 0;

    public IntroScreen(final MyGdxGame game) {
        super(game);
    }

    @Override
    public void show() {
        super.show();
        catStack = new Sprite(IMG.CATSTACK.getTextureRegion());
        catStack.setCenter(Core.D_WIDTH_HALF, 900);
        bg = GameColor.INTRO_BG.get();
    }

    @Override
    public void update(float delta) {
        super.update(delta);
        fall(delta);
    }

    private void fall(float delta) {
        if(count != 7) {
            if (catStack.getY() > Core.D_HEIGHT_HALF - IMG.CATSTACK.getHalfHeight()) {
                catStack.setY(catStack.getY() - delta * speed * Core.gameSpeed);
                if (speed <= maxSpeed) {
                    speed += delta * 1000 * Core.gameSpeed;
                } else speed = maxSpeed;
            } else {
                speed = -speed / 2;
                maxSpeed = -speed;
                catStack.setY(Core.D_HEIGHT_HALF - IMG.CATSTACK.getHalfHeight() + 1);
                count++;
            }
        }else {
            setScreen(MyGdxGame.SCREEN.GAME);
        }
    }

    @Override
    public void draw() {
        super.draw();
        batch.begin();
        catStack.draw(batch);
        batch.end();
    }
}
