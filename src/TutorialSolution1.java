/*
  RMIT University Vietnam
  Course: COSC2081 Programming 1
  Semester: 2022C
  Tutorial: 1
  JDK used: JDK 11
  Created  date: 11/10/2021
  Acknowledgement: None
*/

import java.util.Scanner;

public class TutorialSolution1 {
    public static void exercise1(){
        // Simple Solution
        /*
        System.out.println("***********");
        System.out.println("* Your Name *");
        System.out.println("***********");
        */

        // Better solution (which concerns about the length of your name)
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your name: ");
        String myName = scanner.nextLine();

        String middleString = "* "+myName+" *";
        String topBottomString = "*".repeat(middleString.length());
        System.out.println(topBottomString);
        System.out.println(middleString);
        System.out.println(topBottomString);
    }

    public static void exercise2(){
        int x = 10;
        int y = 20;
        System.out.println("Before:  x=" + x + " and y=" + y);

        // Simple solution with another variable
        // Swap x and y by using a temporary variable temp
        int temp;
        temp = x;
        x = y;
        y = temp;

        // Complex solution using math arithmetics
        /*
        x = x + y;
        y = x - y;
        x = x - y;
        */

        System.out.println("After: x=" + x + " and y=" + y);
    }

    public static void exercise3() {
        // initialize variable s, which stands for seconds
        final int SECONDS_PER_MINUTE = 60;
        final int MINUTES_PER_HOUR = 60;
        final int SECONDS_PER_HOUR = SECONDS_PER_MINUTE * MINUTES_PER_HOUR;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the seconds:");
        int s = scanner.nextInt();

        int hour, minute, second, second_temp;
        hour = s / SECONDS_PER_HOUR;
        second_temp = s % SECONDS_PER_HOUR;
        minute = second_temp / SECONDS_PER_MINUTE;
        second = second_temp % SECONDS_PER_MINUTE;
        System.out.println(hour + ":" + minute + ":" + second);
    }

    public static void exercise4(){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter coordinates of A: ");
        double x1 , y1;
        x1 = scanner.nextDouble();
        y1 = scanner.nextDouble();

        System.out.println("Enter coordinates of B: ");
        double x2 , y2;
        x2 = scanner.nextDouble();
        y2 = scanner.nextDouble();

        // Euclidean distance: length of a line segment between two points
        double lengthAB = Math.sqrt(Math.pow(x1-x2,2) + Math.pow(y1-y2,2));
        double circumference = lengthAB * 4;
        double area = lengthAB * lengthAB;

        System.out.printf("Circumference: %.2f\n", circumference);
        System.out.printf("Area: %.2f\n", area);
    }

    public static void exercise5(){
        System.out.println("Miles \t Kilometers");
        for(int i = 1; i < 10; i++){
            double kilometer = i * 1.61;
            System.out.printf(" %d \t\t %.2f\n", i, kilometer);
        }

        System.out.println();

        System.out.println("Kilometers \t Miles");
        for(int j = 20; j <= 65; j = j + 5){
            double miles = j * 0.62137119;
            System.out.printf(" %d \t\t %.2f\n", j, miles);
        }
    }

    public static void exercise6(){
        int num;
        Scanner sc = new Scanner(System.in);
        // Keep prompting until when the user enters a negative integer or zero
        while (true) {
            System.out.print("Enter a positive integer: ");
            num = sc.nextInt();
            if(num <= 0) break; // End the program
            // Check whether the number is divisible by both first. Why? (You should be able to answer this)
            if(num % 5 == 0 && num % 6 == 0){
                System.out.println(num + " is divisible by both 5 and 6");
            }
            else if(num % 5 == 0 || num % 6 == 0){
                System.out.println(num + " is divisible by either 5 or 6, but not both");
            }
            else{
                System.out.println(num + " is neither divisible by 5 or 6");
            }
        }
        System.out.println("Goodbye!");
    }

    /*
    Question 7:
        - Your Java file name should always the same the public class defined within that file.
        Otherwise, you will get a compiler error.
        - But if you remove the modifier keyword "public" from the class then the program can be compiled.
        - By remove the keyword "public" from the class, that class access modifier will be "default" instead of "public".
        - We will learn more about access modifier in later lectures. Stay tune!
        - This is just to raise your awareness early about access modifiers in OOP.
        - You can read more about access modifiers first here:
            - https://www.javatpoint.com/access-modifiers
            - https://www.geeksforgeeks.org/access-modifiers-java/
     */

    public static void main(String[] args) {
        /* The main method is the starting point of the project
        By calling different above methods here, you can execute them in any order you want.
         */
        exercise1();
        //exercise2();
        //exercise3();
        //exercise4();
        //exercise5();
        //exercise6();
    }
}
