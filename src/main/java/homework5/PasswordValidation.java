package homework5;

import java.util.Scanner;

public class PasswordValidation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); //Scanner

        System.out.printf("Enter password: "); //Asks user for password
        String passwordInput = scanner.nextLine(); //Stores the user input in a string

        if (isValidPassword(passwordInput) == true){ //Prints out a text whether the password is secure enough or not
            System.out.println("Password secure.");
        }
        else {
            System.out.println("Password not secure enough.");
        }
    }

    public static boolean isValidPassword(String password) { //Checks if the password meets the specified requirements
        String regex = "\\A(?=.*[0-9])(?=.*[a-z])(?=.*[@#$%^+=!])(?=\\S+$).{8,}\\z";
        return password.matches(regex);
    }
}