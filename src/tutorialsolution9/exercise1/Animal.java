package tutorialsolution9.exercise1;

public abstract class Animal {
    private String name;

    public Animal(String name) {
        this.name = name;
    }

    public abstract void greets();

    @Override
    public String toString() {
        return "Animal[name='" + name + "']";
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
