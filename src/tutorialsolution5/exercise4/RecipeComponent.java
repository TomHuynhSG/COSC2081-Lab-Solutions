package tutorialsolution5.exercise4;

import java.util.Scanner;

public class RecipeComponent {
    private Ingredient ingredient;
    private double amount;

    public RecipeComponent(Ingredient ingredient, double amount) {
        this.ingredient = ingredient;
        this.amount = amount;
    }

    // Same as the one in Ingredient
    public static RecipeComponent createRecipeComponent(){
        Ingredient ingredient = Ingredient.createIngredient();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please input the amount: ");
        double amount = scanner.nextDouble();
        return new RecipeComponent(ingredient, amount);
    }

    public void displayRecipeComponent(){
        this.ingredient.displayIngredient();
        System.out.printf("The amount is: %.2f\n", amount);
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }
}