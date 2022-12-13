package tutorialsolution8;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;
import java.util.StringTokenizer;

public class UserDataCollection {
    public static void main(String[] args) throws IOException {

        // Exercise 1 Solution
        String name, address;
        int age;

        // Create a scanner object to be ready to input information from user via keyboard
        Scanner scanner = new Scanner(System.in);

        // Create a PrintWriter object to create, modify, update a text file
        PrintWriter pw = new PrintWriter(new FileWriter("src/tutorialsolution8/users.txt",true));

        // Ask user for requested information
        System.out.println("Enter name : ");
        name = scanner.nextLine();

        System.out.println("Enter address:");
        address = scanner.nextLine();

        System.out.println("Enter age : ");
        age = Integer.parseInt(scanner.nextLine());

        // Write a string to the file (please note: "," is a common deliminator of CSV, you can use ";" also if needed)
        pw.println(name + "," + address + "," + age);

        // PrintWriter does not operate with your disc after each write operations,
        // it collects data in its buffer. flush() method is required to push your data to disc.
        pw.flush();
        pw.close();

        // Exercise 2 Solution

        // Create a scanner object to read from a file
        Scanner fileScanner = new Scanner(new File("src/tutorialsolution8/users.txt"));
        String line;
        double sum = 0;
        int count = 0;

        // Continue to loop while the fileScanner does not finish reading the whole file
        while (fileScanner.hasNext()) {
            count++;

            // Read the whole line of the file
            line = fileScanner.nextLine();

            // Use StringTokenizer object to parse a string line into tokens using deliminator ","
            StringTokenizer inReader = new StringTokenizer(line,",");

            // Double check if there are exactly three tokens of every line
            if (inReader.countTokens() != 3)
                throw new IOException("Invalid Input Format");
            else {

                // Since there is always 3 tokens of a line so take turn to
                // assign them into name, address and age
                name = inReader.nextToken();
                address = inReader.nextToken();
                age = Integer.parseInt(inReader.nextToken());
                sum+= age;
            }
            System.out.println(name+" lives at "+address + " and is " + age + " year old.");
        }
        // Remember to close the fileScanner after reading the file!
        fileScanner.close();
        System.out.println("The average age is " + sum/count);
    }
}
