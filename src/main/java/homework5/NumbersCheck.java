package homework5;

import java.util.Scanner;

public class NumbersCheck {
    public static void main(String[] args) {
        Scanner intScanner = new Scanner(System.in);

        System.out.printf("Please enter the first number: ");
        int userNumber1 = intScanner.nextInt();

        System.out.printf("Please enter the second number: ");
        int userNumber2 = intScanner.nextInt();

        System.out.printf("Please enter the third number: ");
        int userNumber3 = intScanner.nextInt();



        //Number 1
        checkNumbers(userNumber1);

        //Number 2
        checkNumbers(userNumber2);

        //Number 3
        checkNumbers(userNumber3);


        if (userNumber1 == userNumber2 && userNumber2 == userNumber3){
            System.out.println("All 3 numbers are equal.");
        }
    }

    public static void checkNumbers(int number){
        if (number > 0){
            System.out.println("The number " + number + " is positive.");
        }
        if (number < 0) {
            System.out.println("The number " + number + " is negative.");
        }
        if (number == 0) {
            System.out.println("The number is 0");
        }
    }
}
