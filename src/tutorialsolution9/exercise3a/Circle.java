package tutorialsolution9.exercise3a;

public class Circle implements GeometricObject{
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public String toString() {
        return "Circle[" +
                "radius=" + radius +
                ']';
    }

    @Override
    public double getArea() {
        return Math.PI*Math.pow(getRadius(),2);
    }

    @Override
    public double getPerimeter() {
        return 2*Math.PI*getRadius();
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
}
