package homework3;

import java.util.Random;

public class OddOrEven {


    public static void main(String[] args) {
        int number1 = randomNumberGenerator(0,0); //Stores randomly generated numbers
        int number2 = randomNumberGenerator(0, 0);
        int number3 = randomNumberGenerator(0,0);


        //Number 1
        if (number1 % 2 == 0){
            System.out.println("Number 1: " + number1 + " - Even");
        }
        else {
            System.out.println("Number 1: " + number1 + " - Odd");
        }

        //Number 2
        if (number2 % 2 == 0){
            System.out.println("Number 2: " + number2 + " - Even");
        }
        else {
            System.out.println("Number 2: " + number2 + " - Odd");
        }

        //Number 3
        if (number3 % 2 == 0){
            System.out.println("Number 3: " + number3 + " - Even");
        }
        else {
            System.out.println("Number 3: " + number3 + " - Odd");
        }
    }
    public static int randomNumberGenerator(int min, int max){ //Generates random numbers
        Random random = new Random();
        return random.nextInt(1,100);
    }
}
