package homework4;

import java.util.Scanner;

public class Test{
    public static void main(String[] args) {
        Dog Hera = new Dog("Boxer");
        Hera.setName("Hera");
        Hera.setAge((byte) 12);
        Hera.setSex("Female");
        Hera.setWeight(29f);
        Hera.setID((byte) 001);

        Parrot Stevie = new Parrot("Cockatiel");
        Stevie.setName("Stevie");
        Stevie.setAge((byte) 3);
        Stevie.setSex("Male");
        Stevie.setWeight(1.2f);
        Stevie.setID((byte) 002);

        Scanner intScanner = new Scanner(System.in);
        System.out.printf("Enter pet ID: ");
        int userInput = intScanner.nextInt();

        if (userInput == Hera.getID()) {
            System.out.println(Hera.petDetails());
        } else if (userInput == Stevie.getID()) {
            System.out.println(Stevie.petDetails());
        }
        else {
            System.out.println("Unable to find pet ID.");
        }

    }
}
