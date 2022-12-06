package tutorialsolution7.exercise2;

public class Rectangle extends Shape{
    private int length;
    private int width;

    public Rectangle(String color, int length, int width) {
        super(color);
        this.length = length;
        this.width = width;
    }

    @Override
    public double getArea(){
        return this.getLength() * this.getWidth();
    }

    @Override
    public String toString() {
        return String.format("Rectangle[color=%s,length=%d, width=%d]",
                this.getColor(), this.getLength(), this.getWidth());
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }
}
