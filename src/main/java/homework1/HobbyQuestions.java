package homework1;

import java.util.Scanner;

public class HobbyQuestions {
    public static void main(String[] args) {
        Scanner stringScanner = new Scanner(System.in); //String scanner

        //First message
        System.out.println("Hello, what is your name?"); //Asks the user for their name
        String name = stringScanner.nextLine(); //Stores the user input in String called "name"

        //Second message
        System.out.println("Nice to meet you " + name + ". What is your favourite hobby?"); //Asks the user for their hobby
        String hobby = stringScanner.nextLine(); //Stores the user input in String called "hobby"

        //Third message
        System.out.println(hobby + " is a very nice hobby! How long have you practiced it for?"); //Asks the user for how long they've practiced the hobby
        String hobby_time = stringScanner.nextLine(); //Stores the user input in a String called "hobby_time"

        //Final message
        System.out.println("Wow! " + hobby_time + " is a lot! You must be very good at " + hobby + ""); //Final message, using the information about the hobby

    }
}
