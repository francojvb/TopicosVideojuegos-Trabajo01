package com.mygdx.game.GameObjects;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.glutils.ShapeRenderer;
import com.badlogic.gdx.math.Rectangle;
import com.mygdx.game.Interface.IFigure;

public class Brick extends Figure implements IFigure {
    public Brick(int x, int y, int width, int height, int xSpeed, int ySpeed) {
        super(x, y, width, height, xSpeed, ySpeed);
    }

    protected void update() {
        x += xSpeed;
        y += ySpeed;
        if(x < 0 || x > Gdx.graphics.getWidth()){
            xSpeed = -xSpeed;
        }
        if(y < 0 || y > Gdx.graphics.getHeight()){
            ySpeed = -ySpeed;
        }
    }

    public void bounce(){
        xSpeed = -xSpeed;
        ySpeed = -ySpeed;
    }

    @Override
    protected Rectangle getArea() {
        return new Rectangle(this.x,this.y,width,height);
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
        update();
    }
}
