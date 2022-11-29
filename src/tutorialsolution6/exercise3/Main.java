package tutorialsolution6.exercise3;

public class Main {
    public static void main(String[] args) {
        // Create different objects
        Shape myDefaultShape = new Shape();
        Circle myCircle = new Circle(2.5);
        Rectangle myRec = new Rectangle(3.0, 5.0);
        Square mySquare = new Square(10);
        Square anotherSquare = new Square("green", false, 4.5);

        System.out.println("Printing out a Shape object:" + myDefaultShape);

        System.out.println("\nTesting myCircle object:");
        System.out.println(myCircle);
        System.out.println(myCircle.getPerimeter());
        System.out.println(myCircle.getArea());

        System.out.println("\nTesting myRec object:");
        System.out.println(myRec);
        System.out.println(myRec.getPerimeter());
        System.out.println(myRec.getArea());

        System.out.println("\nTesting mySquare object:");
        System.out.println(mySquare);
        System.out.println(mySquare.getPerimeter());
        System.out.println(mySquare.getArea());

        System.out.println("\nTesting anotherSquare object:");
        System.out.println(anotherSquare);
        System.out.println(anotherSquare.getPerimeter());
        System.out.println(anotherSquare.getArea());
    }
}
