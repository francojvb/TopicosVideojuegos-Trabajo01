package com.mygdx.game.Screens;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.Color;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.BitmapFont;
import com.badlogic.gdx.scenes.scene2d.Actor;
import com.badlogic.gdx.scenes.scene2d.ui.Image;
import com.badlogic.gdx.scenes.scene2d.ui.Skin;
import com.badlogic.gdx.scenes.scene2d.ui.TextButton;
import com.badlogic.gdx.scenes.scene2d.ui.TextField;
import com.badlogic.gdx.scenes.scene2d.utils.ChangeListener;
import com.badlogic.gdx.scenes.scene2d.utils.Drawable;
import com.mygdx.game.MyGdxGame;
import com.mygdx.game.core.screens.BaseScreen;

public class InputParametersScreen extends BaseScreen {
    private TextButton btnPlay;
    private TextButton btnCredits;
    protected TextField cantElementos;
    protected TextField cantColumnas;

    @Override
    protected void init() {
        requiredProcessor = true;
        Skin skin = new Skin(Gdx.files.internal("uiskin.json"));
        TextField.TextFieldStyle styleField = new TextField.TextFieldStyle();
        TextButton.TextButtonStyle style = new TextButton.TextButtonStyle();
        style.font = new BitmapFont();
        style.fontColor = Color.GOLD;
        style.overFontColor = Color.GREEN;
        style.downFontColor = Color.RED;
        styleField.font=new BitmapFont();
        styleField.fontColor = Color.WHITE;

        btnPlay = new TextButton("Play",style);
        btnCredits = new TextButton("Credits",style);

        cantElementos = new TextField("Elementos",skin);
        cantColumnas = new TextField("Columnas",skin);

        btnPlay.setPosition(40,140);
        btnPlay.setSize(200,80);
        btnCredits.setPosition(40,40);
        btnCredits.setSize(200,80);

        cantElementos.setPosition(200,140);
        cantElementos.setSize(100,40);
        cantColumnas.setPosition(200,80);
        cantColumnas.setSize(100,40);

        addActor(btnCredits);
        addActor(btnPlay);
        addActor(cantColumnas);
        addActor(cantElementos);

        btnPlay.addCaptureListener(new ChangeListener() {
            @Override
            public void changed(ChangeEvent event, Actor actor) {
                Gdx.app.log("Columnas",cantColumnas.getText());
                Gdx.app.log("Elementos", cantElementos.getText());
                GameScreen gamescreen = new GameScreen();
                gamescreen.elem=cantElementos.getText();
                gamescreen.colum=cantColumnas.getText();
                MyGdxGame.instance.setScreen(gamescreen);
            }
        });
    }

    @Override
    protected void draw(float delta) {

    }
}
