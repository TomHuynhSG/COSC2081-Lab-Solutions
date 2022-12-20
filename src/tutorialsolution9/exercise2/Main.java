package tutorialsolution9.exercise2;

public class Main {

    public static void main(String[] args) {
	    // write your code here

        Shape s1 = new Circle(5.5, "red", false); // Upcast Circle to Shape
        System.out.println(s1); // which version?
        System.out.println(s1.getArea()); // which version?
        System.out.println(s1.getPerimeter()); // which version?
        System.out.println(s1.getColor());
        System.out.println(s1.isFilled());
        //System.out.println(s1.getRadius());  // Trigger Error
        Circle c1 = (Circle)s1; // Downcast back to Circle
        System.out.println(c1);
        System.out.println(c1.getArea());
        System.out.println(c1.getPerimeter());
        System.out.println(c1.getColor());
        System.out.println(c1.isFilled());
        System.out.println(c1.getRadius());
        //Shape s2 = new Shape(); // Trigger Error
        Shape s3 = new Rectangle(1.0, 2.0, "red", false); // Upcast
        System.out.println(s3);
        System.out.println(s3.getArea());
        System.out.println(s3.getPerimeter());
        System.out.println(s3.getColor());
        //System.out.println(s3.getLength()); // Trigger Error
        Rectangle r1 = (Rectangle)s3; // downcast
        System.out.println(r1);
        System.out.println(r1.getArea());
        System.out.println(r1.getColor());
        System.out.println(r1.getLength());
        Shape s4 = new Square(6.6); // Upcast
        System.out.println(s4);
        System.out.println(s4.getArea());
        System.out.println(s4.getColor());
        //System.out.println(s4.getSide()); // Trigger Error
        // Take note that we downcast Shape s4 to Rectangle,
        // which is a superclass of Square, instead of Square
        Rectangle r2 = (Rectangle)s4;
        System.out.println(r2);
        System.out.println(r2.getArea());
        System.out.println(r2.getColor());
        //System.out.println(r2.getSide()); // Trigger Error
        System.out.println(r2.getLength());
        // Downcast Rectangle r2 to Square
        Square sq1 = (Square)r2;
        System.out.println(sq1);
        System.out.println(sq1.getArea());
        System.out.println(sq1.getColor());
        System.out.println(sq1.getSide());
        System.out.println(sq1.getLength());

        // Another way to test all classes
        //        Circle myCircle = new Circle(2.5);
        //        Rectangle myRec = new Rectangle(3.0, 5.0);
        //        Square mySquare = new Square(10);
        //        Square anotherSquare = new Square("green", false, 4.5);
        //
        //        System.out.println(myCircle);
        //        System.out.println(myCircle.getPerimeter());
        //        System.out.println(myCircle.getArea());
        //
        //        System.out.println(myRec);
        //        System.out.println(myRec.getPerimeter());
        //        System.out.println(myRec.getArea());
        //
        //        System.out.println(mySquare);
        //        System.out.println(mySquare.getPerimeter());
        //        System.out.println(mySquare.getArea());
        //
        //        System.out.println(anotherSquare);
        //        System.out.println(anotherSquare.getPerimeter());
        //        System.out.println(anotherSquare.getArea());
    }
}
