package tutorialsolution4.point2D;

import java.util.Scanner;

public class Point2D {
    private int x;
    private int y;

    public Point2D() {
        this.x=0;
        this.y=0;
    }

    public Point2D(int x, int y) {
        this.x=x;
        this.y=y;
    }

    public Point2D(Point2D p) {
        this.x=p.getX();
        this.y=p.getY();
    }

    public void input(){
        System.out.println("Enter X:");
        Scanner scanObject = new Scanner(System.in);
        int x = scanObject.nextInt();
        System.out.println("Enter Y:");
        int y = scanObject.nextInt();
        this.setX(x);
        this.setY(y);
    }

    public void move(int x, int y){
        this.setX(x);
        this.setY(y);
    }

    public boolean isOrigin(){
        if ((this.getX()==0) && (this.getY()==0)){
            return true;
        } else{
            return false;
        }
    }

    public double distance(Point2D p){
        return Math.sqrt(Math.pow((this.getX()-p.getX()),2)+Math.pow((this.getY()-p.getY()),2));
    }

    public static double distance(Point2D p1, Point2D p2){
        return Math.sqrt(Math.pow((p1.getX()-p2.getX()),2)+Math.pow((p1.getY()-p2.getY()),2));
    }

    @Override
    public String toString(){
        return String.format("(%d,%d)",this.getX(),this.getY());
    }


    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }
}
