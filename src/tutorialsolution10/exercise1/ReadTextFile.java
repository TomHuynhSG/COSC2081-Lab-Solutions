package tutorialsolution10.exercise1;

import java.io.IOException;
import java.nio.file.Paths;
import java.util.Scanner;

public class ReadTextFile {
    public static void main(String[] args) {
        // Get a file name from user
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter a file name: ");
        String filename= sc.nextLine();

        boolean isOpened = false;

        while (!isOpened)
        {
            // This is a better way to ensure the file will be closed properly
            // even if an exception is thrown during the try block. This can help prevent resource leaks.
            // This is the "try-with-resources" statement syntax
            try (Scanner input = new Scanner(Paths.get(filename))) {
                System.out.println("File is opened successfully");
                isOpened = true;
            }
            catch (IOException e) {
                System.out.println("File is not found. Try one more time");
                System.out.print("Enter a file name: ");
                filename= sc.nextLine();
            }
        }
        System.out.println("Done!");
    }
}

// This is the classic way to open file inside the try block
// However, we need to include finally block to close the file afterward.
/*
    try {
        Scanner input = new Scanner(Paths.get(filename));
        // code that uses the Scanner object goes here
    } catch (IOException e) {
        // exception handling code goes here
    } finally {
        input.close();
    }
*/

// Thus the "try-with-resources" statement syntax is much neater
/*
    try (Scanner input = new Scanner(Paths.get(filename))) {
        // code that uses the Scanner object goes here
    } catch (IOException e) {
        // exception handling code goes here
    }
*/