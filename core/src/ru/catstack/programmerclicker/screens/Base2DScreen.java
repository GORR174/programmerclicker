package ru.catstack.programmerclicker.screens;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Screen;
import com.badlogic.gdx.graphics.Color;
import com.badlogic.gdx.graphics.FPSLogger;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.OrthographicCamera;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.utils.viewport.FitViewport;
import ru.catstack.programmerclicker.engine.Core;
import ru.catstack.programmerclicker.engine.MyGdxGame;
import ru.catstack.programmerclicker.resources.GameColor;
import ru.catstack.programmerclicker.resources.ResourceManager;

public class Base2DScreen implements Screen{

    private String className = Base2DScreen.class.getSimpleName();

    protected MyGdxGame game;
    protected SpriteBatch batch;
    private OrthographicCamera camera;
    private FPSLogger fpsLogger;
    protected Color bg = GameColor.BG2.get();
    private boolean skipRender = false;
    private MyGdxGame.SCREEN nextScreen = null;


    public Base2DScreen(MyGdxGame game){
        this.game = game;

        Core.init(Gdx.graphics.getWidth(), Gdx.graphics.getHeight());

        batch = new SpriteBatch();
        camera = new OrthographicCamera();
        camera.setToOrtho(false, Core.D_WIDTH, Core.D_HEIGHT);
        Core.viewport = new FitViewport(Core.D_WIDTH, Core.D_HEIGHT, camera);
        batch.setProjectionMatrix(camera.combined);

        fpsLogger = new FPSLogger();

        Gdx.app.debug(className, "new");
    }

    @Override
    public void show() {
        Gdx.input.setCatchBackKey(true);
        Gdx.input.setCatchMenuKey(true);
        Gdx.app.debug(className, "show");
    }

    @Override
    public void render(float delta) {

        if(nextScreen != null) { game.switchTo(nextScreen); }

        if (skipRender) { return; }

        update(delta);

        Gdx.gl.glClearColor(bg.r, bg.g, bg.b, 1);
        Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT | GL20.GL_DEPTH_BUFFER_BIT);

        draw();
    }

    public void update(float delta) {
        Core.viewport.update(Core.WIDTH, Core.HEIGHT);
        fpsLogger.log();
    }

    public void draw() {}

    public void setScreen(MyGdxGame.SCREEN screen){
        skipRender = true;
        nextScreen = screen;
    }

    @Override
    public void resize(int width, int height) {
        Core.init(width, height);
    }

    @Override
    public void pause() {
        Gdx.app.debug(className, "pause");
        skipRender = true;
    }

    @Override
    public void resume() {
        skipRender = false;
        ResourceManager.load();
        Gdx.app.debug(className, "resume");
    }

    @Override
    public void hide() {
        skipRender = true;
        Gdx.app.debug(className, "hide");
    }

    @Override
    public void dispose() {
        skipRender = true;

        camera = null;
        Core.viewport = null;

        batch.dispose();
        batch = null;

        fpsLogger = null;

        Gdx.app.debug(className, "unload");
    }
}
