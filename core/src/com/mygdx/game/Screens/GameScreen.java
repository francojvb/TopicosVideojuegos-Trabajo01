package com.mygdx.game.Screens;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.glutils.ShapeRenderer;
import com.mygdx.game.Factory.BallFactory;
import com.mygdx.game.Factory.BrickFactory;
//import com.mygdx.game.Factory.PaddleFactory;
import com.mygdx.game.core.screens.BaseScreen;

public class GameScreen extends BaseScreen {
    ShapeRenderer shapeRenderer;
    BallFactory ballFactory;
    //PaddleFactory paddleFactory;
    BrickFactory brickFactory;

    String elem="5";
    public String colum;

    @Override
    protected void init() {
        Gdx.app.log("a",elem);
        Gdx.app.log("SCREEN","GAME");
        ballFactory = new BallFactory();
        shapeRenderer = new ShapeRenderer();
        brickFactory = new BrickFactory();
        InitGame();
    }

    private void InitGame(){

        int y =  0;
        int index = -1;
        for (int i = 0; i < 20; i++) {
            index++;
            if(index % 6 == 0){
                y += 50;
                index = 0;
            }
            if((i+1)%2==0){
                ballFactory.build(brickFactory.posUltimo(), y);

            }else{
                brickFactory.build(index,y);
            }

        }
    }

    @Override
    protected void draw(float delta) {
        Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
        shapeRenderer.begin(ShapeRenderer.ShapeType.Filled);
        ballFactory.render(shapeRenderer);
       // paddleFactory.render(shapeRenderer);
        brickFactory.render(shapeRenderer);
        shapeRenderer.end();
        update();
    }


    private void update(){
        //paddleFactory.update(Gdx.input.getX());
        //ballFactory.collideWithPaddle(paddleFactory.getPaddle());
        //brickFactory.collideWithBall(ballFactory.getBall());
    }

    public void setConfig(String elementos,String columnas){
        Gdx.app.log("SCREEN",elementos);
        elem=elementos;
        colum=columnas;
    }
}
