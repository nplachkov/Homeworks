package homework5;

public class TwoNumbers {
    public static void main(String[] args) {
        double number1 = 5;
        double number2 = 10;
        double number3 = 15;
        double number4 = 20;

        twoAverage(number1,number2);


    }
    public static void twoAverage(double numberOne, double numberTwo){
        double average = (numberOne + numberTwo)/2;
        System.out.println("The average of those numbers is: " + average);
        sumTwoNumbers(numberOne, numberTwo);
    }

    public static void sumTwoNumbers(double numberOne, double numberTwo){
        double summedNumbers = numberOne + numberTwo;
        System.out.println("The sum of the numbers is " + summedNumbers);
    }
}
