package tutorialsolution5.exercise4;

import tutorialsolution5.exercise3.Ingredient;

public class Restaurant {
    public static void main(String[] args) {
        Recipe chickenCurryRecipe = new Recipe("Chicken Curry");
        chickenCurryRecipe.addComponent();
        chickenCurryRecipe.addComponent();
        chickenCurryRecipe.displayRecipe();
    }
}
