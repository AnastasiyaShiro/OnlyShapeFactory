package com.example.demo3;

import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;
import javafx.scene.shape.ArcType;

public class Oval extends Shape{

    @Override
    double area()
    {
        return h*w;
    }

    @Override
    public String toString()
    {
        return "Oval color is " + super.color + " and x is : " + x+ " and y is : " + y;
    }
    public void draw(GraphicsContext gr)
    {
        gr.setFill(color);
        gr.fillOval(x,y,w,h);
        System.out.println(toString());
    }

}
