package tutorialsolution5.exercise1;

public class Ingredient {
    private String name;
    private String measurementUnit;

    public Ingredient(String name, String measurementUnit){
        this.name = name;
        this.measurementUnit = measurementUnit;
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
        this.measurementUnit = measurementUnit;
    }
}