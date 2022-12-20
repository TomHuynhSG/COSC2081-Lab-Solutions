package tutorialsolution9.exercise2;

public class Rectangle extends Shape{
    protected double width;
    protected double length;

    public Rectangle() {
        this.width = 1.0;
        this.length = 1.0;
    }

    public Rectangle(double width, double length) {
        this.width = width;
        this.length = length;
    }

    public Rectangle(double width, double length, String color, boolean filled) {
        super(color, filled);
        this.width = width;
        this.length = length;
    }

    @Override
    public double getPerimeter(){
        return  (getWidth()+getLength())*2;
    }

    @Override
    public double getArea(){
        return getWidth()*getLength();
    }

    @Override
    public String toString() {
        return String.format("Rectangle[%s,width=%.2f,length=%.2f]",
                super.toString(),getWidth(),getLength());
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
