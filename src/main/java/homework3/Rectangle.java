package homework3;

import java.util.Scanner;

public class Rectangle {
    int width;
    int height;

    public static void main(String[] args) {
        Scanner intScanner = new Scanner(System.in); //Int scanner

        System.out.printf("Rectangle width (cm): ");
        int rectangleWidth = intScanner.nextInt(); //Stores the width

        System.out.printf("Rectangle height (cm): ");
        int rectangleHeight = intScanner.nextInt(); //Stores the height

        int rectanglePerimeter = rectangleWidth*2+rectangleHeight*2; //Calculates the perimeter and stores it in rectanglePerimeter
        int rectangleFace = rectangleWidth*rectangleHeight; //Calculates the face and stores it in rectangleFace

        System.out.printf("\nRectangle perimeter (cm): " + rectanglePerimeter); //Prints out the calculated values
        System.out.printf("\nRectangle face (cm): " + rectangleFace);
    }
}
