// Name: Kyle Petkovic
//
// Program file: FlexArrayRectangle
//
// Class Description: Methods to mess around with object arrays


public class FlexArrayRectangle {
    private int mySize;
    private Rectangle[] myArray;

    //default constructor that creates an array with 20 elements
    public FlexArrayRectangle() {
        myArray = new Rectangle[20];
        mySize = 0;
    }

    //creates an array with the amount of elements as the int that is passed to it
    public FlexArrayRectangle(int size) {
        myArray = new Rectangle[size]; 
        mySize = size;
    }

    //returns a string of all the values
    public String toString() {
        String output = "[";


        for (int counter = 0; counter < mySize; counter++) {

            output = output + ("Rectangle, width = " + myArray[counter].getWidth() + " length = " +  myArray[counter].getLength()) + ", area = " + myArray[counter].getLength() * myArray[counter].getWidth();



            if (!(counter == mySize - 1)){
                output = output + "\n";
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
    public void append(Rectangle data) {

        if(mySize > myArray.length - 1){
            resize();
        }

        myArray[mySize] = data;

        mySize++;


    }

    //pre-condition:  index >= 0
    //inserts data into the list at the index value index
    public void insert(int index, Rectangle data) {



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

            Rectangle[] temp = new Rectangle[myArray.length];


            for (int counter = 0; counter <  index ; counter++) {

                temp[counter] = myArray[counter];

                temp[index] = data;
            }

            for (int counter = index + 1; counter < mySize; counter++){

                if(counter > myArray.length){
                    resize();
                }

                temp[counter] = myArray[counter - 1];
            }



            //fixes a bug, if index was = 0 the thing in index 0 would be null
            if(index == 0){
                temp[index] = data;
            }

            myArray = temp;


        }
    }


    //pre-condition:  index >= 0
    public Rectangle discard(int index){

        if(index >= mySize || index < 0){
            return null;
        }


        Rectangle removedNum = myArray[index];

        Rectangle temp[] = new Rectangle[myArray.length];

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

        Rectangle[] newArray = new Rectangle[1+ myArray.length];

        for(int counter = 0; counter < mySize; counter++){
            newArray[counter] = myArray[counter];
        }

        myArray = newArray;

    }

    //adds the sums of the lengths of all of the rectangles
    public int sum(){
        int sum = 0;

        for(int counter = 0; counter < mySize; counter ++){

            sum = sum + myArray[counter].getLength();
        }

        return sum;
    }


    // A FlexArrayRectangle will be compared by the sum of the lengths of each of its active
    //    elements.

    // EXAMPLE:
    //  flexy1.compareTo(flexy2) returns a negative int if the sum of the lengths of
    //      flexy1 < the sum of the lengths of flexy2
    //  flexy1.compareTo(flexy2) returns a zero if the sum of the lengths are the same
    //  flexy1.compareTo(flexy2) returns a positive int if the sum of the lengths of
    //      flexy1 > the sum of the lengths of flexy2
    public int compareTo(FlexArrayRectangle flexy) {

        return sum() - flexy.sum();
    }

    // A FlexArray object will be considered equal to another FlexArray if the quantity of
    //     active elements are the same.
    //  EXAMPLE:  flexy1.equals(flexy2) returns true if the quantity of active elements
    //     are the same; otherwise it returns false
    public boolean equals(FlexArrayRectangle flexy) {
        return (sum() == flexy.sum());
    }

    //using any sort routine, sort from low to high, index 0 to mySize – 1
    //note that this will change the order of the elements in myArray permanently
    public void sort(){
        
        Rectangle temp;

        for (int counter = 0; counter < mySize; counter++) {
            for (int innerCounter = 1; innerCounter < (mySize - counter); innerCounter++) {

                if (myArray[counter].compareTo(myArray[innerCounter]) > 0) {

                    temp = myArray[innerCounter - 1];

                    myArray[innerCounter - 1] = myArray[innerCounter];
                    myArray[innerCounter] = temp;
                }

            }
        }
    }

    // returns the contents of the FlexArray at index loc
    // if loc is not in the range of active elements null will be returned
    // precondition: loc >= 0
    public Rectangle getValue(int loc){
        if (loc >= mySize)
            return null;
        else
            return myArray[loc];
    }

    // returns the index of the first instance of element target in the list
    // if target is not in the range of active elements, return -1
    public int searchFor(Rectangle target){
        for (int counter = 0; counter < mySize; counter++){
            if (myArray[counter].equals(target))
                return counter;
        }

        return -1;
    }

}
