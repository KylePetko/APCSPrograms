// Name: Kyle Petkovic
//
// Program File: RandomFunTester
//
// Class Description: Picks a random number from 1-6, and also returns it


import java.util.Random;

public class Die{
    Random rand = new Random();
    int roll;

    public void roll(){

        roll =  rand.nextInt(6) + 1;
    }

    public int getNumDots(){
        //System.out.println("class" + roll);
        return roll;
    }

}