package com.example.demo3;

import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;

public class RoundRect extends Shape{

    @Override
    double area()
    {
        return h*w;
    }

    @Override
    public String toString()
    {
        return "RoundRect color is " + super.color+" and x is : " + x+ " and y is : " + y;
    }
    public void draw(GraphicsContext gr)
    {
        gr.setFill(color);
        gr.fillRoundRect(x,y,w,h, 30, 30);
        System.out.println(toString());
    }
}
