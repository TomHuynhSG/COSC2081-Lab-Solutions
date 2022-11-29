package tutorialsolution6.exercise3;

public class Square extends Rectangle{
    public Square() {
    }

    public Square(double side) {
        super(side, side);
    }

    public Square(String color, boolean filled, double side) {
        super(color, filled, side, side);
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
