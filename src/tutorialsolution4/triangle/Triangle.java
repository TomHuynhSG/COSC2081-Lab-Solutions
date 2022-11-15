package tutorialsolution4.triangle;

public class Triangle {
    private int x;
    private int y;
    private int z;

    public Triangle(int x, int y, int z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public String verify(){
        if ((x+y>z) && (y+z>x) && (x+z>y)){
            if (x == y && y == z )
                return "Equilateral Triangle";
                // Check for isosceles triangle
            else if (x == y || y == z || z == x )
                return "Isosceles Triangle";
                // Otherwise scalene triangle
            else
                return "Scalene Triangle";
        } else{
            return "Not Triangle";
        }

    }
}

