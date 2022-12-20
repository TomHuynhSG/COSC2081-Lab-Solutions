package tutorialsolution9.exercise1;

public class BigDog extends Dog {
    public BigDog(String name) {
        super(name);
    }

    @Override
    public void greets() {
        System.out.println("Woow");
    }

    @Override
    public void greets(Dog another) {
        System.out.println("Woooooow");
    }

    public void greets(BigDog another) {
        System.out.println("Wooooooooow");
    }

    @Override
    public String toString() {
        return String.format("BigDog[%s]", super.toString());
    }
}
