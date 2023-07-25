package homework2;

import java.util.Arrays;
import java.util.Scanner;

public class StringExperiment {

    public static void main(String[] args) {
        System.out.println("What programming language is this?"); //Prints out a message
        Scanner scanner1 = new Scanner(System.in); //Asks for user input
        String userInput = scanner1.nextLine(); //Stores user input


        String part1 = "Hello I am "; //String 1
        String part2 = "HTML"; //String 2

        System.out.println(part1 + part2.replace("HTML", userInput)); //Prints a String and replaces "HTML" with the user input
        String combined = part1 + part2.replace("HTML", userInput);

        if (userInput.compareTo(part2) == 0) System.out.println("User input matches the code."); //Prints a message if user input matches code
        if (userInput.compareTo(part2) > 0) System.out.println("User input does not match the code."); //Prints a message if user input does not match the code

        String totalLetters = "There are a total of: " + (part1.replace(" ", "").replace(",","") + part2.replace(" ","")).length() + " letters.";

        System.out.println(totalLetters);
    }
}