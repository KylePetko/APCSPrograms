// Name: Kyle Petkovic
//
// Program file: Palindrome
//
// Class Description: Cleans up the user's input and in another method prints out if the input is a palindrome or not

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

            output = output + ("Rectangle, width = " + myArray[counter].getWidth() + " length = " +  myArray[counter].getLength());



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

        for(int i = 0; i < mySize; i++){
            newArray[i] = myArray[i];
        }

        myArray = newArray;

    }

}
