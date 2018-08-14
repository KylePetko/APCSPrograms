// Name:Kyle Petkovic
//
// Program file: PalindromeTester
//
// Description: The driver for Palindrome.java, it explains the program to the user, and asks for input, and runs all the stuff in the correct order


import java.util.Scanner;

public class PalindromeTester{

    public static void main(String[] args) {

        //introduction for user
        System.out.println("Enter a sentence or word and you'll be told if it's a palindrome or not.");
        System.out.println("When you are done exploring palindromes, type in \"q\" to end the program. \n");

        //Gets the input from the user
        Scanner userInput = new Scanner(System.in);


        //initialize the pal object
        Palindrome pal;

        //runs the loop for user input
        do{


            //Sets what the user typed in to a string so it can be echoed back
            System.out.print("Enter your string: ");
            String input = userInput.nextLine();

            // passes pal the user's input
            pal = new Palindrome(input);

            //It'll end the program if "q" is entered
            if(!pal.isOver()){
                //echos user input
                System.out.println("Input: " + input);

                //Cleans the palindrome
                pal.clean();

                //Sees if the user's input is a palindrome
                pal.check();
            }


        }
        while(!pal.isOver());




    }
}
