package com.mygdx.game.GameObjects;

import com.badlogic.gdx.graphics.Color;
import com.badlogic.gdx.graphics.glutils.ShapeRenderer;
import com.mygdx.game.Interface.IFigure;

public class Paddle extends Figure implements IFigure {

    public Paddle(int x, int y, int width, int height) {
        super(x,y,width,height);
        color = Color.BLUE;
    }

    protected void draw(ShapeRenderer shapeRenderer) {
        super.draw(shapeRenderer);
        shapeRenderer.rect(x,y,width,height);
    }

    @Override
    public void render(ShapeRenderer shapeRenderer) {
        draw(shapeRenderer);
    }

    @Override
    public void draw() {

    }
}
