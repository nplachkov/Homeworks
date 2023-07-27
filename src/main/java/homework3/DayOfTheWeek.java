package homework3;

import java.util.Scanner;

public class DayOfTheWeek {
    int day;

    public static void main(String[] args) {
        Scanner intScanner = new Scanner(System.in); //Int scanner

        System.out.printf("Select a day of the week (1 - 7): ");
        int userInput = intScanner.nextInt(); //Stores user input

        dayOfTheWeek(userInput);

    }
    public static void dayOfTheWeek(int day) { //Switch case. Returns the relevant value according to the user input
        switch (day) {
            case 1:
                System.out.println("You have selected 1. Day of the week is Monday.");
                break;
            case 2:
                System.out.println("You have selected 2. Day of the week is Tuesday.");
                break;
            case 3:
                System.out.println("You have selected 3. Day of the week is Wednesday.");
                break;
            case 4:
                System.out.println("You have selected 4. Day of the week is Thursday.");
                break;
            case 5:
                System.out.println("You have selected 5. Day of the week is Friday.");
                break;
            case 6:
                System.out.println("You have selected 6. Day of the week is Saturday.");
                break;
            case 7:
                System.out.println("You have selected 7. Day of the week is Sunday.");
                break;
            default:
                System.out.println("Invalid entry. Please enter a number between 1 and 7.");
        }
    }
}

