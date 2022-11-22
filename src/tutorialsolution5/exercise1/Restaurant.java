package tutorialsolution5.exercise1;

import java.util.Scanner;

public class Restaurant {
    public static void main(String args[]){
            Scanner scanner = new Scanner(System.in);
            System.out.println("Please input the name of the ingredient: ");
            String name = scanner.nextLine();
            System.out.println("Please input the measurement of the ingredient: ");
            String measurementUnit = scanner.nextLine();

            // create an Ingredient object
            Ingredient myNewIngredient =  new Ingredient(name, measurementUnit);
            System.out.printf("The ingredient is: %s and the measurement unit is: %s\n",
                    myNewIngredient.getName(), myNewIngredient.getMeasurementUnit());
    }
}
