/*
Name:Kyle Petkovic

Program File: Vowels

Class Description: Takes input from poetry.txt and counts the vowels, as well as
                   replacing the spaces with ~'s. It also prints the input to the console,
                   the output is written to dentist.txt.
*/


import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;


public class Vowels {

    public static void main(String[] args) {

        //Declarations
        int a = 0, e = 0, i = 0, o = 0, u = 0;
        String poetryString = "",  output = "", tempString ;
        Scanner read = null;
        FileWriter dentist = null;

        //Create objects using the external files, plus the scanner
        try {
            dentist = new FileWriter("dentist.txt");
            read = new Scanner(new File("poetry.txt"));

        } catch (Exception error) {
            System.out.print("Error: " + error);
        }

        while (read.hasNextLine()) {

            //Read contents of poetry.txt and set it to poetryString
            poetryString = read.nextLine() + "\r\n";

            //print to monitor
            System.out.print(poetryString);

            //Checks for vowels and changes spaces to ~
            for(int counter = 0; counter < poetryString.length(); counter++){

                //writes the contents of poetryString character by character, unless it's a space then ~ is written
                if((poetryString.charAt(counter) == ' ')){
                    try {
                        dentist.write("~");

                    }
                    catch (Exception error){
                        System.out.print("Error: " + error + "\n");
                    }
                }
                else {
                    try {
                        dentist.write("" + poetryString.charAt(counter));

                    }
                    catch (Exception error){
                        System.out.print("Error: " + error + "\n");
                    }
                }

                if(poetryString.charAt(counter) == 'a' || poetryString.charAt(counter) == 'A'){
                    a++;
                }

                else if(poetryString.charAt(counter) == 'e' || poetryString.charAt(counter) == 'E'){
                    e++;
                }

                if(poetryString.charAt(counter) == 'i'|| poetryString.charAt(counter) == 'I'){
                    i++;
                }

                if(poetryString.charAt(counter) == 'o' || poetryString.charAt(counter) == 'O'){
                    o++;
                }

                if(poetryString.charAt(counter) == 'u' || poetryString.charAt(counter) == 'U'){
                    u++;
                }



            }

        }



        //Vowel amounts are stored in this string
        String vowels = "\r\nThere are " + a + " a's, " + e + " e's, " + i +  " i's, " + o + " o's, " + "and " + u + " u's.";

        //Writes the vowels to dentist.txt
        try{

            dentist.write(vowels, 0, vowels.length());
            dentist.close();

        }
        catch (IOException error){
            System.out.println("Error: " + error);
        }





    }
}