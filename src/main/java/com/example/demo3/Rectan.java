package com.example.demo3;

import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;

public class Rectan extends Shape
{
    public Rectan(Color color, Double x, Double y, Double w, Double h) {
        super(color, x, y, w, h);
    }

    @Override
    double area()
    {
        return h*w;
    }

    @Override
    public String toString()
    {
        return "Rectangle color is " + super.color + " and x is : " + x+ " and y is : " + y;
    }
    public void draw(GraphicsContext gr)
    {
        gr.setFill(color);
        gr.fillRect(x,y,w,h);
        System.out.println(toString());
    }

}
