/*
  RMIT University Vietnam
  Course: COSC2081 Programming 1
  Semester: 2022C
  Tutorial: 2
  JDK used: JDK 11
  Created  date: 11/10/2021
*/

import java.util.Scanner;
import java.lang.Math;

public class TutorialSolution2 {

    // Question 1
    public static void exercise1() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the length:");
        int length = scanner.nextInt();
        // Loop by the indexes for lines
        for (int i=0; i < length; i++) {
            // Loop by the indexes for characters in a line
            for (int j=0; j < length; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    // Question 2
    public static void exercise2() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the length:");
        int length = scanner.nextInt();
        // Index for lines
        for (int i=0; i < length; i++) {
            // Index for characters in a line
            for (int j = 0; j < length; j++) {
                if (i == 0 || i == length - 1) {        // For the first and the last lines
                    System.out.print("*");
                } else if (j == 0 || j == length -1) {  // For other lines, the first and last characters
                    System.out.print("*");
                } else {                                // For other lines, other characters
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    // Question 3

    // Simple solution 3a:
    public static String exercise3a() {
        Scanner scanner = new Scanner(System.in);
        double x, y, z;
        System.out.println("Please enter 3 numbers for the sides of a triangle:");
        x = scanner.nextDouble();
        y = scanner.nextDouble();
        z = scanner.nextDouble();

        // Validate input
        if ((x+y>z) && (y+z>x) && (x+z>y)){
            if (x == y && y == z )
                return "Equilateral Triangle";
                // Check for isosceles triangle
            else if (x == y || y == z || z == x )
                return "Isosceles Triangle";
                // Otherwise scalene triangle
            else
                return "Scalene Triangle";
        } else{
            return "Not Triangle";
        }
    }


    // Complex solution 3b using other methods:
    // Use final arguments because we don't expect
    // to change parameters inside the function
    private static boolean isValid(final double x1, final double x2, final double x3) {
        return (x1 + x2 > x3) && (x1 + x3 > x2) && (x2 + x3 > x1);
    }

    // Use final arguments because we don't expect
    // to change parameters inside the function
    private static boolean isEquilateral(final double x1, final double x2, final double x3) {
        return (x1 == x2) && (x2 == x3);
    }

    // Use final arguments because we don't expect
    // to change parameters inside the function
    private static boolean isIsosceles(final double x1, final double x2, final double x3) {
        return (x1 == x2) || (x2 == x3) || (x1 == x3);
    }

    public static String exercise3b() {
        Scanner scanner = new Scanner(System.in);
        double x1, x2, x3;
        System.out.println("Please enter 3 numbers for the sides of a triangle:");
        x1 = scanner.nextDouble();
        x2 = scanner.nextDouble();
        x3 = scanner.nextDouble();

        // Validate input
        if (isValid(x1, x2, x3)) {
            if (isEquilateral(x1, x2, x3)) {
                return "Equilateral Triangle";
            } else if (isIsosceles(x1, x2, x3)) {
                return "Isosceles Triangle";
            } else {
                return "Scalene Triangle";
            }
        } else {
            return "Not Triangle";
        }
    }


    // Question 4
    public static void exercise4() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter circle 1's center x-,y-coordinates, and radius: ");
        double x1 , y1 , rad1;
        x1 = scanner.nextDouble();
        y1 = scanner.nextDouble();
        rad1 = scanner.nextDouble();
        System.out.println("Enter circle 2's center x-,y-coordinates, and radius: ");
        double x2 , y2 , rad2;
        x2 = scanner.nextDouble();
        y2 = scanner.nextDouble();
        rad2 = scanner.nextDouble();

        // Euclidean distance between two circle center points
        double distance = Math.sqrt(Math.pow(x1-x2,2) + Math.pow(y1-y2,2));
        if (distance <= Math.abs(rad1 - rad2)){
            System.out.println("One circle is inside another circle!");
        } else if (distance < rad1 + rad2){
            System.out.println("One circle overlaps the other circle!");
        } else {
            System.out.println("Two circle do not overlap each other!");
        }
    }
    
    // Question 5
    public static void exercise5() {
        // we use the keyword "final" to indicate these are constants (unchanged values)
        final int MIN = 0;
        final int MAX = 9;
        final int RANGE = MAX - MIN + 1;

        // Here is how you can declare an array of a specific number of integers.
        // We will learn more about this in week 3.
        int[] count = new int[RANGE];

        final int NUM = 100;
        System.out.println("Generate 100 integers in range [0,9] and count each number");

        // Loop to generate the NUM numbers of random numbers and count each occurrence in the count array
        for (int i = 0; i < NUM; i++) {
            // Math.random() returns a number greater than or equal 0.0 and less than 1.0
            int rand = (int)(Math.random() * RANGE) + MIN;
            // This works because of the default values for count elements are 0
            count[rand]++;
        }

        // Print out the frequency of those random generated numbers
        for (int i=0; i < RANGE; i++) {
            if (count[i] != 0) {
                System.out.println(i + MIN + ": " + count[i]);
            }
        }
    }


    public static void main(String[] args) {
        /* The main method is the starting point of the project
        By calling different above methods here, you can execute them in any order you want.
         */

        exercise1();
        //exercise2();

        /*In the exercise 3, as the function return String data type
         instead of void, so need to use "println" to see the output of exercise3.
         */
        //System.out.println(exercise3a());
        //System.out.println(exercise3b());

        //exercise4();
        //exercise5();

    }
}
