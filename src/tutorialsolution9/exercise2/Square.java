package tutorialsolution9.exercise2;

public class Square extends Rectangle{
    public Square() {
    }

    public Square(double side) {
        super(side, side);
    }

    public Square(double side, String color, boolean filled) {
        super(side, side, color, filled);
    }

    @Override
    public String toString() {
        return String.format("Square[%s]",super.toString());
    }

    public double getSide(){
        return this.getWidth();
    }

    public void setSide(double side){
        this.setLength(side);
        this.setWidth(side);
    }

    @Override
    public void setWidth(double side){
        this.setSide(side);
    }

    @Override
    public void setLength(double side){
        this.setSide(side);
    }

}
