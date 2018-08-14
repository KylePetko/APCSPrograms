// Name: Kyle Petkovic
//
// Program file: FlexArrayPrimitive
//
// Class Description: Methods to mess around with integer arrays

public class FlexArrayPrimitive {
    private int mySize;
    private int[] myArray;

    //default constructor that creates an array with 20 elements
    public FlexArrayPrimitive() {
        myArray = new int[20];
        mySize = 0;
    }

    //creates an array with the amount of elements as the int that is passed to it
    public FlexArrayPrimitive(int size) {
        myArray = new int[size];
        mySize = 0;
    }

    //returns a string of all the values
    public String toString() {
        String output = "[";


        for (int counter = 0; counter < mySize; counter++) {

            output = output + (myArray[counter]);

            if (!(counter == mySize - 1)){
                output = output + ", ";
            }
        }

        output = output + "]";

        return output;
    }

    //returns the value of mySize
    public int getLength() {
        return mySize;
    }

    //returns true if mySize is zero, false otherwise
    public boolean isEmpty() {
        return (mySize == 0);

    }

    //adds data to the end of the current list
    public void append(int data) {

        if(mySize > myArray.length - 1){
            resize();
        }

        myArray[mySize] = data;

        mySize++;


    }

    //pre-condition:  index >= 0
    //inserts data into the list at the index value index
    public void insert(int index, int data) {
        if (index > mySize) {

            resize();

            myArray[mySize] = data;

            mySize++;
        }
        else {

            if(mySize == myArray.length){
                resize();
            }

            mySize++;

            int[] temp = new int[myArray.length];

            for (int counter = 0; counter <  index ; counter++) {
                temp[counter] = myArray[counter];

                temp[index] = data;
            }

                for (int counter = index + 1; counter < mySize; counter++)
                    temp[counter] = myArray[counter - 1];

            //fixes a bug, if index was = 0 the thing in index 0 would be null
            if(index == 0){
                temp[0] = data;
            }

            myArray = temp;

        }
    }


    //pre-condition:  index >= 0
    public int discard(int index){

        if(index >= mySize || index < 0){
            return -999;
        }


        int removedNum = myArray[index];

        int temp[] = new int[myArray.length];

        for(int counter = 0; counter < index; counter++){
            temp[counter] = myArray[counter];
        }

        for(int counter = index; counter < myArray.length - 1; counter++){
            temp[counter] = myArray[counter + 1];
        }

        myArray = temp;

        mySize--;

        return removedNum;
    }

    //This will resize the array as needed
    private void resize() {

        int[] newArray = new int[1 + myArray.length];

        for(int counter = 0; counter < mySize; counter++){
            newArray[counter] = myArray[counter];
        }

        myArray = newArray;

    }

    //returns the value of all the elements added together
    public int sum(){
        int sum = 0;
        for(int counter = 0; counter < mySize; counter++){
            sum = sum + myArray[counter];
        }

        return sum;
    }


    // A FlexArrayPrimitive will be compared by the sum of its active elements.

    //  flexy1.compareTo(flexy2) returns a negative int if the sum of the elements of
    //      flexy1 < the sum of the elements of flexy2
    //  flexy1.compareTo(flexy2) returns a zero if the sum of the elements are the same
    //  flexy1.compareTo(flexy2) returns a positive int if the sum of the elements of
    //      flexy1 > the sum of the elements of flexy2
    public int compareTo(FlexArrayPrimitive flexy){

        return sum() - flexy.sum();

    }

    // A FlexArray object will be considered equal to another FlexArray if the quantity of
    //     active elements are the same.
    //  EXAMPLE:  flexy1.equals(flexy2) returns true if the quantity of active elements
    //     are the same; otherwise it returns false
    public boolean equals(FlexArrayPrimitive flexy){
        return (sum() == flexy.sum());
    }

    //using any sort routine, sort from low to high, index 0 to mySize – 1
    //note that this will change the order of the elements in myArray permanently
    public void sort(){
        int logicalLength = mySize;
        int temp = 0;

        for (int counter = 0; counter < logicalLength; counter++) {
            for (int innerCounter = 1; innerCounter < (logicalLength - counter); innerCounter++) {

                if (myArray[innerCounter - 1] > myArray[innerCounter]) {
                    temp = myArray[innerCounter - 1];
                    myArray[innerCounter - 1] = myArray[innerCounter];
                    myArray[innerCounter] = temp;
                }

            }
        }
    }

    // returns the contents of the FlexArray at index loc
    // if loc is not in the range of active elements, return -999
    // precondition: loc >= 0
    public int getValue(int loc){
        if (loc >= mySize)
            return -999;
        else
            return myArray[loc];
    }

    // returns the index of the first instance of element target in the list
    // if target is not in the range of active elements, return -1
    public int searchFor(int target){
        for (int counter = 0; counter < mySize; counter++){
            if (getValue(counter) == target)
                return counter;
        }

        return -1;
    }

}