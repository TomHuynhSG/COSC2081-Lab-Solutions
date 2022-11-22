package tutorialsolution5.exercise5;

public class Restaurant {
    public static void main(String[] args) {
        Recipe chickenCurryRecipe = new Recipe("Chicken Curry");
        chickenCurryRecipe.addComponent();
        chickenCurryRecipe.addComponent();
        chickenCurryRecipe.displayRecipe();

        Recipe cookieCreamRecipe = new Recipe("Cookie Cream");
        cookieCreamRecipe.addComponent();
        cookieCreamRecipe.addComponent();
        cookieCreamRecipe.displayRecipe();

        // exercise 5
        System.out.printf("The total number of recipes created is %d", Recipe.showNumberOfRecipes());
    }
}
