package tutorialsolution8.exercise1;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;
import java.util.StringTokenizer;

public class UserDataCollection {
    public static void main(String[] args) throws IOException {

        // Exercise 1
        String name, address;
        int age;
        Scanner scanner = new Scanner(System.in);

        PrintWriter pw = new PrintWriter(new FileWriter("src/tutorialsolution8/exercise1/users.txt",true));

        System.out.println("Enter name : ");
        name = scanner.nextLine();

        System.out.println("Enter address:");
        address = scanner.nextLine();

        System.out.println("Enter age : ");
        age = Integer.parseInt(scanner.nextLine());

        // Write a string to the file
        pw.println(name + "," + address + "," + age);

        // PrintWriter does not operate with your disc after each write operations,
        // it collects data in its buffer. flush() method is required to push your data to disc.
        pw.flush();
        pw.close();

        // Exercise 2
        Scanner fileScanner = new Scanner(new File("src/tutorialsolution8/exercise1/users.txt"));
        String line;
        double sum = 0;
        int count = 0;
        while (fileScanner.hasNext()) {
            count++;
            line = fileScanner.nextLine();
            StringTokenizer inReader = new StringTokenizer(line,",");
            if (inReader.countTokens() != 3)
                throw new IOException("Invalid Input Format");
            else {
                name = inReader.nextToken();
                address = inReader.nextToken();
                age = Integer.parseInt(inReader.nextToken());
                sum+=age;
            }
            System.out.println(name+" lives at "+address + " and is " + age + " year old.");
        }
        fileScanner.close();
        System.out.printf("The average age is " + sum/count);
    }
}
