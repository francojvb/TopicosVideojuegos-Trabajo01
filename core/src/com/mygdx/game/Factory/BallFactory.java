package com.mygdx.game.Factory;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.glutils.ShapeRenderer;
import com.mygdx.game.GameObjects.Ball;
import com.mygdx.game.GameObjects.Brick;
import com.mygdx.game.GameObjects.Paddle;
import com.mygdx.game.Interface.IFactory;


import java.util.ArrayList;
import java.util.Random;

public class BallFactory implements IFactory {
    ArrayList<Ball> balls;
    Random r = new Random();
    public BallFactory() {
        balls = new ArrayList<>();
    }

    public void build(int index,int y){
        int xSpeed= r.nextInt(15);
        int ySpeed= r.nextInt(15);
        Ball ball = new Ball(0, 0,10,xSpeed,ySpeed);
        int x = index + 20 ;
        ball.setY(Gdx.graphics.getHeight() - ball.getHeight() - y);
        ball.setX(x);
        balls.add(ball);
    }
/*
    public Ball getBall() {
        return ball;
    }

    public void setBall(Ball ball) {
        this.ball = ball;
    }

    public void collideWithPaddle(Paddle paddle) {
        if (ball.collideWith(paddle)) {
            ball.bounce();
        }
    }*/

    @Override
    public void render(ShapeRenderer renderer) {
        for (Ball ball: balls) {
            ball.draw();
            ball.render(renderer);
        }
    }

    @Override
    public void destroy() {

    }
}
