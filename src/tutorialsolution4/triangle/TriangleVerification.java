package tutorialsolution4.triangle;

import java.util.Scanner;

public class TriangleVerification {

    public static void main(String[] args) {
        // write your code here
        // Given sides of triangle
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter 3 numbers for the sides of a triangle:");
        int x = input.nextInt();
        int y = input.nextInt();
        int z = input.nextInt();

        // Function call
        Triangle myTriangle =  new Triangle(x, y, z);
        System.out.println(myTriangle.verify());
    }
}

