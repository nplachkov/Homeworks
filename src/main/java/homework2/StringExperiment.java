package homework2;

import java.util.Arrays;
import java.util.Scanner;

public class StringExperiment {

    public static void main(String[] args) {
        System.out.printf("What programming language is this?: "); //Prints out a message
        Scanner scanner1 = new Scanner(System.in); //Asks for user input
        String userInput = scanner1.nextLine(); //Stores user input


        String part1 = "\nHello I am "; //String 1
        String part2 = "HTML"; //String 2

        String combined = part1 + part2.replace("HTML", userInput); //Combines part 1 and part 2. Simultaneously replaces "HTML" in part 2 with the user input
        System.out.println(combined); //Prints out both parts combined

        if (userInput.compareTo(part2) == 0)
            System.out.println("\nUser input matches the code."); //Prints a message if user input matches code
        if (userInput.compareTo(part2) > 0)
            System.out.println("\nUser input does not match the code."); //Prints a message if user input does not match the code

        int totalLetters = combined.replace(" ", "").length(); //Removes all spaces and stores the letter count
        System.out.println("Letter count: " + totalLetters); //Prints the letter count
        System.out.println("Word count: " + WordCounter.countWords(part1 + part2.replace("HTML", userInput))); //Prints the word count
    }
}