package tutorialsolution6.exercise1;

public class Zoo {
    public static void main(String[] args) {
        // write your code here
        System.out.println("Creating different objects for testing!");
        Animal myAnimal = new Animal("My Animal Name");
        Mammal myMammal = new Mammal("My Mammal Name");
        Cat myCat = new Cat("My Cat Name");
        Dog myDog = new Dog("My Dog Name");
        Dog anotherDog = new Dog("Another Dog Name");

        // Printing out different objects for testing
        System.out.println("Printing out myAnimal object: " + myAnimal);
        System.out.println("Printing out myMammal object: " + myMammal);
        System.out.println("Printing out myCat object: " + myCat);
        System.out.println("Printing out myDog object: " + myDog);

        // Testing methods of created objects
        System.out.println("Calling myCat.greets():");
        myCat.greets();

        System.out.println("Calling myDog.greets():");
        myDog.greets();

        System.out.println("myDog.greets(anotherDog):");
        myDog.greets(anotherDog);

    }
}
