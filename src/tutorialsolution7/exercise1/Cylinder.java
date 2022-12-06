package tutorialsolution7.exercise1;

public class Cylinder extends Circle{
    private double height;

    public Cylinder(double radius, double height) {
        super(radius);
        this.height = height;
    }

    @Override
    public double getArea(){
        return 2*super.getArea()+2*Math.PI * this.getRadius() * this.getHeight();
    }

    @Override
    public String toString() {
        return String.format("Cylinder[radius=%.2f,height=%.2f]",
                this.getRadius(), this.getHeight());
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }
}
