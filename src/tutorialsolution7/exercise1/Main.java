package tutorialsolution7.exercise1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the radius of the circle:");
        double radius = scanner.nextDouble();

        Circle myCircle = new Circle(radius);

        System.out.println("The area of the circle: "+ myCircle.getArea());
        System.out.println("The circle info:" + myCircle);

        System.out.println("Enter the height of the cylinder:");
        double height = scanner.nextDouble();

        Cylinder myCylinder = new Cylinder(radius, height);

        System.out.println("The area of the cylinder: "+ myCylinder.getArea());
        System.out.println("The volumn of the cylinder: "+ myCylinder.getVolumn());
        System.out.println("The cylinder info:" + myCylinder);
    }
}
