package homework3;

import java.util.Scanner;

public class NumbersTest {
    int number1;
    int number2;
    int number3;
    int largest;
    int temp;

    public static void main(String[] args) {
        Scanner intScanner = new Scanner(System.in); //Int scanner

        System.out.printf("Number 1: ");
        int number1 = intScanner.nextInt(); //Stores user input for Number 1

        System.out.printf("Number 2: ");
        int number2 = intScanner.nextInt(); //Stores user input for Number 2

        System.out.printf("Number 3: ");
        int number3 = intScanner.nextInt(); //Stores user input for Number 3

        int temp = number1>number2 ? number1:number2; //Finds the larger number between number1 and number2 and stores it in temp
        int largest = number3>temp ? number3:temp; //Finds the largest number between number3 and temp

        if (number1 == largest) { //Prints a message saying which of the 3 numbers is the largest, also printing the number itself
            System.out.println("Number 1 is the largest with the value of " + largest);
        } else if (number2 == largest) {
            System.out.println("Number 2 is the largest with the value of " + largest);
        } else if (number3 == largest) {
            System.out.println("Number 3 is the largest with the value of " + largest);
        }
    }
}
