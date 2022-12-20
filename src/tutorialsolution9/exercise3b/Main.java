package tutorialsolution9.exercise3b;

public class Main {

    public static void main(String[] args) {
	    // write your code here
        Circle myCircle = new Circle(2.5);
        System.out.println(myCircle);
        System.out.println(myCircle.getPerimeter());
        System.out.println(myCircle.getArea());

        ResizableCircle myResizableCircle = new ResizableCircle(2.5);
        System.out.println(myResizableCircle);
        System.out.println(myResizableCircle.getPerimeter());
        System.out.println(myResizableCircle.getArea());
        
        myResizableCircle.resize(200);
        System.out.println(myResizableCircle);
        System.out.println(myResizableCircle.getPerimeter());
        System.out.println(myResizableCircle.getArea());
    }

}
