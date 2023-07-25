package homework1;

import java.util.Scanner;

public class HobbyQuestions {
    public static void main(String[] args) {

        //First message
        System.out.println("Hello, what is your name?"); //Asks the user for their name
        Scanner scan_name = new Scanner(System.in); //User input (name)
        String name = scan_name.nextLine(); //Stores the user input in String called "name"

        //Second message
        System.out.println("Nice to meet you " + name + ". What is your favourite hobby?"); //Asks the user for their hobby
        Scanner scan_hobby = new Scanner(System.in); //User input (hobby)
        String hobby = scan_hobby.nextLine(); //Stores the user input in String called "hobby"

        //Third message
        System.out.println(hobby + " is a very nice hobby! How long have you practiced it for?"); //Asks the user for how long they've practiced the hobby
        Scanner scan_hobby_time = new Scanner(System.in); // User input (hobby time)
        String hobby_time = scan_hobby_time.nextLine(); //Stores the user input in a String called "hobby_time"

        //Final message
        System.out.println("Wow! " + hobby_time + " is a lot! You must be very good at " + hobby + ""); //Final message, using the information about the hobby

    }
}
