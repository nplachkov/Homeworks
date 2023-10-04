package homework5;

import java.util.Scanner;

public class TwoNumbers {
    public static void main(String[] args) {
        //double number1 = 5;
        //double number2 = 10;
        //double number3 = 15;
        //double number4 = 20;

        Scanner doubleScanner = new Scanner(System.in);
        System.out.printf("Number 1: ");
        double number1 = doubleScanner.nextInt();

        System.out.printf("Number 2: ");
        double number2 = doubleScanner.nextInt();

        averageAndSum(number1,number2);
    }
    public static void numbersAverage(double numberOne, double numberTwo){ //Method that finds and prints the average of two numbers.
        double average = (numberOne + numberTwo)/2;
        System.out.println("The average of those numbers is: " + average);
    }

    public static void sumTwoNumbers(double numberOne, double numberTwo){ //Method that sums and prints two numbers.
        double summedNumbers = numberOne + numberTwo;
        System.out.println("The sum of the numbers is " + summedNumbers);
    }

    public static void averageAndSum(double numberOne, double numberTwo){ //Method combining the above methods together.
        numbersAverage(numberOne,numberTwo);
        sumTwoNumbers(numberOne,numberTwo);
    }

}
