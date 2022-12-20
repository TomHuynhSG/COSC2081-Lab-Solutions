package tutorialsolution9.exercise1;

public class Main {

    public static void main(String[] args) {
        // write your code here
        Cat myCat = new Cat("My Cat Name");
        Dog myDog = new Dog("My Dog Name");
        Dog anotherDog = new Dog("Another Dog Name");
        BigDog myBigDog = new BigDog("My Big Dog Name");
        BigDog anotherBigDog = new BigDog("Another Big Dog Name");

        System.out.println(myCat);
        System.out.println(myDog);
        System.out.println(anotherDog);
        System.out.println(myBigDog);
        System.out.println(anotherBigDog);

        myCat.greets();
        myDog.greets();
        myDog.greets(anotherDog);
        myBigDog.greets();
        myBigDog.greets(anotherDog);
        myBigDog.greets(anotherBigDog);

    }
}
