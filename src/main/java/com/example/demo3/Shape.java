package com.example.demo3;

import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;

public abstract class Shape
{
    protected Color color;
    protected Double x;
    protected Double y;
    protected Double w;
    protected Double h;


    public Shape(Color color,  Double x, Double y, Double w, Double h)
    {
        this.color = color;
        this.x = x;
        this.y = y;
        this.w = w;
        this.h = h;
    }

    public Shape() {
        this.color = Color.RED;
        this.x = 50.0;
        this.y = 60.0;
        this.w = 90.0;
        this.h = 100.0;
    }

    abstract double area();
    public abstract String toString();
    abstract void draw( GraphicsContext gr);
    // конструктор


}




