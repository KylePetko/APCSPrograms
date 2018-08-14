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

        int[] newArray = new int[1+ myArray.length];

        for(int i = 0; i < mySize; i++){
            newArray[i] = myArray[i];
        }

        myArray = newArray;

    }

}