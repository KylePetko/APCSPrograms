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
		paper = new SketchPad(500, 500);
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
		
		
			
	}
	
}