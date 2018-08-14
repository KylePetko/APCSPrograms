
// Name: Ronak Pai and Kyle Petkovic
//
// Program file: DrawHouse
//
// Class Description: Initilizes a Draw tool and Sketch Pad and then draws a house

import apcslib.*;
import java.awt.Color;

public class DrawHouse{
	
	//Create pencil and paper
	private SketchPad paper;
	private DrawingTool pencil;
	
	//Initizlize pencil and paper
	public DrawHouse(){
		paper = new SketchPad(600, 600);
		pencil = new DrawingTool(paper);
	}
	
	public void draw(){
		
		//Move the pencil to the starting  location
		pencil.up();
		pencil.move(-150, -150);
		pencil.setDirection(0);
		pencil.down();
		
		//Draw the rectangle of the house
		pencil.forward(300);
		pencil.turnLeft(90);
		pencil.forward(250);
		pencil.turnLeft(90);
		pencil.forward(300);
		pencil.turnLeft(90);
		pencil.forward(250);
		
		//Move pencil to draw roof
		pencil.up();
		pencil.setDirection(90);
		pencil.forward(250);
		pencil.down();
		
		//Draw roof
		pencil.move(0, 200);
		pencil.move(150, 100);
		
		//Move to draw door
		pencil.up();
		pencil.move(-25, -140);
		pencil.setDirection(90);
		pencil.setWidth(20);
		pencil.setColor(Color.blue);
		pencil.down();
		
		//Draw door		
		pencil.forward(100);
		pencil.setDirection(0);
		pencil.forward(50);
		pencil.setDirection(-90);
		pencil.forward(100);
		
		//Move to left window
		pencil.up();
		pencil.setColor(Color.blue);
		pencil.move(-75, 35);
		pencil.setWidth(3);
		
		//Draw left window
		pencil.down();
		pencil.drawCircle(60);
			
		//Move to right window
		pencil.up();
		pencil.move(75, 35);
		
		//Draw right window
		pencil.down();
		pencil.drawCircle(60);
		
		//Move to flagpole
		pencil.up();
		pencil.move(-250, -150);
		pencil.setColor(Color.gray);
		pencil.setWidth(3);
		pencil.down();
		
		//Draw flagpole
		pencil.setDirection(90);
		pencil.forward(390);
		
		//Draw flag
		pencil.setWidth(1);
		pencil.setColor(Color.black);
		pencil.setDirection(0);
		pencil.forward(180);
		pencil.turnRight(90);
		pencil.forward(100);
		pencil.turnRight(90);
		pencil.forward(180);
		
		//Move to flag color
		pencil.up();
		pencil.setWidth(60);
		pencil.setColor(Color.green);
		pencil.setDirection(0);
		pencil.forward(30);
		pencil.setDirection(90);
		pencil.forward(30);
		
		//Draw colors
		pencil.down();
		pencil.forward(40);
		pencil.up();
		pencil.setDirection(0);
		pencil.forward(120);
		pencil.setDirection(-90);
		pencil.setColor(Color.red);
		pencil.down();
		pencil.forward(40);	
			
		
		
	}
	
}