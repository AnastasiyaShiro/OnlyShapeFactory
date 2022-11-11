package com.example.demo3;

import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;
import javafx.scene.shape.ArcType;

public class Arc extends Shape{


    @Override
    double area()
    {
        return w*h;
    }

    @Override
    public String toString()
    {
        return "Arc color is " + super.color + " and x is : " + x+ " and y is : " + y;
    }
    public void draw(GraphicsContext gr)
    {
        gr.setFill(color);
        gr.fillArc(x, y, w, h, 45, 100, ArcType.ROUND);
        System.out.println(this.toString());
    }

}
