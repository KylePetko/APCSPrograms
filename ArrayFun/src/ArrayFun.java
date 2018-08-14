// Name:Kyle Petkovic
//
// Program file: ArrayFun
//
// Description: A program that practice array operations of both primitive data types and objects

import java.util.Random;

public class ArrayFun {

    public static void main(String[] args) {

        //Object array:

        //defines an array that can hold 5 elements
        Rectangle[] rectList = new Rectangle[5];

        //fill rectList with values
        defineList(rectList);

        //Sets the last rectangle's width to 5
        rectList[4].setWidth(5);

        //Various print statements
        System.out.println("Object Array:");

        System.out.println("The length of the rectangle in index 3 is: " + rectList[3].getLength());

        System.out.println("The width of the last rectangle is: " + rectList[4].getWidth());

        System.out.println("\nInt Array: ");

        //define array
        int[] intlist = new int[10];

        //assign values to array
        defineIntArray(intlist);

        //add all the stuff in a array and print to console
        sumArray(intlist);

        //Check and see what the value of the lowest number is
        lowestVal(intlist);

        //Exception examples

        //Accessing past the end of the array
        //rectList[6].setLength(3);
        //It creates an ArrayIndexOutOfBoundsException error!

        //code to demonstrate a nullPointerException
        //Rectangle[] nullError = new Rectangle[3];
        //nullError[1].setLength(1);

    }

    //fills the array with rectangle objects
    static void defineList(Rectangle[] rectList){

        for(int counter = 0; counter < 5; counter++)
            rectList[counter] = new Rectangle(counter + 1, counter + 3);

    }

    //Assigns random values from -10 to 15 into the passed array
    static void defineIntArray(int[] intList){
        //make a Random object
        Random rand = new Random();

        //Assigning values to the first 8 elements, the last two are unassigned!
        for(int counter = 0; counter < 8; counter++){
            intList[counter] = rand.nextInt(26) + -10;
        }
    }

    //Adds the values of the elements of the arrays together and prints it
    static void sumArray(int[] intList){
        int total = 0;

        //A for each loop to add the elements of the array together
        for(int num: intList){
            total += num;

        }

        //prints the output
        System.out.println("The total of all the elements added together is: " + total);
    }

    //Finds what the lowest elements of the array is, and prints it
    static void lowestVal(int[] intList){
        int lowest = intList[0];
        int index = 0;

        //A for each loop to add the elements of the array together
        for(int counter = 0; counter < 8; counter ++){
            if (intList[counter] < lowest){
                lowest = intList[counter];
                index = counter;
            }

        }

        //prints the output
        System.out.println("The index of the lowest value is: " + index);
    }

}
