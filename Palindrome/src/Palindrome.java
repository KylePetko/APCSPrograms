// Name: Kyle Petkovic
//
// Program file: Palindrome
//
// Class Description: Cleans up the user's input and in another method prints out if the input is a palindrome or not

public class Palindrome {

    //This variable is assigned the user's input
    private String input;

    //This variable is where the input will go after the special characters, and spaces are removed
    private String cleanInput = "";

    //The length of cleanInput
    private int length;

    //If the input has an odd number of characters, the middle character will be ignored
    private boolean removeCenter = false;

    //A temporary variable that is used to clean up the users input
    private String tempClean;

    //If the input is a palindrome or not
    private boolean palindrome = false;

    //constructor, is passed the user's input
    public Palindrome(String words){
        //input is set to the user's input, so it can be printed out later
        input = words;

        //Used to help clean up the input
        tempClean = words;



    }

    //gets rid of not needed data
    public void clean(){

        //Makes everything lowercase to simplify the program
        tempClean = tempClean.toLowerCase();

        //Gets rid of the spaces surrounding the user's input
        tempClean= tempClean.trim();

        //Get's the length after all the useless stuff is taken out, so it can be checked if  it's a palindrome later
        length = tempClean.length();

        //Find's out if the input has a letter in the middle that doesn't need to be checked
        if (!(length % 2 == 0)){
            removeCenter = true;

        }

        int halfway = (length / 2);

        //gets rid of characters that are not between a-z, and 0-9
        for(int counter = 0; counter < length; counter++){
            if (((tempClean.charAt(counter) >= 'a' && tempClean.charAt(counter) <= 'z') || (tempClean.charAt(counter) >= '0' && (tempClean.charAt(counter) <= '9')))  && !(counter == halfway && removeCenter)  ){
                cleanInput = (cleanInput + tempClean.charAt(counter));

            }

        }
    }

    //checks to see if the string is a palindrome
    public void check(){

        //keep in mind the the variable length is clean input, so it'll catch stuff like 7_, input.length() makes sure the user's input isn't one character
        if (1 == length || input.length() == 1){
            System.out.println(input + " is not a palindrome \n");

            //to end  the method
            return;
        }

        //reverses the string
        String reverse = new StringBuilder(cleanInput).reverse().toString();

        //checks if the reverse of cleanInput is equal to the cleaned input
        if (reverse.equals(cleanInput) && length != 0)
            palindrome = true;

        //checks palindrome, and returns whether or not the input is a palindrome
        if(palindrome){
            System.out.println(input + " is a palindrome \n");
        }
        else{
            System.out.println(input + " is not a palindrome \n");
        }
    }

    //Checks for the sentinel, which is q
    public  boolean isOver(){

        //When this returns true, the program is over
        return(input.equals("q"));

    }

}
