package tutorialsolution6.exercise3;

public class Rectangle extends Shape{
    private double width;
    private double length;

    public Rectangle() {
        this.width = 1.0;
        this.length = 1.0;
    }

    public Rectangle(double width, double length) {
        this.width = width;
        this.length = length;
    }

    public Rectangle(String color, boolean filled, double width, double length) {
        super(color, filled);
        this.width = width;
        this.length = length;
    }

    public double getPerimeter(){
        return  (getWidth()+getLength())*2;
    }

    @Override
    public String toString() {
        return String.format("Rectangle[%s,width=%.2f,length=%.2f]",
                super.toString(),getWidth(),getLength());
    }

    public double getArea(){
        return  getWidth()*getLength();
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }
}
