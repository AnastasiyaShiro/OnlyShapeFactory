package com.example.demo3;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.ColorPicker;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import javafx.scene.paint.Color;

import java.net.URL;
import java.util.ResourceBundle;

public class HelloController Initializable{
    public ColorPicker colorPicer;
    @FXML
    private Canvas Canv;
    @FXML
    public TextField nameShape;
    Color colorchange=Color.BLACK;

    public void changeColor(ActionEvent actionEvent)
    {
        colorchange = colorPicer.getValue();
    }

    public void butttonForRectangle(ActionEvent actionEvent)
    {
        /*GraphicsContext gc= Canv.getGraphicsContext2D();
        Rectan rectan = new Rectan(colorchange,50.0,60.0,90.0,100.0);
   //   rectan.draw(gc, colorchange);*/
        System.out.println("gkg");
    }


    public void butttonForArc(ActionEvent actionEvent)
    {
       /* GraphicsContext gc= Canv.getGraphicsContext2D();
        Arc arc = new Arc();
        arc.draw(gc);*/
    }

    public void butttonForOval(ActionEvent actionEvent)
    {
        GraphicsContext gc= Canv.getGraphicsContext2D();
        Oval oval = new Oval();
        oval.draw(gc);
    }

    public void butttonForPolygon(ActionEvent actionEvent)
    {
        GraphicsContext gc= Canv.getGraphicsContext2D();
        Polygon polygon = new Polygon();
        polygon.draw(gc);
    }

    public void butttonForRoundRectangle(ActionEvent actionEvent)
    {

        GraphicsContext gc= Canv.getGraphicsContext2D();
        RoundRect roundrect = new RoundRect();
        roundrect.draw(gc);
    }

    public void buttonClear(ActionEvent actionEvent) {
        GraphicsContext gc= Canv.getGraphicsContext2D();
        gc.clearRect(0,0,320,240);
    }

    public void onMouseClickedRect(MouseEvent mouseEvent) {
        double x= mouseEvent.getX();
        double y= mouseEvent.getY();
       // pressedRect(mouseEvent);
        GraphicsContext gc= Canv.getGraphicsContext2D();
        Rectan rectan = new Rectan(colorchange,x,y,90.0,100.0);
        rectan.draw(gc);
        System.out.println(rectan.toString());
    }

    public void onMouseEntered(MouseEvent mouseEvent) {
        ShapeFactory sf=new ShapeFactory();
        sf.createShape(nameShape,colorchange, 10,20,30,40);
    }
}