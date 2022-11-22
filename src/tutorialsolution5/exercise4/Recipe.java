package tutorialsolution5.exercise4;

import java.util.ArrayList;

public class Recipe {
    private String name;

    // We can choose different data structures to keep our RecipeComponent objects: array, list, or set.
    // private RecipeComponent[] listComponent;
    private ArrayList<RecipeComponent> components;

    public Recipe (String name){
        this.name = name;
        this.components = new ArrayList<RecipeComponent>();
    }

    // The idx (index) is optional when the data structure used is array
    public void addComponent(){
        // We have two generators in Ingredient and RecipeComponent to handle the logic of taking
        // the inputs from the user, that is the reason why the commented-out part is no longer necessary.
        // This also facilitates the Single-responsibility principle
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

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

}