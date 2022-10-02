package com.mygdx.game.Factory;

import com.badlogic.gdx.graphics.glutils.ShapeRenderer;
import com.mygdx.game.GameObjects.Paddle;
import com.mygdx.game.Interface.IFactory;

public class PaddleFactory implements IFactory {

    private Paddle paddle;
    public PaddleFactory() {
        this.paddle = new Paddle(150,0,200,30);
    }

    public void update(int x){
        paddle.setX(x);
    }

    public Paddle getPaddle() {
        return paddle;
    }

    public void setPaddle(Paddle paddle) {
        this.paddle = paddle;
    }
    @Override
    public void render(ShapeRenderer renderer) {
        paddle.render(renderer);
    }

    @Override
    public void destroy() {

    }
}
