package tutorialsolution5.exercise2;

import java.util.Scanner;

public class Ingredient {
    // Attributes
    private String name;
    private String measurementUnit;

    // Constructor
    public Ingredient(String name, String measurementUnit){
        this.name = name;
        this.measurementUnit = measurementUnit;
    }

    // A helper method to create a new Ingredient object
    // exercise 2
    public static Ingredient createIngredient(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please input the name of the ingredient: ");
        String name = scanner.nextLine();
        System.out.println("Please input the measurement of the ingredient: ");
        String measurementUnit = scanner.nextLine();

        return new Ingredient(name, measurementUnit);
    }

    // A helper method to show/print a new Ingredient object
    // exercise 2
    public void displayIngredient(){
        System.out.printf("The ingredient is: %s and the measurement unit is: %s\n",
                name, measurementUnit);
    }


    // Getters and Setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMeasurementUnit() {
        return measurementUnit;
    }

    public void setMeasurementUnit(String measurementUnit) {
        this.measurementUnit = measurementUnit;
    }
}