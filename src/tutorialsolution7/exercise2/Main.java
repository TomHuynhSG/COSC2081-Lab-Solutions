package tutorialsolution7.exercise2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the color:");
        String color = scanner.nextLine();

        System.out.println("Enter the length and width of the rectangle:");
        int length = scanner.nextInt();
        int width = scanner.nextInt();

        // Create a Rectangle object with given color, length and width from the user
        Rectangle myRectangle = new Rectangle(color, length, width);

        System.out.println("The area of the rectangle: "+ myRectangle.getArea());
        System.out.println("The rectangle info:" + myRectangle);

        System.out.println("Enter the base and height of the triangle:");
        int base = scanner.nextInt();
        int height = scanner.nextInt();

        // Create a Triangle object with given color, base and height from the user
        Triangle myTriangle = new Triangle(color, base, height);
        System.out.println("The area of the triangle: "+ myTriangle.getArea());
        System.out.println("The triangle info:" + myTriangle);
    }
}
