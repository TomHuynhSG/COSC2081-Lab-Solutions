package tutorialsolution9.exercise3b;

public class ResizableCircle extends Circle implements Resizable{

    public ResizableCircle(double radius) {
        super(radius);
    }

    @Override
    public String toString() {
        return String.format("ResizableCircle[%s]", super.toString());
    }

    @Override
    public void resize(int percent) {
        this.setRadius(this.getRadius()*percent/100.0);
    }
}
