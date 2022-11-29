package tutorialsolution5.exercise5;

import java.util.ArrayList;
import tutorialsolution5.exercise4.RecipeComponent;

public class Recipe {
    private String name;

    private ArrayList<RecipeComponent> components;

    // exercise 5
    private static int count;

    public Recipe (String name){
        this.name = name;
        this.components = new ArrayList<RecipeComponent>();
        count++;
    }

    public void addComponent(){
        // We have two generators in Ingredient and RecipeComponent to handle the logic of taking
        // the inputs from the user, this also facilitates the Single-responsibility principle
        System.out.println("Adding new component....");
        components.add(RecipeComponent.createRecipeComponent());
    }

    public void displayRecipe(){
        System.out.println(name + " (Recipe)");
        for(RecipeComponent rp: components){
            rp.displayRecipeComponent();
            System.out.println("------------");
        }
    }

    // exercise 5
    public static int showNumberOfRecipes(){
        return count;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}