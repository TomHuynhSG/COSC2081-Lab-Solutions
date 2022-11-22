package tutorialsolution4.rectangle;

import java.util.Scanner;

public class TestRectangle {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter width:");
        int width = input.nextInt();
        System.out.println("Enter height:");
        int height = input.nextInt();
        Rectangle myRectangle = new Rectangle(width, height);
        myRectangle.visualize();
    }
}
