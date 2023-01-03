package tutorialsolution10.exercise2;

import java.util.Scanner;
import java.util.InputMismatchException;

public class UserInput {
    static int getIntFromUser(int defaultInt) {
        // Get input from user
        try {
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter an integer number: ");
            int num = sc.nextInt();
            System.out.println("Got the number: " + num);
            return num;
        }
        catch (InputMismatchException e) {
            System.out.println("Not an valid integer number");
            return defaultInt;
        }
    }

    public static void main(String[] args) {
        getIntFromUser(-100);
    }
}
