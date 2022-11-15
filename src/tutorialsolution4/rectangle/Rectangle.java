package tutorialsolution4.rectangle;

public class Rectangle {
    private int width;
    private int height;

    public Rectangle(int width, int height) {
        if (width >= 1){
            this.width = width;
        } else{
            System.out.println("Warning: input width is negative!");
            this.width = 1;
        }
        if (height>=1){
            this.height = height;
        } else{
            System.out.println("Warning: input height is negative!");
            this.height = 1;
        }
    }

    public void visualize(){
        for (int i =0;i<this.height;i++){
            for (int j =0;j<this.width;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
