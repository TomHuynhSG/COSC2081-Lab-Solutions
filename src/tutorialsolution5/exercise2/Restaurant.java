package tutorialsolution5.exercise2;

import tutorialsolution5.exercise3.Ingredient;

public class Restaurant {
    public static void main(String[] args) {
        // exercise 2
        // create first ingredient object
        tutorialsolution5.exercise3.Ingredient i1 = tutorialsolution5.exercise3.Ingredient.createIngredient();
        i1.displayIngredient();

        // create second ingredient object
        tutorialsolution5.exercise3.Ingredient i2 = Ingredient.createIngredient();
        i2.displayIngredient();
    }

}
