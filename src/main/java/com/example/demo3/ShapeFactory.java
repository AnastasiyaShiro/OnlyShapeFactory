package com.example.demo3;

import javafx.scene.control.TextField;
import javafx.scene.paint.Color;

public class ShapeFactory
{
    //Т.е. надо создать везде конструкторы, чтобы передать туда значения от пользователя?
    //Надо ли убирать значения по умолчанию в классе Shape?
    //Надо ли метод, делающий фигуры по клику?
    public Shape createShape(TextField nameShape, Color color, double x, double y, double w, double h )
    {
        if (nameShape.equals("Замкнутая дуга"))
        {
            return new Arc();
        }
        if (nameShape.equals("Овал"))
        {
            return new Oval();
        }
        if (nameShape.equals("Прямоугольник"))
        {
            return new Rectan (color,x,y,w,h);
        }
        else
        {
            return new RoundRect();
        }
    }
    /* public Shape createShape(TextField nameShape, Color color, double [] x, double[] y, double w, double h )
    {
        return new Polygon(color,x,y,w,h);
    }*/
}
