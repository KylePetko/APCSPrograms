// Name: Kyle Petkovic
//
// Program File: RandomFunTester
//
// Class Description: Picks a random number from 1-3 and runs a corresponding program

import java.util.Random;

public class RandomFunTester{

    public static void main(String[] args){
        Random rand = new Random();
        int num1 = rand.nextInt(3) + 1;
       // int myRadius = 0;
        System.out.print("You rolled a " + num1 + ".");

        switch (num1) {
            case 1: DrawHouse house = new DrawHouse();
                    house.draw();
                    break;

            case 2: DrawSquare square = new DrawSquare();
                    square.draw();
                    break;

            case 3:
                    //generate random number for the radius
                    num1 = rand.nextInt(30) + 20;
                    System.out.print("\nThe circles have a radius of " + num1 + ".");

                    DrawCircles circles1 = new DrawCircles(num1);
                    circles1.drawCircle();
                    break;

            default: System.out.print("\nError! Is the randomly generated number between 1 and 3?");
                     break;
        }

    }

}