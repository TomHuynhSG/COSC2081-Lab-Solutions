package tutorialsolution7.exercise2;

public class Shape {
    private String color;

    public Shape(String color) {
        this.color = color;
    }

    public double getArea(){
        // Dummy implementation so there is no compilation error
        // We can improve this using Abstract method which we will learn later
        return 0;
    }

    @Override
    public String toString() {
        return "Shape[" +
                "color='" + color + '\'' +
                ']';
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
