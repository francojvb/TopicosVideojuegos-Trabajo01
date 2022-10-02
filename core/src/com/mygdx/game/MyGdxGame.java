package com.mygdx.game;

import com.badlogic.gdx.Game;
import com.mygdx.game.Screens.InputParametersScreen;
import com.mygdx.game.core.screens.BaseScreen;

public class MyGdxGame extends Game {
    public InputParametersScreen inputParametersScreen;
    public static MyGdxGame instance;

    @Override
    public void create() {
        if(instance == null) {
            instance = this;
        }
        inputParametersScreen = new InputParametersScreen();
        changeScreen(inputParametersScreen);
    }

    


    @Override
    public void dispose() {

    }

    public void changeScreen(BaseScreen screen){
        setScreen(screen);
    }
}
