package com.mygdx.game.GameObjects;

import com.badlogic.gdx.graphics.Color;
import com.badlogic.gdx.graphics.glutils.ShapeRenderer;
import com.badlogic.gdx.math.Rectangle;

public class Figure {
    protected int x;
    protected int y;
    protected int size;
    protected int xSpeed;
    protected int ySpeed;
    protected int height;
    protected int width;
    protected Rectangle rectangle;
    protected Color color = Color.WHITE;

    public Figure(int x, int y, int width, int height) {
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
        rectangle = new Rectangle(x,y,width,height);
    }

    public Figure(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public Figure(int x, int y, int size, int xSpeed, int ySpeed){
        this.x = x;
        this.y = y;
        this.size = size;
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
        rectangle = new Rectangle(x,y,width,height);
    }

    protected void draw(ShapeRenderer shapeRenderer){
        rectangle.x = x;
        rectangle.y = y;
        shapeRenderer.setColor(color);
    }

    protected Rectangle getArea(){
        return rectangle;
    }

    protected void update(){}

    public boolean collideWith(Figure figure){
        return getArea().overlaps(figure.getArea());
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public int getxSpeed() {
        return xSpeed;
    }

    public void setxSpeed(int xSpeed) {
        this.xSpeed = xSpeed;
    }

    public int getySpeed() {
        return ySpeed;
    }

    public void setySpeed(int ySpeed) {
        this.ySpeed = ySpeed;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public Rectangle getRectangle() {
        return rectangle;
    }

    public void setRectangle(Rectangle rectangle) {
        this.rectangle = rectangle;
    }
}
