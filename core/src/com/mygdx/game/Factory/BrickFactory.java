package com.mygdx.game.Factory;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.glutils.ShapeRenderer;
import com.mygdx.game.GameObjects.Ball;
import com.mygdx.game.GameObjects.Brick;
import com.mygdx.game.Interface.IFactory;

import java.util.ArrayList;

public class BrickFactory implements IFactory {
    ArrayList<Brick> bricks;
    public BrickFactory() {
        bricks = new ArrayList<>();
    }

    public void build(int index,int y){
        Brick brick = new Brick(0, 0,40,10);
        int x = index * (brick.getWidth() + 20);
        brick.setY(Gdx.graphics.getHeight() - brick.getHeight() - y);
        brick.setX(x);
        bricks.add(brick);
    }
/*
    public void collideWithBall(Ball ball){
        for (int i = 0; i < bricks.size(); i++) {
            if(bricks.get(i).collideWith(ball)){
                bricks.set(i,null);
                bricks.remove(i);
            }
        }
    }*/

    @Override
    public void render(ShapeRenderer renderer) {
        for (Brick brick: bricks) {
            brick.draw();
            brick.render(renderer);
        }
    }

    @Override
    public void destroy() {

    }

    public int posUltimo(){
        return bricks.get(bricks.size()-1).getX() + bricks.get(bricks.size()-1).getWidth();
    }
}
