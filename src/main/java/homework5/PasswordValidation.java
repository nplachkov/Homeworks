package homework5;

import java.util.Scanner;

public class PasswordValidation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); //Scanner

        System.out.printf("Enter password: "); //Asks user for password
        String password = scanner.nextLine(); //Stores the user input in a string

        isValidPassword(password);

    }
    public static boolean isValidPassword(String password){ //Validates the provided String based of the below specifications.
        boolean isValid = true;
        String upperCaseChars = "(.*[A-Z].*)";
        String lowerCaseChars = "(.*[a-z].*)";
        String numbers = "(.*[0-9].*)";
        String specialChars = "(.*[@,#,$,%].*$)";

        if (password.length() < 8){
            System.out.println("Passowrd must be at least 8 characters long.");
            isValid = false;
        }
        if (!password.matches(upperCaseChars)){
            System.out.println("Password must have at least 1 upper case character.");
            isValid = false;
        }
        if (!password.matches(lowerCaseChars)){
            System.out.println("Password must have at least 1 lower case character.");
            isValid = false;
        }
        if (!password.matches(numbers)){
            System.out.println("Password muse have at least 1 number.");
            isValid = false;
        }
        if (!password.matches(specialChars)){
            System.out.println("Password must have at least 1 special character.");
            isValid = false;
        }
        if (isValid==true){
            System.out.println("The password meets the requirements.");
        }
        return isValid;
    }
}
