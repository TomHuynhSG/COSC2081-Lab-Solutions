package tutorialsolution5.exercise1;

public class Ingredient {

    // Attributes
    private String name;
    private String measurementUnit;

    // Constructor
    public Ingredient(String name, String measurementUnit){
        this.name = name;
        this.measurementUnit = measurementUnit;
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