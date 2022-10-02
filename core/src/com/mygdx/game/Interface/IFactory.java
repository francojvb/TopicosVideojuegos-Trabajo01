package com.mygdx.game.Interface;

import com.badlogic.gdx.graphics.glutils.ShapeRenderer;

public interface IFactory {
    void render(ShapeRenderer renderer);
    void destroy();
}
