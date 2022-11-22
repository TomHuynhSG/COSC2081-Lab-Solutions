package tutorialsolution5.exercise4;

import java.util.Scanner;

public class Ingredient {
    private String name;
    private String measurementUnit;

    public Ingredient(String name, String measurementUnit){
        this.name = name;
        setMeasurementUnit(measurementUnit);
    }

    public static Ingredient createIngredient(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please input the name of the ingredient: ");
        String name = scanner.nextLine();
        System.out.println("Please input the measurement of the ingredient: ");
        String measurementUnit = scanner.nextLine();

        return new Ingredient(name, measurementUnit);
    }

    public void displayIngredient(){
        System.out.printf("The ingredient is: %s and the measurement unit is: %s\n",
                name, measurementUnit);
    }


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
        // We prevent the outsiders from modifying the unit of our ingredient with invalid units
        // This is how we encapsulate our data fields (make them private and provide getters/setters)
        String[] availableUnits = {"teaspoon", "spoon", "mg", "kg"};
        boolean matched = false;

        do{
            for (String unit: availableUnits){
                if (measurementUnit.equals(unit)){
                    matched = true;
                }
            }
            if (matched)
                this.measurementUnit = measurementUnit;
            else{
                System.out.println("Error unit! Please re-enter again:");
                Scanner scanner = new Scanner(System.in);
                measurementUnit = scanner.nextLine();
            }
        } while (!matched);
    }
}