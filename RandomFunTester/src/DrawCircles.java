// Name: Kyle Petkovic
//
// Program File: Circles
//
// Class Description: Draws three different circles in separate colors at specific places

import apcslib.*;
import java.awt.Color;

public class DrawCircles{

    private DrawingTool pen;
    private SketchPad canvas;
    private int myRadius;

    //constructor
    public DrawCircles(int num1){
        canvas = new SketchPad(400,400);
        pen = new DrawingTool(canvas);
        myRadius = num1;

    }

    public void drawCircle(){

        //draw a circle
        pen.setColor(Color.magenta);
        pen.drawCircle(myRadius);

        //move to (-75, -75) and draw
        pen.up();
        pen.move(-75,-75);
        pen.down();
        pen.setColor(Color.blue);
        pen.drawCircle(myRadius);

        //move to (100, 50) and draw
        pen.up();
        pen.move(100,50);
        pen.down();
        pen.setColor(Color.green);
        pen.drawCircle(myRadius);

    }
}