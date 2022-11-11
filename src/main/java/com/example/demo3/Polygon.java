package com.example.demo3;

import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;

public class Polygon extends Shape{

    double []X={100,80,90,30,65};
    double []Y={250,120,123,125,135};

    @Override
    double area()
    {
        return h*w;
    }

    @Override
    public String toString()
    {
        return "Polygon color is " + super.color + " and x is : " + x+ " and y is : " + y;
    }

    public void draw(GraphicsContext gr)
    {
        gr.setFill(color);
        gr.fillPolygon(X,Y,5);
        System.out.println(toString());
    }

}
