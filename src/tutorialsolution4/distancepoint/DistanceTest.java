package tutorialsolution4.distancepoint;

import java.util.Scanner;

public class DistanceTest {
    public static void main(String[] args) {
        // write your code here
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the first point x and y:");
        Point x = new Point(input.nextDouble(), input.nextDouble());
        System.out.println("Enter the second point x and y:");
        Point y = new Point(input.nextDouble(), input.nextDouble());
        System.out.printf("The distance between X and Y is: %.2f", x.distance(y));
    }
}

