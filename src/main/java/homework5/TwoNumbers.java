package homework5;

public class TwoNumbers {
    public static void main(String[] args) {
        double number1 = 5;
        double number2 = 10;
        double number3 = 15;
        double number4 = 20;

        twoAverage(number4,number2);


    }
    public static void twoAverage(double numberOne, double numberTwo){
        double average = (numberOne + numberTwo)/2;
        System.out.println(average);
    }
}
